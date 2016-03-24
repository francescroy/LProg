/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lprog;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;





/**
 *
 * @author francescroy
 */
public class Lexicografico {
    
    private int index_arxiu;
    
    private String ruta;
    
    
    
    
    
    public Lexicografico(String ruta){
    
    this.index_arxiu=0;
    
    this.ruta=ruta;
    
    }
    
    
    
    public Token dameToken() throws IOException, Exception{
        
        Token t;
        List<Character> chars = new ArrayList<>();
        
        
        if(this.finalFitxer()){
        
            t= new Token();
            t.setTipo("-");
            t.setLexema("-");
            return t;
            
        }
        
        int estado =0;
        
        while(true){ 
        
            char caracter = this.dameCaracter();
            
            
               if((caracter==' ' || caracter =='\n' || caracter == '\t') && estado!=0 && estado!=3 && estado!=4 && estado!=5 ){throw new Exception();} 
            while(caracter==' ' || caracter =='\n' || caracter == '\t')                {caracter = this.dameCaracter();}
        
            switch (estado){
        
                case 0:
                    
                    switch (caracter){
                    
                        case 'I':
                            
                            chars.add('I');
                            estado=1;
                            break;
                            
                        case 'i':
                            
                            chars.add('i');
                            estado=1;
                            break;
                            
                        case '=':
                            
                            chars.add('=');
                            estado=2;
                            break;
                    
                        case '>':
                            
                            chars.add('>');
                            estado=3;
                            break;
                            
                        case '<':
                            
                            chars.add('<');
                            estado=3;
                            break;
                            
                        default:
                            throw new Exception();
                        
                    }
                    
                    break;
                    
                case 1:
                    
                     switch (caracter){
                    
                        case 'f':
                            
                            chars.add('f');
                            estado=5;
                            break;
                            
                        case 'F':
                            
                            chars.add('F');
                            estado=5;
                            break;
                            
                        default:
                            throw new Exception();
                        
                    }
                    
                    
                    break;
                    
                case 2:
                    
                    switch (caracter){
                    
                        case '=':
                            
                            chars.add('=');
                            estado=4;
                            break;
                            
                        default:
                            throw new Exception();
                        
                    }
                    

                    break;
                case 3:
                    
                    char[] charArr = new char[chars.size()];
                    int r;
                    for(r=0;r<chars.size();r++){        
                    charArr[r]=chars.get(r);   }
                    this.retrocedeixCaracter(); //?? --> OK
                    t = new Token();
                    t.setTipo("oper.rel"); 
                    t.setLexema(new String(charArr));
                    return t;
                    
                case 4:
                    
                    char[] charArr2 = new char[chars.size()];
                    int r2;
                    for(r2=0;r2<chars.size();r2++){        
                    charArr2[r2]=chars.get(r2);   }
                    this.retrocedeixCaracter(); //?? --> OK
                    t = new Token();
                    t.setTipo("oper.rel"); 
                    t.setLexema(new String(charArr2));
                    return t;
                    
        
                case 5:
                    
                    char[] charArr3 = new char[chars.size()];
                    int r3;
                    for(r3=0;r3<chars.size();r3++){        
                    charArr3[r3]=chars.get(r3);   }
                    this.retrocedeixCaracter(); //?? --> OK
                    t = new Token();
                    t.setTipo("if"); 
                    t.setLexema(new String(charArr3));
                    return t;
                    
                    
        
            }
        
      
        }
    
        
        
        
        
        
        
        
        
        
        
    
    }
    
    public char dameCaracter() throws FileNotFoundException, IOException {
        
        char caracter;
        FileReader f = new FileReader(this.ruta);
        BufferedReader b = new BufferedReader(f);
        b.skip(this.index_arxiu);
        caracter = (char)b.read();
        index_arxiu++;
        b.close();
        return caracter;
}
    
    public boolean finalFitxer() throws FileNotFoundException, IOException {
        
        FileReader f = new FileReader(this.ruta);
        BufferedReader b = new BufferedReader(f);
        b.skip(this.index_arxiu);
        String s = b.readLine();
        b.close();
        if(s==null){return true;}
        return false;
}

    public void retrocedeixCaracter(){
    
    this.index_arxiu=this.index_arxiu-1;
    
    }
  
  
}
