/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.lasencinas.cotxox.carrera;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ozeh
 */
public class CarreraIT {
    
    public CarreraIT() {
    }
    
    
    @Test
    public void testRealizarPago() {
    Carrera pasajero=new Carrera("43224953");
    pasajero.realizarPago(425.25);
    assertEquals(425.25, pasajero.getCosteTotal(),0);
    
    }
    
    @Test
    public void testRecibirPropina() {
    Carrera pasajero=new Carrera("43224953");
    pasajero.recibirPropina(4.55);
    assertEquals(4.55, pasajero.getPropina(),0);
    }
    
    @Test
    public void testRecibirPropina1() {
    Carrera pasajero=new Carrera("43224953");
    pasajero.recibirPropina(7.55);
    assertEquals(7.55, pasajero.getPropina(),0.2);
    }
}
