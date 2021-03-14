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
        
    private  ArrayList<aep.Navio> navio =new  ArrayList<aep.Navio>();
    private int maxNavios=0;
    
    
    public Porto(int maxNavios){
        this.maxNavios=maxNavios;
    }
    
    public void  AddNavio (aep.Navio n){ 
        if (navio.size()<maxNavios){
            for(aep.Navio n1: navio ){
            if(n.getMatricula()== n1.getMatricula()){
                System.out.println("Este navio ja existe");
            }else{
                navio.add(n1);
                
                
            }
        }
        }
           
    }
    
    
    public int QuantidadeContentores(){
       int total=0;
       for(aep.Navio n1:navio){
           if(n1 instanceof aep.PortaContentores){
               total+=((aep.PortaContentores) n1).getMaxContentores();
           }
       }
       
       return total;
    }
    
    
    
    
   public int CargaTotal(){
       int total=0;
       for(aep.Navio n1:navio){
           if(n1 instanceof aep.PortaContentores){
               total+=((aep.PortaContentores) n1).getMaxContentores()*10;
           }
           if(n1 instanceof aep.Petroleiro){
               total+=((aep.Petroleiro) n1).getCapCarga();
           }
       }
       
       return total;
   }
    
    public static void main(String[] args) {
        aep.Porto p =new aep.Porto(5);
        
        aep.Navio n1=new aep.Navio("1234");
        aep.PortaContentores c1=new aep.PortaContentores("2345");
        c1.setMaxContentores(3);
        aep.Petroleiro p1=new aep.Petroleiro("3456");
        p1.setCapCarga(500);
        
       p.AddNavio(n1);
       p.AddNavio(c1);
       p.AddNavio(p1);
        
       
        System.out.println("Existem"+p.QuantidadeContentores()+"contentores");
        System.out.println("Carga total="+p.CargaTotal()+"toneladas");
    }
}
