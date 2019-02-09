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
    public void testGetCosteViajeMillas() {
    Tarifa tarifa = new Tarifa();
    tarifa.setCosteViajeMillas(20.3);
    assertEquals(27.405,tarifa.getCosteViajeMillas(),0);
    }
    
    @Test
    public void testGetCosteViajeMinutos() {
    Tarifa tarifa = new Tarifa();
    tarifa.setCosteViajeMinutos(10.3);
    assertEquals(3.605,tarifa.getCosteViajeMinutos(),0);
    }
    
    
    @Test
    public void testGetPorcentajeComision() {
    Tarifa tarifa = new Tarifa();
    tarifa.setPorcentajeComision();
    assertEquals(0,tarifa.getPorcentajeComision(),0);
    }
    
    @Test
    public void testGetCosteTotalEsperado() {
    Tarifa tarifa = new Tarifa();
    assertEquals(5,tarifa.getCosteTotalEsperado(1, 1),0);
    }
    
    @Test
    public void testGetCosteTotalEsperado1() {
    Tarifa tarifa = new Tarifa();
    assertEquals(204,tarifa.getCosteTotalEsperado(100,100),0);
    }
    
    
    @Test
    public void testGetCosteTiempo() {
    Tarifa tarifa = new Tarifa();
    assertEquals(3.5,tarifa.getCosteTiempo(10),0);
    }
}
