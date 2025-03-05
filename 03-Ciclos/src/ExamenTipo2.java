import javax.swing.*;

public class ExamenTipo2 {
    public static void main(String[] args) {
        //Declaracion de variables
        String menu = "";
        String opcion = "";
        boolean sentinel=true;

        //Creacion del menu

        menu = "Menu Principal \n" +
                "1)Maximo comun divisor \n" +
                "2)Multiplicacion por suma \n" +
                "3)Salir\n" +
                "Elegir opción: ";

        do {
            opcion = JOptionPane.showInputDialog(menu);

            switch (opcion) {
                case "1":
                    int maxComu = 0;
                    int maxComu2 = 0;
                    int residuo = 0;
                    int divisor = 0;

                    maxComu = Integer.parseInt(JOptionPane.showInputDialog
                            ("Introduce el maximo comun divisor 1"));
                    maxComu2 = Integer.parseInt(JOptionPane.showInputDialog
                            ("Introduce el maximo comun divisor 2"));

                    do {
                        if (maxComu >= 1 && maxComu2 >= 1) {

                            residuo = maxComu / maxComu2;
                            divisor=maxComu/maxComu2;

                        }

                    } while (maxComu2%maxComu2!=0);

                    JOptionPane.showMessageDialog(null, divisor);
                    break;
                case "2":
                    int numMulti=0;
                    int canMulti=0;
                    int res=0;
                    int cont=1;
                    int suma=0;

                    numMulti = Integer.parseInt
                            (JOptionPane.showInputDialog("Introduce el numero a multiplicar"));

                    canMulti=Integer.parseInt(JOptionPane.showInputDialog
                            ("Ingresa la cantidad de veces que se desea multiplicar el numero "  ));

                    cont++;
                    cont=cont*canMulti;
                    res= cont*numMulti;
                    JOptionPane.showMessageDialog(null,"El resultado es: "+ res);

                    break;
                case "3":
                    JOptionPane.showMessageDialog(null, "El programa ha terminado");
                    sentinel = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida ");

            }
        }while (sentinel);
    }
}
