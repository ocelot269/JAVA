/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.lasencinas.refactorizar;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ozeh
 */
public class NumerosAleatoriosIT {
    
    public NumerosAleatoriosIT() {
    }

    
    @Test
    public void numeroAleatoriosListaTest() {
        NumerosAleatorios lista1 = new NumerosAleatorios ();
        lista1.numerosAleatoriosLista();
        lista1.sumarParesImparesLista();
        lista1.mostrarNumeroParesLista();
    }
    
//    @Test
//    public void sumarParesImparesListaTest() {
//        NumerosAleatorios lista1 = new NumerosAleatorios ();
//        lista1.numerosAleatoriosLista();
//        lista1.sumarParesImparesLista();
//        assertEquals(14, lista1);
    //}
}
