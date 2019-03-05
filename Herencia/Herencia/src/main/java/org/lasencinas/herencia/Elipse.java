package org.lasencinas.herencia;

public class Elipse extends FiguraGeometrica {

    //Variables
    private double semiEjeMayor = 0d;
    private double semiEjemenor = 0d;
    private final double PI = Math.PI;

    //Constructor
    public Elipse() {
        super();
    }
    
    
    //SobreCarga
    
    public Elipse(double semiEjeMayor, double semiejeMenor){
       setSemiEjeMayor(semiEjeMayor);
        setSemiEjemenor(semiejeMenor); 
    }
    
    
    
    
    //Sobrecarga
    public Elipse(String nombre, double semiEjeMayor, double semiejeMenor) {
        super(nombre);
        setSemiEjeMayor(semiEjeMayor);
        setSemiEjemenor(semiejeMenor);
    }

    //Getters y setters
    public double getSemiEjeMayor() {
        return semiEjeMayor;
    }

    public void setSemiEjeMayor(double semiEjeMayor) {
        this.semiEjeMayor = semiEjeMayor;
    }

    public double getSemiEjemenor() {
        return semiEjemenor;
    }

    public void setSemiEjemenor(double semiEjemenor) {
        this.semiEjemenor = semiEjemenor;
    }

    //logica
    @Override
    public double area() {
        return PI * getSemiEjeMayor() * getSemiEjemenor();
    }

}
