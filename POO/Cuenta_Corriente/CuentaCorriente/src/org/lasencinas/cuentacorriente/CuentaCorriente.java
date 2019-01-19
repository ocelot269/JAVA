
package org.lasencinas.cuentacorriente;


public class CuentaCorriente {
    private String nombre,apellidos,direccion,telefono;
    private boolean nif;
    private double saldo;

public  CuentaCorriente(String nombre,String apellidos,String direccion,String telefono, boolean nif){
    this.nombre=nombre;
    this.apellidos=apellidos;
    this.direccion=direccion;
    this.telefono=telefono;
    this.nif = nif;
    this.saldo=0;
}
public String getNombreCliente(){
    return this.nombre;
    }
public String getApellidosCliente(){
    return this.apellidos;
    
}
public String getDireccionCliente(){
    return this.direccion;
}
public String getTelefonoCliente(){
    return this.telefono;
    }
public boolean getNifCliente(){
    return this.nif;
}

}



