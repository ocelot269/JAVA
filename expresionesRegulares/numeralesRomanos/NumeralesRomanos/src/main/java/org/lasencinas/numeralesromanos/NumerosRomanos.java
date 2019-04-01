package org.lasencinas.numeralesromanos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumerosRomanos {
    
    //variables
    
    
        private String numeroRomano;
        private int valor;
        
        
    //Constructor
        
        
    public NumerosRomanos(String numeroRomanos) {
        this.numeroRomano=numeroRomanos;
    }
    
    
    //getters y setters
    
    
    public String getNumeroRomano() {
        return numeroRomano;
    }

    
    public void setNumeroRomano(String numeroRomano) {
        this.numeroRomano = numeroRomano;
    }


    public int getValor() {
        return valor;
    }

    
    public void setValor(int valor) {
        this.valor += valor;
    }
    
    
    //Logica
    
    
    //Aplicando S.O de SOLID
    public int calcularNumRomanosRestan() {

        int sumaNumerosNegativos = 0; //Suma total de los pares que restan

        for (NumeralesRomanos.numeralesRomanos numeros : NumeralesRomanos.numeralesRomanos.getNumerosRomanosRestan()) {

            if (getNumeroRomano().contains(numeros.getLetraRomana())) {  //Comprueba que el string que nos pasa tenga numeros del grupodeNegativos
                setNumeroRomano(getNumeroRomano().replace(numeros.getLetraRomana(), ""));//Remueve la primera pareja de negativos del String
                sumaNumerosNegativos += numeros.getValorNumeroRomano(); //Contador
            } else {
                //Para un caso inesperado
            }

        }
        return sumaNumerosNegativos;
    }

    //Aplicando S.O de SOLID
    public int calcularNumerosRomanosSuman() {

        

        for (NumeralesRomanos.numeralesRomanos elemento : NumeralesRomanos.numeralesRomanos.getNumerosRomanosSuman()) {

            for (int i = 0; i < getNumeroRomano().length(); i++) {

                if (getNumeroRomano().charAt(i) != elemento.getLetraRomana().charAt(0)) {
                    //Si la letra del string es distinta a la primera posicion de la letra de los enums que "suman", 
                    //Entonces pasa porque sera el caso mas problable     
                } else { //va sumando el valor de cada letra del string
                    setValor(elemento.getValorNumeroRomano());  //Contador                

                }
            }
        }
        return getValor();
    }

    
    public boolean validadorNumeroRomanos() {

        Pattern verificador = Pattern.compile("^M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IV|IX|V?I{0,3})$");
        Matcher comparador = verificador.matcher(getNumeroRomano());
        return comparador.matches();
        
        
    }

    
    public int traductorNumerosRomanos() {
        int resultado = 0;
        
        if (validadorNumeroRomanos()) {
            resultado = calcularNumRomanosRestan() + calcularNumerosRomanosSuman();
        } else {
            System.out.println("Error el numero " + getNumeroRomano() + " no es un numero romano valido");
        }
        return resultado;
    }

  

   

}
