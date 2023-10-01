import javax.swing.JOptionPane;
public class posOrNeg {
    public static void main(String[] args){
        int nPos = 0;
        int nNeg = 0;
        int num;
        for (int i = 0; i < 10; i++){
            num = Integer.parseInt(JOptionPane.showInputDialog("Digita un número a evaluar: "));
            if(num >= 0){
                nPos += 1;
            } else {
                nNeg += 1;
            }
        }
        JOptionPane.showMessageDialog(null, nPos + " números son positivos, y " + nNeg + " son negativos");

    }
}
