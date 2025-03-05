import javax.swing.*;

public class ProyectoIntegrador1 {
    public static void main(String[] args) {
        //Declaracion de variables
        String menu="";
        String opcion="";
        boolean sentinel=true;

        //Creacion del Menu
        menu = "Menu Principal\n" +
                "1) Local de frutas (while)\n" +
                "2) Estacion de servicio (while)\n" +
                "3) (while)\n" +
                "4)  (while)\n" +
                "5) (while)" +
                "\n6) Salir" +
                "\nElegir opcion: ";

        do {
            opcion = JOptionPane.showInputDialog(menu);

            switch (opcion) {
                case "1":
                    frutas();
                    break;
                case "2":
                    gasolineria();
                    break;
                case "3":

                    break;
                case "4":

                    break;
                case "5":

                    break;
                case "6":
                    JOptionPane.showMessageDialog(null, "Adios, Alguien lee esto?");
                    sentinel = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
            }
        } while (sentinel);
    }


    public static void frutas() {
        //Declaracion de variables
        int i=0;
        int cantClientes=0;
        double descuento=0.0;
        double cantKilos=0.0;
        double precioFruta=0.0;
        double precioFinal=0.0;
        String salida="";

        //Entrada de valores
        cantClientes = Integer.parseInt(JOptionPane.showInputDialog("Ingresar la cantidad de personas a cobrar: "));

        i = 1;
        while (i <= cantClientes) {
            cantKilos = Double.parseDouble(JOptionPane.showInputDialog("Ingresar la cantidad de kilos a comprar del cliente " + i));
            precioFruta = Double.parseDouble(JOptionPane.showInputDialog("Ingresar el precio por kilo de la fruta elegida por el cliente " + i));

            if (cantKilos > 5) {
                descuento = (precioFruta * cantKilos) * .15;

                precioFinal = (precioFruta * cantKilos) - descuento;
            } else if (cantKilos <= 0) {
                JOptionPane.showMessageDialog(null, "Debe de comprar una cantidad de fruta");
            } else {
                precioFinal = precioFruta * cantKilos;
            }

            salida += "Cliente " + i + ": compro " + cantKilos + " kg de fruta y tendra que pagar: " + precioFinal + "\n";

            i++;
        }

        JOptionPane.showMessageDialog(null, salida);
    }

    public static void gasolineria() {
        //Declaracion de variables
        int i=0;
        int cantClientes=0;
        double cantLitros=0.0;
        int disel=0, magna=0, premium=0;
        double precioFinal=0.0, totalRecaudado=0.0;
        int masVendido=0, menosVendido=0;
        String tipoCombustible="";
        String salida="";
        String menu="";
        String opcion="";

        //Entrada de valores
        cantClientes = Integer.parseInt(JOptionPane.showInputDialog("Ingresar la cantidad de clientes: "));

        i = 1;
        while (i <= cantClientes) {
            //Creacion del Menu
            menu = "Menu Principal\n" +
                    "1) Disel (while)\n" +
                    "2) Magna (while)\n" +
                    "3) Premium (while)" +
                    "\n4) Salir" +
                    "\nElegir opcion: ";

            do {
                opcion = JOptionPane.showInputDialog(menu);

                switch (opcion) {
                    case "1":

                        break;
                    case "2":

                        break;
                    case "3":

                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion no valida");
                }
            } while (i==0); //<-----Pendiente
            i++;
        }
    }
}
