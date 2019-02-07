
package org.lasencinas.cotxox.tarifa;


public class Tarifa {
    
    
    private final double COSTE_MILLA=1.35;
    private double costeViajeMillas=0;
    private final double COSTE_MINUTO=0.35;
    private double costeViajeMinutos=0;
    private final double COSTE_MINIMO=5 ;
    private double porcentajeComision= (COSTE_MILLA + COSTE_MINUTO) *1.20;
    
    
    
    public Tarifa() {
    
    
    }
    
    
    
    public double getCosteDistancia(double distancia){
       return costeViajeMillas = COSTE_MILLA * distancia; 
    }
    
    
    public double getCosteTiempo(double minutos) {
        return costeViajeMinutos=COSTE_MINUTO * minutos;
    }
    
    
    public double getCosteTotalEsperado(Carrera){
        
    }
    
    
    
}
