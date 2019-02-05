
package org.lasencinas.refactorizar;

import org.junit.Test;
import static org.junit.Assert.*;


public class CadenaSupermercadoIT {
    
    public CadenaSupermercadoIT() {
    }

    
    @Test
    public void calcularGananaciasSuperMercadoTest() {
        CadenaSupermercado mercado1 = new CadenaSupermercado();
        mercado1.calcularGananaciasSuperMercado();
        assertEquals(10921.34, mercado1.getTotalGananciasSuperMercados(),2);
    }
    @Test
    public void calcularGananaciasSuperMercadoTest1() {
        CadenaSupermercado mercado1 = new CadenaSupermercado();
        mercado1.calcularGananaciasSuperMercado();
        assertEquals(1,mercado1.getPosicionTiendaMenosVende());
    }
}
