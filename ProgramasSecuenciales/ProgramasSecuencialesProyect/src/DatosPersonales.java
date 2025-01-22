import java.util.Scanner;

public class DatosPersonales {
    public static void main(String[] args) {
        String matricula;
        String nombre;
        String apellido1;
        String apellido2;
        String edad;
        String direccion;

        Scanner lectura = new Scanner (System.in);
        System.out.println("Introduce tu nombre: ");
        nombre = lectura.nextLine();

        System.out.println("Introduce tu primer apellido: ");
        apellido1 = lectura.nextLine();

        System.out.println("Introduce tu segundo apellido: ");
        apellido2 = lectura.nextLine();

        System.out.println("Introduce tu matricula: ");
        matricula = lectura.nextLine();

        System.out.println("Introduce tu edad: ");
        edad = lectura.nextLine();

        System.out.println("Introduce tu direccion: ");
        direccion = lectura.nextLine();

        String completo = nombre + " " + apellido1 + " " + apellido2; 

        System.out.println("\n \nCarnet\n" + "Matricula: " + matricula + "\nNombre Completo: " + completo + "\nEdad: " + edad + "\nDireccion: " + direccion);
}
}
