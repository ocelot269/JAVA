/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.lasencinas.cotxox.conductores;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ozeh
 */
public class ConductorIT {
    
    public ConductorIT() {
    }

    @Test
    public void testGetNombre() {
    Conductor FernandoAlonso = new Conductor("fernando");
    assertEquals("fernando",FernandoAlonso.getNombre());
    }
    
     @Test
    public void testGetMatricula() {
    Conductor FernandoAlonso = new Conductor("fernando");
    FernandoAlonso.setMatricula("CSY4232Y");
    assertEquals("CSY4232Y",FernandoAlonso.getMatricula());
    }
    
}
