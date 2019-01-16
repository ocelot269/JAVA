
package dni;


public class Dni {
    private String dni=null;
    private char letra = this.dni.charAt(this.dni.length(-1));
    
    //private TablaAsignacion tablaAsignacion = new tablaAsignacion();
            
    public Dni(){}
    
    public Dni(String dni){
        this.dni = dni;
    }
            
    public String getDni(){
        return this.dni;
    }        
    public Character getLetraDni(){
         return letra;
    }
    public String getParteNumerica(){
        return null;
        //return this.dni.substring(0)
    }
            
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
