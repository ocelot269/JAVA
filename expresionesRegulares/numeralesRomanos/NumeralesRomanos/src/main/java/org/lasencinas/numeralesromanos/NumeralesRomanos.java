package org.lasencinas.numeralesromanos;

import java.util.EnumSet;

public class NumeralesRomanos {

    public enum numeralesRomanos {
        
        I( 1),
        V( 5),
        X(10),
        L(50),
        C (100),
        D (500),
        M (1000),
        IV (4),
        IX (9),
        XL (40),
        XC (90),
        CD (400),
        CM (900);

        private Integer valorNumeroRomano = 0;
        

        numeralesRomanos(Integer valor) {
            this.valorNumeroRomano = valor;
          

        }

        public Integer getValorNumeroRomano() {
            return valorNumeroRomano;
        }

       

        public static EnumSet<numeralesRomanos> getNumerosRomanosSuman(){
           return EnumSet.range(I, M);
        }
        
        public static EnumSet<numeralesRomanos> getNumerosRomanosRestan(){
           return EnumSet.range(IV,CM);
        }

    }
}
