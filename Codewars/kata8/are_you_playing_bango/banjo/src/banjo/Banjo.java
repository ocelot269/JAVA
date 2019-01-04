
package banjo;

public class Banjo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        String name ="rose";
    Banjo llamarNombre = new Banjo();
        System.out.println(llamarNombre.areYouPlayingBanjo(name));
    }
    
    public static String areYouPlayingBanjo(String name){
       if(name.charAt(0) == 'R' || name.charAt(0) == 'r' ){
           return name + " plays banjo" ;
    }
    else{
           return name + " does not play banjo"; 
    } 
    }
}
    

