
package org.lasencinas.enzinium;

import java.security.PublicKey;


public class TokenContract {
    //Variables
    private String name =null;
    private String symbol=null;
    private double totalSupply=0d;
    private PublicKey PK=null;
    
    
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

    
    public double getTotalSupply() {
        return totalSupply;
    }

    
    public void setTotalSupply(double totalSupply) {
        this.totalSupply = totalSupply;
    }

    
    public PublicKey getPK() {
        return PK;
    }

    //Metodos 
    @Override
    public String toString(){
       return "\n" + "name = " + getName() + "\n" + 
                      "symbol = " + getSymbol() + "\n" +
                      "totalSupply = " + getTotalSupply() + "\n" + 
                      "owner PK = " + getPK().hashCode();
  }
 
    
}
