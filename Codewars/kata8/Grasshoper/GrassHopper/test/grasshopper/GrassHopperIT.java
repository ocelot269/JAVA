
package grasshopper;

import org.junit.Test;
import static org.junit.Assert.*;


public class GrassHopperIT {
    
    public GrassHopperIT() {
    }

    
    @Test
    public void test1() {
        assertEquals(1,
        GrassHopper.summation(1));
    }
    @Test
    public void test2() {
        assertEquals(36,
        GrassHopper.summation(8));
    }
}
