
package bucles;

import javax.swing.JOptionPane;


public class Bucles {

    public static void main(String[] args) {
        String clave="Secreto";
        String pass="";
        while(clave.equals(pass)== false){
            pass=JOptionPane.showInputDialog("Introduce la contraseña");
            
            if (clave.equals(pass)!= true) {
                System.out.println("Contraseña Incorrecta");
        }
                
    }
    System.out.println("Contraseña correcta");   
}
 
}