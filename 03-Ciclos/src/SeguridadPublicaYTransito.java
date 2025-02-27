import javax.print.attribute.standard.JobImpressions;
import javax.swing.*;
import java.util.jar.JarOutputStream;

public class SeguridadPublicaYTransito {
    public static void main(String[] args) {
        //Decalarcion de variables
        int numCarros=0;
        int numMatricula=0;
        int i=1;
        int amarilla=0, rosa=0, roja=0, verde=0, azul=0;
        String salida="";

        //Entrada de valores
        numCarros = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el numero de carros que ingresaron al DF: "));

        //Verificacion de matricula
        while (i<=numCarros) {
            numMatricula = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el ultimo digito de la matricula del automovil: "));
            if (numMatricula>=0) {
                if (numMatricula == 1 || numMatricula == 2) {
                    JOptionPane.showMessageDialog(null, "El color de matricula es 'Amarilla'");
                    amarilla++;
                } else if (numMatricula == 3 || numMatricula == 4) {
                    JOptionPane.showMessageDialog(null, "El color de matricula es 'Rosa'");
                    rosa++;
                } else if (numMatricula == 5 || numMatricula == 6) {
                    JOptionPane.showMessageDialog(null, "El color de matricula es 'Roja'");
                    roja++;
                } else if (numMatricula == 7 || numMatricula == 8) {
                    JOptionPane.showMessageDialog(null, "El color de matricula es 'Verde'");
                    verde++;
                } else if (numMatricula == 9 || numMatricula == 0) {
                    JOptionPane.showMessageDialog(null, "El color de matricula es 'Azul'");
                    azul++;
                } else {
                    JOptionPane.showMessageDialog(null, "Es solo un digito");
                }
            } else {
                JOptionPane.showMessageDialog(null, "El digito no puede ser negativo");
            }

            i++;
        }
        salida = "El numero de matriculas de cada color es: " +
                "\nAmarillas: " + amarilla +
                "\nRosas: " + rosa +
                "\nRojas" + roja +
                "\nVerdes: " + verde +
                "\nAzules: " + azul;

        JOptionPane.showMessageDialog(null, salida);

    }
}
