package org.lasencinas.herencia;

public class Circulo extends FiguraGeometrica {

    private double radio = 0d;
    private String nombre = null;
    private final double PI = Math.PI;
    //Constructor

    public Circulo() {
        super();
    }

    //Sobrecarga
    public Circulo(double radio) {
        setRadio(radio);
    }

    //Sobrecarga
    public Circulo(String nombre, double radio) {
        super(nombre);
        setRadio(radio); 
    }

    //Getters and Setters
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    //Logica
    @Override
    public double area() {
        return PI * Math.pow(this.radio, 2);
    }
}
