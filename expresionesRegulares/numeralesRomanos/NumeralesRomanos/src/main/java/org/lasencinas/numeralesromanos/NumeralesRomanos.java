package org.lasencinas.numeralesromanos;

import java.util.EnumSet;

public class NumeralesRomanos {

    public enum numeralesRomanos {
        
        UNO("I", 1),
        CINCO("V", 5),
        DIEZ("X", 10),
        CINCUENTA("L", 50),
        CIEN("C", 100),
        QUINIENTOS("D", 500),
        MIL("M", 1000),
        CUATRO("IV", 4),
        NUEVE("IX", 9),
        CUARENTA("XL", 40),
        NOVENTA("XC", 90),
        CUATROCIENTOS("CD", 400),
        NOVECIENTOS("CM", 900);

        private Integer valorNumeroRomano = 0;
        private String letraRomana;

        numeralesRomanos(String letra, Integer valor) {
            this.valorNumeroRomano = valor;
            this.letraRomana = letra;

        }

        public Integer getValorNumeroRomano() {
            return valorNumeroRomano;
        }

        public String getLetraRomana() {
            return this.letraRomana;
        }

        public static EnumSet<numeralesRomanos> getNumerosRomanosSuman(){
           return EnumSet.range(UNO, MIL);
        }
        
        public static EnumSet<numeralesRomanos> getNumerosRomanosRestan(){
           return EnumSet.complementOf(getNumerosRomanosSuman());
        }

    }
}
