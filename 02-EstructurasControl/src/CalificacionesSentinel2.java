import javax.swing.*;

public class CalificacionesSentinel2 {
    public static void main(String[] args) {
        boolean sentinel=true;
        double calif=0.0;
        int numAprobados=0;
        int numReprobados=0;

        JOptionPane.showMessageDialog(null, "El programa cuenta el numero de calificacion aprobatorias y reprobatorias" +
                "\nPara terminar introduce una calificacion con -1 ");

        int x=1;
        while (sentinel) {
            calif = Double.parseDouble(JOptionPane.showInputDialog("Ingresar la calificacion: " + x));

            if (calif!=-1) {
                if (calif >= 7.0) {
                    numAprobados ++;
                } else {
                    numReprobados ++;
                }
                x++;
            } else {
                sentinel=false;
            }
        }
        JOptionPane.showMessageDialog(null, "El numero de aprobados es: " + numAprobados +
                "\nEl numero de reprobados es: " + numReprobados);
    }
}
