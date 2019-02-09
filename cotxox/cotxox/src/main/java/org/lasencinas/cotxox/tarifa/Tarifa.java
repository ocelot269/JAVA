
package org.lasencinas.cotxox.tarifa;


public class Tarifa {
    
    
    private final double COSTE_MILLA=1.35;
    private double costeViajeMillas=0;
    private final double COSTE_MINUTO=0.35;
    private double costeViajeMinutos=0;
    private final double COSTE_MINIMO_VIAJE=5 ;
    private double porcentajeComision = 0;
    
    
    
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
    
    
    public double getCosteTotalEsperado(double millas, double minutos){
            double TotalViaje;
            setCosteViajeMillas(millas);
            setCosteViajeMinutos(minutos);
            setPorcentajeComision();
            
            if (getPorcentajeComision() + getCosteViajeMillas() + getCosteViajeMinutos() <6){
                return TotalViaje =COSTE_MINIMO_VIAJE;
            }
            else {
                return TotalViaje = getPorcentajeComision() + getCosteViajeMillas() + getCosteViajeMinutos();
            }
            
            
        
    }
    
    
    
}
