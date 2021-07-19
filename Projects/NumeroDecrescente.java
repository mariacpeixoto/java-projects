/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerodecrescente;

/**
 *
 * @author maria
 */
import java.util.Scanner;

public class NumeroDecrescente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite um número maior que 0: ");
            int num1 = entrada.nextInt();
            int i;
            
            if(num1 > 0){
            for(i = num1; i >= 0; i--){
                    System.out.println(i);
            }
    }
    }
}
