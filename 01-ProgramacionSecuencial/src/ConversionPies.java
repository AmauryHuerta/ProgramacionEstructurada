import javax.swing.*;

public class ConversionPies {
    /*
     * Hacer un programa que lea un número en pies y calcule e imprima su equivalente en
     * yardas, pulgadas, centímetros y metros, de acuerdo con las siguientes equivalencias:
     * 1 pie = 12 pulgadas, 1 yarda = 3 pies, 1 pulgada = 2.54 cm, 1 metro = 100 cm
     */
    public static void main(String[] args) {
        //Declaracion de variables
        double pies=0.0;
        double c1=0.0, c2=0.0, c3=0.0, c4=0.0;
        String salida="";

        //Entrada de datos
        pies = Double.parseDouble(JOptionPane.showInputDialog("Ingresar los pies a convertir: "));

        //Operaciones
        c1 = pies / 3;
        c2 = pies * 12;
        c3 = c2 * 2.54;
        c4 = c3 / 100;

        //Salida de valores
        salida = "Los " + pies + " pies son: " + String.format("%.4f", c1) + " yardas." +
                 "\nLos " + pies + " pies son: " + String.format("%.4f", c2) + " pulgadas." +
                 "\nLos " + pies + " pies son: " + String.format("%.4f", c3) + " centimetros." +
                 "\nLos " + pies + " pies son: " + String.format("%.4f", c4) + " metros.";

        JOptionPane.showMessageDialog(null, salida);
    }
}
