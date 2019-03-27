
package org.lasencinas.numeralesromanos;

import org.junit.Test;
import static org.junit.Assert.*;
import org.lasencinas.numeralesromanos.NumeralesRomanos.NumerosRomanos;
import static org.assertj.core.api.Assertions.assertThat;

public class NumeralesRomanosIT {
    
    public NumeralesRomanosIT() {
    }

    @Test
    public void testSomeMethod() {
    }
    
    @Test
	public void RomanConstructorTest() {
		NumerosRomanos numero = NumerosRomanos.UNO;
                assertThat(numero).isInstanceOf(NumerosRomanos.class);
                assertThat(numero.ordinal()).isEqualTo(0);
		assertThat(numero.name()).isEqualToIgnoringWhitespace("UNO");
		assertThat(numero.valueOf(numero.name())).isEqualTo(NumerosRomanos.UNO);
		assertThat(numero.compareTo(numero)).isEqualTo(0);
		assertThat(numero.toString()).isEqualToIgnoringWhitespace("UNO");
		assertThat(numero.equals(numero.UNO)).isEqualTo(true);
		assertThat(numero.values()[0]).isEqualTo(numero);
		
	}
        
    @Test
        public void traductorTest () {
       NumerosRomanos UNO= NumeralesRomanos.NumerosRomanos.UNO;
       String mil = "M";
       assertEquals(1000,UNO.traductorNumeroRomano(mil));
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
       String uno = "I";
       assertEquals(1,UNO.traductorNumeroRomano(uno));

        }
        
		
	}

