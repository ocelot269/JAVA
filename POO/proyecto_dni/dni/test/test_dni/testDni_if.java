
package test_dni;

import dni.Dni;


public class testDni_if {
   
    

  public static void main(String[] args) {
    Dni Midni = new Dni("53224953h");
    if (Midni.getDni().equalsIgnoreCase("43224953h")){
          System.out.println("Es correcto");
    } else {
        System.out.println("No es correcto");
    }
    
    
    
    }
}
 