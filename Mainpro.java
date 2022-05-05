import javax.swing.*;

public class Mainpro {

    public static void main(String[] args) {
        double valort1;

        double valort2;

        double valort3;

        double valort4;

        double valoremc;

        double valorefc;

        valort1 = Double.parseDouble(JOptionPane.showInputDialog("INGRESAR TAREA 1"));

        valort2 = Double.parseDouble(JOptionPane.showInputDialog("INGRESAR TAREA 2"));

        valort3 = Double.parseDouble(JOptionPane.showInputDialog("INGRESAR TAREA 3"));

        valort4 = Double.parseDouble(JOptionPane.showInputDialog("INGRESAR TAREA 4"));

        valoremc = Double.parseDouble(JOptionPane.showInputDialog("INGRESAR EXAMEN DE MEDIO CURSO"));

        valorefc = Double.parseDouble(JOptionPane.showInputDialog("INGRESAR EXAMEN DE FIN DE CURSO"));

        PromedioNotas promedioNotas = new PromedioNotas(valort1, valort2, valort3, valort4, valoremc,valorefc);

        System.out.println("Su promedio de tareas es: " +promedioNotas.getPromedioTareas());

        System.out.println("Su promedio final es: " +promedioNotas.getPromedio());
    }
}
