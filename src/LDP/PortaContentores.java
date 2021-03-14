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
public class PortaContentores extends Navio {
     private int maxContentores;
    
    /**
     *
     * @param matricula
     */
    public PortaContentores(String matricula){
        super(matricula);
    }

    /**
     *
     * @return
     */
    public int getMaxContentores() {
        return maxContentores;
    }

    /**
     *
     * @param maxContentores
     */
    public void setMaxContentores(int maxContentores) {
        this.maxContentores = maxContentores;
    }
    
    
}
