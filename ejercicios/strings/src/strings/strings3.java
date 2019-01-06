
package strings;


public class strings3 {
    
    public static void main(String[] args) {
        String alumno1, alumno2;
        alumno1 ="David";
        alumno2 = "david";
        System.out.println(alumno1.equals(alumno2));//Comprueba si los 2 objetos son iguales
        System.out.println(alumno1.equalsIgnoreCase(alumno2));//Lo mismo que el anterior,lo que no mira si tiene mayusculas o minusculas,solo mira la palabra
    }
}
