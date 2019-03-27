
package org.lasencinas.numeralesromanos;


public class NumeralesRomanos {
    
    public enum NumerosRomanos{
        Uno("I",1),
        Cinco("V",5),
        Diez("X",10),
        Cincuenta("L",50),
        Cien("C",100),
        Quinientos("D",500),
        Mil("M",1000);
        
       private int valorNumeroRomano=0;
       private String letraRomana="";
       
        NumerosRomanos(String letra,int valor){
           this.valorNumeroRomano=valor;
           this.letraRomana=letra;
           
       }
    }
}
