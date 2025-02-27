import javax.swing.*;

public class Ecuacion1 {
    public static void main(String[] args) {
        //Declaracion de variables
        int n=0;
        int denSup=0;
        int deno=0;
        double x=0.0;
        double s=0.0;

        //Entrada de valores
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog("Ingresar la cantidad de fracciones a sumar: "));
            x = Double.parseDouble(JOptionPane.showInputDialog("Ingresar el valor de x: "));
            if (n<0.0 && x<0.0) {
                JOptionPane.showMessageDialog(null, "El valor de 'x' y 'n' son menores que 0");
            } else if (x<0.0) {
                JOptionPane.showMessageDialog(null, "El valor de 'x' es menor que 0");
            } else if (n<0.0) {
                JOptionPane.showMessageDialog(null, "El valor de 'n' es menor que 0");
            }
        }while (n<0.0 || x<0.0);

        //Inicializar las variables
        denSup = 3;
        deno = 1;

        for (int i = 1; i <= n; i++) {
            s += Math.pow(x, 3.0/denSup) / deno;
            denSup += 3;
            deno += 2;
        }
        JOptionPane.showMessageDialog(null,
                "El valor de 's': " + String.format("%.4f", s));
    }
}
