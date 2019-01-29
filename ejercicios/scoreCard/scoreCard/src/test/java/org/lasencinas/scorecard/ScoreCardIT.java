
package org.lasencinas.scorecard;

import org.junit.Test;
import static org.junit.Assert.*;


public class ScoreCardIT {
    
    public ScoreCardIT() {
    }

    @Test
    public void PuntuacionSimpleTest() {
     ScoreCard tarjeta = new ScoreCard();
     String puntuacion ="12345123451234512345";
     int total = 60;
     assertEquals(total,tarjeta.getSampleScore(puntuacion));
    }
    
    @Test
    public void PuntuacionHeartBreakTest() {
     ScoreCard tarjeta = new ScoreCard();
     String puntuacion ="9-9-9-9-9-9-9-9-9-9-";
     int total = 90;
     assertEquals(total,tarjeta.getSampleScore(puntuacion));
    }
}
