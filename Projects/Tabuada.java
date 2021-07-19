/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabuada;

/**
 *
 * @author maria
 */
import javax.swing.JOptionPane;

public class Tabuada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num =(Integer.parseInt(JOptionPane.showInputDialog("Digite um número: ")));
        for(int i = 0; i <= 10; i++){
            int mult = num * i;
            JOptionPane.showMessageDialog(null, num+" x "+i+" = "+mult);
        }
    }
}
