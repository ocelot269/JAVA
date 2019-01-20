
package dni;



public class Dni {
    private String dni;

    private tablaAsignacionLetra tablaAsignacion = new tablaAsignacionLetra();

            
    public Dni(){}
    
    public Dni(String dni){
        this.dni = dni;
    }
    public void SetDni(dni) {
        this.dni = dni;
    }        
    public String getDni(){
        return this.dni;
    }        
    public Character getLetraDni(){
         return this.dni.charAt(dni.length()-1);
         
    }
    public String getParteNumerica(){
        return this.dni.substring(0, this.dni.length() -1);
        
    }
            
    public String getObtenerLetraDni(){
       return this.tablaAsignacion.calcularLetraDni(getParteNumerica());
       
   }
    
}
