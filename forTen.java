import javax.swing.JOptionPane;
public class forTen {
    public static void main(String[] args){
        int suma = 0;
        int num;

        for(int i = 0; i < 10; i++){
            num = Integer.parseInt(JOptionPane.showInputDialog("Digita el valor"));
            suma = suma + num;
        }

    }
}
