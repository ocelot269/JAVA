
package org.lasencinas.cotxox.conductores;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;


public class PoolConductores {
    private Set<Conductor> poolConductores=new HashSet<Conductor>();


    public PoolConductores(Set<Conductor> poolConductores ){
        this.poolConductores = poolConductores;
    }
    
    
    public Set<Conductor> getPoolConductores(){
        return this.poolConductores;
    }
    
    public Conductor asignarConductor(){
        Conductor conductor = new Conductor();
        boolean asignado =false;
        for (Conductor conductores : getPoolConductores()){
            if (conductor.getConductorLibre()){
                conductor.setConductorLibre(true);
                asignado=true;
            }
        }
        return conductor;
    }





}
