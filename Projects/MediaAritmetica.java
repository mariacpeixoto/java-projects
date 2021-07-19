/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediaaritmetica;

/**
 *
 * @author maria
 */
import javax.swing.JOptionPane;

public class MediaAritmetica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String nome = (JOptionPane.showInputDialog("Digite seu nome: "));
        String discip = (JOptionPane.showInputDialog("Digite a disciplina escolar: "));
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite a primeira nota: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite a segunda nota: "));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Digite a terceira nota: "));
        int d = Integer.parseInt(JOptionPane.showInputDialog("Digite a quarta nota: "));
        
        double media = (a + b + c + d)/4;
        
        JOptionPane.showMessageDialog(null,"O aluno(a) "+nome+ " obteve a média aritmética "+media+ " na disciplina de "+discip);
    }
    
}
