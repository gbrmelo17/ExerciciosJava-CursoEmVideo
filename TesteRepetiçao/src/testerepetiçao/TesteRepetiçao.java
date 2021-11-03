/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testerepetiçao;

/**
 *
 * @author Gabriel
 */
public class TesteRepetiçao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i,j;
        for (i=1; i<=3; i++){
            for(j=0; j<=2; j+=2 ){
                System.out.println(i + "<html>" + j + "</hmtl>");
            }
        }
    }
    
}
