import javax.swing.*;

public class NumerosCuadrados {
    /*
     * Escribir un programa que calcula y muestra el cuadrado
     * de cada entero 1-9.
     */
    public static void main(String[] args) {
        //Declaracion de variables
        double num1=1.0, num2=2.0, num3=3.0, num4=4.0, num5=5.0, num6=6.0, num7=7.0, num8=8.0, num9=9.0;
        double c1=0.0, c2=0.0, c3=0.0, c4=0.0, c5=0.0, c6=0.0, c7=0.0, c8=0.0, c9=0.0;
        String salida="";

        //Operacion
        c1 = Math.pow(num1, 2);
        c2 = Math.pow(num2, 2);
        c3 = Math.pow(num3, 2);
        c4 = Math.pow(num4, 2);
        c5 = Math.pow(num5, 2);
        c6 = Math.pow(num6, 2);
        c7 = Math.pow(num7, 2);
        c8 = Math.pow(num8, 2);
        c9 = Math.pow(num9, 2);

        //Salida de datos
        salida = "El cuadrado de " + num1 + " es: " + c1 +
                 "\nEl cuadrado de " + num2 + " es: " + c2 +
                 "\nEl cuadrado de " + num3 + " es: " + c3 +
                 "\nEl cuadrado de " + num4 + " es: " + c4 +
                 "\nEl cuadrado de " + num5 + " es: " + c5 +
                 "\nEl cuadrado de " + num6 + " es: " + c6 +
                 "\nEl cuadrado de " + num7 + " es: " + c7 +
                 "\nEl cuadrado de " + num8 + " es: " + c8 +
                 "\nEl cuadrado de " + num9 + " es: " + c9;

        JOptionPane.showMessageDialog(null, salida);
    }
}
