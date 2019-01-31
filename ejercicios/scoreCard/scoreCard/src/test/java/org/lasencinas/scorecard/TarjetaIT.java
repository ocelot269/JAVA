
package org.lasencinas.scorecard;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class TarjetaIT {
    private Tarjeta tarjeta = null;
    
        @Before
        public void init(){
            tarjeta = new Tarjeta();
    }
    
    @Test
    public void testcomputarStrike() {
        assertEquals(10, tarjeta.computarStrike('X'));
        assertEquals(0, tarjeta.computarStrike('9'));
    }
    @Test
    public void computarPinsTest(){
        for (int i = 1; i<= 9; i++)
        assertEquals(9,tarjeta.computarPins('9'));
        assertEquals(0,tarjeta.computarPins('-'));
    }
    @Test
    public void computarTarjetaVeinteBolasTest(){
         tarjeta = new Tarjeta("12345123451234512345");
        assertEquals(60,tarjeta.computarTarjetaVeinteBolas());
    }
    @Test
    public void computarTarjetaVeinteBolasTest1(){
        Tarjeta tarjeta= new Tarjeta("11111111111111111111");
        assertEquals(20,tarjeta.computarTarjetaVeinteBolas());
    }
    @Test
    public void computarTarjetaVeinteBolasTest2(){
        Tarjeta tarjeta= new Tarjeta("9-9-9-9-9-9-9-9-9-9-");
        assertEquals(90,tarjeta.computarTarjetaVeinteBolas());
    }
    @Test
    public void computarTarjetaVeinteBolasTest3(){
        Tarjeta tarjeta= new Tarjeta("5/5/5/5/5/5/5/5/5/5-5");
        assertEquals(145,tarjeta.computarTarjetaVeinteBolas());
    }
    @Test
    public void computarTarjetaVeinteBolasTest4(){
        Tarjeta tarjeta= new Tarjeta("9/5/5/5/5/5/5/5/5/5-5");
        assertEquals(145,tarjeta.computarTarjetaVeinteBolas());
    }
    @Test
    public void computarTarjetaVeinteBolasTest5(){
        Tarjeta tarjeta= new Tarjeta("9/9/3/5/2/-/7/2/1/21-");
        assertEquals(124,tarjeta.computarTarjetaVeinteBolas());
    }
    @Test
    public void computarTarjetaVeinteBolasTest6(){
        Tarjeta tarjeta= new Tarjeta("XXXXXXXXX11");
        assertEquals(245,tarjeta.computarTarjetaVeinteBolas());
    }
    @Test
    public void computarTarjetaVeinteBolasTest7(){
      Tarjeta tarjeta = new Tarjeta ("1/27XXX-/X3/X11");
      assertEquals(165,tarjeta.computarTarjetaVeinteBolas());
    }
}
