/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maiornumero;

/**
 *
 * @author maria
 */
import java.util.Scanner;

public class MaiorNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
            int num1 = entrada.nextInt();
            System.out.println("Digite um segundo número diferente do anterior: ");
            int num2 = entrada.nextInt();
            
            if(num1 < num2){
                    System.out.println("o número "+num2+" é maior.");
            }
            else{
                    System.out.println("o número "+num1+" é maior");
                }
                }
}

