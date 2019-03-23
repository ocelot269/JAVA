package org.lasencinas.solid;



import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProcesadorTexto implements TextUpdatable,AutoCorrectable{


	private List<String> texto = new ArrayList<>();
	
        
	public void añadirPalabraNueva (String palabra) {
		texto.add(palabra);
	}
        
	
	public String verPalabras () {
		return texto.stream().collect(Collectors.joining(" "));
	}
	
        
	public boolean correcto (Idioma idioma) {
		for (String palabra: texto) {
			if (! idioma.diccionario.contains(palabra.toLowerCase())) {
				return false;
			}
		}
		return true;
	}
}
