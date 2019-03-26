package org.lasencinas.planeta;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

public class planeta {

    public enum Planeta {
        MERCURY(3.303e+23, 2.4397e6),
        VENUS(4.869e+24, 6.0518e6),
        EARTH(5.976e+24, 6.37814e6),
        MARS(6.421e+23, 3.3972e6),
        JUPITER(1.9e+27, 7.1492e7),
        SATURN(5.688e+26, 6.0268e7),
        URANUS(8.686e+25, 2.5559e7),
        NEPTUNE(1.024e+26, 2.4746e7);

        private double masa = 0d;
        private double radio = 0d;
        private double G=6.67300E-11;
        private Planeta(double masa, double radio) {
            this.masa=masa;
            this.radio=radio;
        }

       
        public double getMasa() {
            return masa;
        }

       
        public double getRadio() {
            return radio;
        }

        
        public double getG() {
            return G;
        }
        
        //----------------------------Logicaaa---------------------------------------
      
        
        public double gravedadPlaneta(Planeta planeta){
            return getG() * planeta.getMasa() / Math.pow(planeta.getRadio(), 2);
        }
        
        public double gravedadPlaneta(){
		return getG() * getMasa() / Math.pow(getRadio(), 2);
	}
        
        public double calcularMasa(double peso){
            return peso / gravedadPlaneta(EARTH);
        }
        
        public double pesoSuperficie(double peso){
            
            return calcularMasa(peso) * gravedadPlaneta();
        }
        
        public static EnumSet<Planeta> getPlanetasTerrestres(){
            return EnumSet.range(MERCURY, MARS);
        }
        
        
        public static EnumSet<Planeta> getGigantesGaseosos(){
            return EnumSet.range(JUPITER, NEPTUNE);
        }
    }
    
}