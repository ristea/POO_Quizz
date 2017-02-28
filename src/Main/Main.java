/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.Vector;

/**
 *
 * @author Lydya0103
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Game gm = new Game("mama",4);
        while(true) 
        {
            gm.compara();
            gm.afisare();
        }      
        
        
    }
    
}
