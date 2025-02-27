import javax.swing.*;

public class ProgramasCiclos3 {
    public static void main(String[] args) {
        //Declaracion de variables
        String menu="";
        String opcion="";
        boolean sentinel=true;

        //Creacion del Menu
        menu = "Menu Principal\n" +
                "1) Tabla de multiplicar (for)\n" +
                "2) Promedio de 'n' alumnos (while)\n" +
                "3)  Descuentos en el teatro (do-while)" +
                "\n4) Salir" +
                "\nElegir opcion: ";

        do {
            opcion = JOptionPane.showInputDialog(menu);

            switch (opcion) {
                case "1":
                    tabla();
                    break;
                case "2":
                    promedio();
                    break;
                case "3":
                    teatro();
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


    public static void tabla() {
        //Declaracion de variables
        int numVeces=0;
        int multiplicado=0;
        int multiplicador=0;
        int producto=0;
        String salida="";

        //Entrada de valores
        numVeces = Integer.parseInt(JOptionPane.showInputDialog("Ingresar hasta cual multiplicar: "));
        multiplicado = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el numero de la tabla: "));

        for (int i = 0; i <= numVeces; i++) {
            producto = multiplicado * multiplicador;

            salida += "=>  " + multiplicado + " x " + multiplicador + " = " + producto + "\n";

            multiplicador += 1;
        }

        JOptionPane.showMessageDialog(null, "     Tabla del " + multiplicado + "\n" + salida);
    }

    public static void promedio() {
        //Declaracion de variables
        int i=0;
        double promedio=0;
        double calif=0.0, totalCalif=0.0;
        int numAlum=0;
        String salida="";

        //Entrada de valores
        numAlum = Integer.parseInt(JOptionPane.showInputDialog("Ingresar la cantidad de alumnos: "));

        i=1;
        while (i <= numAlum) {
            calif = Double.parseDouble(JOptionPane.showInputDialog("Ingresar la calificacion del alumno " + i));

            totalCalif += calif;

            promedio = totalCalif / numAlum;

            i++;
        }

        salida = "El promedio de las calificaciones de los " + numAlum + " alumnos es: " + promedio;

        JOptionPane.showMessageDialog(null,  salida);
    }

    public static void teatro() {
        //Declaracion de variables
        int i=0;
        int cantBoletos=0;
        int edad=0;
        double precio=0.0;
        double niños=0.0, jovenes=0.0, adultos1=0.0, adultos2=0.0, adultosMayores=0.0;
        String salida="";

        //Entada de valores
        precio = Double.parseDouble(JOptionPane.showInputDialog("Ingresar el precio de los boletos: "));
        cantBoletos = Integer.parseInt(JOptionPane.showInputDialog("Ingresar la cantidad de boletos a comprar: "));

        i=1;
        do {
            edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresar la edad de la persona: "));

            if (edad < 5) {
                JOptionPane.showMessageDialog(null, "Niños menores a 5 años no pueden ingresar");
            } else if (edad >= 5 && edad <= 14) {
                niños += precio * 0.35;
            } else if (edad >= 15 && edad <= 19) {
                jovenes += precio * 0.25;
            } else if (edad >= 20 && edad <= 45) {
                adultos1 += precio * 0.10;
            } else if (edad >= 46 && edad <= 65) {
                adultos2 += precio * 0.25;
            } else if (edad >= 66) {
                adultosMayores += precio * 0.35;
            }

            i++;
        }while (i <= cantBoletos);

        salida = "Las ganancias dejadas de percibir por cada categoria son: " +
                "\nCategoria 1: " + niños +
                "\nCategoria 2: " + jovenes +
                "\nCategoria 3: " + adultos1 +
                "\nCategoria 4: " + adultos2 +
                "\nCategoria 5: " + adultosMayores;

        JOptionPane.showMessageDialog(null, salida);
    }
}
