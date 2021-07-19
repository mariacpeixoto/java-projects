/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lernota;

/**
 *
 * @author maria
 */
import javax.swing.JOptionPane;

public class LerNota { // Classe Principal.

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        lerNota(); // execução do método lerNota.
    }
    static void lerNota(){ // criação do método.
        // declaração das variáveis(atributos)
        double nota1, nota2;
        String nome;
        // execução do import.
        nome = JOptionPane.showInputDialog("Digite o nome do aluno(a): ");
        nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 1° nota: "));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 2° nota: "));
        calcularMedia(nome, nota1, nota2); // entrando com as váriaveis no método calcularMedia.
    }
    private static void calcularMedia(String nome, double n1, double n2){ // criação do método que realizará as operações.
        double md = (n1 + n2) / 2;  // declaração das variáveis(atributos) e operações.
        if(md >= 7) // uso do if para definir um parâmetro.
            JOptionPane.showMessageDialog(null, "Aluno(a) "+nome+" foi aprovado(a) com a média: "+md);
        else  // uso do else para definir um parâmetro diferente do anterior.
            if(md < 7)
            JOptionPane.showMessageDialog(null, "Aluno(a) "+nome+" foi reprovado(a) com a média: "+md);
    }
}
