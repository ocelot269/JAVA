
import javax.swing.JOptionPane;
/*package strings;*/
public class NewClass {
    public static void main(String[] args) {
        String num1=JOptionPane.showInputDialog("Introduce un numero");
        double num2=Double.parseDouble(num1);
        System.out.println("La raiz de " + num2 + " es ");
        System.out.printf("%1.2f" ,Math.sqrt(num2));
    }
}
