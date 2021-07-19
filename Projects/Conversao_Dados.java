/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversao_dados;

/**
 *
 * @author maria
 */
import javax.swing.JOptionPane;

public class Conversao_Dados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 0, b = 0, c = 0, d = 0, r = 0;
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1° número: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2° número: "));
        c = Integer.parseInt(JOptionPane.showInputDialog("Digite o 3° número: "));
        d = Integer.parseInt(JOptionPane.showInputDialog("Digite o 4° número: "));
        r = (a*b) + (a*c) + (a*d);
        JOptionPane.showMessageDialog(null, "O resultado é: " + r);
    }
    
}
