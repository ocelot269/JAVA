/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.lasencinas.distanceconverted;


public class DistanceConverter {
  
    public static double convertFeettoMeters (double feet) {
        return feet * 0.3048;
    }
    public static double convertMeterstoFeet (double meters){
        return meters * 3.2808;
    }
    public static double convertFeettoInches (double feet) {
        return feet * 12;
    }
    public static double convertInchesttoFeet (double inches){
        return inches /12 ;
    }
    public static double convertedCmtoFeet ( double cm){
        return convertMeterstoFeet(cm /100);
    }
    public static double convertFeettoCm(double feet){
        return convertFeettoMeters(feet) * 100;
    }
    public static double convertCmtoInches(double cm){
        return convertFeettoInches(convertedCmtoFeet(cm));
    }
    public static double convertInchestoCm(double inches){
    return convertFeettoCm(convertInchesttoFeet(inches));
    }
}
