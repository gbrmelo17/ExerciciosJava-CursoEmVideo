/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resoluçãosistema;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Gabriel
 */
public class ResoluçãoSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Toolkit r = Toolkit.getDefaultToolkit();
        Dimension d = r.getScreenSize();
        System.out.println("A resoluçao do sistema é:" + d.width +"X" + d.height);
        
    }
    
}
