package org.lasencinas.numeralesromanos;

public class NumeralesRomanos {

    public enum NumerosRomanos {
        UNO("I", 1),
        CUATRO("IV", 4),
        CINCO("V", 5),
        NUEVE("IX", 9),
        DIEZ("X", 10),
        CINCUENTA("L", 50),
        CIEN("C", 100),
        QUINIENTOS("D", 500),
        MIL("M", 1000);

        private Integer valorNumeroRomano = 0;
        private String letraRomana;

        NumerosRomanos(String letra, Integer valor) {
            this.valorNumeroRomano = valor;
            this.letraRomana = letra;

        }

        public Integer getValorNumeroRomano() {
            return valorNumeroRomano;
        }

        public String getLetraRomana() {
            return letraRomana;
        }

        public int traductorNumeroRomano(String numeroString) {

            int numeroRomano = 0;  
            
            
            for (NumerosRomanos elemento : NumerosRomanos.values()) {

                for (int i = 0; i < numeroString.length(); i++) {

                    if (numeroString.substring(i, i+1) == elemento.getLetraRomana()){
                        numeroRomano += elemento.getValorNumeroRomano();
                    } else {
                        
                    }
                }
            }
            return numeroRomano;
        }

    }
}
