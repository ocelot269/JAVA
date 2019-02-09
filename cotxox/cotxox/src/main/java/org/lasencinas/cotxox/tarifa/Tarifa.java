
package org.lasencinas.cotxox.tarifa;

import org.lasencinas.cotxox.carrera.Carrera;


public class Tarifa {
    
    
    private final static double COSTE_MILLA=1.35;
    private static double costeViajeMillas=0;
    private static final double COSTE_MINUTO=0.35;
    private static double costeViajeMinutos=0;
    private static final double COSTE_MINIMO_VIAJE=5 ;
    private static double porcentajeComision = 0;
    
    
    
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
    
    
    public double getPorcentajeComision(){
        return porcentajeComision;
    }
    
    
    public void setPorcentajeComision(){
        this.porcentajeComision= (getCosteViajeMillas() + getCosteViajeMinutos()) * 20 /100;
    }
    
    
    public double getCosteTotalEsperado(Carrera totalCarrera){
            setCosteViajeMillas(totalCarrera.getDistancia());
            setCosteViajeMinutos(totalCarrera.getTiempoEsperado());
            setPorcentajeComision();
            
            if (getPorcentajeComision() + getCosteViajeMillas() + getCosteViajeMinutos() <6){
                totalCarrera.setCosteTotal(COSTE_MINIMO_VIAJE);
                return totalCarrera.getCosteTotal();
            }
            else {
                totalCarrera.setCosteTotal(getPorcentajeComision() + getCosteViajeMillas() + getCosteViajeMinutos());
                return totalCarrera.getCosteTotal();
            }
            
            
        
    }
    
    
    
}
