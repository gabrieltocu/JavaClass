import javax.swing.JOptionPane;

public class Ej42 {
    public static void main(String[] args) {
        int na = Integer.parseInt(JOptionPane.showInputDialog("Primer Número: "));
        int nb = Integer.parseInt(JOptionPane.showInputDialog("Segundo Número: "));
        int total = 0;

        for (int i = 0; i < nb; i++) {
            total += na;
        }

        if (nb < 0) {
            total = -total;
        }

        JOptionPane.showMessageDialog(null, "Total: " + total);
    }
}
