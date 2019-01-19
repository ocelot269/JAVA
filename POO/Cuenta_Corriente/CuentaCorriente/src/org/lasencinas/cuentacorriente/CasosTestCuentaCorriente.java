
package org.lasencinas.cuentacorriente;

public class CasosTestCuentaCorriente {
    public static void main(String[] args) {
    CuentaCorriente cuentaCorrienteMarcosEmbargadaBanco = new CuentaCorriente("Marcos", "Monjon","Calvia", "66666666666",true);
    
    //Todo getters de prueba 
        System.out.println(cuentaCorrienteMarcosEmbargadaBanco.getNombreCliente());
        System.out.println(cuentaCorrienteMarcosEmbargadaBanco.getApellidosCliente());
        System.out.println(cuentaCorrienteMarcosEmbargadaBanco.getDireccionCliente());
        System.out.println(cuentaCorrienteMarcosEmbargadaBanco.getTelefonoCliente());
        System.out.println(cuentaCorrienteMarcosEmbargadaBanco.getNifCliente());
        System.out.println(cuentaCorrienteMarcosEmbargadaBanco.getSaldoCliente());
    //Todo setters de prueba
    
        //Set ApellidosCliente
        cuentaCorrienteMarcosEmbargadaBanco.setApellidoCliente("Monjon");
        if (cuentaCorrienteMarcosEmbargadaBanco.getApellidosCliente()=="Monjon"){
            System.out.println("Es correcto");
        }
        else {
            System.out.println("No es correcto");
        }
        
         cuentaCorrienteMarcosEmbargadaBanco.setApellidoCliente("loco");
        if (cuentaCorrienteMarcosEmbargadaBanco.getApellidosCliente()=="Zamora"){
            System.out.println("Es correcto");
        }
        else {
            System.out.println("No es correcto");
        }
        
        //Set NombreCliente
         cuentaCorrienteMarcosEmbargadaBanco.setNombreCliente("Adrian");
        if (cuentaCorrienteMarcosEmbargadaBanco.getNombreCliente()=="Adrian"){
            System.out.println("Es correcto");
        }
        else {
            System.out.println("No es correcto");
        }
        
         cuentaCorrienteMarcosEmbargadaBanco.setNombreCliente("Luis");
        if (cuentaCorrienteMarcosEmbargadaBanco.getApellidosCliente()=="Jose"){
            System.out.println("Es correcto");
        }
        else {
            System.out.println("No es correcto");
        }
        //Set Direccion
         cuentaCorrienteMarcosEmbargadaBanco.setDireccionCliente("Calle falsa");
        if (cuentaCorrienteMarcosEmbargadaBanco.getDireccionCliente()=="Calle falsa"){
            System.out.println("Es correcto");
        }
        else {
            System.out.println("No es correcto");
        }
        
         cuentaCorrienteMarcosEmbargadaBanco.setDireccionCliente("Calle falsa");
        if (cuentaCorrienteMarcosEmbargadaBanco.getDireccionCliente()=="calle verdadera"){
            System.out.println("Es correcto");
        }
        else {
            System.out.println("No es correcto");
        }
        
        //Set Telefono
        
         cuentaCorrienteMarcosEmbargadaBanco.setTelefonoCliente("666666666");
        if (cuentaCorrienteMarcosEmbargadaBanco.getTelefonoCliente()=="666666666"){
            System.out.println("Es correcto");
        }
        else {
            System.out.println("No es correcto");
        }
        
         cuentaCorrienteMarcosEmbargadaBanco.setTelefonoCliente("666666666");
        if (cuentaCorrienteMarcosEmbargadaBanco.getTelefonoCliente()=="666666667"){
            System.out.println("Es correcto");
        }
        else {
            System.out.println("No es correcto");
        }
  
        //Set nif
         cuentaCorrienteMarcosEmbargadaBanco.setNifCliente(true);
        if (cuentaCorrienteMarcosEmbargadaBanco.getNifCliente()==true){
            System.out.println("Es correcto");
        }
        else {
            System.out.println("No es correcto");
        }
        
         cuentaCorrienteMarcosEmbargadaBanco.setNifCliente(false);
        if (cuentaCorrienteMarcosEmbargadaBanco.getNifCliente()==true){
            System.out.println("Es correcto");
        }
        else {
            System.out.println("No es correcto");
        }
        
        //Set Saldo
         cuentaCorrienteMarcosEmbargadaBanco.setSaldoCliente(100.00);
        if (cuentaCorrienteMarcosEmbargadaBanco.getSaldoCliente()==100.00){
            System.out.println("Es correcto");
        }
        else {
            System.out.println("No es correcto");
        }
        
         cuentaCorrienteMarcosEmbargadaBanco.setSaldoCliente(-100); //Esto le suma -100 a los 100 de antes a si que el resultado seria 0
        if (cuentaCorrienteMarcosEmbargadaBanco.getSaldoCliente()==1){
            System.out.println("Es correcto");
        }
        else {
            System.out.println("No es correcto");
        }
        
        
        
        
        //Retirar dinero
        cuentaCorrienteMarcosEmbargadaBanco.retirarDinero(100);
        if ( cuentaCorrienteMarcosEmbargadaBanco.getSaldoCliente() == -100){
            System.out.println("Es correcto");
        }
        else {
            System.out.println("Es incorrecto");
        }
        
        cuentaCorrienteMarcosEmbargadaBanco.retirarDinero(1000);
        if ( cuentaCorrienteMarcosEmbargadaBanco.getSaldoCliente() == -1100){
            System.out.println("Es correcto");
        }
        else {
            System.out.println("Es incorrecto");
        }
        //Ingresar Saldo
        cuentaCorrienteMarcosEmbargadaBanco.ingresarSaldo(1100);
        if ( cuentaCorrienteMarcosEmbargadaBanco.getSaldoCliente() == 0){
            System.out.println("Es correcto");
        }
        else {
            System.out.println("Incorrecto");
        }
        
         cuentaCorrienteMarcosEmbargadaBanco.ingresarSaldo(1100);
        if ( cuentaCorrienteMarcosEmbargadaBanco.getSaldoCliente() == 100){
            System.out.println("Es correcto");
        }
        else {
            System.out.println("Incorrecto");
        }
        //ConsultarSaldoCuenta
        
        cuentaCorrienteMarcosEmbargadaBanco.consultarCuentaCorriente();
    }
}
