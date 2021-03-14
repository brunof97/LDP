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
public class Navio {
    private String matricula;
    private String nome;
    private float comprimento;
    
    /**
     *
     * @param matricula
     */
    public Navio(String matricula){
        this.matricula = matricula;
    }

    /**
     *
     * @return
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     *
     * @return
     */
    public String getNome() {
        return nome;
    }

    /**
     *
     * @return
     */
    public float getComprimento() {
        return comprimento;
    }

    /**
     *
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     *
     * @param comprimento
     */
    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }
    
}
