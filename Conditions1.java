import javax.swing.JOptionPane;

public class Conditions1
{
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 0;
        JOptionPane.showMessageDialog(null, "Binvenido al mini comparador");
        // Inicio de la instrucción repetitiva //
        while (n1 == n2){
            n1 = Integer.parseInt(JOptionPane.showInputDialog("Indica el primer número"));
            n2 = Integer.parseInt(JOptionPane.showInputDialog("Indique el segundo número"));
        } // Finalizando instrucciones repretitivas
        if (n1>n2) {
            JOptionPane.showMessageDialog(null, n1 + " es mayor");
        } else {
            JOptionPane.showMessageDialog(null, n1 + " es menor");
        }
    }
}
