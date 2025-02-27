import javax.swing.*;

public class ProgramasCiclos5 {
    public static void main(String[] args) {
        //Declaracion de variables
        String menu="";
        String opcion="";
        boolean sentinel=true;

        //Creacion del Menu
        menu = "Menu Principal\n" +
                "1) Expendio de naranjas (for)\n" +
                "2) Valor menor de 'n' numeros (while)\n" +
                "3) Venta por kilo de huevo (while)" +
                "\n4) Salir" +
                "\nElegir opcion: ";

        do {
            opcion = JOptionPane.showInputDialog(menu);

            switch (opcion) {
                case "1":
                    expendio();
                    break;
                case "2":
                    valorMenor();
                    break;
                case "3":
                    granja();
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


    public static void expendio() {
        final int CLIENTES =15;
        double kilos=0.0;
        double descuento=0.0, precioPrincipal=0.0, precioInicial=0.0, precioTotal=0.0, total=0.0;
        String visualizacionPrecio="";
        String salida="";

        precioPrincipal = Double.parseDouble(JOptionPane.showInputDialog("Ingresar el precio por kilo de naranja: "));

        for (int i = 1; i <= CLIENTES; i++) {
            kilos = Double.parseDouble(JOptionPane.showInputDialog("Ingresar la cantidad de kilos de naranjas comprados: "));

            if (kilos > 10 ) {
                JOptionPane.showMessageDialog(null, "Se aplico descuento del 15%");
                precioInicial=kilos * precioPrincipal;
                descuento = precioInicial * 0.15;
                precioTotal = precioInicial - descuento;

            } else {
                precioInicial=kilos * precioPrincipal;
                precioTotal = precioInicial;
            }

            total += precioTotal;

            visualizacionPrecio += "El precio a pagar del cliente " + i + " es de: $" + precioTotal + "\n";
        }

        salida = "El precio a pagar por cada cliente es: \n" + visualizacionPrecio +
                "Lo que percibira la tienda por las compras sera de: $" + total;

        JOptionPane.showMessageDialog(null, salida);
    }

    public static void valorMenor() {
        //Declaracion de variables
        int i=0;
        double valorBajo=0.0;
        double valor=0.0;
        int cantvalores=0;
        String salida="";

        //Entrada de datos
        cantvalores = Integer.parseInt(JOptionPane.showInputDialog("Ingresar la cantidad de valores a ingresar: "));

        i=1;
        while (i <= cantvalores) {
            valor = Double.parseDouble(JOptionPane.showInputDialog("Ingresar el valor " + i));

            if (i == 1) {
                valorBajo = valor;
            }

            if (valor < valorBajo) {
                valorBajo = valor;
            }

            i++;
        }
        salida = "El valor mas bajo encontrado entre los " + cantvalores + " valores dados fue: " + valorBajo;

        JOptionPane.showMessageDialog(null, salida);
    }

    public static void granja() {
        //Declaracion de variables
        int i=0;
        int cantGallinas =0;
        double sumaCalidad=0.0;
        double promedioCalidad=0.0;
        double precioKilo =0.0;
        String salida="";

        //Entrada de valores
        cantGallinas = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el número de gallinas:"));

        i = 1;
        while (i <= cantGallinas) {
            double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso de la gallina " + (i + 1) + ":"));
            double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura de la gallina " + (i + 1) + ":"));
            int numHuevos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de huevos que pone la gallina " + (i + 1) + ":"));

            double calidad = (peso * altura) / numHuevos;

            sumaCalidad += calidad;

            i++;
        }

        promedioCalidad = sumaCalidad / cantGallinas;

        if (promedioCalidad >= 15) {
            precioKilo = 1.2 * promedioCalidad;
        } else if (promedioCalidad > 8 && promedioCalidad < 15) {
            precioKilo = 1.0 * promedioCalidad;
        } else {
            precioKilo = 0.8 * promedioCalidad;
        }

        salida = "El promedio de calidad de las gallinas es: " + promedioCalidad + "\nEl precio por kilo de huevo es: " + precioKilo;

        JOptionPane.showMessageDialog(null, salida);
    }
}
