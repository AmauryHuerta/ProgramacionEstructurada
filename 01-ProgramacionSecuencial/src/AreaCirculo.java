import javax.swing.*;

public class AreaCirculo {
    public static void main(String[] args) {
        final double PI=3.1415926535897932384626433832;
        double r=0.0;
        double a=0.0;
        String salida;

        r = Double.parseDouble(JOptionPane.showInputDialog("Ingresar el valor del radio: "));

        a = PI * Math.pow(r, 2);
        salida = "El area del circulo con radio "+ r + " es: " + a;

        JOptionPane.showMessageDialog(null, salida);

    }
}
