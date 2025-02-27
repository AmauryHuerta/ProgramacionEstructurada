import javax.swing.*;

public class ProgramasCiclos4 {
    public static void main(String[] args) {
        //Declaracion de variables
        String menu="";
        String opcion="";
        boolean sentinel=true;

        //Creacion del Menu
        menu = "Menu Principal\n" +
                "1) Muestreo peso (for)\n" +
                "2) Promedio de edades (while)\n" +
                "3) Masa de aire de neumaticos (while)" +
                "\n4) Salir" +
                "\nElegir opcion: ";

        do {
            opcion = JOptionPane.showInputDialog(menu);

            switch (opcion) {
                case "1":
                    muestreo();
                    break;
                case "2":
                    promedioEdades();
                    break;
                case "3":
                    masadeaire();
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


    public static void muestreo() {
        //Declaracion de variables
        int cantPersonas=0;
        int edad=0;
        double peso=0.0, pesoNiños =0.0, pesoJovenes=0.0, pesoAdultos=0.0, pesoViejos =0.0;
        double cantNiños=0.0, cantJovenes=0.0, cantAdultos =0.0, cantViejos=0.0;
        double niños=0.0, jovenes=0.0, adultos=0.0, viejos=0.0;
        String salida="";

        //Entrada de valores
        cantPersonas = Integer.parseInt(JOptionPane.showInputDialog("Ingresar la cantidad de personas del muestreo: "));

        for (int i = 1; i <= cantPersonas ; i++) {
            edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresar la edad de la persona: "));

            if (edad < 0) {
                JOptionPane.showMessageDialog(null, "No puedes ingresar edades por debajo de cero (0)");
            } else if (edad >= 0 && edad <= 12) {
                peso += Double.parseDouble(JOptionPane.showInputDialog("Ingresar el peso de la persona: "));

                pesoNiños +=peso;
                cantNiños ++;
            } else if (edad >= 13 && edad <= 29) {
                peso += Double.parseDouble(JOptionPane.showInputDialog("Ingresar el peso de la persona: "));

                pesoJovenes += peso;
                cantJovenes ++;
            } else if (edad >= 30 && edad <= 59) {
                peso += Double.parseDouble(JOptionPane.showInputDialog("Ingresar el peso de la persona: "));

                pesoAdultos += peso;
                cantAdultos ++;
            } else if (edad >= 60) {
                peso += Double.parseDouble(JOptionPane.showInputDialog("Ingresar el peso de la persona: "));

                pesoViejos += peso;
                cantViejos ++;
            }
            peso = 0;
        }

        niños = pesoNiños / cantNiños;
        jovenes = pesoJovenes / cantJovenes;
        adultos = pesoAdultos / cantAdultos;
        viejos = pesoViejos / cantViejos;

        salida = "El promedio de peso por personas es: " +
                "\nNiños: " + String.format("%.4f", niños) +
                "\nJovenes: " + String.format("%.4f", jovenes) +
                "\nAdultos: " + String.format("%.4f", adultos) +
                "\nViejos: " + String.format("%.4f", viejos);

        JOptionPane.showMessageDialog(null, salida);
    }

    public static void promedioEdades() {
        int i=0;
        int cantPersonas=0;
        double edad=0, edadM=0, edadH=0, edadTotal=0;
        int mujeres=0, hombres=0;
        double operacion1=0.0, operacion2=0.0, operacion3=0.0;
        String genero="";
        String salida="";

        //Entrada de valores
        cantPersonas = Integer.parseInt(JOptionPane.showInputDialog("Ingresar la cantidad de gente a promediar: "));

        i = 1;

        while (i <= cantPersonas) {
            genero = JOptionPane.showInputDialog("Ingresar tu genero: Hombre/Mujer");

            if (genero.equalsIgnoreCase("Mujer")) {
                mujeres ++;
                edad = Double.parseDouble(JOptionPane.showInputDialog("Ingresar tu edad: "));

                edadM += edad;
            } else if (genero.equalsIgnoreCase("Hombre")) {
                hombres ++;
                edad = Double.parseDouble(JOptionPane.showInputDialog("Ingresar tu edad: "));

                edadH += edad;
            } else {
                JOptionPane.showMessageDialog(null, "Opcion no encontrada");
            }
            edadTotal += edad;

            i++;
        }

        operacion1 = edadM / mujeres;
        operacion2 = edadH / hombres;
        operacion3 = edadTotal / cantPersonas;

        salida = "El promedio de las edades en el grupo son: " +
                "\nEn general: " + operacion3 +
                "\nDe Mujeres: " + operacion1 +
                "\nDe Hombres: " + operacion2;

        JOptionPane.showMessageDialog(null, salida);
    }

    public static void masadeaire() {
        //Declaracion de variables
        int i = 0;
        int cantVehiculos =0;
        double promedioMasa=0;
        double sumaMasa = 0;
        String salida="";

        //Entrada de valores
        cantVehiculos = Integer.parseInt(JOptionPane.showInputDialog("Ingresar la cantidad de vehículos:"));

        i = 1;
        while (i <= cantVehiculos) {

            double presion = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la presión del neumático del vehículo " + (i + 1) + ":"));
            double volumen = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el volumen del neumático del vehículo " + (i + 1) + ":"));
            double temperatura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la temperatura del neumático del vehículo " + (i + 1) + ":"));

            double masa = (presion * volumen) / (0.37 * (temperatura + 460));

            sumaMasa += masa;

            i++;
        }

        promedioMasa = sumaMasa / cantVehiculos;

        salida = "El promedio de masa de aire de los neumáticos de los " + cantVehiculos + " vehículos es: " + promedioMasa;

        JOptionPane.showMessageDialog(null, salida);
    }
}
