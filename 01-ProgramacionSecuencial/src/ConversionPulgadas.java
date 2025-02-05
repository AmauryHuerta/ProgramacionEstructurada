import javax.swing.*;

public class ConversionPulgadas {
    /*
     * Escribir un programa que convierte los 2, 5 y 10 pulgadas
     * a milímetros (1 pulgada =25,4 mm).
     */
    public static void main(String[] args) {
        //Declaracion de constante
        final double PULGADAS=25.4;

        //Declararacion de variables
        double num1=2.0, num2=5.0, num3=10.0;
        double c1=0.0, c2=0.0, c3=0.0;
        String salida="";

        //Operacion para conversion de valores
        c1 = num1 * PULGADAS;
        c2 = num2 * PULGADAS;
        c3 = num3 * PULGADAS;

        //Salida de la conversion
        salida = "El valor de " + num1 + " mm convertidos a libras es: " + String.format("%.4f", c1) +
                 "\nEl valor de " + num2 + "mm convertidos a libras es: " + String.format("%.4f", c2) +
                 "\nEl valor de " + num3 + "mm convertidos a libras es: " + String.format("%.4f", c3);

        JOptionPane.showMessageDialog(null, salida);
    }
}
