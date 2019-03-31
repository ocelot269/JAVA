package org.lasencinas.numeralesromanos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
    
    
                              //Aplicando S.O de SOLID
    public int calcularNumerosRomanosSuman(String numeroRomano) {

        int totalSumaNumerosRomanos =0;

        for (NumeralesRomanos.numeralesRomanos elemento : NumeralesRomanos.numeralesRomanos.getNumerosRomanosSuman()) {

            for (int i = 0; i < numeroRomano.length(); i++) {

                if (numeroRomano.charAt(i) != elemento.getLetraRomana().charAt(0)) { 
                 //Si la letra del string es distinta a la primera posicion de la letra de los enums que "suman", 
                //Entonces pasa porque sera el caso mas problable     
                } else { //va sumando el valor de cada letra del string
                     totalSumaNumerosRomanos += elemento.getValorNumeroRomano();  //Contador                
                
                }
            }
        }
        return totalSumaNumerosRomanos;
    }
    
    
    public boolean validadorNumeroRomanos(String NumeroRomano){
        
            Pattern verificador=Pattern.compile("^M{0,3}((CM|CD|D?C{0,3}))([LV])?");
            Matcher ma = verificador.matcher(NumeroRomano);
        return ma.matches();
        
    }
    
    
    public int traductorNumerosRomanos(String numeroRomano){
        return calcularNumRomanosRestan(numeroRomano) + calcularNumerosRomanosSuman(numeroRomano);
    }
}
