package org.lasencinas.numeralesromanos;

public class NumerosRomanos {

    //Constructor
    public NumerosRomanos() {

    }

    //Logica
                                //Aplicando S.O de SOLID
    public int calcularNumRomanosRestan(String numerosRomanos) {

        int sumaNumerosNegativos = 0; //Suma total de los pares que restan

        for (NumeralesRomanos.numeralesRomanos numeros : NumeralesRomanos.numeralesRomanos.getNumerosRomanosRestan()) {

            if (numerosRomanos.contains(numeros.getLetraRomana())) {  //Comprueba que el string que nos pasa tenga numeros del grupodeNegativos
                numerosRomanos.replaceFirst(numeros.getLetraRomana(), "");//Remueve la primera pareja de negativos del String
                sumaNumerosNegativos += numeros.getValorNumeroRomano(); //Contador
            } else {
                //Para un caso inesperado
            }

        }
        return sumaNumerosNegativos;
    }

    public int SumadorNumeroRomano(String numeroString) {

        int totalSuma =0;

        for (NumeralesRomanos.numeralesRomanos elemento : NumeralesRomanos.numeralesRomanos.getNumerosRomanosSuman()) {

            for (int i = 0; i < numeroString.length(); i++) {

                if (numeroString.charAt(i) != elemento.getLetraRomana().charAt(0)) {
                   
                     
                } else {
                     totalSuma += elemento.getValorNumeroRomano();                   
                
                }
            }
        }
        return totalSuma;
    }
}
