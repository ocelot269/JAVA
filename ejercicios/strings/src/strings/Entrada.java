
package strings;

import javax.swing.*;


public class Entrada {
    public static void main(String[] args) {
    String nombre_usuario = JOptionPane .showInputDialog("Introduce tu nombre,por favor");//Crea un menu con el mensaje personalizado 
    String edad=JOptionPane.showInputDialog("Introduce tu edad");
    int edad_usuario=Integer.parseInt(edad);//Pasa una string a int
    edad_usuario++;
    System.out.println("Hola " + nombre_usuario + " ,tu edad es " + (edad_usuario) + " años");
    }
}
