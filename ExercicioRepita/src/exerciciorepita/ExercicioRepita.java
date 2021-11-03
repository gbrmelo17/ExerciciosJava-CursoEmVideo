/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;
import javax.swing.JOptionPane;
/**
 *
 * @author Gabriel
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n,totvalores = -1,totpares = -1,totimpar = 0,acima = 0, soma = 0;
        int media;
        do{
            
          n = Integer.parseInt(JOptionPane.showInputDialog(null, 
                  "<html>Informe um numero: <br><em>(valor 0 interrompe)</em><html>"));
          totvalores++;
          if(n%2 == 0){
              totpares++;
          } else {
              totimpar++;
          }
          if(n>100){
              acima++;
          }
          soma += n;
        } while (n !=0);
        media = (soma/totvalores);
        JOptionPane.showMessageDialog(null, "<html>Resultado Final <hr>"+
                "<br>Total de Valores: " + totvalores + 
                "<br>Total de Pares: " + totpares + 
                "<br>Total de Impares: " + totimpar +
                "<br>Acima de 100: " + acima +
                "<br>Media dos Valores: " + media +"</html>");
     }
        
    
}
