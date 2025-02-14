import javax.swing.*;

public class ProgramasCiclos1 {
    public static void main(String[] args) {
        //Declaracion de variables
        String menu="";
        String opcion="";
        boolean sentinel=true;

        //Creacion del Menu
        menu = "Menu Principal\n" +
                "1) Promedio Calificaciones (for)\n" +
                "2) Vendedores (while)\n" +
                "3) Tienda (do-while)" +
                "\n4) Salir" +
                "\nElegir opcion: ";

        do {
            opcion = JOptionPane.showInputDialog(menu);

            switch (opcion) {
                case "1":
                    promedio();
                    break;
                case "2":
                    vendedores();
                    break;
                case "3":
                    JOptionPane.showMessageDialog(null, "Opcion 3");
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


    public static void promedio() {
        int numCalif=0;
        double calif=0.0;
        double promedio=0;

        //Ingresar cantidad de calificaciones
        numCalif = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de calificaciones: "));

        for (int i = 1; i<= numCalif; i++) {
            //Solicitar calificaciones
            calif = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la calificacion " + i + ": "));

            //Acumular Calificaciones
            promedio+=calif;
        }
        promedio/=numCalif;
        JOptionPane.showMessageDialog(null,"El promedio del alumno es: " + promedio);
    }

    public static void vendedores() {
        String nombres="";
        int numVendedores=0;
        double sueldoBase=0.0;
        double comision=0.0;
        double sueldoTotal=0.0;
        String salida="";

        numVendedores = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el numero de vendedores: "));
        sueldoBase= Double.parseDouble(JOptionPane.showInputDialog("Ingresar el sueldo base: "));

        salida = "Nombre          Comision        Sueldo Total\n";

        int i=1;

        while (i<=numVendedores) {
            nombres = JOptionPane.showInputDialog("Ingrese el nombre del vendedor " + i + ": ");
            salida+=nombres + "          " + comision + "        " + sueldoTotal + "\n";
            i++;
        }
        JOptionPane.showMessageDialog(null, salida);
    }


}
