import javax.swing.JOptionPane;

public class multiplicationFor {
    public static void main(String[] args) {

        int num1;
        int num2;
        int result = 0;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Primer Número: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Segundo Número: "));


        for (int i = 0; i < Math.abs(num2); i++) {
            if (num2 < 0) {
                result -= num1;
            } else {
                result += num1;
            }
        }

        // Display the result
        JOptionPane.showMessageDialog(null, "El producto de " + num1 + " y " + num2 + " es: " + result);
    }



}
