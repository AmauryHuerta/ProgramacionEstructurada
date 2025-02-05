import javax.swing.*;

public class EcuacionTrinomio {
    /*
     * Realizar un programa que obtenga el valor de X de
     * la siguiente ecuación Y = 3X^2 + 7X − 15
     */
    public static void main(String[] args) {
        //Declaracion de variables
        double a=3.0, b=7.0, c=-15.0;
        double operacion1=0.0, operacion2=0.0;
        String salida="";

        //Operaciones
        operacion1 = (-b + (Math.sqrt(Math.pow(b, 2) - (4 * a * c)))) / (2 * a);

        operacion2 = (-b - (Math.sqrt(Math.pow(b, 2) - (4 * a * c)))) / (2 * a);

        //Salida de resultado
        salida = "El primer valor de X es: " + String.format("%.4f", operacion1) +
                 "\nEl segundo valor de X es: " + String.format("%.4f", operacion2);

        JOptionPane.showMessageDialog(null, salida);
    }
}
