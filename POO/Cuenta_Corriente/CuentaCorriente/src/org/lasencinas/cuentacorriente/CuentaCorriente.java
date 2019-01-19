
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

//Getters
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
public double getSaldoCliente(){
    return this.saldo;
}


//Fin Getters


//Inicio Setters
public void setNombreCliente(String nombre){
    this.nombre=nombre;
}
public void setApellidoCliente(String apellidos){
    this.apellidos=apellidos;
}
public void setDireccionCliente(String direccion){
    this.direccion=direccion;
}
public void setTelefonoCliente(String telefono){
    this.telefono=telefono;
}
public void setNifCliente(boolean nif){
    this.nif=nif;
}
public void setSaldoCliente(double saldo){
    this.saldo+=saldo;
}
//Fin Setters
public void retirarDinero(double dineroRetirado){ //El dinero se resta de la cuenta 
    setSaldoCliente(-dineroRetirado);   
}
public void ingresarSaldo(double dineroIngresado){ //El dinero se suma a tu cuenta
    setSaldoCliente(dineroIngresado);
}
public void consultarCuentaCorriente(){
    System.out.println("Hola " + getNombreCliente() + " " + getApellidosCliente() + " tu saldo es de " + getSaldoCliente() + " €.");
}
public boolean saldoNegativoCuenta(){//Te permite concer si el saldo de la cuenta será negativa devolviendo un boolean
    if (getSaldoCliente()>=0){
        return false;
    }
    else {
        return true;
    }
}
}



