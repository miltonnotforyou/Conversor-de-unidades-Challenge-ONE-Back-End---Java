import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.MalformedJsonException;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;

import javax.swing.JOptionPane;

public class ConversorDeMoedasApiBancoCentral {
    private static ImageIcon icon = new ImageIcon("imgs/Dinheiro.png");
    /**
     * Este método estático converte um valor de uma moeda de origem para uma moeda de destino.
     * O método recebe como parâmetros o valor a ser convertido, a moeda de origem e a moeda de destino.
     * @throws IOException Se ocorrer algum erro ao obter a cotação das moedas.
     * @throws IllegalArgumentException Se o valor informado for negativo.
     */
    public static double converter(double valor, String moedaOrigem, String moedaDestino) throws IOException {
        if (valor < 0) {
            throw new IllegalArgumentException("O valor a ser convertido deve ser positivo.");
        }
        // Define a URL correta para a conversão, dependendo das moedas de entrada e saída
        URL url = null;
        if (moedaOrigem.equals("Reais") && moedaDestino.equals("Dólares")) {
            url = new URL("https://api.bcb.gov.br/dados/serie/bcdata.sgs.10813/dados/ultimos/1?formato=json");
        } else if (moedaOrigem.equals("Reais") && moedaDestino.equals("Euros")) {
            url = new URL("https://api.bcb.gov.br/dados/serie/bcdata.sgs.21619/dados/ultimos/1?formato=json");
        } else if (moedaOrigem.equals("Reais") && moedaDestino.equals("Libras Esterlinas")) {
            url = new URL("https://api.bcb.gov.br/dados/serie/bcdata.sgs.21624/dados/ultimos/1?formato=json");
        } else if (moedaOrigem.equals("Reais") && moedaDestino.equals("Pesos Argentinos")) {
            url = new URL("https://api.bcb.gov.br/dados/serie/bcdata.sgs.14001/dados/ultimos/1?formato=json");
        } else if (moedaOrigem.equals("Reais") && moedaDestino.equals("Pesos Chilenos")) {
            url = new URL("https://api.bcb.gov.br/dados/serie/bcdata.sgs.3934/dados/ultimos/1?formato=json");
        } else if (moedaOrigem.equals("Dólares") && moedaDestino.equals("Reais")) {
            url = new URL("https://api.bcb.gov.br/dados/serie/bcdata.sgs.10813/dados/ultimos/1?formato=json");
        } else if (moedaOrigem.equals("Euros") && moedaDestino.equals("Reais")) {
            url = new URL("https://api.bcb.gov.br/dados/serie/bcdata.sgs.21619/dados/ultimos/1?formato=json");
        } else if (moedaOrigem.equals("Libras Esterlinas") && moedaDestino.equals("Reais")) {
            url = new URL("https://api.bcb.gov.br/dados/serie/bcdata.sgs.21624/dados/ultimos/1?formato=json");
        } else if (moedaOrigem.equals("Pesos Argentinos") && moedaDestino.equals("Reais")) {
            url = new URL("https://api.bcb.gov.br/dados/serie/bcdata.sgs.14001/dados/ultimos/1?formato=json");
        } else if (moedaOrigem.equals("Pesos Chilenos") && moedaDestino.equals("Reais")) {
            url = new URL("https://api.bcb.gov.br/dados/serie/bcdata.sgs.3934/dados/ultimos/1?formato=json");
        }

        try {
            // Obtém a cotação da moeda de origem em relação à moeda de destino usando a URL definida anteriormente
            double cotacaoOrigem = obterCotacao(url);

            // Se a moeda de origem for Real, divide o valor pelo valor da cotação de origem para obter o valor na moeda de destino
            if (moedaOrigem.equals("Reais")) {
                return valor / cotacaoOrigem;
                // Caso contrário, obtém a cotação da moeda de origem
            } else {
                URL urlDestino = null;
                if (moedaOrigem.equals("Dólares") && moedaDestino.equals("Reais")) {
                    urlDestino = new URL("https://api.bcb.gov.br/dados/serie/bcdata.sgs.1/dados/ultimos/1?formato=json");
                } else if (moedaOrigem.equals("Euros") && moedaDestino.equals("Reais")) {
                    urlDestino = new URL("https://api.bcb.gov.br/dados/serie/bcdata.sgs.21620/dados/ultimos/1?formato=json");
                } else if (moedaOrigem.equals("Libras Esterlinas") && moedaDestino.equals("Reais")) {
                    urlDestino = new URL("https://api.bcb.gov.br/dados/serie/bcdata.sgs.21625/dados/ultimos/1?formato=json");
                } else if (moedaOrigem.equals("Pesos Argentinos") && moedaDestino.equals("Reais")) {
                    urlDestino = new URL("https://api.bcb.gov.br/dados/serie/bcdata.sgs.14002/dados/ultimos/1?formato=json");
                } else if (moedaOrigem.equals("Pesos Chilenos") && moedaDestino.equals("Reais")) {
                    urlDestino = new URL("https://api.bcb.gov.br/dados/serie/bcdata.sgs.3935/dados/ultimos/1?formato=json");
                }

                // Obtém a cotação da moeda de destino em relação à moeda de origem
                double cotacaoDestino = obterCotacao(urlDestino);

                // Multiplica o valor pela cotação de destino para obter o valor na moeda de destino
                return valor * cotacaoDestino;
            }
        } catch (IOException e) {
            // Caso ocorra algum erro ao obter a cotação, lança uma exceção
            throw new IOException("Ocorreu um erro ao obter a cotação das moedas.");
        }
    }

