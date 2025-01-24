import javax.swing.*;

public class ConversionLibras2 {
    /*
     * Escribir un programa que convierta tres numeros de
     * Kilogramos a libras (1 Libras = 0.454)
     */


    public static void main(String[] args) {
        //Declaracion de constante
        final double LIBRAS = 0.454;

        //Declaracion de variables de tres numeros doubles a convertir
        double num1 = 0.0, num2 = 0.0, num3 = 0.0;
        String salida = "";

        //Ingresar el valor de las tres variables
        num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresar el primer valor en Kg: "));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresar el segundo valor en Kg: "));
        num3 = Double.parseDouble(JOptionPane.showInputDialog("Ingresar el tercer valor en Kg: "));

        //Salida en Libras de las operaciones de Kg
        salida = num1 + "Kg en libras es: " + String.format("%.4f", num1 / LIBRAS) +
                "\n" + num2 + "Kg en libras es: " + String.format("%.4f", num2 / LIBRAS) +
                "\n" + num3 + "Kg en libras es: " + String.format("%.4f", num3 / LIBRAS);

        JOptionPane.showMessageDialog(null, salida);
    }
}
