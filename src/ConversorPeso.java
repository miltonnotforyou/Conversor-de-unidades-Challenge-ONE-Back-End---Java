import java.util.HashMap;
import javax.swing.*;

public class ConversorPeso {
    private static ImageIcon icon = new ImageIcon("imgs/peso.png");
    // Tabela de conversão usando HashMap
    public static HashMap<String, Double> tabelaConversao = new HashMap<>();

    static {
        tabelaConversao.put("Micrograma µg", 0.000001);
        tabelaConversao.put("Miligrama mg", 0.001);
        tabelaConversao.put("Gramas g", 1.0);
        tabelaConversao.put("Onça oz", 0.0283495);
        tabelaConversao.put("Libra lb", 0.453592);
        tabelaConversao.put("Quilograma kg", 1000.0);
        tabelaConversao.put("Tonelada ST", 907.185);
        tabelaConversao.put("Tera t", 1000000.0);
        tabelaConversao.put("Litro LT", 1016046.91);
    }

    public static void main(String[] args) {
        converter();
    }

    public static void converter() {

        Object[] options = {"Micrograma µg", "Miligrama mg", "Gramas g", "Onça oz", "Libra lb", "Quilograma kg", "Tonelada ST", "Tera t", "Litro LT", "Sair"};
        Object origem = JOptionPane.showInputDialog(null, "Escolha a unidade de origem:", "Conversor de Peso", JOptionPane.PLAIN_MESSAGE, icon, options, options[0]);
        Object destino = JOptionPane.showInputDialog(null, "Escolha a unidade de destino:", "Conversor de Peso", JOptionPane.PLAIN_MESSAGE, icon, options, options[0]);

        double valor = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de origem"));

        double resultado = converterPeso(valor, origem.toString(), destino.toString());
        JOptionPane.showMessageDialog(null, "Resultado: " + String.format("%.2f", resultado) + " " + destino);

        int continuar = JOptionPane.showOptionDialog(null, "Deseja realizar outra conversão?", "Conversor de Peso", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, icon, new String[]{"Sim", "Não"}, "Sim");
        if (continuar == JOptionPane.YES_OPTION) {
            converter();
        } else {
            JOptionPane.showMessageDialog(null, "Programa finalizado!");
        }
    }

    public static double converterPeso(double valor, String origem, String destino) {
        double valorOrigem = valor * tabelaConversao.get(origem);
        return valorOrigem / tabelaConversao.get(destino);
    }
}

