
package org.lasencinas.refactorizar;
//Escribe un programa que almacene en un Array de cinco elementos las ventas anuales de cada una de las cinco tiendas de una cadena de supermercados (asígnaselos al Array al declararlo). 
//A continuación calcular cuál fue la tienda que menos vendió, cuál fue la que más vendió y el importe total de ventas de las cinco tiendas.


public class CadenaSupermercado {
    
    //---------------------Inicializando Variables-----------------------------------//
    
    public static void main(String[] args) {
        
    }
        double[] gananciaSuperMercado = {8000, 320.35, 930, 1020.99, 650};
        double mayorGanancia = gananciaSuperMercado[0];
        double menorGanancia = gananciaSuperMercado[0];
        double totalGananciasSuperMercados = 0;
        int gananciaMayor = 0;
        int gananciaMenor = 0;
      
        
    //------------------------Fin inicializacion-----------------------------------//    
       
        
        
    //-------------------------Inicializando Constructor----------------------------//
        public CadenaSupermercado(){
       
       }
      
        
    //----------------------------Fin constructor--------------------------------------//
      
        
    //----------------------------Getters y Setters-----------------------------------//
        
        
        public double [] getGananciaSuperMercado(){
           return gananciaSuperMercado;  
       }
       
        
       public double getTotalGananciasSuperMercados () {
           return totalGananciasSuperMercados;
       }
       
       
       public int getPosicionTiendaMenosVende () {
           return gananciaMenor;
       }
       
       
       public int getPosicionTiendaMasVende () {
           return gananciaMayor;
       }
       
       public double getMenorGananciaTienda () {
          return menorGanancia; 
       }
       
       public double getMayorGananciaTienda () {
           return mayorGanancia;
       }
       
       public void setMayorGanancia (double supermercado){
           mayorGanancia+=supermercado;
       }
       
       
       public void setMenorGanancia (double supermercado){
           menorGanancia+=supermercado;
       }
       
       
       public void setTotalGananciasSuperMercados(double supermercado){
           totalGananciasSuperMercados+=supermercado;
       }
       
       
       public void setPosicionTiendaMasVende (int ganancia){
           gananciaMayor=  ganancia;
       }
       
       
       public void setPosicionTiendaMenosVende (int ganancia){
           gananciaMenor=  ganancia;
       }
    
       
    //--------------------Fin de getters y setters------------------------------//   
       
    
    //--------------------Inicio de metodos de la logica-----------------------------//
       
       public void calcularGananaciasSuperMercado(){ //Te dice el total de ganancias de todos los supermercados
        for (int tienda = 0; tienda < getGananciaSuperMercado().length; tienda++) {
            
            if (gananciaSuperMercado[tienda] > mayorGanancia) {                 //asigna la mayor ganancia a posicionMayor
                setMayorGanancia(gananciaSuperMercado[tienda]);
                setPosicionTiendaMasVende(tienda);                         
            }
            else {
                setMenorGanancia(gananciaSuperMercado[tienda]);
                setMenorGanancia(tienda);
            }
            setTotalGananciasSuperMercados(gananciaSuperMercado[tienda]);
        }
       }
       
    //-------------------Fin metodos logica---------------------------------//   
        
    
    //-------------------Inicio metodos de visualizacion--------------------//
       
       
       public void MostrarTiendaMenosVende () { //Muestra la tienda que menos vende
            System.out.println("La tienda que menos ha vendido fue la " + (getPosicionTiendaMenosVende() + 1)
            + ", que vendió " + getMenorGananciaTienda() + " €");
        }
        
        
        public void MostrarTiendaMasVende () { //Muestra la tienda que mas vende
           System.out.println("La tienda que mas ha vendido fue la " + 
           (getPosicionTiendaMasVende() + 1) + ", que  vendió " + getMayorGananciaTienda() + " €"); 
        }
      
        
        public void MostrarTotalVentas () { //Muestra el total de ventas de todas las tiendas
           System.out.println("El total de las ventas es: " + getTotalGananciasSuperMercados() + " €");
        }

 //-------------------Fin metodos de visualizacion--------------------//        
    
}