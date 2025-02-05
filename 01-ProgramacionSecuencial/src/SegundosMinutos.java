import javax.swing.*;

public class SegundosMinutos {
    /*
     * Hacer un programa que convierta un número dado en segundos
     * a minutos y que imprima el resultado
     */
    public static void main(String[] args) {
        //Declaracion de variables
        double segundos=0.0;
        double operacion=0.0;
        String salida="";

        //Entrada de valores
        segundos = Double.parseDouble(JOptionPane.showInputDialog("Ingresar los segundos a convertir: "));

        //Operacion
        operacion = segundos / 60;

        //Salida de valores
        salida = "Los " + segundos + " segundos convertidos a minutos son: " + String.format("%.4f", operacion);

        JOptionPane.showMessageDialog(null, salida);
    }
}
