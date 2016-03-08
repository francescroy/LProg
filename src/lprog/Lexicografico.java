/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lprog;

import java.util.*;
import java.lang.*;



/**
 *
 * @author francescroy
 */
public class Lexicografico {
    
    private ArrayList<Token> lista;
    
    public Lexicografico(){
    
    lista = new ArrayList<>();
    
    
    }
    
    public void generaListaDeTokens(){
    
    
        // BUCLE PARA CADA PALABRA... SEPARADA POR ESPACIOS...
        
        // I CADA PALABRA LA PASAMOS A TODAS LAS FUNCIONES
        
        
        
       
        
        int estado =0;
        
        while(true){ // mientras no se final de fichero...
        
            char caracter ='1'; // Leer siguiente caracter
        
            switch (estado){
        
                case 0:
                    
                    
                    
                    switch (caracter){
                    
                        case :
                            
                            break;
                    
                    
                    }
                    
                    break;
        
        
        
        
            }
        
      
        }
    
        
        
        
    
    }
    
    
    
    

    /**
     * @return the lista
     */
    public ArrayList<Token> getLista() {
        return lista;
    }

    /**
     * @param lista the lista to set
     */
    public void setLista(ArrayList<Token> lista) {
        this.lista = lista;
    }
    
    
}
