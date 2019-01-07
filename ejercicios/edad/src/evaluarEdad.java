
package edad;

import java.util.*;

public class evaluarEdad {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce tu edad");
        int edad =entrada.nextInt();//Declarado e iniciado en la misma linea
        if(edad>=18){
            System.out.println("Eres un hombre");//Te muestra eres un hombre si tu edad es mayor de 18
        }else if(edad<=18){
            System.out.println("Eres muy pequeño para mirar este tipo de paginas");
         
        }
        System.out.println(edad);
    }
    
}
