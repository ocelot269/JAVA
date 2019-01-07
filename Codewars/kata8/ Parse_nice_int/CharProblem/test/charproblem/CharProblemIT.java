/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charproblem;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ozeh
 */
public class CharProblemIT {
    
    public CharProblemIT() {
    }
@Test
    public void test1() {
      assertEquals(5, CharProblem.howOld("5 years old"));
      }
    @Test
    public void test2() {  
      assertEquals(9, CharProblem.howOld("9 years old"));
      }
   @Test
   public void test3() {
      assertEquals(1, CharProblem.howOld("1 year old"));
      }
}
    