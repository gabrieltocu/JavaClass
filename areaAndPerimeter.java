import javax.swing.JOptionPane;

public class areaAndPerimeter {
    public static void main(String[] args){
        JOptionPane.showMessageDialog(null,"Bienvenido a la calculadora mágica de medidas. Nota: Funciona con rectángulos");
        Double longSide = Double.parseDouble(JOptionPane.showInputDialog("Dime el lado más largo de tu rectángulo"));
        Double shortSide = Double.parseDouble(JOptionPane.showInputDialog("Ahora dime el lado más corto de tu rectángulo"));
        Double area = longSide * shortSide;
        Double perimeter = (longSide * 2) + (shortSide * 2);
        JOptionPane.showMessageDialog(null,"El área de tu rectángulo es de " + area);
        JOptionPane.showMessageDialog(null, "El perímetro de tu rectángulo es de " + perimeter);
    }
}
