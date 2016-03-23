/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lprog;

import java.io.IOException;


/**
 *
 * @author francescroy
 */
public class LProg {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    
    
    
    public static void main(String[] args) throws IOException, Exception {
        
        Lexicografico l1 = new Lexicografico("//Users/francescroy/Desktop/archivo.txt");
        
        Token t0 = l1.dameToken();
        System.out.println(t0.getTipo());
        System.out.println(t0.getLexema());
        
        Token t1 = l1.dameToken();
        System.out.println(t1.getTipo());
        System.out.println(t1.getLexema());
        
        Token t2 = l1.dameToken();
        System.out.println(t2.getTipo());
        System.out.println(t2.getLexema());    
        
        
        
      
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