    //Este método utiliza a classe HttpURLConnection para fazer uma requisição GET na URL fornecida e obter a cotação de uma moeda.
    public static double obterCotacao(URL url) throws IOException {
        //Aqui é feita a abertura da conexão com a URL.
        HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
        conexao.setRequestMethod("GET");

        //Se a resposta não for 200 (sucesso), lança uma exceção informando que não foi possível obter a cotação.
        if (conexao.getResponseCode() != 200) {
            throw new IOException("Não foi possível se conectar com o Banco Central. Por favor tente novamente.");
        }

        //Cria um BufferedReader com o InputStream da conexão para ler a resposta da requisição.
        BufferedReader leitor = new BufferedReader(new InputStreamReader(conexao.getInputStream()));
        String linha;
        StringBuilder resposta = new StringBuilder();

        //Lê cada linha da resposta e adiciona ao StringBuilder.
        while ((linha = leitor.readLine()) != null) {
            resposta.append(linha);
        }
        leitor.close();

        //Faz o parsing da resposta em JSON e obtém o valor da cotação.
        try {
            JsonArray jsonArray = new JsonParser().parse(resposta.toString()).getAsJsonArray();
            return jsonArray.get(0).getAsJsonObject().get("valor").getAsDouble();
            //Em caso de erro durante o parsing, lança uma exceção informando o problema.
        } catch (JsonSyntaxException | IndexOutOfBoundsException e) {
            throw new IOException("Erro ao converter o resultado obtido da API. Tente novamente");
        }
    }

    //Este método executa o conversor de moedas por meio de uma interface gráfica utilizando a classe JOptionPane.

    public static void executarConversor() throws IOException {
        //O loop while é executado até que o usuário decida encerrar o programa.
        int continuar = 0;
        while (continuar != JOptionPane.NO_OPTION) {
            String[] opcoes = {"Real para Dólar",
                    "Real para Euro",
                    "Real para Libras Esterlinas",
                    "Real para Peso argentino",
                    "Real para Peso Chileno",
                    "Dólar para Real",
                    "Euro para Real",
                    "Libras Esterlinas para Real",
                    "Peso argentino para Real",
                    "Peso Chileno para Real"};
            String opcao = (String) JOptionPane.showInputDialog(null, "Selecione a conversão desejada:", "Conversor de Moedas", JOptionPane.PLAIN_MESSAGE, icon, opcoes, opcoes[0]);

            String moedaOrigem = "";
            String moedaDestino = "";
            int opcaoIndex = Arrays.asList(opcoes).indexOf(opcao);
            if (opcaoIndex == 0) {
                moedaOrigem = "Reais";
                moedaDestino = "Dólares";
            } else if (opcaoIndex == 1) {
                moedaOrigem = "Reais";
                moedaDestino = "Euros";
            } else if (opcaoIndex == 2) {
                moedaOrigem = "Reais";
                moedaDestino = "Libras Esterlinas";
            } else if (opcaoIndex == 3) {
                moedaOrigem = "Reais";
                moedaDestino = "Pesos Argentinos";
            } else if (opcaoIndex == 4) {
                moedaOrigem = "Reais";
                moedaDestino = "Pesos Chilenos";
            } else if (opcaoIndex == 5) {
                moedaOrigem = "Dólares";
                moedaDestino = "Reais";
            } else if (opcaoIndex == 6) {
                moedaOrigem = "Euros";
                moedaDestino = "Reais";
            } else if (opcaoIndex == 7) {
                moedaOrigem = "Libras Esterlinas";
                moedaDestino = "Reais";
            } else if (opcaoIndex == 8) {
                moedaOrigem = "Pesos Argentinos";
                moedaDestino = "Reais";
            } else if (opcaoIndex == 9) {
                moedaOrigem = "Pesos Chilenos";
                moedaDestino = "Reais";
            }

            double valor = 0;
            boolean valorValido = false;
            while (!valorValido) {
                String inputValor = JOptionPane.showInputDialog(null, "Digite o valor a ser convertido:", "Conversor de Moedas", JOptionPane.PLAIN_MESSAGE);
                try {
                    // Se a conversão for bem sucedida, o valor é armazenado na variável "valor"
                    valor = Double.parseDouble(inputValor);
                    // Verifica se o valor é maior ou igual a zero
                    if (valor >= 0) {
                        valorValido = true;
                        // Caso o valor seja negativo, uma mensagem de erro é exibida e o laço continua a ser executado
                    } else {
                        JOptionPane.showMessageDialog(null, "O valor a ser convertido deve ser positivo.", "Erro", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (NumberFormatException e) {
                    // Caso o usuário tenha inserido um valor inválido, uma mensagem de erro é exibida e o laço continua a ser executado
                    JOptionPane.showMessageDialog(null, "Insira apenas números e use '.' para os centavos.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }

            try {
                double valorConvertido = converter(valor, moedaOrigem, moedaDestino);
                JOptionPane.showMessageDialog(null, valor + " " + moedaOrigem + " equivale a " + String.format("%.2f", valorConvertido) + " " + moedaDestino);
                // Caso ocorra uma exceção durante a conversão, uma mensagem de erro é exibida
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }

            continuar = JOptionPane.showOptionDialog(null, "Deseja realizar outra conversão?", "Conversor de Moedas", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, icon, new String[]{"Sim", "Não"}, "Sim");

            if (continuar == 1) {
                JOptionPane.showMessageDialog(null, "Programa finalizado!");
            }
        }
    }
    // Função principal que chama o método "executarConversor"
    public static void main(String[] args) throws IOException {
        executarConversor();
    }
}