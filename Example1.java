import javax.swing.JOptionPane;

public class Example1 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bienvenido!");
        String yourName = JOptionPane.showInputDialog("What is your name?");
        int yourAge = Integer.parseInt(JOptionPane.showInputDialog("What is your age?"));
        JOptionPane.showMessageDialog(null, "Welcome " + yourName + ", you are " + yourAge + " years old");

    }
}
