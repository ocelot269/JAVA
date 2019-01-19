
package org.lasencinas.coche;

/**
 *
 * @author ozeh
 */
public class Coche {

    private int peso_plataforma;
    private int largo;
    private String color;
    private int ancho;
    private int motor;
    private int ruedas;
    int peso_total;
    boolean asientos_cuero,climatizador;
    
public Coche(){
    color="";
    ruedas= 4;
    largo= 2000;
    ancho= 300;
    motor= 1600;
    peso_plataforma=500;
    asientos_cuero=false;
    
}

public String getLargo(){ //Getter
    return "El largo del coche es " + largo;
}
public String getDatosGenerales(){
    return "La plataforma del vehiculo tiene " + ruedas +" ruedas y mide " + largo/1000 + " metros con un ancho de " + ancho + " cm y un peso de plataformas de " + peso_plataforma + " kg";
}
public void setCambiarColor(String color_coche){//Setter
    this.color=color_coche;
}
public String getDimeColor(){
    return "El color del coche es " + color;
}
public void setConfiguraAsientos(String asientosCuero){
    if (asientosCuero == "si") {
         this.asientos_cuero = true;
    }else{
        this.asientos_cuero = false;
    }  
}
public String get_dimeAsientos(){
    if (this.asientos_cuero ==true){
        return "El coche tiene asientos de cuero";
    }else{
        return "El coche tiene asientos normales";
    }
}

}