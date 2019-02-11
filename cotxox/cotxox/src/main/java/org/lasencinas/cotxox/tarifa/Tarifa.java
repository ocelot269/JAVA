
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
    
    
    
    public static double getCosteViajeMillas(){
       return Tarifa.costeViajeMillas;
    }
    
    
    public static void setCosteViajeMillas(double distancia){
        Tarifa.costeViajeMillas= COSTE_MILLA * distancia;
    }
    
    
    public static double getCosteViajeMinutos(){
        return Tarifa.costeViajeMinutos;
    }
    
    
    public static void setCosteViajeMinutos (double minutos){
        Tarifa.costeViajeMinutos= minutos * COSTE_MINUTO;
    }
    
    
    public static double getCosteTiempo(double minutos) {
        return COSTE_MINUTO * minutos;
    }
    
    
    public static double getPorcentajeComision(){
        return Tarifa.porcentajeComision;
    }
    
    
    public static void setPorcentajeComision(){
        Tarifa.porcentajeComision= (getCosteViajeMillas() + getCosteViajeMinutos()) * 20 /100;
    }
    
    
    public static double getCosteTotalEsperado(Carrera totalCarrera){
            setCosteViajeMillas(totalCarrera.getDistancia());
            setCosteViajeMinutos(totalCarrera.getTiempoEsperado());
            setPorcentajeComision();
            
            if (getPorcentajeComision() + getCosteViajeMillas() + getCosteViajeMinutos() <= 5){
                totalCarrera.setCosteTotal(COSTE_MINIMO_VIAJE);
                return totalCarrera.getCosteTotal();
            }
            else {
                totalCarrera.setCosteTotal(getPorcentajeComision() + getCosteViajeMillas() + getCosteViajeMinutos());
                return totalCarrera.getCosteTotal();
            }
            
            
        
    }
    
    
    
}
