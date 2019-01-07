
package solution;

import org.junit.Test;
import static org.junit.Assert.*;


public class SolutionIT {
    
    public SolutionIT() {
    }

   @Test
    public void testSimpleString1() {
        assertEquals("Hello World", Solution.removeExclamationMarks("Hello World!"));
    }
}