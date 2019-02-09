
package org.lasencinas.cotxox.tarifa;


public class Tarifa {
    
    
    private final double COSTE_MILLA=1.35;
    private double costeViajeMillas=0;
    private final double COSTE_MINUTO=0.35;
    private double costeViajeMinutos=0;
    private final double COSTE_MINIMO=5 ;
    private double porcentajeComision = (costeViajeMillas +  costeViajeMinutos) * 1.20;
    
    
    
    public Tarifa() {
    
    
    }
    
    
    
    public double getCosteViajeMillas(){
       return this.costeViajeMillas;
    }
    
    
    public void setCosteViajeMillas(double distancia){
        this.costeViajeMillas= COSTE_MILLA * distancia;
    }
    
    public double getCosteViajeMinutos(){
        return this.costeViajeMinutos;
    }
    
    
    public void setCosteViajeMinutos (double minutos){
        this.costeViajeMinutos= minutos * COSTE_MINUTO;
    }
    
    public double getCosteTiempo(double minutos) {
        return COSTE_MINUTO * minutos;
    }
    
    
    public double getCosteTotalEsperado(Kilometros){
       return costeViajeMillas + costeViajeMinutos;
    }
    
    
    
}
