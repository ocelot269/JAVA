package org.lasencinas.herencia;

public class Cuadrado extends FiguraGeometrica implements Drawable{

    //Variables
    private double lado = 0d;

    //Constructor
    public Cuadrado() {
        super();
    }

    //SobreCarga
    public Cuadrado(double lado) {

    }

    public Cuadrado(String nombre, double lado) {
        super(nombre);
        setLado(lado);

    }

    //Getters y setters

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    //logica
    @Override
    public double area() {
        return Math.pow(getLado(),2);
    }
    
    public void draw (){
        System.out.println("Soy un " + getNombre());
    }
}
