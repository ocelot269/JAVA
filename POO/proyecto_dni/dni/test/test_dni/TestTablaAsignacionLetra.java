
package test_dni;

import dni.tablaAsignacionLetra;


public class TestTablaAsignacionLetra {
    
    
    
    
    public static void main(String[] args) {
        
    tablaAsignacionLetra nuevaTabla = new  tablaAsignacionLetra();
    nuevaTabla.setTablaAsignacion();
    nuevaTabla.getLongitudDni();//Esto te devuelve la longitud de la tabla de asignacion de Dni ,en este caso 23 int
    if (nuevaTabla.calcularLetraDni("43224953") == "T") { 
        System.out.println("true");// este caso test te muestra la letra que va en esa posición  
    }
    else{
        System.out.println("false");
    }
       

    }
}
