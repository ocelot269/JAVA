
package smallestintegerfinder;


public class SmallestIntegerFinder {

   
    public static void main(String[] args) {
        // TODO code application logic here
    }
        public static int findSmallestInt(int[] args) {
      int contador = args[0];
      for(int numero: args){
        if(numero < contador){
          contador = numero;
        
        }
      }
      return contador;
}
}

