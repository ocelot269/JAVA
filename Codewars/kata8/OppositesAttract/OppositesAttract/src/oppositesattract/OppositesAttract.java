
package oppositesattract;

public class OppositesAttract {
    
    public static void main(String[] args) {
        int flower1 = 0;
        int flower2 = 0 ;
        OppositesAttract contarFlores = new OppositesAttract();
        System.out.println(OppositesAttract.isLove(flower1, flower2));
    }
   
  public static boolean isLove(final int flower1, final int flower2) {
    if(flower1%2==0 && flower2%2!=0){
      return true;
     }
     
    else if(flower1%2!=0 && flower2%2==0) {
      return true;
    }
    
    else {
      return false;
      }
  }
  
}
