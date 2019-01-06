
package strings;

public class Strings {

    
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre="Jose";
        System.out.println("Mi nombre es " + nombre);
        System.out.println("Mi nombre tiene " + nombre.length() + " letras");//Te permite saber la longitud de la string
        System.out.println("La primera letra de " + nombre+ " es la " + nombre.charAt(0));//Te permite saber la letra que hay en esa posicion
        int ultima_letra;
        ultima_letra =nombre.length();
        System.out.println("La ultima letra de "  + nombre + " es " + nombre.charAt(ultima_letra - 1));//Esta porcion de codigo te muestra la ultima letra de nombre
    }
    
}
