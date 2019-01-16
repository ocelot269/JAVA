
package test_dni;

import dni.tablaAsignacionLetra;


public class TestTablaAsignacionLetra {
    
    
    
    
    public static void main(String[] args) {
        
    tablaAsignacionLetra nuevaTabla = new  tablaAsignacionLetra();
    nuevaTabla.setTablaAsignacion();
    
    System.out.println(nuevaTabla.getLetra(17));
    nuevaTabla.mostrarLetra(0);
        
    }
}
