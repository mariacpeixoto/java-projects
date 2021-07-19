/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcular;

/**
 *
 * @author maria
 */
import static java.lang.Math.sqrt;
import java.util.Scanner;

public class Calcular {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        short operacao;
        double num1, num2;    
        Scanner input = new Scanner(System.in);
        
        do {
             System.out.println("  1. Soma - 2.Subtração - 3.Divisão - 4.Multiplicação - 5.Resto da Divisão - 6.Dobro - 7.Quadrado - 8.Cubo - 9.Raiz Quadrada - 0.Sair");
             System.out.println("Digite o número da operação desejada:");
             operacao = input.nextShort();
             
             if (operacao == 0) {
            	 System.out.println("Até a próxima!");
            	 break;
             }
             
             if (!OperacaoExiste(operacao)) {
            	 continue;
             }
             
             System.out.print("Informe um número: ");
             num1 = input.nextDouble();
             
             System.out.print("Informe um segundo número: ");
             num2 = input.nextDouble();
             
             System.out.println("O resultado da operação "+getNomeOperacao(operacao)+" é "+Calculando(operacao, num1, num2)+"\n");
        } while (operacao != 0);
    }
    
    static double Calculando (short operacao, double num1, double num2) {
    	double resultado = 0;
    	switch (operacao) {
    		case 1:
    			resultado = num1 + num2;
    			break;
    		case 2:
    			resultado = num1 - num2;
    			break;
    		case 3:
    			resultado = num1 / num2;
    			break;
    		case 4:
    			resultado = num1 * num2;
    			break;
                case 5:
    			resultado = num1 % num2;
    			break;
                case 6:
    			resultado = (num1 + num2) * 2;
    			break;
                case 7:
    			resultado = (num1 + num2) * (num1 + num2);
    			break;
                case 8:
    			resultado = (num1 + num2) * (num1 + num2) * (num1 + num2);
    			break;
                case 9:
    			resultado = sqrt (num1 + num2);
    			break;
    	}
    	return resultado;
    }
    
    static boolean OperacaoExiste (short operacao) {
       	boolean retorno = true;
    	if (operacao > 9) {
       		System.out.println("A operação escolhida é inválida!\n");
       		retorno = false;
       	}
    	return retorno;
    }
    
    static String getNomeOperacao(short operacao) {
    	
    	switch (operacao) {
		case 1:
			return "Soma";
		case 2:
			return "Subtração";
		case 3: 
			return "Divisão";
		case 4: 
			return "Multiplicação";
                case 5:
			return "Resto da Divisão";
                case 6:
			return "Dobro";
                case 7:
			return "Quadrado";
                case 8:
			return "Cubo";
                case 9:
			return "Raiz Quadrada";
    	default:
    		return "Indefinido";
    	}
    	
    }
} 
