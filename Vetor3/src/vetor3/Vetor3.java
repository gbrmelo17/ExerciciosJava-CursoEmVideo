/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor3;

import java.util.Arrays;

/**
 *
 * @author Gabriel
 */
public class Vetor3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double v[] = {3.7, -7.5 ,1.5 , 5.8 ,-4.4};
        Arrays.sort(v);// poe o vetor em ordem do menor para o maior
        int pos = Arrays.binarySearch(v,1.5); // procura a posição do valor desejado dentro do vetor
        for(double valor: v) { // for int usado para vetor
            System.out.println(valor);
        }
        System.out.println("O valor esta na posição " + pos + " do vetor");
    }
    
}
