import javax.swing.JOptionPane;
public class semana9Ej3 {
    public static void main(String[] args){
        int suma = 0;
        int edad;
        int media = 0;
        for (int i = 0; i < 15; i++){
            edad = Integer.parseInt(JOptionPane.showInputDialog("Edad?: "));
            suma = suma + edad;
            media = suma / 15;
        }
        JOptionPane.showMessageDialog(null, "Media: " + media);

    }
}