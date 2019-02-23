
package org.lasencinas.enzinium;

import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;

public class Address {
    //Variables
    private PublicKey PK=null;
    private PrivateKey SK=null;
    
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
    
    //metodos
      public void generateKeyPair(){
    KeyPair pair = GenSig.generateKeyPair();
    setSK(pair.getPrivate());
    setPK(pair.getPublic());
    }

    
}
