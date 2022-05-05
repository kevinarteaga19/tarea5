import javax.swing.*;

public class MainInte {

    public static void main(String[] args) {
        double valorc;

        double valorn;

        double valori;

        valorc = Double.parseDouble(JOptionPane.showInputDialog("INGRESAR Capital"));

        valori = Double.parseDouble(JOptionPane.showInputDialog("INGRESAR tasa de interes por periodo"));

        valorn = Double.parseDouble(JOptionPane.showInputDialog("INGRESAR Numero de periodos"));

        InteresCompuesto interesCompuesto = new InteresCompuesto(valorc, valorn, valori);

        System.out.println(interesCompuesto.getM());

    }
}
