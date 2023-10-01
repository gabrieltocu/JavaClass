import javax.swing.*;

public class openCampus {
    public static void main(String[] args){
        JOptionPane.showMessageDialog(null, "Bienvenido, a continuación te indicaré a qué zona dirigirte...");
        int edad;
        edad = Integer.parseInt(JOptionPane.showInputDialog("Escribe tu edad"));
        if (edad >= 18){
            String zonaCD = JOptionPane.showInputDialog("¿Estas interesado en la ingeniería? (si o no)");
            if (zonaCD.equalsIgnoreCase("si")){
            JOptionPane.showMessageDialog(null, "Debes dirigirte a la zona C");
            } else {
                JOptionPane.showMessageDialog(null, "Debes dirigirte a la zona D");
            }
        } else {
            String zonaAB = JOptionPane.showInputDialog("¿Estas interesado en la ingeniería? (si o no)");
            if (zonaAB.equalsIgnoreCase("si")){
                JOptionPane.showMessageDialog(null, "Debes dirigirte a la zona A");
            } else {
                JOptionPane.showMessageDialog(null, "Debes dirigirte a la zona B");
            }
        }
    }
}
