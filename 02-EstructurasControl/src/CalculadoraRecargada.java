import javax.swing.*;
import java.util.Locale;

public class CalculadoraRecargada {
    public static void main(String[] args) {
        //Declaracion de variables
        String menu="";
        String opcion="";
        double num1=0.0, num2=0.0;
        String resultado="";

        menu = "MENU PRINCIPAL\n" +
                "a)Sumar\n2)Restar\n" +
                "b)Dividir\n" +
                "c)Multiplicar\n" +
                "d)Mudulo\n" +
                "Elegir una opcion: ";

        //Entrada de valores
        opcion = JOptionPane.showInputDialog(menu);

        num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el 1er numero: "));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el 2do numero: "));

        //Eso convierte letras a minisculas
        opcion = opcion.toLowerCase();

        //Esto convierte ltras a mayusculas
         //opcion = opcion.toUpperCase();

        if (num2>0.0){
            switch (opcion) {
                case "a":
                    //Suma
                    resultado = "La suma es: " + (num1 + num2);
                    break;
                case "b":
                    //Resta
                    resultado = "La resta es: " + (num1 - num2);
                    break;
                case "c":
                    //Division
                    resultado = "La division es: " + (num1 / num2);
                    break;
                case "d":
                    //Multiplicacion
                    resultado = "La multiplicacion es: " + (num1 * num2);
                    break;
                case "e":
                    //Modulo
                    resultado = "La modulo es: " + (num1 % num2);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "No seais p#/?!$o pone alguna opcion que te doy, guachin");
            }
        }else{
            JOptionPane.showMessageDialog(null, "El 2do numero debe ser distinto de cero (0)");
        }
    }
}
