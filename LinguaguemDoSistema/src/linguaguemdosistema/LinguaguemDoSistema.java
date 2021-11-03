/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linguaguemdosistema;

import java.util.Locale;

/**
 *
 * @author Gabriel
 */
public class LinguaguemDoSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Locale loc = Locale.getDefault();
        System.out.println("a linguagem do sistema é");
        System.out.println(loc.getDisplayLanguage());
        
    }
    
}
