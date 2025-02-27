import javax.swing.*;
import java.math.BigInteger;

public class ProgramasCiclos9 {
    public static void main(String[] args) {
        //Declaracion de variables
        String menu="";
        String opcion="";
        boolean sentinel=true;

        //Creacion del Menu
        menu = "Menu Principal\n" +
                "1) Factorial (while)\n" +
                "2) Impares entre 0 a 100 (while)\n" +
                "3) Suma de los valores anteriores (while?)" +
                "\n4) Salir" +
                "\nElegir opcion: ";

        do {
            opcion = JOptionPane.showInputDialog(menu);

            switch (opcion) {
                case "1":
                    factorial();
                    break;
                case "2":
                    impares();
                    break;
                case "3":
                    anteceden();
                    break;
                case "4":
                    JOptionPane.showMessageDialog(null, "Adios, Alguien lee esto?");
                    sentinel = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
            }
        } while (sentinel);
    }


    public static void factorial() {
        //Declaracion de variables
        int i=0;
        int valor=0, valorInicial=0;
        int valorFinal=0;
        String salida="";

        valorInicial = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el valor a calcular: (no mayor a 12 porfavor)"));

        i = 1;
        valorFinal = 1;
        valor = valorInicial;
        while (i <= valorInicial) {
            if (valorInicial > 0) {
                valorFinal *= valor;
                valor -= 1;
            } else if (valor < 0) {
                JOptionPane.showMessageDialog(null, "El valor tiene que ser mayor o igual que cero");
            }

            i++;
        }

        salida = "El factorial de " + valorInicial + " es: " + valorFinal;

        JOptionPane.showMessageDialog(null, salida);
    }

    public static void impares() {
        //Declaracion de variables
        int i=0;
        int valor=0;
        String valorFinal="";
        String salida="";

        i=1;
        while (i <= 100) {
            valor += 1;
            if (valor%2 != 0) {
                valorFinal += " " + valor + ",";
            }

            i++;
        }

        salida = "Los numero impares seran: " + valorFinal;

        JOptionPane.showMessageDialog(null, salida);
    }

    public static void anteceden() {
        //Declaracion de variables
        int i=0;
        int valor=0, valorInicial=0;
        int valorFinal=0;
        String salida="";

        valorInicial = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el valor a calcular: "));

        i = 1;
        valor = valorInicial;
        while (i <= valorInicial) {
            if (valorInicial > 0) {
                valorFinal += valor;
                valor -= 1;
            }

            i++;
        }

        if (valorInicial < 0) {
            JOptionPane.showMessageDialog(null, "Podria seleccionar otra numero mayor o igual a cero?");
        }

        salida = "La suma de los valores que anteceden a " + valorInicial + " es: " + valorFinal;

        JOptionPane.showMessageDialog(null, salida);
    }
}
