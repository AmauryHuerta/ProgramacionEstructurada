import javax.swing.*;

public class Vendedor {
    /*
     * Un vendedor recibe un sueldo base más un 10% extra por comisión de sus ventas,
     * el vendedor desea saber cuánto dinero obtendrá por concepto de comisiones
     * por las tres ventas que realiza en el mes y el total que recibirá en el mes
     * tomando en cuenta su sueldo base y comisiones.
     */
    public static void main(String[] args) {
        //Declaracion de variables
        double sueldobase=0.0;
        double sueldototal=0.0;
        double venta1=0.0, venta2=0.0, venta3=0.0;
        double comision1=0.0, comision2=0.0, comision3=0.0;
        double resultado1=0.0, resultado2=0.0, resultado3=0.0;
        String salida="";

        //Entrada de datos
        sueldobase = Double.parseDouble(JOptionPane.showInputDialog("Ingresar el suledo base del empleado: "));

        venta1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresar el valor de la 1er venta: "));
        venta2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresar el valor de la 2da venta: "));
        venta3 = Double.parseDouble(JOptionPane.showInputDialog("Ingresar el valor de la 3er venta: "));

        //Operaciones
        comision1 = venta1 * 0.10;
        comision2 = venta2 * 0.10;
        comision3 = venta3 * 0.10;

        resultado1 = venta1 + comision1;
        resultado2 = venta2 + comision2;
        resultado3 = venta3 + comision3;

        sueldototal = sueldobase + resultado1 + resultado2 + resultado3;

        //Salida de datos
        salida = "El sueldo total a recibir por el empleado seria: " + String.format("%.2f",(sueldototal));

        JOptionPane.showMessageDialog(null, salida);
    }
}
