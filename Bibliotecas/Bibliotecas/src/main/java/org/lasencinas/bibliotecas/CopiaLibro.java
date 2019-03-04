
package org.lasencinas.bibliotecas;

import java.util.HashMap;
import java.util.Map;


public class CopiaLibro extends CopiaEjemplar {
    //Variables
    
    
    private HashMap<String,Integer> listaLibros = new HashMap<String,Integer>();
    
    //Constructor
    
    
    public CopiaLibro(){
        
    }
    
    //Getters y setters
    
    
    public HashMap<String,Integer> getListaLibros() {
        return listaLibros;
    }

    
    public void setListaLibros(HashMap<String,Integer> listaLibros) {
        this.listaLibros = listaLibros;
    }
}
