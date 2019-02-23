
package org.lasencinas.enzinium;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;


public class TokenContractIT {
    TokenContract token;
    Address address;
    public TokenContractIT() {
    }
    
    @Before
    public void set_UP(){
        token= new TokenContract();
        address = new Address();
        
        
        
    }
    
    @Test
    public void testGetName() {
    token.setName("Jose");
    assertEquals("Jose", token.getName());
    }

  
    @Test
    public void testGetSymbol() {
    token.setSymbol("JJJ");
    assertEquals("JJJ", token.getSymbol());
    }

    
    @Test
    public void testGetTotalSupply() {
    token.setTotalSupply(100d);
    assertEquals(100d, token.getTotalSupply(),0);
    }

    
    @Test
    public void testGetPK() {
    address.generateKeyPair();
    TokenContract token1 = new TokenContract(address);    
    assertNotNull(token1.getPK());
    }

}
