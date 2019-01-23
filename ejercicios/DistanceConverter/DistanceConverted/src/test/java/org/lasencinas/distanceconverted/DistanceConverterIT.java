/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.lasencinas.distanceconverted;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ozeh
 */
public class DistanceConverterIT {
    
    public DistanceConverterIT() {
    }

    

    @Test
    public void testConvertFeettoMeters() {
        int feet = 1;
        double meters = DistanceConverter.convertFeettoMeters(feet);
        assertEquals(meters, 0.3048,0.001);
    }
    @Test
    public void testConvertMeterstoFeet() {
        int meters = 1;
        double feet = DistanceConverter.convertMeterstoFeet(meters);
        assertEquals(3.281,feet,0.001);
    }
    @Test
    public void testConvertFeettoInches() {
        double feet = 1;
        double inches = DistanceConverter.convertFeettoInches(feet);
        assertEquals(12,inches,0.001);
    }
    @Test
    public void testConvertInchestoFeet() {
        int inches = 12;
        double feet = DistanceConverter.convertInchesttoFeet(inches);
        assertEquals(1,feet,0.001);
    }
    @Test
    public void testConvertCmtoFeet() {
        int cm = 10;
        double feet;
        feet = DistanceConverter.convertedCmtoFeet(cm);
        assertEquals(0.3281,feet,0.001);
    }
    @Test
    public void testConvertFeettoCm() {
        int feet = 1;
        double cm = DistanceConverter.convertFeettoCm(feet);
        assertEquals(30.48,cm,0.001);
    }
    @Test
    public void testConvertCmtoInches() {
        int cm = 10;
        double inches = DistanceConverter.convertCmtoInches(cm);
        assertEquals(3.9371,inches,0.001);
    }
    @Test
    public void testConvertInchestoCm() {
        int inches = 10;
        double cm = DistanceConverter.convertInchestoCm(inches);
        assertEquals(25.4,cm,0.001);
    }
}