
package org.lasencinas.enzinium;

import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;

public class Address {
    //Variables
    private PublicKey PK=null;
    private PrivateKey SK=null;
    private double balance = 0d;
    private String symbol ="EZI";
    
    //Constructor
    
    
    public Address() {}
    
    
    //Gettes y setters
    
    
    public PublicKey getPK() {
        return PK;
    }

    
    public void setPK(PublicKey PK) {
        this.PK = PK;
    }

    
    public PrivateKey getSK() {
        return SK;
    }

    
    public void setSK(PrivateKey SK) {
        this.SK = SK;
    }
    
    
    
    public double getBalance() {
        return balance;
    }

    
    public void setBalance(double balance) {
        this.balance = balance;
    }

   
    public String getSymbol() {
        return symbol;
    }    
    
    
    //metodos
      public void generateKeyPair(){
    KeyPair pair = GenSig.generateKeyPair();
    setSK(pair.getPrivate());
    setPK(pair.getPublic());
    }

    @Override
    public String toString() {
        return "\n" + "PK = " + getPK().hashCode() + "\n" + "Balance = " + getBalance() + " " + getSymbol(); 
    }

   

    public void addEZI (double enziniums){
        balance+=enziniums;
    }
   
    public void transferEZI(PrivateKey receptor, double enziniums){
        
        
    }
}
