
package test_dni;

import dni.Dni;


public class testDni_if {
   
    

  public static void main(String[] args) {
    Dni midni = new Dni("53224953");
    System.out.println(midni.getParteNumerica());
    if (midni.getDni().equalsIgnoreCase("43224953h")){
          System.out.println("Es correcto");
    } else {
        System.out.println("No es correcto");
    }
    
    System.out.println(midni.getParteNumerica());
    System.out.println(midni.getLetraDni());
    System.out.println(midni.getObtenerLetraDni());
      
    
    }
}
 