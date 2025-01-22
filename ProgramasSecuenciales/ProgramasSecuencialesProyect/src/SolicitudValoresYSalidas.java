import java.util.Scanner;

public class SolicitudValoresYSalidas {
    public static void main(String[] args) {
        //Declaracion de variables
        String nombre;
        int edad;

        Scanner lectura = new Scanner (System.in);
        System.out.println("Introduce tu nombre: ");
        nombre = lectura.nextLine();

        System.out.println("Introduce tu edad " + nombre);
        edad = lectura.nextInt();

        System.out.println("Tu nombre es " + nombre + " y tu edad es " + edad);
    }
}
