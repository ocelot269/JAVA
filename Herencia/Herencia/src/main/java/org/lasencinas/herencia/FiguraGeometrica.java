
package org.lasencinas.herencia;


public abstract class FiguraGeometrica {
    //variable
    
    
    private String nombre;
    
    //Constructor
    
    public FiguraGeometrica(){
        setNombre("Nombre desconocido");
    }
    
    //Sobrecarga
    
    public FiguraGeometrica(String nombre){
        setNombre(nombre);
    }

    //Getters y Setters
    
    
    public String getNombre() {
        return nombre;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //Logica
    
    public abstract double area();
          
}
