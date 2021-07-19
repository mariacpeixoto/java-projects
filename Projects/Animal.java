/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_exercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author maria
 */
public class Animal {
    protected String nome;
    protected float comprimento;
    protected int num_patas;
    protected String cor;
    protected String ambiente;
    protected float vel_media;
    
    public Animal(){
        this("", 0, 0, "", "", 0);
    }
    public Animal(String nome, float comprimento, int num_patas, String cor, String ambiente, float vel_media){
        this.nome = nome;
        this.comprimento = comprimento;
        this.num_patas = num_patas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.vel_media = vel_media;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getComprimento() {
        return comprimento;
    }
    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }
    public int getNum_patas() {
        return num_patas;
    }
    public void setNum_patas(int num_patas) {
        this.num_patas = num_patas;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getAmbiente() {
        return ambiente;
    }
    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }
    public float getVel_media() {
        return vel_media;
    }
    public void setVel_media(float vel_media) {
        this.vel_media = vel_media;
    }
    public void dadosAnimal(){
        JOptionPane.showMessageDialog(null, "Dados do Animal \nNome: "+this.nome+ "\nComprimento: "+this.comprimento+ "\nNúmero de patas: "+this.num_patas+ "\nCor: "+this.cor+ "\nAmbiente: "+this.ambiente+ "\nVelocidade média: "+this.vel_media+" m/s");
}
}