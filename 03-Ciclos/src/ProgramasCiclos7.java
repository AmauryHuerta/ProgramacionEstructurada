import javax.swing.*;

public class ProgramasCiclos7 {
    public static void main(String[] args) {
        //Declaracion de variables
        String menu="";
        String opcion="";
        boolean sentinel=true;

        //Creacion del Menu
        menu = "Menu Principal\n" +
                "1) Suma de 10 valores (for)\n" +
                "2) Porcentaje de reprobados y Aprobados (while)\n" +
                "3) Sucesion de 5 en 5 desde el 20 hasta 'n' (while)" +
                "\n4) Salir" +
                "\nElegir opcion: ";

        do {
            opcion = JOptionPane.showInputDialog(menu);

            switch (opcion) {
                case "1":
                    suma();
                    break;
                case "2":
                    reprobadosAprobados();
                    break;
                case "3":
                    sucesion();
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


    public static void suma() {
        //Declaracion de variables
        final int cantValores=10;
        double valores=0.0;
        double suma=0.0;
        String salida="";

        //Entrada de valores
        for (int i = 1; i <= cantValores; i++) {
            valores = Double.parseDouble(JOptionPane.showInputDialog("Ingresar el valor " + i + " para sumar: "));

            suma += valores;
        }

        salida = "La suma de los valores dados es de: " + suma;

        JOptionPane.showMessageDialog(null, salida);
    }

    public static void reprobadosAprobados() {
        //Declaracion de variables
        int i=0;
        int cantAlumnos =0;
        double calif=0.0;
        double porcentaje1=0.0, porcentaje2=0.0;
        double reprobados=0.0, aprobados=0.0;
        String salida="";

        //Entrada de valores
        cantAlumnos = Integer.parseInt(JOptionPane.showInputDialog("Ingresar la cantidad de alumnos a evaluar: "));

        i=1;
        while (i <= cantAlumnos) {
            calif = Double.parseDouble(JOptionPane.showInputDialog("Ingresar la calificacion del alumno " + i));

            if (calif < 7.0) {
                reprobados ++;
            } else if (calif >= 7.0 && calif <= 10.0) {
                aprobados ++;
            }

            i++;
        }

        porcentaje1 = (reprobados * 100) / cantAlumnos;
        porcentaje2 = (aprobados * 100) / cantAlumnos;

        salida = "El porcentaje de reprobados es: " + String.format("%.2f", porcentaje1) + "%" +
                "\nEl porcentaje de aprobados es: " + String.format("%.2f", porcentaje2) + "%";

        JOptionPane.showMessageDialog(null, salida);
    }

    public static void sucesion() {
        //Declaracion de variables
        int i=0;
        int valor=0, valorFinal=0;
        int cantVeces=0;
        String salida1="", salida2="";

        //Entrada de valores
        cantVeces = Integer.parseInt(JOptionPane.showInputDialog("Ingresar la cantidad de veces que la sucesion avanzara: "));

        i = 1;
        valor = 20;
        while (i <= cantVeces) {
            salida1 += " " + valor + ", ";
            valorFinal += valor;
            valor += 5;

            i++;
        }

        salida2 = "La sucesion es: " + salida1 + "\n" + "\nEl valor de la suma de esta sucesion es: " + valorFinal;

        JOptionPane.showMessageDialog(null, salida2);
    }
}
