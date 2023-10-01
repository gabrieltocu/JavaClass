import javax.swing.JOptionPane;
public class edadPersonas {
    public static void main(String[] args){
        int personas = 15;
        int suma = 0;
        int edadPersona;
        int promedio = 0;
        for (int i = 0; i < personas; i++){
            edadPersona = Integer.parseInt(JOptionPane.showInputDialog("Dime la edad de la persona: "));
            suma = suma + edadPersona;
            promedio = suma / personas;
        }
        JOptionPane.showMessageDialog(null, "El promedio de las edades es: " + promedio);

    }
}