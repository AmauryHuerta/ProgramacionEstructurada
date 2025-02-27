import javax.swing.*;

public class ProgramasCiclos10 {
    public static void main(String[] args) {
        //Declaracion de variables
        String menu="";
        String opcion="";
        boolean sentinel=true;

        //Creacion del Menu
        menu = "Menu Principal\n" +
                "1) Verificar si es numero primo (while)\n" +
                "2) Positivos se suman y Negativos se multiplican (while)\n" +
                "3) Los valores del 1000 al 0 (while?)" +
                "\n4) Salir" +
                "\nElegir opcion: ";

        do {
            opcion = JOptionPane.showInputDialog(menu);

            switch (opcion) {
                case "1":
                    primo();
                    break;
                case "2":
                    sumaResta();
                    break;
                case "3":
                    mil();
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


    public static void primo() {
        // Declaracion de variables
        int valor = 0;
        boolean primo = true;
        int i = 0;
        String salida = "";

        //Entrada de valores
        valor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número:"));

        i = 2;
        if (valor < 2) {
            primo = false;
        } else {
            while (i <= Math.sqrt(valor)) {
                if (valor % i == 0) {
                    primo = false;
                    break;
                }
                i++;
            }
        }

        if (primo) {
            salida = "El número '" + valor + "' es primo.";
        } else {
            salida = "El número '" + valor + "' no es primo.";
        }

        JOptionPane.showMessageDialog(null, salida);
    }

    public static void sumaResta() {
        //Declaracion de variables
        int i=0;
        int cantValor =0;
        double valor=0.0;
        double suma=0.0, multiplicacion=0.0;
        String salida="";

        //Entrada de valores
        cantValor = Integer.parseInt(JOptionPane.showInputDialog("Ingresar la cantidad de valores a ingresar: "));

        i = 1;
        multiplicacion = 1;
        while (i <= cantValor) {
            valor = Double.parseDouble(JOptionPane.showInputDialog("Ingresar el valor " + i));

            if (valor < 0) {
                multiplicacion *= valor;
            } else if (valor >= 0) {
                suma += valor;
            }

            i++;
        }

        salida = "La suma de los valores positivos es: " + suma +
                "\nLa multiplicacion de los valores negativos es: " + multiplicacion;

        JOptionPane.showMessageDialog(null, salida);
    }

    public static void mil() {
        //Declaracion de variables
        int i=0;
        int valor=0;
        String salida="";

        i = 1;
        valor = 1000;
        while (i <= valor) {
            salida += " " + valor + ", ";
            valor--;
            i++;
        }

        JOptionPane.showMessageDialog(null, "Los valores son: " + salida);
    }
}
