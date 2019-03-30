package org.lasencinas.numeralesromanos;

public class NumerosRomanos {

    public NumerosRomanos() {

    }

    public int calcularNumRomanosRestan(String numerosRomanos) {
        int contador = 0;

        for (NumeralesRomanos.numeralesRomanos numeros : NumeralesRomanos.numeralesRomanos.getNumerosRomanosRestan()) {

            if (numerosRomanos.contains(numeros.getLetraRomana())) {
                numerosRomanos.replace(numeros.getLetraRomana(), "");
                contador += numeros.getValorNumeroRomano();
            } else {

            }

        }
        return contador;
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
