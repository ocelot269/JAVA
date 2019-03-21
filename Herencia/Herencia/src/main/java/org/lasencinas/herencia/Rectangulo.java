package org.lasencinas.herencia;

public class Rectangulo extends FiguraGeometrica implements Drawable{

    //Variables
    private double altura = 0d;
    private double anchura = 0d;
    private String nombre = null;

    //Constructor
    public Rectangulo() {
        super();
    }

    //Sobrecarga
    public Rectangulo(double altura, double anchura) {
        setAltura(altura);
        setAnchura(anchura);

    }

    //Sobrecarga
    public Rectangulo(String nombre, double altura, double anchura) {
        super(nombre);
        setAltura(altura);
        setAnchura(anchura);
    }

    //Getters y Setters
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAnchura() {
        return anchura;
    }

    public void setAnchura(double anchura) {
        this.anchura = anchura;
    }

    //Logica
    @Override
    public double area() {
        return getAltura() * getAnchura();
    }
    
    public void draw (){
        System.out.println("Soy un " + getNombre());
    }
}
