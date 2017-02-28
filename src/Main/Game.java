/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.Scanner;

/**
 *
 * @author Lydya0103
 */
public class Game {
    
    private final String cuvant;
    private int viata;
    //private int pozitieJoc = 0;
    private String cuvantAfisat = "" ;
    
    public Game (String _cuvant,int _viata)
    {
        cuvant = _cuvant;
        viata = _viata;
        creazaString();
    }
    
    public void compara()
    {       
       char[] cuvantChars = cuvant.toCharArray();
       char[] cuvantAfisatChars = cuvantAfisat.toCharArray();
       int k = 0;
       char litera = primaLitera();
       
       for(int i = 0; i < cuvant.length(); i++)
       {
           if( cuvantChars[i] == litera )
           {
               cuvantAfisatChars[i] = litera;
               k = 1;
           }        
       }       
       if(k == 0)   viata--;  
       
       cuvantAfisat = String.valueOf(cuvantAfisatChars);      
    }
    
    // Functie de citire cuvant/litera pentru joc
    public String citesteCuvant()
    {
        System.out.print("Introdu litera:");
        Scanner scan = new Scanner(System.in);        
        return scan.nextLine();
    }
    
    // Ia prima litera introdusa de utilizator ( in cazul in care a introdus mai multe)
    private char primaLitera()
    {
       String raspuns;       
       raspuns = citesteCuvant();       
       return raspuns.charAt(0);
    }
    
    public void afisare()
    {
        System.out.println(cuvantAfisat);
        System.out.println(viata);
    }
    
    public void creazaString()
    {
       for(int i = 0; i < viata ; i++)
       {
           cuvantAfisat = cuvantAfisat + "*";
       }
    }
}
