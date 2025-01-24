import javax.swing.*;

public class SueldoEmpleado {
    /*
     * Realizar un programa que calcule e imprima el sueldo de un empleado, bajo las
     * siguientes características
     * a. Se debe almacenar el nombre del empleado
     * b. Las horas trabajadas que deben ser horas sin parte fraccionaria
     * c. Cuota por hora
     * d. Se debe imprimir el nombre del Trabajador y el Sueldo que va a percibir
     */
    public static void main(String[] args) {
        //Declaracion de variables
        String nombre = "";
        int horasTrabajadas = 0;
        double cuotaHora = 0.0;
        double operacion = 0.0;
        String salida = "";

        //Ingreso de datos
        nombre = JOptionPane.showInputDialog("Empleado ingresa tu nombre: ");
        horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese sus horas trabajadas (deben ser enteras): "));
        cuotaHora = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cuota por hora trabajada: "));

        //Operacion para el pago
        operacion = horasTrabajadas * cuotaHora;

        //Salida del valor de la operacion
        salida = "El trabajador " + nombre + " recibira un pago total de " + String.format("%.4f", operacion) + " por sus " + cuotaHora + " horas trabajadas";

        JOptionPane.showMessageDialog(null, salida);
    }
}
