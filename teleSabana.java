import javax.swing.*;
public class teleSabana {
    public static void main(String[] args){
        // Tiempo en minutos
        Double tiempoMin;
        // Costo del minuto
        Double costoMin;
        // Dia de la Semana
        String diaSemana;
        // Impuesto
        Double impuesto;

        // Saludar al Usuario //
        JOptionPane.showMessageDialog(null, "Bienvenido al simulador de TeleSabana");

        // Preguntar el día de la semana y calcular
        diaSemana = JOptionPane.showInputDialog("Dime el día de la semana en que se hizo la llamada: ");
        if (diaSemana.equalsIgnoreCase("martes")){
            impuesto = 0.16;
        } else if (diaSemana.equalsIgnoreCase("miercoles")) {
            impuesto = 0.14;
        } else {
            impuesto = 0.19;
        }

        // Preguntar el tiempo en Minutos que duró la llamada //
        tiempoMin = Double.parseDouble(JOptionPane.showInputDialog("Ahora dime el tiempo en minutos que duró la llamada"));
        if (tiempoMin < 5) {
            costoMin = 1000.0;
        } else if (tiempoMin >= 5 && tiempoMin < 8) {
            costoMin = 800.0;
        } else if (tiempoMin >= 8 && tiempoMin < 10) {
            costoMin = 600.0;
        } else {
            costoMin = 500.0;
        }

        // Calcular el precio por minuto //
        Double resultado = tiempoMin * costoMin;
        // Calcular el impuesto //
        Double imp = resultado * impuesto;
        // Calcular el precio total de la llamada //
        Double precioLlamada = resultado + imp;
        // Imprimir al usuario el precio de la llamada //
        JOptionPane.showMessageDialog(null, "El precio de la llamada fue de: " + precioLlamada + " pesos");
    }
}
