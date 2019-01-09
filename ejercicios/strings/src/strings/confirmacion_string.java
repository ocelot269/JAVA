
package strings;

import javax.swing.JOptionPane;



public class confirmacion_string {
    public static void main(String[] args) {
        int arroba = 0;
        boolean punto = false;
        String email =JOptionPane.showInputDialog("introduce un email");
        for( int i=0; i<email.length(); i++){
            
            
            
            if(email.charAt(i)=='@'){
                arroba++;
            }
            
            if(email.charAt(i)=='.'){
                punto=true;
            }
        }
        if(arroba==1 && punto ==true){
            System.out.println("Es correcto el email");
        }
        else{
            System.out.println("No es correcto");
        }
        
    }
 
}
