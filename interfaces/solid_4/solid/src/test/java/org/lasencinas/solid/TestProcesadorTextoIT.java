package org.lasencinas.solid;



import org.lasencinas.solid.Idioma;
import org.lasencinas.solid.ProcesadorTexto;
import static org.junit.Assert.*;

import org.junit.Test;


public class TestProcesadorTextoIT {

	@Test
	public void test_simple() {
		
		ProcesadorTexto procesador = new ProcesadorTexto();
		
		procesador.añadirPalabraNueva("No");
		procesador.añadirPalabraNueva("himporta");
		procesador.añadirPalabraNueva("la");
		procesador.añadirPalabraNueva("hortografia");
		
		assertEquals("No himporta la hortografia", procesador.verPalabras());
	}
	
	@Test
	public void test_con_idioma() {
		
		ProcesadorTexto procesador = new ProcesadorTexto();
		
		procesador.añadirPalabraNueva("Tengo");
		procesador.añadirPalabraNueva("hambre");
		
		assertEquals("Tengo hambre", procesador.verPalabras());
		
		assertTrue(procesador.correcto(Idioma.ES));
	}
}
