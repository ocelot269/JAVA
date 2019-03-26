
package org.lasencinas.bibliotecas;

import java.util.HashMap;
import java.util.Map;

public class CopiaEjemplar {
    
    //Variables
    
    
    private HashMap<String,Integer> listaRevistas = new HashMap<String,Integer>();
    private Revista revista;
    private Biblioteca biblioteca;
    
    //Constructor
    
    public CopiaEjemplar(){
        
    }
   
    //Getters y Setters

    
    public HashMap<String,Integer> getListaRevistas() {
        return listaRevistas;
    }

    
    public void setListaRevistas(HashMap<String,Integer> listaRevistas) {
        this.listaRevistas = listaRevistas;
    }
    
}
