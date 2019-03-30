package org.lasencinas.numeralesromanos;

public class NumerosRomanos {

    
    
    
    //Constructor
    public NumerosRomanos() {

    }

    
    
    
    
    
    
    //Logica
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

    public int traductorNumeroRomano(String numeroString) {

        int numeroRomano = 0;

        for (NumeralesRomanos.numeralesRomanos elemento : NumeralesRomanos.numeralesRomanos.values()) {

            for (int i = 0; i < numeroString.length(); i++) {

                if (numeroString.substring(i) != elemento.getLetraRomana()) {

                } else {
                    numeroRomano += elemento.getValorNumeroRomano();
                }
            }
        }
        return numeroRomano;
    }
}
