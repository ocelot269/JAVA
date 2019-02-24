
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
    assertEquals("JJJ", token.symbol());
    }

    
    @Test
    public void testGetTotalSupply() {
    token.setTotalSupply(100d);
    assertEquals(100d, token.totalSupply(),0);
    }

    
    @Test
    public void testGetPK() {
    address.generateKeyPair();
    TokenContract token1 = new TokenContract(address);    
    assertNotNull(token1.getPK());
    }
    
    @Test
    public void testAddOwner(){
    address.generateKeyPair();
    TokenContract token1 = new TokenContract(address);
    token1.addOwner(address.getPK(), 100d);
    assertEquals(1, token1.getBalances().size());
    
    }
    
    @Test
    public void testAddOwner1(){
    address.generateKeyPair();
    TokenContract token1 = new TokenContract(address);
    token1.addOwner(address.getPK(), 100d);
    token1.addOwner(address.getPK(), 500d);
    assertEquals(100d, token1.getBalances().get(address.getPK()),0);
    
    
    
    }
}
