import javax.swing.*;

public class ProgramasCiclos8 {
    public static void main(String[] args) {
        //Declaracion de variables
        String menu="";
        String opcion="";
        boolean sentinel=true;

        //Creacion del Menu
        menu = "Menu Principal\n" +
                "1) Sucesion 'invcrementativa' (while)\n" +
                "2) Valor mayor y menor de 'n' numeros (while)\n" +
                "3) Suma de 1 al 100 (while)" +
                "\n4) Salir" +
                "\nElegir opcion: ";

        do {
            opcion = JOptionPane.showInputDialog(menu);

            switch (opcion) {
                case "1":
                    sucesion();
                    break;
                case "2":
                    mayorMenor();
                    break;
                case "3":
                    suma();
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


    public static void sucesion() {
        //Declaracion de las variables
        int i=0;
        int valor=0, valorFinal=0;
        int cantVeces=0;
        String salida1="", salida2="";

        cantVeces = Integer.parseInt(JOptionPane.showInputDialog("Ingresar la cantidad de veces a avanzar: "));

        i = 1;
        while (i <= cantVeces) {
            valor = (i * i);
            salida1 += " " + valor + ", ";
            valorFinal += valor;

            i++;
        }

        salida2 = "La sucesion es: " + salida1 + "\n" + "\nEl valor de la suma de esta sucesion es: " + valorFinal;

        JOptionPane.showMessageDialog(null, salida2);
    }

    public static void mayorMenor() {
        //Declaracion de variables
        int i=0;
        int cantValores=0;
        double valores=0.0;
        double mayor=0.0, menor=0.0;
        String salida="";

        //Entrada de valores
        cantValores = Integer.parseInt(JOptionPane.showInputDialog("Ingresar la cantidad de valores a ingresar: "));

        i = 1;
        while (i <= cantValores) {
            valores = Double.parseDouble(JOptionPane.showInputDialog("Ingresar el valor " + i));

            if (i == 1) {
                mayor = valores;
                menor = valores;
            }

            if (mayor < valores) {
                mayor = valores;
            }

            if (menor > valores) {
                menor = valores;
            }
            i++;
        }

        salida = "El valor mayor del conjunto es: " + mayor +
                "\nEl valor menor del conjunto es: " + menor;

        JOptionPane.showMessageDialog(null, salida);
    }

    public static void suma() {
        //Declaracion de variables
        int i=0;
        int valor=0, valorFinal=0;
        double suma=0.0;
        String salida="";

        i = 1;
        while (i <= 100) {
            valor += 1;
            valorFinal += valor;

            i++;
        }

        salida = "La suma de los valores del 1 al 100 es: " + valorFinal;

        JOptionPane.showMessageDialog(null, salida);
    }
}
