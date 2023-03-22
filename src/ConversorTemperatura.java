import javax.swing.*;

public class ConversorTemperatura {

    private static ImageIcon icon = new ImageIcon("imgs/temperature.png");
    public static void converter() {
        JOptionPane.showMessageDialog(null, "Opção selecionada: Converter Temperatura");

        Object[] options = {"Kelvin(K)", "Celsius (C)", "Fahrenheit (F)", "Reaumur (R)", "Rankine"};
        Object temperaturaEntrada = JOptionPane.showInputDialog(null, "Escolha a temperatura de origem:", "Conversor de Temperatura", JOptionPane.PLAIN_MESSAGE, icon, options, options[0]);
        Object temperaturaSaida = JOptionPane.showInputDialog(null, "Escolha a temperatura de destino:", "Conversor de Temperatura", JOptionPane.PLAIN_MESSAGE, icon, options, options[1]);

        // conversão de Kelvin para outras escalas
        if (temperaturaEntrada.equals("Kelvin(K)")) {
            double valorEntrada = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor em Kelvin:", "Conversor de Temperatura", JOptionPane.PLAIN_MESSAGE));
            if (temperaturaSaida.equals("Celsius (C)")) {
                double valorSaida = valorEntrada - 273.15;
                JOptionPane.showMessageDialog(null, valorEntrada + " K = " + valorSaida + " C");
            } else if (temperaturaSaida.equals("Fahrenheit (F)")) {
                double valorSaida = (valorEntrada - 273.15) * 9 / 5 + 32;
                JOptionPane.showMessageDialog(null, valorEntrada + " K = " + valorSaida + " F");
            } else if (temperaturaSaida.equals("Reaumur (R)")) {
                double valorSaida = (valorEntrada - 273.15) * 4 / 5;
                JOptionPane.showMessageDialog(null, valorEntrada + " K = " + valorSaida + " R");
            } else if (temperaturaSaida.equals("Rankine")) {
                double valorSaida = valorEntrada * 1.8;
                JOptionPane.showMessageDialog(null, valorEntrada + " K = " + valorSaida + " Rankine");
            }
        }
        // conversão de Fahrenheit para outras escalas
        if (temperaturaEntrada.equals("Fahrenheit (F)")) {
            double valorEntrada = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor em Fahrenheit:", "Conversor de Temperatura", JOptionPane.PLAIN_MESSAGE));
            if (temperaturaSaida.equals("Kelvin(K)")) {
                double valorSaida = (valorEntrada + 459.67) * 5 / 9;
                JOptionPane.showMessageDialog(null, valorEntrada + " F = " + valorSaida + " K");
            } else if (temperaturaSaida.equals("Celsius (C)")) {
                double valorSaida = (valorEntrada - 32) * 5 / 9;
                JOptionPane.showMessageDialog(null, valorEntrada + " F = " + valorSaida + " C");
            } else if (temperaturaSaida.equals("Reaumur (R)")) {
                double valorSaida = (valorEntrada - 32) * 4 / 9;
                JOptionPane.showMessageDialog(null, valorEntrada + " F = " + valorSaida + " R");
            } else if (temperaturaSaida.equals("Rankine")) {
                double valorSaida = valorEntrada + 459.67;
                JOptionPane.showMessageDialog(null, valorEntrada + " F = " + valorSaida + " Rankine");
            }
        }
        // conversão de Reaumur para outras escalas
        if (temperaturaEntrada.equals("Reaumur (R)")) {
            double valorEntrada = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor em Reaumur:", "Conversor de Temperatura", JOptionPane.PLAIN_MESSAGE));
            if (temperaturaSaida.equals("Kelvin(K)")) {
                double valorSaida = valorEntrada * 5 / 4 + 273.15;
                JOptionPane.showMessageDialog(null, valorEntrada + " R = " + valorSaida + " K");
            } else if (temperaturaSaida.equals("Celsius (C)")) {
                double valorSaida = valorEntrada * 5 / 4;
                JOptionPane.showMessageDialog(null, valorEntrada + " R = " + valorSaida + " C");
            } else if (temperaturaSaida.equals("Fahrenheit (F)")) {
                double valorSaida = valorEntrada * 9 / 4 + 32;
                JOptionPane.showMessageDialog(null, valorEntrada + " R = " + valorSaida + " F");
            } else if (temperaturaSaida.equals("Rankine")) {
                double valorSaida = (valorEntrada * 9 / 4 + 32) + 459.67;
                JOptionPane.showMessageDialog(null, valorEntrada + " R = " + valorSaida + " Rankine");
            }
        }
        // conversão de Rankine para outras escalas
        if (temperaturaEntrada.equals("Rankine")) {
            double valorEntrada = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor em Rankine:", "Conversor de Temperatura", JOptionPane.PLAIN_MESSAGE));
            if (temperaturaSaida.equals("Kelvin(K)")) {
                double valorSaida = valorEntrada * 5 / 9;
                JOptionPane.showMessageDialog(null, valorEntrada + " Rankine = " + valorSaida + " K");
            } else if (temperaturaSaida.equals("Celsius (C)")) {
                double valorSaida = (valorEntrada - 491.67) * 5 / 9;
                JOptionPane.showMessageDialog(null, valorEntrada + " Rankine = " + valorSaida + " C");
            } else if (temperaturaSaida.equals("Fahrenheit (F)")) {
                double valorSaida = valorEntrada - 459.67;
                JOptionPane.showMessageDialog(null, valorEntrada + " Rankine = " + valorSaida + " F");
            } else if (temperaturaSaida.equals("Reaumur (R)")) {
                double valorSaida = (valorEntrada - 491.67) * 4 / 9;
                JOptionPane.showMessageDialog(null, valorEntrada + " Rankine = " + valorSaida + " R");
            }
        }
        // conversão de Celsius para outras escalas
        if (temperaturaEntrada.equals("Celsius (C)")) {
            double valorEntrada = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor em Celsius:", "Conversor de Temperatura", JOptionPane.PLAIN_MESSAGE));
            if (temperaturaSaida.equals("Kelvin(K)")) {
                double valorSaida = valorEntrada + 273.15;
                JOptionPane.showMessageDialog(null, valorEntrada + " C = " + valorSaida + " K");
            } else if (temperaturaSaida.equals("Fahrenheit (F)")) {
                double valorSaida = valorEntrada * 9 / 5 + 32;
                JOptionPane.showMessageDialog(null, valorEntrada + " C = " + valorSaida + " F");
            } else if (temperaturaSaida.equals("Reaumur (R)")) {
                double valorSaida = valorEntrada * 4 / 5;
                JOptionPane.showMessageDialog(null, valorEntrada + " C = " + valorSaida + " R");
            } else if (temperaturaSaida.equals("Rankine")) {
                double valorSaida = (valorEntrada + 273.15) * 1.8;
                JOptionPane.showMessageDialog(null, valorEntrada + " C = " + valorSaida + " Rankine");
            }
        }
        int continuar = JOptionPane.showOptionDialog(null, "Deseja realizar outra conversão?", "Conversor de Temperatura", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, icon, new String[]{"Sim", "Não"}, "Sim");
        if (continuar == JOptionPane.YES_OPTION) {
            converter();
        } else {
            JOptionPane.showMessageDialog(null, "Programa finalizado!");
        }
        }

    }
