import javax.swing.JOptionPane;

public class calculator {
    public static void main(String[] args){
        Double a = 0.0;
        Double b = 0.0;
        String ans = "si";
        JOptionPane.showMessageDialog(null, "Binvenido a la mini calculadora");
        // Inicio de la instrucción repetitiva //
            while (ans.equalsIgnoreCase("si")){
                a = Double.parseDouble(JOptionPane.showInputDialog("Indica el primer número"));
                b = Double.parseDouble(JOptionPane.showInputDialog("Indica el segundo número"));
                Double res = a + b;
                JOptionPane.showMessageDialog(null, "La respuesta es: " + res);
                ans = JOptionPane.showInputDialog("¿Quieres sumar dos números? (si o no)");
            }
            JOptionPane.showMessageDialog(null, "Tarea Finalizada");
        }

    }


