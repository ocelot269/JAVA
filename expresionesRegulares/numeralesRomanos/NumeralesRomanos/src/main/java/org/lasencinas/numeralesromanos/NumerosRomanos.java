
package org.lasencinas.numeralesromanos;


public class NumerosRomanos {

    public NumerosRomanos() {
        
    }
    
    
    
    public static int traductorNumeroRomano(String numeroString) {

            int numeroRomano = 0;

            for (NumeralesRomanos.NumerosRomanos elemento : NumeralesRomanos.NumerosRomanos.values()) {

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
