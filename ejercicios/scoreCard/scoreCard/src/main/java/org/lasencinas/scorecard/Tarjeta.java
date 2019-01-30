
package org.lasencinas.scorecard;


public class Tarjeta {
    
    private final int STRIKE = 10;
    private final int CERO = 0;
    private String pines="-123456789X/";
    private String tarjeta =null ;
    private int puntuacionTotal = 0;
    private final int SPARE =10;
    
    public Tarjeta() {
    
    }
    public Tarjeta(String tarjeta){
        this.tarjeta = tarjeta;
    }
    public String getTarjetaPuntuacion(){
        return this.tarjeta;
    }
    public int getStrike(){
        return STRIKE;
    }
    public int computarStrike(char strike){
        if (strike == 'X'){
           return STRIKE;   
        }
        else{
            return CERO;
        }
        
    }
    public int computarSpare(char spare){
        if (spare == ('/')){
            return SPARE;
        }
        else {
            return CERO;
        }
    }
    public int computarPins(char pin){
        return this.pines.indexOf(pin);
    }
    
    public int computarTarjetaVeinteBolas(){
        for (int i=0; i <getTarjetaPuntuacion().length(); i++)
            if (getTarjetaPuntuacion().charAt(i)== '/'){
                if (i < 19 ) {
                    puntuacionTotal+= -getTarjetaPuntuacion().charAt(i - 1) + 10 + getTarjetaPuntuacion().charAt(i + 1); 
                }
            }
            else {
                puntuacionTotal+= computarPins(getTarjetaPuntuacion().charAt(i));
            } 
        return puntuacionTotal;
    }
    
    
}
