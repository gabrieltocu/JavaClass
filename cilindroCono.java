import javax.swing.JOptionPane;

public class cilindroCono {


    public static void main(String[] args) {
        //////// Bienvenida ///////
        JOptionPane.showMessageDialog(null,"Bienvenido al programa!");
        // dimensiones del cilindro //
        double radioCilindro = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del cilindro:"));
        double alturaCilindro = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del cilindro:"));

        // volumen del cilindro //
        double volumenCilindro = Math.PI * Math.pow(radioCilindro, 2) * alturaCilindro;

        // dimensiones del cono //
        double radioCono = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del cono:"));
        double alturaCono = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del cono:"));

        // volumen del cono //
        double volumenCono = (Math.PI * Math.pow(radioCono, 2) * alturaCono) / 3.0;

        // Resultado //
        String mensaje;
        if (volumenCilindro > volumenCono) {
            mensaje = "El cilindro tiene mayor capacidad";
        } else if (volumenCono > volumenCilindro) {
            mensaje = "El cono tiene mayor capacidad";
        } else {
            mensaje = "Ambos recipientes tienen la misma capacidad.";
        }

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
