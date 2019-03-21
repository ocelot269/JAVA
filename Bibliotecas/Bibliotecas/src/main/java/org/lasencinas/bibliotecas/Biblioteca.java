
package org.lasencinas.bibliotecas;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


 
public class Biblioteca extends EntidadPublica{
    //Variables
   private Set<Personal> ListaDelPersonal = new HashSet<>();
   private Set<Miembro> ListaMiembros = new HashSet<>();
   private Map<String , CopiaEjemplar> copias= new HashMap<>();
   
   //Contructor
   public Biblioteca(){
       
   }
   
   public void recibirCopia(){
       
   }
}
