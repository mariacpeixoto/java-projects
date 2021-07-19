/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lampada;

/**
 *
 * @author maria
 */
public class Lampada {
    private boolean estado;
    public void mostrarEstado(){
        this.estado = false;
    }
    public void setEstado(boolean estado){
        this.estado = estado;
    }
    public boolean getEstado(){
        return this.estado;
    }
     public static void main(String[] args) {
         Lampada lampada = new Lampada();
         
         lampada.setEstado(true);
         System.out.println("A lâmpada está ligada.");
         
         lampada.setEstado(false);
         System.out.println("A lâmpada está desligada.");
    }
}
