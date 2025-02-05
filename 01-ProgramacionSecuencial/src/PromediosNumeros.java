import javax.swing.*;

public class PromediosNumeros {
    /*
     * Escribir un programa que calcula y muestra el promedio
     * de los números enteros 1,7, 9 y 34.
     */
    public static void main(String[] args) {
        //Declaracion de variables
        final int num=3;
        double num1=1.0, num2=7.0, num3=9.0, num4=34.0;
        double promedio=0.0;
        String salida="";

        //Operacion para calcular el promedio
        promedio = (num1 + num2 +num3)/num;

        //Salida del promdeio de los numeros
        salida = "El promedio de los numeros: " + num1 + ", " + num2 + ", " + num3 + ", " + num4 +
                 "\nes: " + String.format("%.4f",promedio);

        JOptionPane.showMessageDialog(null, salida);
    }
}
