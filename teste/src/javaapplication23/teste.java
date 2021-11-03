/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication23;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class JavaApplication23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o ano do seu nascimento: ");
        int nascimento = teclado.nextInt();
        int idade =  2021 - nascimento;
        System.out.println("Sua idade é "+ idade);
        if(idade<16){
            System.out.println("Nao vota!");
        } else {
            if((idade>=16 && idade<18)||(idade>70)) {
                System.out.println("Voto Opcional!");
            } else {
                System.out.println("Voto Obrigatorio!");
                
            }
        }
        
        
    }
    
}
