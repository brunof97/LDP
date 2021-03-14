/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LDP;

import java.util.ArrayList;

/**
 *
 * @author bruno
 */
public class Porto {
        
    private  ArrayList<Navio> navio =new  ArrayList<Navio>();
    private int maxNavios=0;
    
    /**
     *
     * @param maxNavios
     */
    public Porto(int maxNavios){
        this.maxNavios=maxNavios;
    }
    
    /**
     *Adiciona um navio
     * @param n
     */
    public void  AddNavio (aep.Navio n){ 
        if (navio.size()<maxNavios){
            for(Navio n1: navio ){
            if(n.getMatricula()== n1.getMatricula()){
                System.out.println("Este navio ja existe");
            }else{
                navio.add(n1);
                
                
            }
        }
        }
           
    }
    
    /**
     *Devolve a qauntidade de contentores
     * @return
     */
    public int QuantidadeContentores(){
       int total=0;
       for(Navio n1:navio){
           if(n1 instanceof PortaContentores){
               total+=((PortaContentores) n1).getMaxContentores();
           }
       }
       
       return total;
    }
    
    /**
     *Devolve a acarga total dos navios
     * @return
     */
    public int CargaTotal(){
       int total=0;
       for(Navio n1:navio){
           if(n1 instanceof PortaContentores){
               total+=((PortaContentores) n1).getMaxContentores()*10;
           }
           if(n1 instanceof Petroleiro){
               total+=((Petroleiro) n1).getCapCarga();
           }
       }
       
       return total;
   }
    
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Porto p =new Porto(5);
        
        Navio n1=new Navio("1234");
        PortaContentores c1=new PortaContentores("2345");
        c1.setMaxContentores(3);
        Petroleiro p1=new Petroleiro("3456");
        p1.setCapCarga(500);
        
       p.AddNavio(n1);
       p.AddNavio(c1);
       p.AddNavio(p1);
        
       
        System.out.println("Existem"+p.QuantidadeContentores()+"contentores");
        System.out.println("Carga total="+p.CargaTotal()+"toneladas");
    }
}
