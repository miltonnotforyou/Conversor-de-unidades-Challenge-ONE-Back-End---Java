import javax.swing.*;

public class ConversorVelocidade {

    private static ImageIcon icon = new ImageIcon("imgs/velocidade.png");

    public static void converter() {

        double valor;

        JOptionPane.showMessageDialog(null, "Opção selecionada: Converter Velocidade");

        Object[] options = {"milhas/hora", "km/hora", "metros/segundo", "pés/segundo", "nós", "Sair"};
        Object unidadeValor = JOptionPane.showInputDialog(null, "Escolha a unidade que deseja converter:", "Conversor de Temperatura", JOptionPane.PLAIN_MESSAGE, icon, options, options[0]);
        Object unidadeConvertida = JOptionPane.showInputDialog(null, "Escolha para qual unidade deseja converter:", "Conversor de Temperatura", JOptionPane.PLAIN_MESSAGE, icon, options, options[1]);

        valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor que deseja converter"));

        if (unidadeValor.equals("milhas/hora") && unidadeConvertida.equals("km/hora")) {
            double resultado = valor * 1.609;
            JOptionPane.showMessageDialog(null, "O valor convertido é: " + resultado + " km/hora");
        } else if (unidadeValor.equals("milhas/hora") && unidadeConvertida.equals("metros/segundos")) {
            double resultado = valor * 0.447;
            JOptionPane.showMessageDialog(null, "O valor convertido é: " + resultado + " metros/segundos");
        } else if (unidadeValor.equals("milhas/hora") && unidadeConvertida.equals("pés/segundos")) {
            double resultado = valor * 0.29;
            JOptionPane.showMessageDialog(null, "O valor convertido é: " + resultado + " pés/segundos");
        } else if (unidadeValor.equals("milhas/hora") && unidadeConvertida.equals("nós")) {
            double resultado = valor * 0.51;
            JOptionPane.showMessageDialog(null, "O valor convertido é: " + resultado + " nós");
        }
        if (unidadeValor.equals("km/hora") && unidadeConvertida.equals("milhas/hora")) {
            double resultado = valor * 0.62;
            JOptionPane.showMessageDialog(null, "O valor convertido é: " + resultado + " milhas/hora");
        } else if (unidadeValor.equals("km/hora") && unidadeConvertida.equals("metros/segundos")) {
            double resultado = valor * 0.278;
            JOptionPane.showMessageDialog(null, "O valor convertido é: " + resultado + " metros/segundos");
        } else if (unidadeValor.equals("km/hora") && unidadeConvertida.equals("pés/segundos")) {
            double resultado = valor * 0.18;
            JOptionPane.showMessageDialog(null, "O valor convertido é: " + resultado + " pés/segundos");
        } else if (unidadeValor.equals("km/hora") && unidadeConvertida.equals("nós")) {
            double resultado = valor * 0.32;
            JOptionPane.showMessageDialog(null, "O valor convertido é: " + resultado + " nós");
        }
        if (unidadeValor.equals("metros/segundos") && unidadeConvertida.equals("milhas/hora")) {
            double resultado = valor * 2.23;
            JOptionPane.showMessageDialog(null, "O valor convertido é: " + resultado + " milhas/hora");
        } else if (unidadeValor.equals("metros/segundos") && unidadeConvertida.equals("km/hora")) {
            double resultado = valor * 3.6;
            JOptionPane.showMessageDialog(null, "O valor convertido é: " + resultado + " km/hora");
        } else if (unidadeValor.equals("metros/segundos") && unidadeConvertida.equals("pés/segundos")) {
            double resultado = valor * 3.6;            JOptionPane.showMessageDialog(null, "O valor convertido é: " + resultado + " pés/segundos");
        } else if (unidadeValor.equals("metros/segundos") && unidadeConvertida.equals("nós")) {            double resultado = valor * 1.94;
            JOptionPane.showMessageDialog(null, "O valor convertido é: " + resultado + " nós");        }
        if (unidadeValor.equals("pés/segundos") && unidadeConvertida.equals("milhas/hora")) {            double resultado = valor * 3.45;
            JOptionPane.showMessageDialog(null, "O valor convertido é: " + resultado + " milhas/hora");        } else if (unidadeValor.equals("pés/segundos") && unidadeConvertida.equals("km/hora")) {
            double resultado = valor * 5.6;            JOptionPane.showMessageDialog(null, "O valor convertido é: " + resultado + " km/hora");
        } else if (unidadeValor.equals("pés/segundos") && unidadeConvertida.equals("metros/segundos")) {            double resultado = valor * 0.278;
            JOptionPane.showMessageDialog(null, "O valor convertido é: " + resultado + " metros/segundos");        } else if (unidadeValor.equals("pés/segundos") && unidadeConvertida.equals("nós")) {
            double resultado = valor * 0.36;            JOptionPane.showMessageDialog(null, "O valor convertido é: " + resultado + " nós");
        }
        if (unidadeValor.equals("nós") && unidadeConvertida.equals("milhas/hora")) {            double resultado = valor * 1.94;
            JOptionPane.showMessageDialog(null, "O valor convertido é: " + resultado + " milhas/hora");        } else if (unidadeValor.equals("nós") && unidadeConvertida.equals("km/hora")) {
            double resultado = valor * 3.1;            JOptionPane.showMessageDialog(null, "O valor convertido é: " + resultado + " km/hora");
        } else if (unidadeValor.equals("nós") && unidadeConvertida.equals("metros/segundos")) {            double resultado = valor * 0.51;
            JOptionPane.showMessageDialog(null, "O valor convertido é: " + resultado + " metros/segundos");        } else if (unidadeValor.equals("nós") && unidadeConvertida.equals("pés/segundos")) {
            double resultado = valor * 2.7;            JOptionPane.showMessageDialog(null, "O valor convertido é: " + resultado + " pés/segundos");
        }
        int continuar = JOptionPane.showOptionDialog(null, "Deseja realizar outra conversão?", "Conversor de Velocidade", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, icon, new String[]{"Sim", "Não"}, "Sim");
        if (continuar == JOptionPane.YES_OPTION) {
            converter();
        } else {
            JOptionPane.showMessageDialog(null, "Programa finalizado!");
        }

    }

}

