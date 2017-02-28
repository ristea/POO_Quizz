/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author Lydya0103
 */
public class GameState {
    
    private String cuvantAfisat;
    private int viataRamasa;
    
    public GameState(int cuvantLenght)
    {
        viataRamasa = cuvantLenght;
        creazaString();
    }
    
    public void creazaString()
    {
       for(int i = 0; i < viataRamasa ; i++)
       {
           cuvantAfisat = cuvantAfisat + "*";
       }
    }   
}
