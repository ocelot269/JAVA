/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.lasencinas.bicipalma;

import java.util.Arrays;
import java.util.List;


public class Bicicleta {
    
   
    
    
    
    
    public static void main(String[] args) {
         String [] bicicletas = { "001","002","003","004"};
//    bicicleta [2] ="baz";
         List<String> lista = Arrays.asList(bicicletas);
  
        System.out.println(bicicletas.length);
    
    
   
        for (String bicis : bicicletas){
            System.out.println(bicis);
        }
        
        for ( int i = bicicletas.length -1; i >= 0; i--0){
        System.out.println(bicicletas[i]);
        }
        
    }
    
   
}

