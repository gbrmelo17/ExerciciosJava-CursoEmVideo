/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeswitch;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class TesteSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o numero de pernas do animal: ");
        int pernas = teclado.nextInt();
        String tipo;
        System.out.print("Isso é um(a) ");
        switch (pernas){
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 3:
                tipo = "Tripe";
                break;
            case 4:
                tipo = "Quadrupede";
                break;
            case 8:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";               
        }
        System.out.println(tipo);
        
    }
    
}
