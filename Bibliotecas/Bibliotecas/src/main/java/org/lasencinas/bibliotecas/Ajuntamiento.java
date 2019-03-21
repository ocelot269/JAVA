
package org.lasencinas.bibliotecas;

import java.util.HashSet;
import java.util.Set;


public class Ajuntamiento extends EntidadPublica{
   private Set<Biblioteca> conjuntoBibliotecas= new HashSet<>();
   private Set<Ejemplar> listaEjemplares = new HashSet<>();
   
    
    public Set<Biblioteca> getConjuntoBibliotecas() {
        return conjuntoBibliotecas;
    }

    
    public void setConjuntoBibliotecas(Set<Biblioteca> ConjuntoBibliotecas) {
        this.conjuntoBibliotecas = ConjuntoBibliotecas;
    }
}
