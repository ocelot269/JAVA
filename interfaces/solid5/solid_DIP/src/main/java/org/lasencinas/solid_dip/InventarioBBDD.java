package org.lasencinas.solid_dip;


public class InventarioBBDD implements Inventeable{


	// Metodo de consulta a la base de datos
	public int numeroProductos(String tienda, String producto) {
		return BBDD.stocs.get(tienda).get(producto);
	}
}
