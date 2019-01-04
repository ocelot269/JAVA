
package banjo;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ozeh
 */
public class BanjoIT {
    
    public BanjoIT() {
    }
  
  @Test
  public void PeopleThatPlayBanjo() {
    assertEquals( "Nope!" , Banjo.areYouPlayingBanjo("Martin"), "Martin does not play banjo");
    assertEquals( "Nope!" , Banjo.areYouPlayingBanjo("Rikke"), "Rikke plays banjo");
  }

}

