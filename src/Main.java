import view.ConversorMonedas;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String [] options = {"Conversor de Monedas"};
        String op = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menu", JOptionPane.DEFAULT_OPTION, null, options, options[0]).toString();

        switch(op){
            case "Conversor de Monedas" -> new ConversorMonedas();
            default -> System.out.println("Error");
        }
    }
}