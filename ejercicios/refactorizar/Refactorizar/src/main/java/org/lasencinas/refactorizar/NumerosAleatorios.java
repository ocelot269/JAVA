
//Declara un Array de nombre lista que estará formado por 25 datos de tipo entero generados al azar comprendidos entre 25 y 50.
//Declara otro vector de nombre auxiliar formado por 4 datos de tipo real. Almacenar en este Array lo siguiente: 
//Posición 0: número Total de números pares en lista. 
//Posición 1: número Total de números impares de lista. 
//Posición 2: media de los números impares de lista. 
//Posición 3: suma de los números enteros comprendidos entre 1 y el valor par más pequeño de lista. 
//Escribe a continuación el contenido de lista, así como los resultados obtenidos y almacenados en auxiliar.

package org.lasencinas.refactorizar;

import java.util.Random;


public class NumerosAleatorios {
    
    
     public static void main(String[] args) {
         
     }    
//-------------------Inicializando el variables---------------------------//


    private int[] lista = new int[25];
    private Random aleatorio = new Random();
    private double[] auxiliar = new double[4];
    private int sumaImpares = 0;
    private int min = 0;
        
        
//--------------------Fin Inicializando variables-------------------------------//

        
//------------------------Inicio Getters y Setters------------------------------//

    
    //----------------------------Getters----------------------------------//
    
    
    public int[] getListaNumAleatorios() {
         return this.lista;
    }
    
    
    public Random getRandom() {
        return this.aleatorio;
    }
    
    
    public double[] getAuxiliar() {
        return this.auxiliar;
    }
    
    
    public int getSumaImpares() {
        return this.sumaImpares;
    }
    
    
    public int getMin(){
        return this.min;
    }
    
    
    //------------------------Final Getters------------------------------//
    
    
    //----------------------------Setters-----------------------------------//
    
    
    
    //----------------------------Final Setters------------------------------//
    
    
    
//------------------------Fin Getters y Setters---------------------------------//
        
        
//------------------------Inicio Metodos Logica---------------------------------//
        
        
        public void numerosAleatoriosLista () {
            for (int i = 0; i < lista.length; i++) { //Creando la lista con numeros del 25 al 50,al azar
                lista[i] = aleatorio.nextInt(26) + 25;
            }
        }

        
        public void sumarParesImparesLista() {
            for (int i = 0; i < lista.length; i++) {
                if (lista[i] % 2 == 0) {
                    auxiliar[0]++;
                } else {
                    auxiliar[1]++;
                    sumaImpares+=i;
                }
            }
        }
        
        
        public void numeroMinimoLista() {
            for (int i= 0; i < lista.length; i++) {
                if (i == 0) {
                    min = lista[i];
                } 
                else if (lista[i] < min) {
                    min = lista[i];
                }
            }
        } 
        
        
        public void ObtenerrMediaImpares () {
            auxiliar[2] = sumaImpares / auxiliar[1];
        }
        
        
        public void Sumar1EntreParMasPequeño () {
            for (int i = 1; i <= min; i++) {
                auxiliar[3] += i;
            }
        }

        
        
    
        
    //--------------------Fin Metodos Logica----------------------------------//
        
        
    //--------------------Inicio Metodos Visualizacion-----------------------//
        
        
       public void MostrarElementosLista () {
            for (int i = 0; i < lista.length; i++) {
                System.out.println("Posicion " + i + " de la lista =" + lista[i]);
            }
       }
       
       
       public void mostrarNumeroParesLista() { 
           System.out.println("Numero de elementos pares: " + auxiliar[0]);
       }
       
       
       public void mostrarNumerosImparesLista() {      
          System.out.println("Numero de elementos impares: " + auxiliar[1]);
       }
       
       
       public void mostrarMediaImpares () {
           System.out.println("Media impares: " + auxiliar[2]);
       }
       
       
       public void mostrarSumaEntre1ParMasPequeño (){
           System.out.println("Suma de los enteros comprendidos entre 1 y el minimo de la lista: " + auxiliar[3]);
       }  
       
    //------------------------Fin Metodos Visualizacion------------------------//
    }




