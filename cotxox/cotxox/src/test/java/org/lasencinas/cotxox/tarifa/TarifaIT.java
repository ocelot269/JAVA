/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.lasencinas.cotxox.tarifa;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ozeh
 */
public class TarifaIT {
    
    public TarifaIT() {
    }

    @Test
    public void testGetCosteDistancia() {
    Tarifa tarifa = new Tarifa();
    assertEquals(13.5,tarifa.getCosteDistancia(10),0);
    }
    
    
    @Test
    public void testGetCosteTiempo() {
    Tarifa tarifa = new Tarifa();
    assertEquals(3.5,tarifa.getCosteTiempo(10),0);
    }
}
