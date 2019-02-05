
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
    public void getPosicionTiendaMenosVendeTest0() {
        CadenaSupermercado mercado1 = new CadenaSupermercado();
        mercado1.calcularGananaciasSuperMercado();
        assertEquals(1,mercado1.getPosicionTiendaMenosVende());
    }
    @Test
    public void getPosicionTiendaMasVende() {
        CadenaSupermercado mercado1 = new CadenaSupermercado();
        mercado1.calcularGananaciasSuperMercado();
        assertEquals(0,mercado1.getPosicionTiendaMasVende());
    }
}
