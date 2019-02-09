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
    public void getTarjetaCreditoTest(){
    Carrera carrera=new Carrera("432246754");
    assertEquals("432246754", carrera.getTarjetaCredito());
    }
    
    @Test
    public void getOrigenTest(){
    Carrera carrera=new Carrera("432246754");
    carrera.setOrigen("magaluf");
    assertEquals("magaluf", carrera.getOrigen());
    }
    
    @Test
    public void getDestinoTest(){
    Carrera carrera=new Carrera("432246754");
    carrera.setDestino("aeropuerto");
    assertEquals("aeropuerto", carrera.getDestino());
    }
    
    @Test
    public void getDistanciaTest(){
    Carrera carrera=new Carrera("432246754");
    carrera.setDistancia(18.1);
    assertEquals(18.1, carrera.getDistancia(),0);
    }
    
    
   
    @Test
    public void testGetPropina() {
    Carrera pasajero=new Carrera("43224953");
    pasajero.setPropina(425.25);
    assertEquals(425.21, pasajero.getPropina(),0);
    
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
