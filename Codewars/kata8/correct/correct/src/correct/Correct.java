/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correct;

/**
 *
 * @author ozeh
 */
public class Correct {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
  public static String correct(String string) {
     return string.replace("5","S").replace("0", "O").replace("1","I");
  
  }
}

