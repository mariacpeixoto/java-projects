/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salarioliquido;

/**
 *
 * @author maria
 */
import javax.swing.JOptionPane;

public class Salarioliquido {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double SB = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de seu salário: "));
        
        double a = SB + SB/10;
        double SL = a - (a*20/100);
        
         JOptionPane.showMessageDialog(null,"Seu salário líquido é: " + SL);
    }
    
}
