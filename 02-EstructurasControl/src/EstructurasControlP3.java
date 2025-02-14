import javax.swing.*;

public class EstructurasControlP3 {
    public static void main(String[] args) {
        //Declaracion de variables
        String opcion="";
        String menu="a)Llantera\n" +
                "b)Proveedor\n" +
                "c)Tres Numeros\n" +
                "d)Salir\n" +
                "Elegir alguna letra como opcion: ";

        //Entrada de datos
        opcion = JOptionPane.showInputDialog(menu);

        //Las hace mayusculas a las LETRAS
        opcion = opcion.toUpperCase();

        switch (opcion) {
            case "A":
                //Llamada al metodo
                llantera();
                break;
            case "B":
                //Llamada al otro metodo
                estereo();
                break;
            case "C":
                //Lamada al otro metodo
                numeros();
                break;
            case "D":
                JOptionPane.showMessageDialog(null, "El programa a fianlizado");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion no valida para el programa");
        }
    }


    public static void llantera() {
        //Declaracion de variables
        int cantidad=0;
        int precio=0;
        double precioFinal=0.0;

        //Entrada de valores
        cantidad =Integer.parseInt(JOptionPane.showInputDialog("Ingresar la cantidad de neumaticos a comprar: "));

        if (cantidad < 5) {
            precio = 300;
            JOptionPane.showMessageDialog(null, "El precio por cada llanta sera de $" + precio);
            precioFinal = cantidad * precio;
            JOptionPane.showMessageDialog(null, "El precio a pagar por " + cantidad + " llantas sera de: $" + precioFinal);
        } else if (cantidad >= 5 && cantidad < 10) {
            precio = 250;
            JOptionPane.showMessageDialog(null, "El precio por cada llanta sera de $" + precio);
            precioFinal = cantidad * precio;
            JOptionPane.showMessageDialog(null, "El precio a pagar por " + cantidad + " llantas sera de: $" + precioFinal);
        } else if (cantidad > 10) {
            precio = 200;
            JOptionPane.showMessageDialog(null, "El precio por cada llanta sera de $" + precio);
            precioFinal = cantidad * precio;
            JOptionPane.showMessageDialog(null, "El precio a pagar por " + cantidad + " llantas sera de: $" + precioFinal);
        }
    }

    public static void estereo() {
        //Declaracion de variables
        double precio=0.0;
        double iva=0.0;
        String marca="";
        double descuento1=0.0, descuento2=0.0;
        double precioFinal=0.0;

        //Entrada de valores
        precio = Double.parseDouble(JOptionPane.showInputDialog("Ingresar el precio del producto: "));

        if (precio >= 2000) {
            descuento1 = precio * 0.10;
            precioFinal = precio - descuento1;
            JOptionPane.showMessageDialog(null, "Se ha aplicado un descuento del 10% sin incluir IVA");
        } else {
            precioFinal = precio;
        }

        marca = JOptionPane.showInputDialog("Ingrese la marca del producto: ");

        if (marca.equalsIgnoreCase("NOSY")) {
            iva = Double.parseDouble(JOptionPane.showInputDialog("Ingresar el porcentaje de IVA: "));

            iva = iva / 100.0;
            iva = precio * iva;

            descuento2 = (precio + iva) * 0.05;
            precioFinal = precioFinal - descuento2;
            precioFinal = precioFinal + iva;
            JOptionPane.showMessageDialog(null,"El precio a pagar por el producto sera de: $" + precioFinal);
        } else {
            iva = Double.parseDouble(JOptionPane.showInputDialog("Ingresar el IVA: "));

            iva = iva / 100;
            iva = precio * iva;

            precioFinal = precioFinal + iva;
            JOptionPane.showMessageDialog(null,"El precio a pagar por el producto sera de: $" + precioFinal);
        }
    }

    public static void numeros() {
        //Declaracion de variables
        double num1=0.0, num2=0.0, num3=0.0;

        //Entrada de valores
        num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el 1er valor a comparar: "));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el 2do valor a comparar: "));
        num3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el 3er valor a comparar: "));

        //Comparacion
        if ((num1 > num2 && num1 < num3) || (num1 > num3 && num1 < num2)) {
            JOptionPane.showMessageDialog(null, "El numero medio del conjunto es el 1er valor: " + num1);
        } else if ((num2 > num1 && num2 < num3) || (num2 > num3 && num2 < num1)) {
            JOptionPane.showMessageDialog(null, "El numero medio del conjunto es el 2do valor: " + num2);
        } else if ((num3 > num1 && num3 < num2) || (num3 > num2 && num3 < num1)) {
            JOptionPane.showMessageDialog(null, "El numero medio del conjunto es el 3er valor: " + num3);
        }
        JOptionPane.showMessageDialog(null, "Fin del programa");
    }
}
