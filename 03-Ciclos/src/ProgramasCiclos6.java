import javax.swing.*;

public class ProgramasCiclos6 {
    public static void main(String[] args) {
        //Declaracion de variables
        String menu="";
        String opcion="";
        boolean sentinel=true;

        //Creacion del Menu
        menu = "Menu Principal\n" +
                "1) Verificacion de automoviles (for)\n" +
                "2) Valor mayor de 'n' numeros (while)\n" +
                "3) Suma decendente 100 a 0 (while?)" +
                "\n4) Salir" +
                "\nElegir opcion: ";

        do {
            opcion = JOptionPane.showInputDialog(menu);

            switch (opcion) {
                case "1":
                    verificacion();
                    break;
                case "2":
                    valorMayor();
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



    public static void verificacion() {
        //Declaracion de variables
        final double Autos=25.0;
        int cantAutos=0;
        double puntos=0.0, masPuntos=0.0, menosPuntos=0.0;
        double puntosAcumulados=0.0, promedioPuntos=0.0;
        String salida1="", salida2="";

        //Entrada de valores
        cantAutos = Integer.parseInt(JOptionPane.showInputDialog("Ingresar la cantidad de autos a verificar: "));

        for (int i = 1; i <= cantAutos; i++) {
            puntos = Double.parseDouble(JOptionPane.showInputDialog("Ingresar los puntos de contaminantes del carro " + i + ": "));
            if (i <= Autos) {
                puntosAcumulados += puntos;
            }

            if (i == 1) {
                masPuntos = puntos;
                menosPuntos = puntos;
            }

            if (puntos > masPuntos) {
                masPuntos = puntos;
            }

            if (puntos < menosPuntos) {
                menosPuntos = puntos;
            }
        }

        promedioPuntos = puntosAcumulados / Autos;

        salida1 = "El promedio de puntos de los primeros 25 autos es de: " + promedioPuntos;

        salida2 = salida1 +
                "\nLos puntos mas bajos registrados fueron de: " + menosPuntos +
                "\nLos puntos mas altos registrados fueron de: " + masPuntos;

        JOptionPane.showMessageDialog(null, salida2);
    }

    public static void valorMayor() {
        //Declaracion de variables
        int i=0;
        double valorAlto =0.0;
        double valor=0.0;
        int cantvalores=0;
        String salida="";

        //Entrada de datos
        cantvalores = Integer.parseInt(JOptionPane.showInputDialog("Ingresar la cantidad de valores a ingresar: "));

        i=1;
        while (i <= cantvalores) {
            valor = Double.parseDouble(JOptionPane.showInputDialog("Ingresar el valor " + i));

            if (i == 1) {
                valorAlto = valor;
            }

            if (valor > valorAlto) {
                valorAlto = valor;
            }

            i++;
        }
        salida = "El valor mas alto encontrado entre los " + cantvalores + " valores dados fue: " + valorAlto;

        JOptionPane.showMessageDialog(null, salida);
    }

    public static void suma() {
        //Declaracion de variables
        int i=0;
        double valor=0.0;
        double suma=0.0;
        String salida="";

        valor = 100;
        i = 1;
        while (i <= 100) {
            suma += valor;
            valor -= 2;
            i += 2;
        }

        salida = "La suma de los valores de 100 a 0 de 2 en 2 es: " + suma;

        JOptionPane.showMessageDialog(null, salida);
    }
}
