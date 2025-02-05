import javax.swing.*;

public class PerimetroAreaCirculo {
    /*
     * Escribir un programa para calcular y de salida el perímetro
     * y el área de un círculo con un radio de 3,2 pulgadas.
     */
    public static void main(String[] args) {
        //Declaracion de contantes
        final double PI=3.1415926535897932384626433832;

        //Declaracion de variables
        double r=3.2;
        double a=0.0, p=0.0;
        String salida="";

        //Operacion para calcular area y perimetro
        a = PI * Math.pow(r, 2);
        p = 2 * PI * r;

        //Salida de resultados de area y perimetro
        salida = "El area del circulo con radio " + r + " pulgadas es de: " + String.format("%.4f", a) + " in" +
                 "\nEl perimetro del circulo con radio " + r + " pulgadas es de: " + String.format("%.4f", p) + " in";

        JOptionPane.showMessageDialog(null, salida);
    }
}
