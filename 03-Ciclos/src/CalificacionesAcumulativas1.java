import javax.swing.*;

public class CalificacionesAcumulativas1 {
    public static void main(String[] args) {
        //Declaracion de variables
        double calif=0.0;
        double califAcum=0.0;
        int numCalif=0;

        //Entradsa de valores
        numCalif = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de calificaciones"));

        //Ciclo
        for (int i = 0; i < numCalif; i++){
            califAcum += Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificaion" + (i + 1)));

        }

        califAcum = califAcum / numCalif;

        JOptionPane.showMessageDialog(null, "");
    }
}
