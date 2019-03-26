
package org.lasencinas.numeralesromanos;


public class NumeralesRomanos {
    
    public enum NumerosRomanos{
        I(1),
        V(5),
        X(10),
        L(50),
        C(100),
        D(500),
        M(1000);
        
       private int valorNumeroRomano=0;
       
       private NumerosRomanos(int valor){
           this.valorNumeroRomano=valor;
       }
    }
}
