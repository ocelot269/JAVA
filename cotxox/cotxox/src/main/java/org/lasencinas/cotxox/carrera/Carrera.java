
package org.lasencinas.cotxox.carrera;

import org.lasencinas.cotxox.conductores.PoolConductores;
import org.lasencinas.cotxox.tarifa.Tarifa;


public class Carrera {

    static double getTiempoEsperado(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


//-----------------------Iniciando variables----------------------------//

    private String tarjetaCredito=null;
    private String origen=null;
    private String destino=null;
    private double distancia=0;
    private double tiempoEsperado =0;
    private int tiempoCarrera = 0;
    private double propina=0;
    private double costeTotal = 0;
    private String conductor= null;
    private int pago= 0;
//    private Conductor conductor=null;
    
//-------------------------Fin variables---------------------------------//    
    
//------------------------Inicio Constructor-----------------------------//

    
    public Carrera(String tarjeta){
    this.tarjetaCredito=tarjeta;
    }
    
    
//------------------------Fin constructor--------------------------------// 
        
    
//------------------------Inicio Getters and Setters----------------------//    
    
public String getTarjetaCredito(){
    return this.tarjetaCredito;
} 


public String getOrigen(){
    return this.origen;
}


public void setOrigen(String origen){
    this.origen=origen;
}


public String getDestino(){
    return this.destino;
}

public void setDestino(String destino){
     this.destino=destino;
}


public double getDistancia(){
    return this.distancia;
}


public void setDistancia(double distancia){
    this.distancia=distancia;
}

public double getCosteEsperado(){
    return getCoste;
}
    

//public String [] asignarConductor(PoolConductores conductores){
//    return this.conductor=conductores;
//}

public double getCosteTotal(){
    return this.costeTotal;
}


public double getPropina(){
    return this.propina;
}


public void setPropina(double propina) {
    this.propina+=propina;
}


public void setCosteTotal(double pago){
    this.costeTotal+=pago;
}


public void setTiempoEsperado (double tiempo){
    this.tiempoEsperado=tiempo;
}

public double getTiempoEsperado() {
      return this.tiempoEsperado;
}



//-------------------------Fin Getters and Setters------------------------//

    

    
//--------------------------Inicio Metodos--------------------------------//    

public void realizarPago(double pago){
    setCosteTotal(pago);
}


public void recibirPropina(double propina){
    setPropina(propina);
}

//public void liberarConductor(0) {
    
//}
}