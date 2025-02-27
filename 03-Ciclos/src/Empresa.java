import javax.swing.*;

public class Empresa {
    public static void main(String[] args) {
        //Declaracion de variables
        int i=0;
        int numTrabajadores=0;
        int numHorasTrabajadas=0;
        int numHorasExtras=0;
        double salarioBase=0.0;
        double salarioTotal=0.0;
        String salida="";

        //Entrada de datos
        numTrabajadores = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el numero de trabajadores: "));

        salida = "Reporte de Salarios Semanales\n" +
                "Empleado               " + "Horas Trabajadas     " + "Horas Extras     " + "Salario Total\n";

        i=1;

        while (i <= numTrabajadores) {
            numHorasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Numero de horas trabajadas: "));

            numHorasExtras = 0;

            if (numHorasTrabajadas <= 40) {
                salarioTotal = numHorasExtras * 20;
                salida += "Empleado " + i + "     " + numHorasTrabajadas +
                          "     " + numHorasExtras + "     " + salarioTotal + "\n";
            } else {
                numHorasExtras = numHorasTrabajadas - 40;
                salarioTotal = (40 * 20) + numHorasExtras * 25;
            }

            i++;
        }
        JOptionPane.showMessageDialog(null, salida);
    }
}
