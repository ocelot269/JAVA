
package org.lasencinas.cotxox.conductores;

import java.util.ArrayList;


public class Conductor {
    
    
//------------------------Inicializando variables------------------------------------------------//    
  
   private String nombre;
   private String modelo;
   private String matricula;
   private double valoracionesMedia=0d;
   private ArrayList<Double>valoraciones= new ArrayList<>();
   private boolean ocupado=false;
   
   
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
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
}

