package org.lasencinas.numeralesromanos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumerosRomanos {

    //variables
    private String numeroRomano;
    private int NumeroRomanoTraducido;

    //Constructor
    public NumerosRomanos(String numeroRomanos) {
        this.numeroRomano = numeroRomanos;
    }

    //getters y setters
    public String getNumeroRomano() {
        return numeroRomano;
    }

    public void setNumeroRomano(String numeroRomano) {
        this.numeroRomano = numeroRomano;
    }

    public int getNumeroRomanoTraducido() {
        return this.NumeroRomanoTraducido;
    }

    public void setValor(int valor) {
        this.NumeroRomanoTraducido += valor;
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
        return getNumeroRomanoTraducido();
    }

    public boolean validadorNumeroRomanos() { //Este metodo te compara el numero romano con tu expresion regular

        Pattern verificador = Pattern.compile("^M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IV|IX|V?I{0,3})$"); //Expresion regular para numeros romanos
        //la expresion comprueba que el numero romano empieze con 0 a 3 "M" 
        //Puede contener "CM" "CD" o no  //"D" la puede estar 1 vez o no estar y la "C" de 0 a 3
        //Puede contener "XC" "XL" o no  //"L" la puede estar 1 vez o no estar y la "X" de 0 a 3
        //Puede contener "IV" "IX" o no  //"V" la puede estar 1 vez o no estar y la "I" de 0 a 3
        Matcher comparador = verificador.matcher(getNumeroRomano()); //Compara la expresion con el formato del numero romano
        return comparador.matches();//Te devuelve true o false segun si la expresion es valida

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
