/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetormeses;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class Vetor2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mes[] = {"JAN","FEV","MAR","ABR","MAI","JUN","JUL","AGO","SET","OUT","NOV","DEZ"};
        Integer tot[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o ano atual: ");
        int ano = teclado.nextInt();
        for(int i = 0; i<mes.length; i++){
            if(ano % 4 == 0){
            tot[1]=29;
        } 
            System.out.println(mes[i] + " tem " + tot[i] + " dias");   
    }
        
    }
    
}
