
import java.util.Scanner;//Paquete en el que se encuentra el Scanner


public class scanner {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);//Scanner te permite almacenar contenido escrito por el usuario
        System.out.println("Introduce tu nombre, por favor");
        String nombre_usuario =entrada.nextLine();
        System.out.println("Introduce edad,por favor");
        int edad =entrada.nextInt();
        System.out.println("Hola " + nombre_usuario + " El año que viene tendrás " + (1+edad));
    }
}
