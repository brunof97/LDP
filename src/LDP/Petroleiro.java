/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LDP;

/**
 *
 * @author bruno
 */
public class Petroleiro extends Navio {
        private float capCarga;
    
    /**
     *
     * @param matricula
     */
    public Petroleiro(String matricula){
       super(matricula);
    }

    /**
     *
     * @return
     */
    public float getCapCarga() {
        return capCarga;
    }

    /**
     *
     * @param capCarga
     */
    public void setCapCarga(float capCarga) {
        this.capCarga = capCarga;
    }
    
}
