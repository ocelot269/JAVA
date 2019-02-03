//Este proyecto te permite conocer los resultados  de las tiradas de bolos
//y como tiene una logica algo compleja es un ejercicio muy interesante para hacer con TDD
package org.lasencinas.scorecard;


public class Tarjeta {
    
//-----------Inicialando variables---------------//
    
    
    private final int STRIKE = 10;
    private final int CERO = 0;
    private String pines="-123456789X";
    private String tarjeta =null ;
    private int puntuacionTotal = 0;
    private final int SPARE =10;
    
    
//------------Constructores------------------//
    
    
    public Tarjeta() {
    
    }
    
    
    public Tarjeta(String tarjeta){
        this.tarjeta = tarjeta;
    }
    
    
//----------Fin Constructores------------------//
    
    
//-----------Setters y getters------------//
   
    
    public String getTarjetaPuntuacion(){ //Encapsulacion de la tarjeta de puntuacion
        return this.tarjeta;
    }
    
    
    public int getStrike(){ //Encapsulamiento de la constante STRIKE
        return STRIKE;
    }
    public int getSpare(){ //Encapsulamiento de la constante SPARE
        return SPARE;
    }
    public int getCero(){ //Encapsulamiento de la constante CERO
        return CERO;
    }
    
    
//------------Fin Setters y getters-------------//  
    
//------------Metodos--------------------------//  
    
    
    public int computarStrike(char strike){
        if (strike == 'X'){                     //Esta funcion espera un character 'X' y te devuelve 10 sino 0      
           return STRIKE;   
        }
        else{
            return CERO;
        }    
    }
    
    
    public int computarSpare(String puntuacion){
        try {                                 //Esta funcion espera una barra en la posicion 1 si es asi devuelve 10 sino 0
        if (puntuacion.charAt(1) == ('/')){
            return SPARE;
        }
        else {
            return CERO;
        }
        }
        catch (StringIndexOutOfBoundsException e){      //Este catch te permite capturar la excepcion salir del rango
            return CERO;
        }
    }
    
    
    public int computarPins(char pin){           //Mira en piner el char y te da su index
        return this.pines.indexOf(pin);
    }
    
    
    public int computarTarjetaVeinteBolas(){        //Comprueba toda la tarjeta y va sumando las bolas
        int contadorbolas = 0;
        for (int bolas=0; bolas <getTarjetaPuntuacion().length(); bolas++)
            if ( contadorbolas < 19){
                if (getTarjetaPuntuacion().charAt(bolas)== '/'){ //Comprueba que es spare y suma 10,restando la anterior bola y luego suma la siguiente bola
                        puntuacionTotal+= getSpare()  - computarPins(getTarjetaPuntuacion().charAt(bolas - 1)) + computarPins(getTarjetaPuntuacion().charAt(bolas + 1)); 
                        contadorbolas+=2;
                    }
                else if (getTarjetaPuntuacion().charAt(bolas)== 'X'){ //comprueba que es strike 
                        if (getTarjetaPuntuacion().charAt(bolas + 2) == '/'){//Ahora comprueba que en las siguientes 2 bolas si hay un spare
                            puntuacionTotal+=getStrike() + getSpare() -computarPins(getTarjetaPuntuacion().charAt(bolas +1)); //te suma el strike + el spare y te resta la siguiente tirada 
                        }
                        else {
                            puntuacionTotal+= getStrike() + computarPins(getTarjetaPuntuacion().charAt(bolas +1)) + computarPins(getTarjetaPuntuacion().charAt(bolas + 2));//Sino hace un strike normal;

                        }
                        contadorbolas+=2;
                }
                else {
                    puntuacionTotal+= computarPins(getTarjetaPuntuacion().charAt(bolas));//Suma las tiradas normales
                    contadorbolas+=1;
                }
            }
            else {
                 if (getTarjetaPuntuacion().charAt(bolas)== '/'){
                     puntuacionTotal+= getSpare()  - computarPins(getTarjetaPuntuacion().charAt(bolas - 1));
                }
                else if (getTarjetaPuntuacion().charAt(bolas)== 'X'){
                    puntuacionTotal+= getStrike();
                }
                else {
                    puntuacionTotal+= computarPins(getTarjetaPuntuacion().charAt(bolas));
                }
            }
            return puntuacionTotal;
    }
    
    
    //--------------------Fin de los metodos-------------------------//
    
}
