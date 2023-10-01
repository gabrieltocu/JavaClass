import javax.swing.JOptionPane;
public class dato {
    public static void main(String[] args){
        int i = 0;
        int suma = 0;
        int dato = 0;
        int num;
        dato = Integer.parseInt(JOptionPane.showInputDialog("Total de números?: "));
        for (i = 0; i < dato; i++){
            num = Integer.parseInt(JOptionPane.showInputDialog("Número: "));
            suma = suma + num;
        }
        JOptionPane.showMessageDialog(null, "Total: "  + suma);

    }
}