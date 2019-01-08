
package bucles;
import java.util.*;

public class juego_adivinar {
    public static void main(String[] args) {
        int aleatorio =(int)(Math.random()*100);
        Scanner entrada = new Scanner(System.in);
        int numero=0;
        int intentos=0;
        while(numero!=aleatorio){
            intentos++;        
            System.out.println("Introduce un numero");
            numero = entrada.nextInt();
            if(numero < aleatorio){
                System.out.println("El numero es mas alto");
                
            }   
            else if(numero > aleatorio){
            System.out.println("EL numero es mas bajo");
  
    }
            
}
    System.out.println("Correcto,has tardado un total " + intentos + " intentos");    
}
}
