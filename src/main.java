

import com.formdev.flatlaf.FlatDarculaLaf;

import javax.swing.*;
import java.awt.*;


public class main {
    private static ImageIcon icon = new ImageIcon("imgs/Matrix.png");

    public static void main(String[] args) throws Exception {
        FlatDarculaLaf.install();

        Object[] options = {"Converter Moedas", "Converter Temperatura", "Converter Peso", "Converter Velocidade", "Sair"};
        Object choice = JOptionPane.showInputDialog(null, "Escolha uma opção:", "Conversor de Unidades", JOptionPane.PLAIN_MESSAGE, icon, options, options[0]).toString();

        if (choice != null) {
            switch (choice.toString()) {
                case "Converter Moedas":
                    ConversorDeMoedasApiBancoCentral.executarConversor();
                    break;
                case "Converter Temperatura":
                    ConversorTemperatura.converter();
                    break;
                case "Converter Peso":
                    ConversorPeso.converter();
                    break;
                case "Converter Velocidade":
                    ConversorVelocidade.converter();
                    break;
                case "Sair":
                    JOptionPane.showMessageDialog(null, "Programa Finalizado");
                    System.exit(0);
                    break;

            }
        }
    }
}