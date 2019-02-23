
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
    
}
