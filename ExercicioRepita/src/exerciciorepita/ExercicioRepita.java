/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author cyber
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //JOptionPane.showMessageDialog(null, "Ola Mundo", "Boas Vindas", JOptionPane.INFORMATION_MESSAGE);
        int n, s = 0;
        int par = 0;
        int impar = 0;
        int acima100 = 0;
        int cont = 0;
        double media = 0;
        do {            
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um numero: <br><em>(VALOR 0 INTERROMPE)</em></html>"));
            
            s += n;
            
            if (n == 0) {
                cont -= 1;
                break;
            }
            
            if (n % 2 == 0) {
                par ++;
            } else {
                impar ++;
            }
            
            if (n > 100) {
                acima100 ++;
            }
            
            if (n != 0) {
                cont++;
            }

        } while (n!=0);
        
        media = s / cont;

        JOptionPane.showMessageDialog(null, "<html>RESULTADO<hr>" 
                + "Soma dos valores: "+ s + "<br>"
                + "Total dos valores: "+ cont + "<br>"  
                + "Total de números pares: " + par + "<br>" 
                + "Total de números Impares: " + impar + "<br>" 
                + "Números acima de 100: " + acima100 + "<br>" 
                + "Média dos valores: " + media + "</html>");
        
    }
    
}
