
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
	public void PlanetaConstructorTest() {
		// voy a asegurarme de que los metodos de los Enum Types
		// se comportan como yo espero
		NumerosRomanos numero = NumerosRomanos.Uno;
                assertThat(numero).isInstanceOf(NumerosRomanos.class);
                assertThat(numero.ordinal()).isEqualTo(0);
		assertThat(numero.name()).isEqualToIgnoringWhitespace("Uno");
		assertThat(numero.valueOf(numero.name())).isEqualTo(NumerosRomanos.Uno);
		assertThat(numero.compareTo(numero)).isEqualTo(0);
		assertThat(numero.toString()).isEqualToIgnoringWhitespace("Uno");
		assertThat(numero.equals(numero.Uno)).isEqualTo(true);
		assertThat(numero.values()[0]).isEqualTo(numero);
		
	}
		
	}

