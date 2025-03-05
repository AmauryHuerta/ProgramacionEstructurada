import javax.swing.*;

public class IntegradorParte2 {
    public static void main(String[] args) {
        String menu = "Seleccione una opción:\n"
                + "1. Unidades de medida\n"
                + "2. Cajero automatico\n"
                + "3. Factorial de un numero\n"
                + "4. Los primero 7 numeros primos\n"
                + "5. Tabla de multiplicar\n"
                + "6. Salir";

        int opcion;
        do {
            String opcionStr = JOptionPane.showInputDialog(menu);
            opcion = Integer.parseInt(opcionStr);

            switch (opcion) {
                case 1:
                    medidas();
                    break;
                case 2:
                    cajero();
                    break;
                case 3:
                    factorial();
                    break;
                case 4:
                    numPrimos();
                    break;
                case 5:
                    tabla();
                    break;
                case 6: // Salir del programa
                    JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                    break;
                default: // Opción no válida
                    JOptionPane.showMessageDialog(null, "Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 6);
    }

    public static void medidas() {
        int opcionUnidades=0;
        double valor=0.0;
        double resultado = 0;
        String opcionUnidadesStr="";
        String valorStr="";

        String menuUnidades = "Seleccione la conversión:\n"
                + "1. Centímetros a pulgadas\n"
                + "2. Kilogramos a libras\n"
                + "3. Pies a yardas";
        opcionUnidadesStr = JOptionPane.showInputDialog(menuUnidades);
        opcionUnidades = Integer.parseInt(opcionUnidadesStr);

        valorStr = JOptionPane.showInputDialog("Ingrese el valor a convertir:");
        valor = Double.parseDouble(valorStr);

        switch (opcionUnidades) {
            case 1:
                resultado = valor / 2.54;
                JOptionPane.showMessageDialog(null, valor + " cm = " + resultado + " pulgadas");
                break;
            case 2:
                resultado = valor * 2.20462;
                JOptionPane.showMessageDialog(null, valor + " kg = " + resultado + " libras");
                break;
            case 3:
                resultado = valor / 3;
                JOptionPane.showMessageDialog(null, valor + " pies = " + resultado + " yardas");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción no válida.");
        }
    }

    public static void cajero() {
        double saldo = 1000.0;
        int opcionCajero=0;
        double retiro=0.0;
        double transferencia=0.0;
        String opcionCajeroStr="";
        String retiroStr="";
        String transferenciaStr="";

        String menuCajero = "Seleccione una opción:\n"
                + "1. Consultar saldo\n"
                + "2. Retirar dinero\n"
                + "3. Realizar transferencia";
        opcionCajeroStr = JOptionPane.showInputDialog(menuCajero);
        opcionCajero = Integer.parseInt(opcionCajeroStr);

        switch (opcionCajero) {
            case 1:
                JOptionPane.showMessageDialog(null, "Su saldo actual es: $" + saldo);
                break;
            case 2:
                retiroStr = JOptionPane.showInputDialog("Ingrese la cantidad a retirar:");
                retiro = Double.parseDouble(retiroStr);

                if (retiro > saldo) {
                    JOptionPane.showMessageDialog(null, "Fondos insuficientes.");
                } else {
                    saldo -= retiro;
                    JOptionPane.showMessageDialog(null, "Retiro exitoso. Nuevo saldo: $" + saldo);
                }
                break;
            case 3:
                transferenciaStr = JOptionPane.showInputDialog("Ingrese la cantidad a transferir:");
                transferencia = Double.parseDouble(transferenciaStr);
                if (transferencia > saldo) {
                    JOptionPane.showMessageDialog(null, "Fondos insuficientes.");
                } else {
                    saldo -= transferencia;
                    JOptionPane.showMessageDialog(null, "Transferencia exitosa. Nuevo saldo: $" + saldo);
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción no válida.");
        }
    }

    public static void factorial() {
        int numero=0;
        double factorial=0;
        String numeroStr="";
        String salida="";

        numeroStr = JOptionPane.showInputDialog("Ingrese un número para calcular su factorial:");
        numero = Integer.parseInt(numeroStr);
        factorial = 1;

        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }

        salida = "El factorial de " + numero + " es: " + factorial;

        JOptionPane.showMessageDialog(null, salida);
    }

    public static void numPrimos() {
        int contador = 0;
        int numeroPrimo = 2;
        String primos = "";

        primos = "Los primeros 7 números primos son:\n";

        while (contador < 7) {
            boolean esPrimo = true; // Reiniciar la variable esPrimo para cada nuevo número

            for (int i = 2; i <= Math.sqrt(numeroPrimo); i++) {
                if (numeroPrimo % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                primos += numeroPrimo + " ";
                contador++;
            }
            numeroPrimo++;
        }

        JOptionPane.showMessageDialog(null, primos);
    }

    public static void tabla() {
        int tablaNumero=0;
        String tablaNumeroStr="";
        String tabla="";

        tablaNumeroStr = JOptionPane.showInputDialog("Ingrese un número para mostrar su tabla de multiplicar:");
        tablaNumero = Integer.parseInt(tablaNumeroStr);
        tabla = "Tabla de multiplicar del " + tablaNumero + ":\n";

        for (int i = 1; i <= 10; i++) {
            tabla += tablaNumero + " x " + i + " = " + (tablaNumero * i) + "\n";
        }

        JOptionPane.showMessageDialog(null, tabla);
    }
}
