
package org.lasencinas.bibliotecas;

import java.util.HashSet;
import java.util.Set;


public class Ejemplar {
    
    //Variables
    private Set<Libro> ListaLibros = new HashSet<>();
    private Set<Revista> ListaRevistas = new HashSet<>();
    
    //Constructor
    public Ejemplar() {
        
    }

    
    public Set<Libro> getListaLibros() {
        return ListaLibros;
    }

    
    public void setListaLibros(Set<Libro> ListaLibros) {
        this.ListaLibros = ListaLibros;
    }

    
    public Set<Revista> getListaRevistas() {
        return ListaRevistas;
    }

    
    public void setListaRevistas(Set<Revista> ListaRevistas) {
        this.ListaRevistas = ListaRevistas;
    }
}
