
package org.lasencinas.cotxox.conductores;

import java.util.ArrayList;


public class Conductor {
    
    
//------------------------Inicializando variables------------------------------------------------//    
  
   private String nombre;
   private String modelo;
   private String matricula;
   private double valoracionesMedia=0d;
   private ArrayList<Double>valoraciones= new ArrayList<>();
   private boolean conductorLibre=false;
   
   
//------------------------------Fin variables------------------------------------------//   

   
//-------------------------------Iniciando Constructor---------------------------------//

   
   public Conductor(){
       
   }
   
   
   //--------------------Sobrecarga Constructor-------------------------------//
   

   public Conductor (String nombre){
       this.nombre=nombre;
   }
   
   
   //------------------Fin Sobrecarga Constructor-----------------------------//
   
   
//---------------------------------Fin Inicio Constructor--------------------------------//
   

//-------------------------Inicio Getters and Setters------------------------------------//
   
public String getNombre(){
    return this.nombre;
}


public String getMatricula(){
    return this.matricula;
}


public void  setMatricula(String matricula){
    this.matricula=matricula;
}


public String getModelo(){
    return this.modelo;
}


public void setModelo (String modelo){
    this.modelo=modelo;
}

public double getValoracionesMedia(){
    return this.valoracionesMedia;
}


public void setValoracionesMedia(double puntuacion){
    this.valoracionesMedia=puntuacion;
}


public int getNumeroValoraciones(){
    return this.valoraciones.size();
}


public void setValoraciones(double valoracion){
    this.valoraciones.add(valoracion);
    calcularMediaValoracionesConductor();
}


public boolean getConductorLibre(){
    return this.conductorLibre;
}


public void setConductorLibre(boolean ocupado){
    this.conductorLibre=ocupado;
}
//-------------------------Fin Getters and Setters------------------------------------//
 


//-------------------------Inicio Logica---------------------------------------------//



public double calcularMediaValoracionesConductor(){
    double media=0;
    for (double valoracion : valoraciones){
        media+= valoracion; 
    }
    return valoracionesMedia = media / getNumeroValoraciones();
}


//--------------------------Fin logica----------------------------------------------//

   
   
   
   
   
   
   
   
   
   
   
}

