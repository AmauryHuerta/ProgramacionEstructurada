import javax.swing.*;

public class EstructurasControlP2 {
    public static void main(String[] args) {
        //Declaracion de variables
        String opcion="";
        String menu="a)Fabrica\n" +
                "b)Empresa\n" +
                "c)Insticucion\n" +
                "d)Salir\n" +
                "Elegir alguna letra como opcion: ";

        //Entrada de datos
        opcion = JOptionPane.showInputDialog(menu);

        //Las hace mayusculas a las LETRAS
        opcion = opcion.toUpperCase();

        switch (opcion) {
            case "A":
                //Llamada al metodo
                fabrica();
                break;
            case "B":
                //Llamada al otro metodo
                empresa();
                break;
            case "C":
                //Lamada al otro metodo
                institucion();
                break;
            case "D":
                JOptionPane.showMessageDialog(null, "El programa a fianlizado");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion no valida para el programa");
        }
    }


    public  static void fabrica() {
        //Declaracion de variables
        int cantidad=0;
        final int precio=11000;
        double descuento=0.0;
        double preciofinal=0.0;

        //Entrada de valores
        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de computadoras a comprar: "));

        if (cantidad <= 0) {
            JOptionPane.showMessageDialog(null, "Ingrese una cantidad mayor y diferente de cero (0)");
        }else {
            if (cantidad < 5) {
                descuento = (precio * cantidad) * 0.10;
                preciofinal = (precio * cantidad) - descuento;
                JOptionPane.showMessageDialog(null, "El precio a pagar seria de: " + preciofinal);
            } else if (cantidad >= 5 && cantidad < 10) {
                descuento = (precio * cantidad) * 0.20;
                preciofinal = (precio * cantidad) - descuento;
                JOptionPane.showMessageDialog(null, "El precio a pagar seria de: " + preciofinal);
            } else if (cantidad >= 10) {
                descuento = (precio * cantidad) * 0.40;
                preciofinal = (precio * cantidad) - descuento;
                JOptionPane.showMessageDialog(null, "El precio a pagar seria de: " + preciofinal);
            }
        }
    }

    public static void empresa() {
        //Declaracion de valores
        double saldo=0.0;
        double saldo1=0.0, saldo2=0.0;
        final int equipoComputo=5000, mobiliario=2000;

        //Entrada de valores
        saldo = Double.parseDouble(JOptionPane.showInputDialog("Ingresar el saldo actual con el que cuenta la empresa: "));

        if (saldo < 0) {
            saldo = 10000;
            JOptionPane.showMessageDialog(null, "Se ha pedido un prestamo y el saldo actual ahora es de $10,000");
        } else if (saldo >= 0 && saldo <= 20000) {
            saldo = 20000;
            JOptionPane.showMessageDialog(null, "Se ha pedido un prestamo y el saldo actual ahora es de $20,000");
        }else {
            JOptionPane.showMessageDialog(null, "No se ha sido necesario pedir ningun prestamo");
        }

        saldo -= equipoComputo;
        JOptionPane.showMessageDialog(null, "Se han destinado $5000 a equipo de computo del saldo actual");
        saldo -= mobiliario;
        JOptionPane.showMessageDialog(null, "Se han destinado $2000 a mobiliario del saldo actual");

        saldo /= 2.0;

        JOptionPane.showMessageDialog(null, "Y de saldo actual que queda la mitad (" + saldo + ") se ha destinado a la compra de insumos" +
                                                                    "\ny la otra mitad (" + saldo + ") se ha destinado a incentivos para el personal.");
        if (saldo < 0) {
            JOptionPane.showMessageDialog(null, "El proximo saldo a pedir tendra que ser de $10,000");
        } else if (saldo >= 0 && saldo <= 20000) {
            JOptionPane.showMessageDialog(null, "El proximo saldo a pedir tendra que ser de $20,000");
        } else if (saldo > 20000) {
            JOptionPane.showMessageDialog(null, "No se tendra que pedir ningun prestamo");
        }
    }

