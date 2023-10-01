import javax.swing.JOptionPane;

public class semana9Ej4 {
    public static void main(String[] args) {

        int na;
        na = Integer.parseInt(JOptionPane.showInputDialog("Primer Número: "));
        int nb;
        nb = Integer.parseInt(JOptionPane.showInputDialog("Segundo Número: "));
        int total = 0;



        for (int i = 0; i < Math.abs(nb); i++) {
            if (nb > 0) {
                total += na;
            } else {
                total -= na;
            }
        }

        JOptionPane.showMessageDialog(null, "Total: " + total);
    }



}
