package org.lasencinas.herencia;

public interface Drawable {
    void draw();
    
    default void applyTheme(){
        throw new UnsupportedOperationException("Metodo sin implementar");
    }
}
