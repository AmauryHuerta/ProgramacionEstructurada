import javax.swing.*;

public class EstructurasControlP1 {
    public static void main(String[] args) {
        //Declaracion de variables
        String opcion="";
        String menu="a)Juego\n" +
                    "b)Fruteria\n" +
                    "c)Laboratorio\n" +
                    "d)Salir\n" +
                    "Elegir alguna opcion: ";

        //Entrada de datos
        opcion = JOptionPane.showInputDialog(menu);

        //Las hace mayusculas a las LETRAS
        opcion = opcion.toUpperCase();

        switch (opcion) {
            case "A":
                //Llamada al metodo
                jugar();
                break;
            case "B":
                //Llamada al otro metodo
                fruteria();
                break;
            case "C":
                //Lamada al otro metodo
                laboratorio();
                break;
            case "D":
                JOptionPane.showMessageDialog(null, "El programa a fianlizado");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion no valida para el programa");
        }


    }

    public static void jugar() {
        String pregunta="¿Colon descrubrio America?";
        String respuesta=JOptionPane.showInputDialog(pregunta + "Si/No");
        if (respuesta.equalsIgnoreCase("Si")) {
            respuesta = JOptionPane.showInputDialog("¿La independencia de Mexico fue en 1810?");
            if (respuesta.equalsIgnoreCase("SI")) {
                respuesta = JOptionPane.showInputDialog("¿The doors fue un grupo de rock Americano?");
                if (respuesta.equalsIgnoreCase("si")) {
                    JOptionPane.showMessageDialog(null, "Has ganado");
                }else{
                    JOptionPane.showMessageDialog(null, "Has perdido");
                }
            }else{
                JOptionPane.showMessageDialog(null, "¿Si piensas?, has perdido");
            }
        }else{
            JOptionPane.showMessageDialog(null, "¿Si piensas?, has perdido");
        }
    }

    public static void fruteria() {
        double cantKilos=0.0;
        double precio=0.0;
        String resultado="";

        precio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio de las manzanas"));

        cantKilos = Double.parseDouble(JOptionPane.showInputDialog("Introduce el total de kilos de manzanas"));

        if (cantKilos>0.0 && precio>0.0) {
            if (cantKilos>0.0 && cantKilos<=2.0) {
                resultado = "El total a pagar sin descuento es: " + (cantKilos * precio);
            }else if (cantKilos>=2.01 && cantKilos<=5.0) {
                double descuento = (cantKilos * precio) * 0.10;
                resultado = "El total a pagar con un descuento de (10%) " + descuento + " es: " + (cantKilos * precio - descuento);
            }else if (cantKilos>=5.01 && cantKilos<=10.0) {
                double descuento = (cantKilos * precio) * 0.15;
                resultado = "El total a pagar con un descuento de (15%) " + descuento + " es: " + (cantKilos * precio - descuento);
            }else{
                double descuento = (cantKilos * precio) * 0.20;
                resultado = "El total a pagar con un descuento de (20%) " + descuento + " es: " + (cantKilos * precio - descuento);
            }
            JOptionPane.showMessageDialog(null, resultado);
        }else{
            if (cantKilos<0.0) {
                JOptionPane.showMessageDialog(null,"La cantidad de Kilos no puede ser negativa, ni igual a cero (0)");
            }
            if (precio < 0.0) {
                JOptionPane.showMessageDialog(null,"El precio no puede ser negativo");
            }

        }
    }

    public static void laboratorio() {
        //Declaracion de variables
        int edad=0;
        String mesAño="";
        String sexo="";
        double hemoglobina=0.0;

        //Engtrada de valores
        mesAño = JOptionPane.showInputDialog("Ingrese si el paciente tiene meses o años: (Meses/Años)");

        if (mesAño.equalsIgnoreCase("meses")) {
            edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del paciente: "));

            if (edad >= 0 && edad <= 1) {
                hemoglobina = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el nivel de hemoglobina: "));
                if (hemoglobina >= 13) {
                    JOptionPane.showMessageDialog(null, "El paciente da negativo a anemia");
                } else if (hemoglobina < 13) {
                    JOptionPane.showMessageDialog(null, "El paciente da positivo a anemia");
                }
            } else if (edad > 1 && edad <= 6) {
                hemoglobina = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el nivel de hemoglobina: "));
                if (hemoglobina >= 10) {
                    JOptionPane.showMessageDialog(null, "El paciente da negativo a anemia");
                } else if (hemoglobina < 10) {
                    JOptionPane.showMessageDialog(null, "El paciente da positivo a anemia");
                }
            } else if (edad > 6 && edad <=12) {
                hemoglobina = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el nivel de hemoglobina: "));
                if (hemoglobina >= 11) {
                    JOptionPane.showMessageDialog(null, "El paciente da negativo a anemia");
                } else if (hemoglobina < 11) {
                    JOptionPane.showMessageDialog(null, "El paciente da positivo a anemia");
                }
            } else if (edad > 12) {
                JOptionPane.showMessageDialog(null, "Elige la opcion años");
            }
        } else if (mesAño.equalsIgnoreCase("años")) {
            edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del paciente: "));

            if (edad > 1 && edad <= 5) {
                hemoglobina = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el nivel de hemoglobina: "));
                if (hemoglobina >= 11.5) {
                    JOptionPane.showMessageDialog(null, "El paciente da negativo a anemia");
                } else if (hemoglobina < 11.5) {
                    JOptionPane.showMessageDialog(null, "El paciente da positivo a anemia");
                }
            } else if (edad > 5 && edad <= 10) {
                hemoglobina = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el nivel de hemoglobina: "));
                if (hemoglobina >= 12.6) {
                    JOptionPane.showMessageDialog(null, "El paciente da negativo a anemia");
                } else if (hemoglobina < 12.6) {
                    JOptionPane.showMessageDialog(null, "El paciente da positivo a anemia");
                }
            } else if (edad > 10 && edad <= 15) {
                hemoglobina = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el nivel de hemoglobina: "));
                if (hemoglobina >= 13) {
                    JOptionPane.showMessageDialog(null, "El paciente da negativo a anemia");
                } else if (hemoglobina < 13) {
                    JOptionPane.showMessageDialog(null, "El paciente da positivo a anemia");
                }
            } else if (edad > 15) {
               sexo = JOptionPane.showInputDialog("Ingrese el sexo del paciente: (Hombre/Mujer)");

               if (sexo.equalsIgnoreCase("Mujer")) {
                   hemoglobina = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el nivel de hemoglobina: "));
                   if (hemoglobina >= 12) {
                       JOptionPane.showMessageDialog(null, "El paciente da negativo a anemia");
                   } else if (hemoglobina < 12) {
                       JOptionPane.showMessageDialog(null, "El paciente da positivo a anemia");
                   }
               } else if (sexo.equalsIgnoreCase("Hombre")) {
                   hemoglobina = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el nivel de hemoglobina: "));
                   if (hemoglobina >= 14) {
                       JOptionPane.showMessageDialog(null, "El paciente da negativo a anemia");
                   } else if (hemoglobina < 14) {
                       JOptionPane.showMessageDialog(null, "El paciente da positivo a anemia");
                   }
               }
            } else if (edad == 1) {
                JOptionPane.showMessageDialog(null, "Elige la opcion meses");
            }
        }

    }

}
