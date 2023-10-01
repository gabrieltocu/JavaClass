import javax.swing.JOptionPane;
public class cajaRegistradora {
    public static void main(String[] args){
        int valorArticulo = 0;
        int cantidad = 0;
        String llevar = "si";
        int totalFactura = 0;
        int total = 0;
        JOptionPane.showMessageDialog(null, "Binvenido a nuestra tienda!");
        // Inicio ciclo //
        while (llevar.equalsIgnoreCase("si")){
            valorArticulo = Integer.parseInt(JOptionPane.showInputDialog("Indique el valor del artículo"));
            cantidad = Integer.parseInt(JOptionPane.showInputDialog("Indique cuántos artículos lleva"));
            total = valorArticulo * cantidad;
            totalFactura = total + totalFactura;
            llevar = JOptionPane.showInputDialog("¿Desea llevar algún otro artículo? (si o no)");
        } JOptionPane.showMessageDialog(null, "Debes pagar " + totalFactura + " Pesos");
        JOptionPane.showMessageDialog(null, "Gracias por Confiar en Nosotros");
    }
}
