import javax.swing.*;

public class PromediosCalificaciones {
    /*
     * Realizar un programa que calcule e imprima el promedio de cuatro calificaciones.
     *
     */
    public static void main(String[] args) {
        //Declaracion de variables
        double calif1=0.0, calif2=0.0, calif3=0.0, calif4=0.0;
        double promedio=0.0;
        String salida="";

        //Entrada de variables
        calif1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresar la 1er calificacion: "));
        calif2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresar la 2da calificacion: "));
        calif3 = Double.parseDouble(JOptionPane.showInputDialog("Ingresar la 3er calificacion: "));
        calif4 = Double.parseDouble(JOptionPane.showInputDialog("Ingresar la 4ta calificacion: "));

        //Operacion
        promedio = (calif1 + calif2 + calif3 + calif4) / 4;

        //Salida de valores
        salida = "El promedio de las calificaciones es: " + promedio;

        JOptionPane.showMessageDialog(null, salida);
    }
}
