import javax.swing.*;

public class AreaTriangulo {
    /*
     * Realizar un programa que calcule e imprima el área de un triangulo
     *
     */
    public static void main(String[] args) {
        //Declaracion de variables
        double base=0.0, altura=0.0;
        double area=0.0;
        String salida="";

        //Entrada de valores
        base = Double.parseDouble(JOptionPane.showInputDialog("Ingresar el valor de la base de tu triangulo: "));

        altura = Double.parseDouble(JOptionPane.showInputDialog("Ingresar el valor de la altura de tu triangulo: "));

        //Operacion
        area = (base * altura) / 2;

        //Salida de valores
        salida = "El valor del area de tu triangulo es: " + String.format("%.4f", area);

        JOptionPane.showMessageDialog(null, salida);
    }
}
