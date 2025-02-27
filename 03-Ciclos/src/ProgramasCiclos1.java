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
                    tienda();
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
        double venta1=0.0, venta2=0.0, venta3=0.0;

        numVendedores = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el numero de vendedores: "));
        sueldoBase= Double.parseDouble(JOptionPane.showInputDialog("Ingresar el sueldo base: "));

        salida = "Nombre                                             Comision                    Sueldo Total\n";

        int i=1;

        while (i<=numVendedores) {
            nombres = JOptionPane.showInputDialog("Ingrese el nombre del vendedor " + i + ": ");

            venta1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresar la 1ra venta: "));
            venta2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresar la 2da venta: "));
            venta3 = Double.parseDouble(JOptionPane.showInputDialog("Ingresar la 3ra venta: "));

            comision = (venta1 + venta2 + venta3) * 0.10;

            sueldoTotal = sueldoBase + comision;

            salida += nombres + "                         " + comision + "                    " + sueldoTotal + "\n";
            i++;
        }
        JOptionPane.showMessageDialog(null, salida);
    }

    public  static void tienda() {
        String respuesta="", salida="", resultado="";
        boolean sentinel=true;
        double totalCompra=0.0, descuento=0.0, importe=0.0, total=0.0;
        String tipoBolita="";
        String menuBolitas="Tombola\n" +
                            "a) Bolita roja\n" +
                            "b) Bolita amarilla\n" +
                            "c) Bolita blanca\n" +
                            "Elegir alguna opcion: ";

        salida = "Total de ventas\n" +
                 "Total a pagar                   " + "Descuento                    " + "Importe          \n";


        do {
            totalCompra = Double.parseDouble(JOptionPane.showInputDialog("Ingresar el total de la compra: "));
            tipoBolita = JOptionPane.showInputDialog(menuBolitas);

            if (tipoBolita.equalsIgnoreCase("a") || tipoBolita.equalsIgnoreCase("b") || tipoBolita.equalsIgnoreCase("c")) {
                if (tipoBolita.equalsIgnoreCase("a")) {
                    descuento = totalCompra * 0.40;

                } else if (tipoBolita.equalsIgnoreCase("b")) {
                    descuento = totalCompra * 0.25;

                } else {
                    descuento = 0.0;
                }

                importe = totalCompra - descuento;
                total += importe;

                salida += totalCompra + "                    " + descuento + "                    " + importe + "\n";

            } else {
                JOptionPane.showMessageDialog(null, "Bolita no valida");
            }

            respuesta = JOptionPane.showInputDialog("Desea cerrar la caja si/no");

            if (respuesta.equalsIgnoreCase("si")) {
                sentinel = false;
            }
        }while (sentinel);

        resultado += "Total: " + total;
        JOptionPane.showMessageDialog(null, resultado);
    }
}
