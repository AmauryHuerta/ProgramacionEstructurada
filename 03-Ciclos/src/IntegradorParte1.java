import javax.swing.*;

public class IntegradorParte1 {
    public static void main(String[] args) {
        int opcion;
        do {
            String menu = "Menú de ejercicios:\n" +
                    "1. Local de frutas\n" +
                    "2. Estación de servicio\n" +
                    "3. Cuenta regresiva\n" +
                    "4. Números pares del 1 al 100\n" +
                    "5. Pares, Impares, Negativos\n" +
                    "6. Salir\n" +
                    "Seleccione una opción:";
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcion) {
                case 1:
                    frutas();
                    break;
                case 2:
                    gasolineria();
                    break;
                case 3:
                    cuenta();
                    break;
                case 4:
                    numPares();
                    break;
                case 5:
                    numeros();
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 6);
    }

    public static void frutas() {
        // Declaracion de variables
        double cantidadComprada = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de fruta comprada (en kg):"));
        double precioPorKg = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio por kilogramo de fruta:"));
        double montoTotal = cantidadComprada * precioPorKg;

        if (cantidadComprada > 5) {
            double descuento = montoTotal * 0.15;
            montoTotal -= descuento;
            JOptionPane.showMessageDialog(null, "El monto a pagar con descuento es: $" + montoTotal);
        } else {
            JOptionPane.showMessageDialog(null, "El monto a pagar es: $" + montoTotal);
        }
    }

    public static void gasolineria() {
        double totalDiesel = 0, totalMagna = 0, totalPremium = 0;
        int litrosDiesel = 0, litrosMagna = 0, litrosPremium = 0;
        int opcionCombustible;
        double litros = 0.0;
        double totalRecaudado = 0.0;
        String salida = "";

        do {
            opcionCombustible = Integer.parseInt(JOptionPane.showInputDialog(
                    "Seleccione el tipo de combustible:\n" +
                            "1. Diesel ($31)\n" +
                            "2. Magna ($24)\n" +
                            "3. Premium ($28)\n" +
                            "0. Finalizar ventas"
            ));

            if (opcionCombustible != 0) {
                litros = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de litros vendidos:"));
                switch (opcionCombustible) {
                    case 1:
                        totalDiesel += litros * 31;
                        litrosDiesel += litros;
                        break;
                    case 2:
                        totalMagna += litros * 24;
                        litrosMagna += litros;
                        break;
                    case 3:
                        totalPremium += litros * 28;
                        litrosPremium += litros;
                        break;
                }
            }
        } while (opcionCombustible != 0);

        totalRecaudado = totalDiesel + totalMagna + totalPremium;
        salida = "Total recaudado: $" + totalRecaudado + "\n";

        if (litrosDiesel > litrosMagna && litrosDiesel > litrosPremium) {
            salida += "Combustible más vendido: Diesel\n";
        } else if (litrosMagna > litrosPremium) {
            salida += "Combustible más vendido: Magna\n";
        } else {
            salida += "Combustible más vendido: Premium\n";
        }

        if (litrosDiesel < litrosMagna && litrosDiesel < litrosPremium) {
            salida += "Combustible menos vendido: Diesel\n";
        } else if (litrosMagna < litrosPremium) {
            salida += "Combustible menos vendido: Magna\n";
        } else {
            salida += "Combustible menos vendido: Premium\n";
        }

        JOptionPane.showMessageDialog(null, salida);
    }

    public static void cuenta() {
        int numero = 0;
        String salida = "";

        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número para la cuenta regresiva:"));

        for (int i = numero; i >= 0; i--) {
            salida += i + "\n";
        }
        JOptionPane.showMessageDialog(null, salida);
    }

    public static void numPares() {
        String numerosPares = "";
        String salida = "";

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                numerosPares += i + " ";
            }
        }

        salida = "Números pares entre 1 y 100:\n" + numerosPares;

        JOptionPane.showMessageDialog(null, salida);
    }

    public static void numeros() {
        double sumaPares = 0, productoImpares = 1;
        int cantidadNegativos = 0;
        String respuesta = "";
        String salida = "";

        do {
            double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un número:"));
            if (numero1 % 2 == 0) {
                sumaPares += numero1;
            } else {
                productoImpares *= numero1;
            }
            if (numero1 < 0) {
                cantidadNegativos++;
            }
            respuesta = JOptionPane.showInputDialog("¿Desea ingresar otro número? (s/n):");
        } while (respuesta.equalsIgnoreCase("s"));

        salida = "Suma de números pares: " + sumaPares + "\n" +
                "Producto de números impares: " + productoImpares + "\n" +
                "Cantidad de números negativos: " + cantidadNegativos;

        JOptionPane.showMessageDialog(null, salida);
    }
}
