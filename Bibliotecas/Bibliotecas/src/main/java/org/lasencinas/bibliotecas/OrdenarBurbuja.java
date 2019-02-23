/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.lasencinas.bibliotecas;

/**
 *
 * @author ozeh
 */
public class OrdenarBurbuja {
    public static int[] main(String[] args) {
    int array[]={7,3,15,20};
    int tmp;

for ( int i = 0; i < array.length; i++) {
	for ( int j = 0; j < array.length - 1; j++) {

		if (array [ j ] > array [ j+1 ] ) {
			tmp = array [ j ];
			array [ j ] = array [ j+1 ];
			array [ j+1 ] = tmp;
			}
		}
	}
return array;
        

}
}


