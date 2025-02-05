import javax.swing.*;

public class CalculadoraSencilla {
    public static void main(String[] args) {
        //Declaracion de variables
        String menu="";
        String opcion="";
        double num1=0.0, num2=0.0;
        double resultado=0.0;

        menu = "MENU PRINCIPAL\n" +
                "1)Sumar\n2)Restar\n" +
                "3)Dividir\n" +
                "4)Multiplicar\n" +
                "5)Mudulo\n" +
                "Elegir una opcion: ";

        //Entrada de valores
        opcion = JOptionPane.showInputDialog(menu);

        num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el 1er numero: "));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el 2do numero: "));

        if (num2>0.0){
            switch (opcion) {
                case "1":
                    //Suma
                    resultado = num1 + num2;
                    JOptionPane.showMessageDialog(null, "La suma es: " + resultado);
                    break;
                case "2":
                    //Resta
                    resultado = num1 - num2;
                    JOptionPane.showMessageDialog(null, "La resta es: " + resultado);
                    break;
                case "3":
                    //Division
                    resultado = num1 / num2;
                    JOptionPane.showMessageDialog(null, "La divison es: " + resultado);
                    break;
                case "4":
                    //Multiplicacion
                    resultado = num1 * num2;
                    JOptionPane.showMessageDialog(null, "La multiplicacion es: " + resultado);
                    break;
                case "5":
                    //Modulo
                    resultado = num1 % num2;
                    JOptionPane.showMessageDialog(null, "El modulo es: " + resultado);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "No seas p#/?!$o pone alguna opcion que te doy, guachin");
            }
        }else{
            JOptionPane.showMessageDialog(null, "El 2do numero debe ser distinto de cero (0)");
        }
    }
}