    public static void institucion() {
        //Declaracion de variables
        double promedio=0.0;
        String nivelAcademico="";
        int unidades=0;
        int profesional=300, preparatoria=180;
        double descuento=0.0;
        double pago=0.0, pagofinal=0.0;
        int reprobadas=0;

        //Entrada de valores
        promedio = Double.parseDouble(JOptionPane.showInputDialog("Ingresar el promedio del alumno: "));
        nivelAcademico = JOptionPane.showInputDialog("Ingresar el nivel academico en el cual se encuentra el alumno: (Preparatoria/Profesional)");

        if (nivelAcademico.equalsIgnoreCase("Preparatoria")) {
            if (promedio >= 9.5) {
                unidades = 55;
                JOptionPane.showMessageDialog(null, "La cantidad de unidades que podra cursar sera de 55");
                pago = (unidades / 5) * preparatoria;
                descuento = pago * 0.25;
                pagofinal = pago - descuento;
                JOptionPane.showMessageDialog(null, "El pago que debera realizar el alumno con un descuento de $" + descuento + " seran: $" + pagofinal);
            } else if (promedio >= 9 && promedio < 9.5) {
                unidades = 50;
                JOptionPane.showMessageDialog(null, "La cantidad de unidades que podra cursar sera de 50");
                pago = (unidades / 5) * preparatoria;
                descuento = pago * 0.10;
                pagofinal = pago - descuento;
                JOptionPane.showMessageDialog(null, "El pago que debera realizar el alumno con un descuento de $" + descuento + " seran: $" + pagofinal);
            } else if (promedio > 7 && promedio < 9) {
                unidades = 50;
                JOptionPane.showMessageDialog(null, "La cantidad de unidades que podra cursar sera de 50");
                pago = (unidades / 5) * preparatoria;
                pagofinal = pago;
                JOptionPane.showMessageDialog(null, "El pago que debera realizar el alumno seran: $" + pagofinal);
            } else if (promedio <= 7) {
                reprobadas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de materias reprobadas: "));
                if (reprobadas >= 0 && reprobadas <=3) {
                    unidades = 45;
                    JOptionPane.showMessageDialog(null, "La cantidad de unidades que podra cursar sera de 45");
                    pago = (unidades / 5) * preparatoria;
                    pagofinal = pago;
                    JOptionPane.showMessageDialog(null, "El pago que debera realizar el alumno seran: $" + pagofinal);
                } else if (reprobadas >= 4) {
                    unidades = 40;
                    JOptionPane.showMessageDialog(null, "La cantidad de unidades que podra cursar sera de 40");
                    pago = (unidades / 5) * preparatoria;
                    pagofinal = pago;
                    JOptionPane.showMessageDialog(null, "El pago que debera realizar el alumno seran: $" + pagofinal);
                } else {
                    JOptionPane.showMessageDialog(null, "Las materias reprobadas deben ser distintas de cero");
                }
            }
        } else if (nivelAcademico.equalsIgnoreCase("Profesional")) {
            if (promedio >= 9.5) {
                unidades = 55;
                JOptionPane.showMessageDialog(null, "La cantidad de unidades que podra cursar sera de 55");
                pago = (unidades / 5) * profesional;
                descuento = pago * 0.20;
                pagofinal = pago - descuento;
                JOptionPane.showMessageDialog(null, "El pago que debera realizar el alumno con un descuento de $" + descuento + " seran: $" + pagofinal);
            } else if (promedio < 9.5) {
                unidades = 55;
                JOptionPane.showMessageDialog(null, "La cantidad de unidades que podra cursar sera de 55");
                pago = (unidades / 5) * preparatoria;
                pagofinal = pago;
                JOptionPane.showMessageDialog(null, "El pago que debera realizar el alumno seran: $" + pagofinal);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Esa opcion no esta dentro del programa, intente una de las recomendadas");
        }
    }
}
