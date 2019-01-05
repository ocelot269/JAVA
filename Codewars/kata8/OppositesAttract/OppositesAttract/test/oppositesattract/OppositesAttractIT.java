/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oppositesattract;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ozeh
 */
public class OppositesAttractIT {
    
    public OppositesAttractIT() {
    }
    
    @Test
  public void testOddAndEven() {
    assertEquals(true, OppositesAttract.isLove(1, 4));
  }
  
  @Test
  public void testEvenAndEven() {
    assertEquals(false, OppositesAttract.isLove(2, 2));
  }
  
  @Test
  public void testOddAndOdd() {
    assertEquals(false, OppositesAttract.isLove(1, 1));
  }
  
  @Test
  public void testEvenAndOdd() {
    assertEquals(true, OppositesAttract.isLove(0, 1));
  }
  
}