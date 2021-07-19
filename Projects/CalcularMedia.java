/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcularmedia;

/**
 *
 * @author maria
 */
import javax.swing.JOptionPane;

public class CalcularMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double nota1, nota2;
        String nome;
        nome = JOptionPane.showInputDialog("Digite o nome do aluno(a): ");
        nota1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a 1° nota: "));
        nota2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a 2° nota: "));
        
        String lerNota = calcularMedia(nome, nota1, nota2);
        JOptionPane.showMessageDialog(null, lerNota);   
    }
    static String calcularMedia(String nome, double n1, double n2){
        double MA = (n1 + n2) / 2;
        if(MA >= 7)
            return "Aluno(a) "+nome+" foi aprovado(a) com a média: "+MA;
        else
            return "Aluno(a) "+nome+" foi reprovado(a) com a média: "+MA;
    }
    
}
