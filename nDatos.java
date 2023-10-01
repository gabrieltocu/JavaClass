import javax.swing.JOptionPane;
public class nDatos {
    public static void main(String[] args){
        int suma = 0;
        int nDatos = 0;
        int num;
        nDatos = Integer.parseInt(JOptionPane.showInputDialog("Dime el número de datos total"));
        for (int i = 0; i < nDatos; i++){
            num = Integer.parseInt(JOptionPane.showInputDialog("Digita un número: "));
            suma = suma + num;
        }
        JOptionPane.showMessageDialog(null, "La suma de los datos es: " + suma);

    }
}