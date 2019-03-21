package org.lasencinas.bibliotecas;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Ejemplar {

    //Variables
    private HashMap<String, Integer> listaLibros = new HashMap<String, Integer>();
    private HashMap<String, Integer> listaRevistas = new HashMap<String, Integer>();
    private Ajuntamiento ajuntamiento;
    

    //Constructor
    public Ejemplar() {

    }
//getters y setters

    public HashMap<String, Integer> getListaLibros() {
        return listaLibros;
    }
    
    
    public void setListaLibros(HashMap<String, Integer> listaLibros) {
        this.listaLibros = listaLibros;
    }
    
    
    public HashMap<String, Integer> getListaRevistas() {
        return listaRevistas;
    }
    
    
    public void setListaRevistas(HashMap<String, Integer> listaRevistas) {
        this.listaRevistas = listaRevistas;
    }

    
}
