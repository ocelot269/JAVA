
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

//-----------------------Inicio Constructor----------------------------------//     
    
     
     public NumerosAleatorios() {

    }

//------------------------Fin Constructor-----------------------------------//

     
//-------------------Inicializando el variables------------------------------//


    private int[] listaNumerosAleatorio = new int[25];
    private Random aleatorio = new Random();
    private double[] auxiliar = new double[4];
    private int sumaImpares = 0;
    private int min = 0;
        
        
//--------------------Fin Inicializando variables-------------------------------//

        
//------------------------Inicio Getters y Setters------------------------------//

    
    //----------------------------Getters----------------------------------//
    
    
    public int[] getListaNumAleatorios() {
         return this.listaNumerosAleatorio;
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
    
    
    public void setAñadirLista(int posicion, int dato){
        listaNumerosAleatorio[posicion]= dato;
    }
        
    
    //----------------------------Final Setters------------------------------//
    
    
    
//------------------------Fin Getters y Setters---------------------------------//
        
        
//------------------------Inicio Metodos Logica---------------------------------//
        
        
        public void numerosAleatoriosLista () {
            for (int i = 0; i < listaNumerosAleatorio.length; i++) { //Creando la lista con numeros del 25 al 50,al azar
                setAñadirLista(i, aleatorio.nextInt(26) + 25);
            }
        }

        
        public void sumarParesImparesLista() {
            for (int i = 0; i < listaNumerosAleatorio.length; i++) {
                if (listaNumerosAleatorio[i] % 2 == 0) {
                    auxiliar[0]++;
                } else {
                    auxiliar[1]++;
                    sumaImpares+=i;
                }
            }
        }
        
        
        public void numeroMinimoLista() {
            for (int i= 0; i < listaNumerosAleatorio.length; i++) {
                if (i == 0) {
                    min = listaNumerosAleatorio[i];
                } 
                else if (listaNumerosAleatorio[i] < min) {
                    min = listaNumerosAleatorio[i];
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
            for (int i = 0; i < listaNumerosAleatorio.length; i++) {
                System.out.println("Posicion " + i + " de la lista =" + listaNumerosAleatorio[i]);
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




