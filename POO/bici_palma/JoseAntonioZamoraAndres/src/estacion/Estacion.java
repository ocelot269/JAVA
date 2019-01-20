
package estacion;
import bicicleta.Bicicleta;

class Estacion {
   private int id,numeroAnclajes;
   private String direccion;
   private Bicicleta []  anclajes;
    
    
   
    public Estacion(int id,String direccion,int numAnclajes) {
        this.id = id;
        this.direccion =direccion;
        this.numeroAnclajes= numAnclajes;
        this.anclajes = new Bicicleta[numAnclajes];
        
}
    public int getIdEstacion(){
        return this.id;
    }
    
    public String getDireccionEstacion(){
       return this.direccion; 
    }
    
    public int getNumeroAnclajesEstacion(){
        return this.numeroAnclajes;
    }
    
    
    public void consultarEstacion(){
        System.out.println("La id de la estacion es " + getIdEstacion() + " y tiene " + getNumeroAnclajesEstacion() + " totales en la direccion " + getDireccionEstacion());
  } 
    
    
    
    
    
    
    
    
    
    
    
}





    
    
    
    
    
    
    
    
    
    
    
    
}
