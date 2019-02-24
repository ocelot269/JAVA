
package org.lasencinas.enzinium;

import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;


public class TokenContract {
    //Variables
    private String name =null;
    private String symbol=null;
    private double totalSupply=0d;
    private PublicKey PK=null;
    private Map <PublicKey , Double> balances= new HashMap();
    
    
    
    //Constructor
    public TokenContract(){
        
    }
    
    
    //Sobrecargar el contructor
    public TokenContract(Address rick){
        PK=rick.getPK();
        
    }

    
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    
    public String symbol() {
        return symbol;
    }

    
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    
    public double totalSupply() {
        return totalSupply;
    }

    
    public void setTotalSupply(double totalSupply) {
        this.totalSupply = totalSupply;
    }

    
    public PublicKey getPK() {
        return PK;
    }
    
    
    
    public Map <PublicKey , Double> getBalances() {
        return balances;
    }

    
    public void setBalances(Map <PublicKey , Double> balances) {
        this.balances = balances;
    }

    //Metodos 
    @Override
    public String toString(){
       return "\n" + "name = " + getName() + "\n" + 
                      "symbol = " + symbol() + "\n" +
                      "totalSupply = " + totalSupply() + "\n" + 
                      "owner PK = " + getPK().hashCode();
  }
    public void addOwner(PublicKey PK, Double unidades){
        getBalances().putIfAbsent(PK, unidades);
    }

    public int numOwners(){         //Este metodo te dice el numero de propietarios hay en el mapa
        return getBalances().size();
    }
    
    public Double balanceOf(PublicKey pk){  //Este metodo te comprueba cuantas entradas tiene cada propietario, y en el caso de ser null , te las muestra como 0.0
        if (getBalances().get(pk)==null){
            return 0d;
        }
        else{
           return getBalances().get(pk);
        }
        
    }
    
    public void transfer(PublicKey pk,Double tokens) {
        try {
        require(balanceOf(getPK()) > tokens);
        getBalances().put(getPK(),balanceOf(getPK())- tokens);
        getBalances().put(pk,balanceOf(pk) + tokens);
        
        }
      catch (Exception e) {
        }
    }
    
    public void transfer(PublicKey sender,PublicKey recipient ,Double tokens) {
        try {
        require(balanceOf(getPK()) > tokens);
        getBalances().put(recipient,balanceOf(recipient) + tokens);
        getBalances().put(sender,balanceOf(sender) - tokens);
        
        }
      catch (Exception e) {
        }
    }
    
    public void owners(){
        
       //getBalances().forEach((propietario,tokens) -> 
       //      System.out.println("Propietario = " + propietario.hashCode() + " tiene " + tokens + " entradas."));
       for (Map.Entry<PublicKey, Double> propietario : getBalances().entrySet()) {
           if (propietario.getKey()!=getPK()){
             System.out.println("Propietario = " + propietario.getKey().hashCode() + " tiene " + propietario.getValue() + " entradas.");  
           }
           else {
               
           }
           
       } 
    }
    
    
    
    public void require(boolean condicion)throws  Exception{
       if (condicion){
           
       }
       else {
           Exception SinEntradas = new  Exception();
           throw SinEntradas;
       }
    }
}
