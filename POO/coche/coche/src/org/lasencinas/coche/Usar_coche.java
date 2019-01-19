
package org.lasencinas.coche;


public class Usar_coche {
    
    public static void main(String[] args) {
        Coche micoche= new Coche();
        micoche.setCambiarColor("verde");
        System.out.println(micoche.getDatosGenerales());
        micoche.setConfiguraAsientos("no");
        System.out.println(micoche.get_dimeAsientos());
    }
}
