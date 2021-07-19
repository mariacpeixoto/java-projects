/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diferencadedoisvalores;

/**
 *
 * @author maria
 */
import javax.swing.JOptionPane;

public class DiferencaDeDoisValores {
    public float num1;
    public float num2;
    public float resto;
    
    public float diferenca(float n1, float n2){
        if(n1 > n2){
            return n1 - n2;
        }
        else{
            return n2 - n1;
        }
    }
    public static void main(String[] args) {
        DiferencaDeDoisValores subtracao = new DiferencaDeDoisValores();
        
        subtracao.num1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe um número: "));
        subtracao.num2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe um segundo número: "));
        
        subtracao.resto = subtracao.diferenca(subtracao.num1, subtracao.num2);
        
        JOptionPane.showMessageDialog(null, "A diferença do maior para o menor é de "+subtracao.resto);
    }
}
