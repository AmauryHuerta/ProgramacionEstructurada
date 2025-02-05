import javax.swing.*;

public class CentigradosFahrenheit {
    /*
     * Hacer un programa que dada la temperatura en grados centígrados (C)
     * se pueda convertir a su equivalente Fahrenheit (F) con la fórmula:
     *  F = 9/5 C + 32
     */
    public static void main(String[] args) {
        //Declaracion de variables
        double centigrados=0.0;
        double operacion=0.0;
        String salida="";

        //Entrada de variables
        centigrados = Double.parseDouble(JOptionPane.showInputDialog("Ingresar los grados centigrados a convertir: "));

        //Operacion
        operacion = ((4.0/5.0) * centigrados) + 32;

        //Salida de valores
        salida = "Los " + centigrados + " grados centigrados son : " + String.format("%.2f", operacion) + " grados Fahrenheit";

        JOptionPane.showMessageDialog(null, salida);
    }
}
