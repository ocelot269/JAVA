
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

    
    public String getSymbol() {
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
                      "symbol = " + getSymbol() + "\n" +
                      "totalSupply = " + totalSupply() + "\n" + 
                      "owner PK = " + getPK().hashCode();
  }
    public void addOwner(PublicKey PK, Double unidades){
        getBalances().putIfAbsent(PK, unidades);
    }

    
 
    
}
