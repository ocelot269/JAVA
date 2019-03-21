
package org.lasencinas.herencia;

import java.util.ArrayList;


public class Drawables {

   
    
    public Drawables(){
    
    }
    
    public static void dibujarDrawables(ArrayList<Drawable> listaFiguras){
        for (Drawable figura : listaFiguras){
            figura.draw();
        }
    }
    
    public static void aplicarTema(ArrayList<Drawable> listaFiguras){
        for (Drawable figura : listaFiguras){
            try {
                figura.applyTheme();
            } catch (UnsupportedOperationException Exception) {
                FiguraGeometrica figurita = (FiguraGeometrica) figura;
                System.out.println("La figura que es un " + figurita.getNombre() + " no tiene implementado el metodo aplicarTema" );
                
            }
        }
        
    }
}
