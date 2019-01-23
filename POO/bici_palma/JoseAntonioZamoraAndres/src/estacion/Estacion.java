
package estacion;
import bicicleta.Bicicleta;
import java.util.concurrent.ThreadLocalRandom;
import tarjetaUsuario.TarjetaUsuario;

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
    public int anclajesLibres(){
        int anclajesLibres = 0;
        
     for (Bicicleta contador : this.anclajes) {
         if (anclajes ==null){
             anclajesLibres++;
         }
         else{
             
         }
     }
     return anclajesLibres;
    }
    public void consultarAnclajes(){
       int posicion =0;
       int numeroAnclaje= 0;
       for (Bicicleta bicicleta:this.anclajes){
           numeroAnclaje= posicion + 1;
           if (bicicleta!=null){
                System.out.println("Anclaje" + numeroAnclaje + " " + this.anclajes[numeroAnclaje]);
           }
           else{
                System.out.println("Anclaje libres son " + numeroAnclaje);          
           }
       }
       
    }
    public void anclarBicicleta(Bicicleta bicicleta){
        int posicion=0;
        int numeroAnclaje=posicion + 1;
        for (Bicicleta anclaje : this.anclajes){
            if (anclaje == null){
                this.anclajes[posicion] = bicicleta;
                mostrarAnclaje(bicicleta, numeroAnclaje);
                break;
            }
            else {
                posicion++;
                numeroAnclaje++;
            }
        }
    }
    
    
    public void mostrarAnclaje(Bicicleta bicicleta, int numeroAnclaje){
        System.out.println("La bicicleta tiene un id que es" + bicicleta.getBicicletaID() + " y el numero de anclaje es "+ numeroAnclaje);
    }
    
    public boolean leerTarjetUsuario(TarjetaUsuario tarjeta){
        return tarjeta.getActivada();
    }
    
    public void retirarBicicleta(TarjetaUsuario tarjeta){
        int numeroAnclaje = 0;
        int posicion= 0;
        for (Bicicleta bicicleta :this.anclajes){
            if (bicicleta != null && tarjeta.equals(true)){
                mostrarBicicleta(bicicleta, numeroAnclaje);
        } 
        }
       
        
    }
    
    public void mostrarBicicleta(Bicicleta bicicleta, int numeroAnclaje){
        System.out.println("La bicicleta tiene el id "+ bicicleta.getBicicletaID() + "y su anclaje es" + numeroAnclaje);
    }
    public ThreadLocalRandom generarAnclajes(){
        return  ThreadLocalRandom.current();
    }
    
    
    
}
    
    
    
    
    
    
    
    
    
    
}
