package view;

import controller.ConversorMonedasController;

import javax.swing.*;

public class ConversorMonedas {

    public ConversorMonedas(){
        main();
    }

    public void main(){

        ConversorMonedasController oConversorController = new ConversorMonedasController();

        String [] options = {"De Peso Argentino a Dolar estadounidense", "De Peso Argentino a Euro",
                "De Peso Argentino a Libras esterlinas", "De Peso Argentino a Yen Japonés",
                "De Peso Argentino a Real Brasileño", "De Dolar estadounidense a Peso Argentino",
                "De Euro a Peso Argentino", "De Libras esterlinas a Peso Argentino",
                "De Yen Japonés a Peso Argentino", "De Real Brasileño a Peso Argentino"};

        String op = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión",
                "Menu", JOptionPane.PLAIN_MESSAGE, null, options, options[0]).toString();

        switch(op){
            case "De Peso Argentino a Dolar estadounidense" -> oConversorController.conversionMoneda("USD", "ARS");
            case "De Peso Argentino a Euro" -> oConversorController.conversionMoneda("EUR", "ARS");
            case "De Peso Argentino a Libras esterlinas" -> oConversorController.conversionMoneda("GBP", "");
            case "De Peso Argentino a Yen Japonés" -> oConversorController.conversionMoneda("JPY", "ARS");
            case "De Peso Argentino a Real Brasileño" -> oConversorController.conversionMoneda("BRL", "ARS");
            case "De Dolar estadounidense a Peso Argentino" -> oConversorController.conversionMoneda("ARS", "USD");
            case "De Euro a Peso Argentino" -> oConversorController.conversionMoneda("ARS", "EUR");
            case "De Libras esterlinas a Peso Argentino" -> oConversorController.conversionMoneda("ARS", "GBP");
            case "De Yen Japonés a Peso Argentino" -> oConversorController.conversionMoneda("ARS", "JPY");
            case "De Real Brasileño a Peso Argentino" -> oConversorController.conversionMoneda("ARS", "BRL");
            default -> System.out.println("Error");
        }
    }
}