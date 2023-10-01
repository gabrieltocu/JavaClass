import javax.swing.JOptionPane;

public class tempFria {


    public static void main(String[] args) {
        // Bienvenida al Usuario
        JOptionPane.showMessageDialog(null, "Bienvenido al Programa!");

        double tempCelsius = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la temperatura en grados Celsius:"));
        double tempFahrenheit = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la temperatura en Fahrenheit:"));

        double tempConvertida = tempCelsius * 9/5 + 32;

        if (tempFahrenheit < tempConvertida) {
            JOptionPane.showMessageDialog(null, "La temperatura en grados Fahrenheit es más baja.");
        } else if (tempFahrenheit > tempConvertida) {
            JOptionPane.showMessageDialog(null, "La temperatura en grados Celsius es más baja.");
        } else {
            JOptionPane.showMessageDialog(null, "Ambas temperaturas son iguales.");
        }
    }
}
