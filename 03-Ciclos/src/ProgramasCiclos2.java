import javax.swing.*;

public class ProgramasCiclos2 {
    public static void main(String[] args) {
        //Declaracion de variables
        String menu="";
        String opcion="";
        boolean sentinel=true;

        //Creacion del Menu
        menu = "Menu Principal\n" +
                "1) Calificacion media y baja (for)\n" +
                "2) Hombres y Mujeres (while)\n" +
                "3) Supermercado (do-while)" +
                "\n4) Salir" +
                "\nElegir opcion: ";

        do {
            opcion = JOptionPane.showInputDialog(menu);

            switch (opcion) {
                case "1":
                    calificaciones();
                    break;
                case "2":
                    grupoHM();
                    break;
                case "3":
                    supermercado();
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


    public static void calificaciones() {
        //Declaracion de variables
        int numAlumnos=0;
        double calif=0.0;
        double totalCalif=0.0;
        double media=0.0;
        double califBaja=0.0;
        String salida="";

        //Entrada de valores
        numAlumnos = Integer.parseInt(JOptionPane.showInputDialog("Ingresar la cantidad de alumnos: "));

        for (int i = 1; i <= numAlumnos; i++) {
            calif = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la calificacion del alunmo " + i + ": "));

            totalCalif += calif;

            media = totalCalif / 2;

            if (i == 1) {
                califBaja = calif;
            }
            if (califBaja > calif) {
                califBaja = calif;
            }
        }

        salida = "La media de las calificaciones de los " + numAlumnos + " alumnos es: " + media +"\n" +
                "La calificacion mas baja de todas fue: " + califBaja;

        JOptionPane.showMessageDialog(null, salida);
    }

    public static void grupoHM() {
        //Declaracion de variables
        int i=0;
        int cantPersonas=0;
        int hombres=0, mujeres=0;
        String persona="";
        String salida="";

        //Entrada de valores
        cantPersonas = Integer.parseInt(JOptionPane.showInputDialog("Ingresar la cantidad de personas: "));

        i = 1;

        while (i <= cantPersonas) {
            persona = JOptionPane.showInputDialog("Ingresa tu sexo: Hombre/Mujer");

            if (persona.equalsIgnoreCase("Mujer")) {
                mujeres += 1;
            } else if (persona.equalsIgnoreCase("Hombre")) {
                hombres += 1;
            } else {
                JOptionPane.showMessageDialog(null, "No nos interesas :)");
            }

            i++;
        }

        salida = "El total de mujeres es: " + mujeres +
                "\nEl total de hombres es: " + hombres;

        JOptionPane.showMessageDialog(null, salida);
    }

    public static void supermercado() {
        //Declaracion de variables
        boolean sentinel=true, sentinal=true;
        double precio=0.0, precioFinal=0.0;
        int cantProducto=0;
        double operacion=0.0;
        String pregunta="", salida="";

        //Entrada de variables
        do {
            sentinal = true;
            precio = Double.parseDouble(JOptionPane.showInputDialog("Ingresar el precio del producto a comprar: "));

            cantProducto = Integer.parseInt(JOptionPane.showInputDialog("Ingresar la cantidad de producto a comprar: "));

            operacion = precio * cantProducto;

            precioFinal += operacion;

            pregunta = JOptionPane.showInputDialog("¿Desea continuar comprando? Si/No");
            do {
                if (pregunta.equalsIgnoreCase("No")) {
                    sentinel = false;
                    sentinal = false;
                } else if (pregunta.equalsIgnoreCase("Si")){
                    sentinel = true;
                    sentinal = false;
                } else {
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
                }
            }while (sentinal == true);
        }while (sentinel == true);

        salida = "El total final de las compras deberia ser de: $" + precioFinal;

        JOptionPane.showMessageDialog(null, salida);
    }
}
