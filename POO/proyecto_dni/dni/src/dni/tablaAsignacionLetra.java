
package dni;

import java.util.HashMap;

public class tablaAsignacionLetra {
    
    HashMap<Integer, String> hash_map = new HashMap<Integer, String>(); 
    
    
    public  void  setTablaAsignacion(){ // Este método recorre una array, pàra obtener la letra del DNI
        String [] letra ={ "T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        for(int posicion = 0; posicion < 23; posicion++){
            hash_map.put(posicion,letra[posicion]);//Se crea un diccionario con clave valor
            
        }
        
    }
    public String getLetra(int pos){
       return hash_map.get(pos);
       
   }
    
    public void mostrarLetra(int posicion){
        System.out.println(hash_map.get(posicion));
    }
}
