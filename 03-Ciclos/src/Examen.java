import javax.swing.*;

public class Examen {
    public static void main(String[] args) {
        //Declaracion de variables
        String menu="";
        String opcion="";
        boolean sentinel=true;

        //Creacion del Menu
        menu = "Menu Principal\n" +
                "1) Poblacion estudiantil (while)\n" +
                "2) Liga mexicana de beisbol (while)" +
                "\n3) Salir" +
                "\nElegir opcion: ";

        do {
            opcion = JOptionPane.showInputDialog(menu);

            switch (opcion) {
                case "1":
                    poblacion();
                    break;
                case "2":
                    beisbol();
                    break;
                case "3":
                    JOptionPane.showMessageDialog(null, "Adios, Alguien lee esto?");
                    sentinel = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
            }
        } while (sentinel);
    }


    public static void poblacion() {
        //Declaracion de variables
        double poblacionActual=0, poblacionEstimada=0;
        double crecimientoAnual=0.0, porcentajeCremiento=0.0;
        int añoActual=0, añoEstimado=0;
        String salida="", salidaaño="";

        //Entrada de valores
        poblacionActual = Integer.parseInt(JOptionPane.showInputDialog("Ingresar la poblacion actual: "));
        añoActual = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el año actual: "));
        añoEstimado = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el año a estimar: "));
        crecimientoAnual = Double.parseDouble(JOptionPane.showInputDialog("Ingresar el porcentaje de cremiento esperado: "));

        porcentajeCremiento = (crecimientoAnual / 100);
        poblacionEstimada = poblacionActual;

        while (añoActual <= añoEstimado) {
            poblacionEstimada += poblacionEstimada * porcentajeCremiento;

            salidaaño += "En el año " + añoActual + " es de una poblacion de: " + poblacionEstimada + "\n";

            añoActual++;
        }

        salida = salidaaño + "\nLa poblacion estimada para el año " + añoEstimado + " con un porcentaje de cremiento del " + crecimientoAnual + "% seria de una poblacion de: " + String.format("%.4f",poblacionEstimada);

        JOptionPane.showMessageDialog(null, salida);
    }

    public static void beisbol() {
        //Declaracion de variables
        int i=0, j=0;
        int edad=0;
        double peso=0.0, pesoTotal1 =0.0, pesoTotal2 =0.0, edadTotal1 =0, edadTotal2 =0;
        int cantEquipos=0;
        int cantJugadores=0;
        String salida1="", salida2="", salida3="";

        //Entrada de valores
        cantEquipos = Integer.parseInt(JOptionPane.showInputDialog("Ingresar la cantidad de equipos: "));

        i = 1;
        while (i <= cantEquipos) {
            cantJugadores = Integer.parseInt(JOptionPane.showInputDialog("Ingresar la cantidad de jugadores del equipo " + i));

            j = 1;
            while (j <= cantJugadores) {

                edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresar la edad del jugador " + j + " del equipo " + i));
                peso = Double.parseDouble(JOptionPane.showInputDialog("Ingresar el peso del jugador " + j + " del equipo " + i));

                edadTotal1 += edad;
                pesoTotal1 += peso;

                j++;
            }

            edadTotal1 = edadTotal1 / cantJugadores;
            pesoTotal1 = pesoTotal1 / cantJugadores;

            salida1 += "" + i + "          " + String.format("%.2f",pesoTotal1) + "          " + String.format("%.2f",edadTotal1) + "\n";

            edadTotal2 += edadTotal1;
            pesoTotal2 += pesoTotal1;

            edadTotal1 = 0;
            pesoTotal1 = 0;
            i++;
        }

        edadTotal2 = edadTotal2 / cantEquipos;
        pesoTotal2 = pesoTotal2 / cantEquipos;
        salida2 = "Peso: Promedio General: " + String.format("%.4f",pesoTotal2) +
                "\nEdad: Promedio General: " + String.format("%.2f",edadTotal2);

        salida3 = "Estadistica" +
                "\n Equipo " + "     " + "Peso promedio" + "     " + "Edad promedio" +
                "\n" + salida1 +
                "\n" + salida2;

        JOptionPane.showMessageDialog(null, salida3);
    }
}
