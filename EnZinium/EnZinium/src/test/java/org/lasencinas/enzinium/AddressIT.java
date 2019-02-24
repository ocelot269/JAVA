
package org.lasencinas.enzinium;

import org.junit.Test;
import static org.junit.Assert.*;


 
public class AddressIT {
    
    public AddressIT() {
    }

    
    @Test
    public void testGetPK() {
    Address direccion = new Address();
    direccion.generateKeyPair();
    assertNotNull(direccion.getPK());
    }

    
    @Test
    public void testGetSK() {
    Address direccion = new Address();
    direccion.generateKeyPair();
    assertNotNull(direccion.getSK());
    }
    
    
   @Test
    public void generate_key_pair_test() {
        Address address = new Address();
        assertNotNull(address);
        address.generateKeyPair();
        assertNotNull(address.getPK());
        assertNotNull(address.getSK());
    }
    
    @Test
    public void testGetBalance() {
    Address direccion = new Address();
    direccion.setBalance(100d);
    assertEquals(100d,direccion.getBalance(),0);
    }
   
    @Test
    public void testSymbol() {
    Address direccion = new Address();
    assertEquals("EZI",direccion.getSymbol());
    }
    
    @Test
    public void testAddEZI() {
    Address direccion = new Address();
    direccion.addEZI(20d);
    assertEquals(20d,direccion.getBalance(),0);
    }
}
