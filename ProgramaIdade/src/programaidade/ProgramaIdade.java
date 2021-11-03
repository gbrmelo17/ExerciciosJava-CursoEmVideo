/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaidade;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class ProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu ano de nascimento: ");
        int ano = teclado.nextInt();
        int idade = 2021 - ano;
        System.out.println("Sua idade é "+ idade);
        if (idade>=18) {
            System.out.println("Vc é maior de idade");
        } else {
            System.out.println("Vc é menor de idade");
        }
    }
    
}
