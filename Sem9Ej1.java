import javax.swing.JOptionPane;
public class Sem9Ej1 {
    public static void main(String[] args){
        int cont = 0;
        int numeroP = 0;
        int numeroN = 0;
        int num;
        for (cont = 0; cont < 10; cont++){
            num = Integer.parseInt(JOptionPane.showInputDialog("Digita un número a evaluar: "));
            if(num >= 0){
                numeroP += 1;
            } else {
                numeroN += 1;
            }
        }
        JOptionPane.showMessageDialog(null, "Tienes " + numeroP + " positivos y " + numeroN + " Negativos");

    }
}
