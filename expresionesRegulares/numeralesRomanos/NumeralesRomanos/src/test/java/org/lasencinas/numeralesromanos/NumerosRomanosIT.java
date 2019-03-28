
package org.lasencinas.numeralesromanos;

import org.junit.Test;
import static org.junit.Assert.*;
import org.lasencinas.numeralesromanos.NumeralesRomanos.NumerosRomanos;
import static org.assertj.core.api.Assertions.assertThat;


public class NumerosRomanosIT {
    
    public NumerosRomanosIT() {
    }

   
    @Test
        public void traductorTest () {
            
       NumeralesRomanos.NumerosRomanos UNO= NumeralesRomanos.NumerosRomanos.UNO;
       String mil = "M";
       assertEquals(1000,Numerales(mil));
       String quinientos = "D";
       assertEquals(500,UNO.traductorNumeroRomano(quinientos));
       String cien = "C";
       assertEquals(100,UNO.traductorNumeroRomano(cien));
       String cincuenta = "L";
       assertEquals(50,UNO.traductorNumeroRomano(cincuenta));
       String diez = "X";
       assertEquals(10,UNO.traductorNumeroRomano(diez));
       String cinco = "V";
       assertEquals(5,UNO.traductorNumeroRomano(cinco));
       String cuatro = "IV";
       assertEquals(4,UNO.traductorNumeroRomano(cuatro));
       String nueve = "IX";
       assertEquals(9,UNO.traductorNumeroRomano(nueve));
       String milquinientos = "MD";
       assertEquals(1500,UNO.traductorNumeroRomano(milquinientos));
        }
    
}
