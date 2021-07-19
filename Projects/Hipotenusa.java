/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hipotenusa;

/**
 *
 * @author maria
 */
import static java.lang.Math.sqrt;
import javax.swing.JOptionPane;

public class Hipotenusa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double base, alt;
        base = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor da base do triângulo: "));
        alt = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor da altura do triângulo: "));
        
        String texto = hipotenusa(base, alt);
        JOptionPane.showMessageDialog(null, texto);
    }
    static String hipotenusa(double b, double a){
        double h = sqrt((b*b) + (a*a));
        return "O valor da hipotenusa é: "+h;
    }
}
