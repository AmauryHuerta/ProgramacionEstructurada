import javax.swing.*;

public class Expresion {
    /*
     *Calcular el resultado de la expresion n = x+y/y-1,
     *para los valores de x y y cualesquiera
     */
    public static void main(String[] args) {
        //Declaracion de variables
        double x = 0.0;
        double y = 0.0;
        double funcion = 0.0;
        String salida = "";

        //Ingreso de las dos variables
        x = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de x: "));
        y = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de y: "));

        //Operacion de la funcion
        funcion = (x + y)/(y-1);

        //Salida del valor de la funcion
        salida = "El resultado de la funcion es: " + String.format("%.4f", funcion);

        JOptionPane.showMessageDialog(null, salida);


    }
}
