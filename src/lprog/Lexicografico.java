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
 

 
public class Lexicografico {
    
    static int num_carac=0;
    
    // Atributos
    
    private int index_arxiu;
    
    private String ruta;
    
    private int num_de_fila;
    
    private int a_avancar;
    
    
    
    // Constructor
    
    public Lexicografico(String ruta){
    
        this.index_arxiu=0;
    
        this.ruta=ruta;
    
        this.num_de_fila=0;
    
    }
    
    
    
    // Metodos publicos
    
    public Token dameToken() throws IOException, Exception{
        
        
        
        Token t;
        List<Character> chars = new ArrayList<>();
        char[] charArr;
        int r;
        int cant_id=0;
        
        
        if(this.finalFitxer()){
        
            t= new Token();
            t.setTipo("PROUU");
            t.setLexema("PROUU"); 
            return t;
            
        }
        
        int estado =0;
        
        while(true){ 
        
            char caracter = this.dameCaracter();
            
            if(caracter=='\n'){this.num_de_fila++;}
            
            if(estado==0){
            
                while(caracter==' ' || caracter =='\n' || caracter == '\t' || caracter == '\r') {caracter = this.dameCaracter();if(caracter=='\n'){this.num_de_fila++;}} 
            
            }
            
            
            
            
            
            //////////////////////////////////////////////////////////////////////////////
            ///////////////////////////// TRATAR COMENTARIOS  ////////////////////////////
            //////////////////////////////////////////////////////////////////////////////
            if(estado==0){
                while(true){
                    if(caracter=='/'){
                
                        caracter = this.dameCaracter();
                    
                        if(caracter=='/'){
                        
                            while(caracter !='\n') {caracter = this.dameCaracter();}     
                            caracter = this.dameCaracter(); 
                            this.num_de_fila++;
                    
                            while(caracter==' ' || caracter =='\n' || caracter == '\t' || caracter == '\r') {caracter = this.dameCaracter();if(caracter=='\n'){this.num_de_fila++;}} 
                        }
                        else{
                        
                            caracter='/';
                            this.retrocedeixCaracter();
                            break;
                        }
                
                    }
                    else{
                        break;
                
                    }
                }
            
            }
            //////////////////////////////////////////////////////////////////////////////
            //////////////////////////////////////////////////////////////////////////////
            //////////////////////////////////////////////////////////////////////////////
            
            
        
            switch (estado){
        
                case 0:
                    
                    switch (caracter){
                    
                        case '0':
                            
                            chars.add('0');
                            estado=1;
                            break;
                            
                        case '1':
                            
                            chars.add('1');
                            estado=1;
                            break;
                            
                        case '2':
                            
                            chars.add('2');
                            estado=1;
                            break;
                    
                        case '3':
                            
                            chars.add('3');
                            estado=1;
                            break;
                    
                        case '4':
                            
                            chars.add('4');
                            estado=1;
                            break;
                    
                        case '5':
                            
                            chars.add('5');
                            estado=1;
                            break;
                    
                        case '6':
                            
                            chars.add('6');
                            estado=1;
                            break;
                    
                        case '7':
                            
                            chars.add('7');
                            estado=1;
                            break;
                    
                        case '8':
                            
                            chars.add('8');
                            estado=1;
                            break;
                    
                        case '9':
                            
                            chars.add('9');
                            estado=1;
                            break;
                            
                        case 'a':
                            
                            chars.add('a');
                            estado=2;
                            break;
                            
                        case 'b':
                            
                            chars.add('b');
                            estado=2;
                            break;
                            
                        case 'c':
                            
                            chars.add('c');
                            estado=2;
                            break;
                    
                        case 'd':
                            
                            chars.add('d');
                            estado=2;
                            break;
                        
                        case 'e':
                            
                            chars.add('e');
                            estado=2;
                            break;
                            
                        case 'f':
                            
                            chars.add('f');
                            estado=2;
                            break;
                            
                        case 'g':
                            
                            chars.add('g');
                            estado=2;
                            break;
                            
                        case 'h':
                            
                            chars.add('h');
                            estado=2;
                            break;
                            
                        case 'i':
                            
                            chars.add('i');
                            estado=2;
                            break;    
                        
                        case 'j':
                            
                            chars.add('j');
                            estado=2;
                            break;
                            
                        case 'k':
                            
                            chars.add('k');
                            estado=2;
                            break;
                            
                        case 'l':
                            
                            chars.add('l');
                            estado=2;
                            break;
                    
                        case 'm':
                            
                            chars.add('m');
                            estado=2;
                            break;
                        
                        case 'n':
                            
                            chars.add('n');
                            estado=2;
                            break;
                            
                        case 'o':
                            
                            chars.add('o');
                            estado=2;
                            break;
                            
                        case 'p':
                            
                            chars.add('p');
                            estado=2;
                            break;
                            
                        case 'q':
                            
                            chars.add('q');
                            estado=2;
                            break;
                            
                        case 'r':
                            
                            chars.add('r');
                            estado=2;
                            break;
                            
                        case 's':
                            
                            chars.add('s');
                            estado=2;
                            break;
                            
                        case 't':
                            
                            chars.add('t');
                            estado=2;
                            break;
                            
                        case 'u':
                            
                            chars.add('u');
                            estado=2;
                            break;
                    
                        case 'v':
                            
                            chars.add('v');
                            estado=2;
                            break;
                        
                        case 'w':
                            
                            chars.add('w');
                            estado=2;
                            break;
                            
                        case 'x':
                            
                            chars.add('x');
                            estado=2;
                            break;
                            
                        case 'y':
                            
                            chars.add('y');
                            estado=2;
                            break;
                            
                        case 'z':
                            
                            chars.add('z');
                            estado=2;
                            break;
                            
                        case 'A':
                            
                            chars.add('A');
                            estado=2;
                            break;
                            
                        case 'B':
                            
                            chars.add('B');
                            estado=2;
                            break;
                            
                        case 'C':
                            
                            chars.add('C');
                            estado=2;
                            break;
                            
                        case 'D':
                            
                            chars.add('D');
                            estado=2;
                            break;
                    
                        case 'E':
                            
                            chars.add('E');
                            estado=2;
                            break;
                        
                        case 'F':
                            
                            chars.add('F');
                            estado=2;
                            break;
                            
                        case 'G':
                            
                            chars.add('G');
                            estado=2;
                            break;
                            
                        case 'H':
                            
                            chars.add('H');
                            estado=2;
                            break;
                            
                        case 'I':
                            
                            chars.add('I');
                            estado=2;
                            break;
                            
                        case 'J':
                            
                            chars.add('J');
                            estado=2;
                            break;   
                        
                        case 'K':
                            
                            chars.add('K');
                            estado=2;
                            break;
                            
                        case 'L':
                            
                            chars.add('L');
                            estado=2;
                            break;
                            
                        case 'M':
                            
                            chars.add('M');
                            estado=2;
                            break;
                            
                        case 'N':
                            
                            chars.add('N');
                            estado=2;
                            break;
                            
                        case 'O':
                            
                            chars.add('O');
                            estado=2;
                            break;
                    
                        case 'P':
                            
                            chars.add('P');
                            estado=2;
                            break;
                        
                        case 'Q':
                            
                            chars.add('Q');
                            estado=2;
                            break;
                            
                        case 'R':
                            
                            chars.add('R');
                            estado=2;
                            break;
                            
                        case 'S':
                            
                            chars.add('S');
                            estado=2;
                            break;
                            
                        case 'T':
                            
                            chars.add('T');
                            estado=2;
                            break;
                            
                        case 'U':
                            
                            chars.add('U');
                            estado=2;
                            break;  
                        
                        case 'V':
                            
                            chars.add('V');
                            estado=2;
                            break;
                            
                        case 'W':
                            
                            chars.add('W');
                            estado=2;
                            break;
                            
                        case 'X':
                            
                            chars.add('X');
                            estado=2;
                            break;
                            
                        case 'Y':
                            
                            chars.add('Y');
                            estado=2;
                            break;  
                        
                        case 'Z':
                            
                            chars.add('Z');
                            estado=2;
                            break;  
                            
                        case '"':
                            
                            chars.add('"');
                            estado=3;
                            break;
                            
                        case '<':
                            
                            chars.add('<');
                            estado=4;
                            break;    
                        
                        case '=':
                            
                            chars.add('=');
                            estado=5;
                            break;      
                        
                        case '>':
                            
                            chars.add('>');
                            estado=9;
                            break;
                            
                        case '+':
                            
                            chars.add('+');
                            estado=12;
                            break;
                            
                        case '-':
                            
                            chars.add('-');
                            estado=13;
                            break;
                            
                        case '*':
                            
                            chars.add('*');
                            estado=14;
                            break;
                        
                        case '/':
                            
                            chars.add('/');
                            estado=15;
                            break;
                        case '(':
                            
                            chars.add('(');
                            estado=16;
                            break;
                        case ')':
                            
                            chars.add(')');
                            estado=17;
                            break;
                        case '[':
                            
                            chars.add('[');
                            estado=18;
                            break;    
                        case ']':
                            
                            chars.add(']');
                            estado=19;
                            break;
                        case ':':
                            
                            chars.add(':');
                            estado=20;
                            break;
                        case ';':
                            
                            chars.add(';');
                            estado=21;
                            break;
                        case ',':
                            
                            chars.add(',');
                            estado=22;
                            break;
                        case '?':
                            
                            chars.add('?');
                            estado=23;
                            break;   
                        case '.':
                            
                            chars.add('.');
                            estado=24;
                            break;
                            
                            
                            
                        default:
                            
                            Token token_fallo = new Token();
                            token_fallo.setLexema(this.num_de_fila+", Caracter ["+caracter+"] desconegut.");
                            token_fallo.setTipo("ERR_LEX_1"); 
                            haciaAtras();
                            return token_fallo;
                        
                    }
                    
                    break;
                    
                case 1:
                    
                     switch (caracter){
                    
                        case '0':
                            
                            chars.add('0');
                            estado=1;
                            break;
                            
                        case '1':
                            
                            chars.add('1');
                            estado=1;
                            break;
                        
                        case '2':
                            
                            chars.add('2');
                            estado=1;
                            break;
                        
                        case '3':
                            
                            chars.add('3');
                            estado=1;
                            break;
                        
                        case '4':
                            
                            chars.add('4');
                            estado=1;
                            break;
                        
                        case '5':
                            
                            chars.add('5');
                            estado=1;
                            break;
                        
                        case '6':
                            
                            chars.add('6');
                            estado=1;
                            break;
                        
                        case '7':
                            
                            chars.add('7');
                            estado=1;
                            break;
                        
                        case '8':
                            
                            chars.add('8');
                            estado=1;
                            break;
                            
                        case '9':
                            
                            chars.add('9');
                            estado=1;
                            break;
                            
                        default:
                            
                            charArr = new char[chars.size()];
                            for(r=0;r<chars.size();r++){        
                            charArr[r]=chars.get(r);   }
                            t = new Token();
                            t.setTipo("cte_sencera"); 
                            t.setLexema(new String(charArr));
                            while(caracter==' ' || caracter =='\n' || caracter == '\t'|| caracter == '\r')                 {caracter = this.dameCaracter();if(caracter=='\n'){this.num_de_fila++;}} 
                            this.retrocedeixCaracter();
                            haciaAtras();
                            return t;
                            
                    }
                    
                    
                    break;
                    
                case 2:
                    
                    cant_id++;
                    
                    
                    switch (caracter){
                    
                        case 'a':
                            
                            chars.add('a');
                            estado=2;
                            break;
                            
                        case 'b':
                            
                            chars.add('b');
                            estado=2;
                            break;
                            
                        case 'c':
                            
                            chars.add('c');
                            estado=2;
                            break;
                    
                        case 'd':
                            
                            chars.add('d');
                            estado=2;
                            break;
                        
                        case 'e':
                            
                            chars.add('e');
                            estado=2;
                            break;
                            
                        case 'f':
                            
                            chars.add('f');
                            estado=2;
                            break;
                            
                        case 'g':
                            
                            chars.add('g');
                            estado=2;
                            break;
                            
                        case 'h':
                            
                            chars.add('h');
                            estado=2;
                            break;
                            
                        case 'i':
                            
                            chars.add('i');
                            estado=2;
                            break;    
                        
                        case 'j':
                            
                            chars.add('j');
                            estado=2;
                            break;
                            
                        case 'k':
                            
                            chars.add('k');
                            estado=2;
                            break;
                            
                        case 'l':
                            
                            chars.add('l');
                            estado=2;
                            break;
                    
                        case 'm':
                            
                            chars.add('m');
                            estado=2;
                            break;
                        
                        case 'n':
                            
                            chars.add('n');
                            estado=2;
                            break;
                            
                        case 'o':
                            
                            chars.add('o');
                            estado=2;
                            break;
                            
                        case 'p':
                            
                            chars.add('p');
                            estado=2;
                            break;
                            
                        case 'q':
                            
                            chars.add('q');
                            estado=2;
                            break;
                            
                        case 'r':
                            
                            chars.add('r');
                            estado=2;
                            break;
                            
                        case 's':
                            
                            chars.add('s');
                            estado=2;
                            break;
                            
                        case 't':
                            
                            chars.add('t');
                            estado=2;
                            break;
                            
                        case 'u':
                            
                            chars.add('u');
                            estado=2;
                            break;
                    
                        case 'v':
                            
                            chars.add('v');
                            estado=2;
                            break;
                        
                        case 'w':
                            
                            chars.add('w');
                            estado=2;
                            break;
                            
                        case 'x':
                            
                            chars.add('x');
                            estado=2;
                            break;
                            
                        case 'y':
                            
                            chars.add('y');
                            estado=2;
                            break;
                            
                        case 'z':
                            
                            chars.add('z');
                            estado=2;
                            break;
                            
                        case 'A':
                            
                            chars.add('A');
                            estado=2;
                            break;
                            
                        case 'B':
                            
                            chars.add('B');
                            estado=2;
                            break;
                            
                        case 'C':
                            
                            chars.add('C');
                            estado=2;
                            break;
                            
                        case 'D':
                            
                            chars.add('D');
                            estado=2;
                            break;
                    
                        case 'E':
                            
                            chars.add('E');
                            estado=2;
                            break;
                        
                        case 'F':
                            
                            chars.add('F');
                            estado=2;
                            break;
                            
                        case 'G':
                            
                            chars.add('G');
                            estado=2;
                            break;
                            
                        case 'H':
                            
                            chars.add('H');
                            estado=2;
                            break;
                            
                        case 'I':
                            
                            chars.add('I');
                            estado=2;
                            break;
                            
                        case 'J':
                            
                            chars.add('J');
                            estado=2;
                            break;   
                        
                        case 'K':
                            
                            chars.add('K');
                            estado=2;
                            break;
                            
                        case 'L':
                            
                            chars.add('L');
                            estado=2;
                            break;
                            
                        case 'M':
                            
                            chars.add('M');
                            estado=2;
                            break;
                            
                        case 'N':
                            
                            chars.add('N');
                            estado=2;
                            break;
                            
                        case 'O':
                            
                            chars.add('O');
                            estado=2;
                            break;
                    
                        case 'P':
                            
                            chars.add('P');
                            estado=2;
                            break;
                        
                        case 'Q':
                            
                            chars.add('Q');
                            estado=2;
                            break;
                            
                        case 'R':
                            
                            chars.add('R');
                            estado=2;
                            break;
                            
                        case 'S':
                            
                            chars.add('S');
                            estado=2;
                            break;
                            
                        case 'T':
                            
                            chars.add('T');
                            estado=2;
                            break;
                            
                        case 'U':
                            
                            chars.add('U');
                            estado=2;
                            break;  
                        
                        case 'V':
                            
                            chars.add('V');
                            estado=2;
                            break;
                            
                        case 'W':
                            
                            chars.add('W');
                            estado=2;
                            break;
                            
                        case 'X':
                            
                            chars.add('X');
                            estado=2;
                            break;
                            
                        case 'Y':
                            
                            chars.add('Y');
                            estado=2;
                            break;  
                        
                        case 'Z':
                            
                            chars.add('Z');
                            estado=2;
                            break;
                            
                        case '0':
                            
                            chars.add('0');
                            estado=2;
                            break;
                            
                        case '1':
                            
                            chars.add('1');
                            estado=2;
                            break;
                            
                        case '2':
                            
                            chars.add('2');
                            estado=2;
                            break;
                    
                        case '3':
                            
                            chars.add('3');
                            estado=2;
                            break;
                    
                        case '4':
                            
                            chars.add('4');
                            estado=2;
                            break;
                    
                        case '5':
                            
                            chars.add('5');
                            estado=2;
                            break;
                    
                        case '6':
                            
                            chars.add('6');
                            estado=2;
                            break;
                    
                        case '7':
                            
                            chars.add('7');
                            estado=2;
                            break;
                    
                        case '8':
                            
                            chars.add('8');
                            estado=2;
                            break;
                    
                        case '9':
                            
                            chars.add('9');
                            estado=2;
                            break;   
                            
                        case '_':
                            
                            chars.add('_');
                            estado=2;
                            break;  
                            
                        default:
                            
                            
                            if(cant_id>32){
                        
                            if(caracter=='\n'){this.num_de_fila--;}
                            
                            Token token_fallo = new Token();
                            token_fallo.setLexema(this.num_de_fila+", Id massa llarg.");
                            token_fallo.setTipo("ERR_LEX_2");
                            this.retrocedeixCaracter();
                            haciaAtras();
                            return token_fallo;
                    
                                   }
                            
                            
                            charArr = new char[chars.size()];
                            for(r=0;r<chars.size();r++){        
                            charArr[r]=chars.get(r);   }
                            t = new Token();
                            t.setTipo("id"); 
                            t.setLexema(new String(charArr));
                            this.comprovaToken(t);
                            while(caracter==' ' || caracter =='\n' || caracter == '\t'|| caracter == '\r')                {caracter = this.dameCaracter();if(caracter=='\n'){this.num_de_fila++;}} 
                            this.retrocedeixCaracter();
                            haciaAtras();
                            return t;
                            
                        
                    }
                    

                    break;
                case 3:
                    
                    if(caracter!='"'){
                    
                        chars.add(caracter);
                        estado=3;
                        
                    }
                    else{
                    
                        chars.add('"');
                        estado=8;
                        
                    
                    }
                    
                    break;
                    
                case 4:
                    
                switch (caracter){
                    
                        case '>':
                            
                            chars.add('>');
                            estado=11;
                            break;
                            
                            
                        case '=':
                            
                            chars.add('=');
                            estado=6;
                            break;    
                        
                        default:
                            
                            charArr = new char[chars.size()];
                            for(r=0;r<chars.size();r++){        
                            charArr[r]=chars.get(r);   }
                            t = new Token();
                            t.setTipo("oper_rel"); 
                            t.setLexema(new String(charArr));
                            while(caracter==' ' || caracter =='\n' || caracter == '\t'|| caracter == '\r')                {caracter = this.dameCaracter();if(caracter=='\n'){this.num_de_fila++;}} 
                            this.retrocedeixCaracter();
                            haciaAtras();
                            return t;
                            
                    }
                    
                    
                    break;    
                    
        
                case 5:
                    
                    switch (caracter){
                    
                        case '=':
                            
                            chars.add('=');
                            estado=6;
                            break;
                            
                        default:
                            
                            charArr = new char[chars.size()];
                            for(r=0;r<chars.size();r++){        
                            charArr[r]=chars.get(r);   }
                            t = new Token();
                            t.setTipo("="); 
                            t.setLexema(new String(charArr));
                            while(caracter==' ' || caracter =='\n' || caracter == '\t'|| caracter == '\r')                {caracter = this.dameCaracter();if(caracter=='\n'){this.num_de_fila++;}} 
                            this.retrocedeixCaracter();
                            haciaAtras();
                            return t;
                            
                    }
                    
                    
                    break;
                    
                    
                    
                    case 6:
                        
                        charArr = new char[chars.size()];
                        for(r=0;r<chars.size();r++){        
                        charArr[r]=chars.get(r);   }
                        t = new Token();
                        t.setTipo("oper_rel"); 
                        t.setLexema(new String(charArr));
                        while(caracter==' ' || caracter =='\n' || caracter == '\t'|| caracter == '\r')                {caracter = this.dameCaracter();if(caracter=='\n'){this.num_de_fila++;}} 
                        this.retrocedeixCaracter();
                        haciaAtras();
                        return t;
                        
                        
                    
                    
                        
                    case 7:
                        
                        charArr = new char[chars.size()];
                        for(r=0;r<chars.size();r++){        
                        charArr[r]=chars.get(r);   }
                        t = new Token();
                        t.setTipo("oper_rel"); 
                        t.setLexema(new String(charArr));
                        while(caracter==' ' || caracter =='\n' || caracter == '\t'|| caracter == '\r')                {caracter = this.dameCaracter();if(caracter=='\n'){this.num_de_fila++;}} 
                        this.retrocedeixCaracter();
                        haciaAtras();
                        return t;
                        
                    case 8:
                        
                        boolean conte_salt=false;
                        
                        charArr = new char[chars.size()];
                        for(r=0;r<chars.size();r++){        
                        charArr[r]=chars.get(r); if(chars.get(r)=='\n'){conte_salt=true;}}
                        t = new Token();
                        
                        if(conte_salt){
                        
                            t.setTipo("ERR_LEX_4"); 
                            t.setLexema(this.num_de_fila+", Cte cadena no valida.");
                            while(caracter==' ' || caracter =='\n' || caracter == '\t'|| caracter == '\r')                {caracter = this.dameCaracter();if(caracter=='\n'){this.num_de_fila++;}} 
                            this.retrocedeixCaracter();
                            haciaAtras();
                            return t;
                        
                        }
                        
                        t.setTipo("cte_cadena"); 
                        t.setLexema(new String(charArr));
                        while(caracter==' ' || caracter =='\n' || caracter == '\t'|| caracter == '\r')                {caracter = this.dameCaracter();if(caracter=='\n'){this.num_de_fila++;}} 
                        this.retrocedeixCaracter();
                        haciaAtras();
                        return t;
                        
                    
                    case 9:
                    
                    switch (caracter){
                    
                        case '=':
                            
                            chars.add('=');
                            estado=10;
                            break;
                            
                        
                        default:
                            
                            charArr = new char[chars.size()];
                            for(r=0;r<chars.size();r++){        
                            charArr[r]=chars.get(r);   }
                            t = new Token();
                            t.setTipo("oper_rel"); 
                            t.setLexema(new String(charArr));
                            while(caracter==' ' || caracter =='\n' || caracter == '\t'|| caracter == '\r')                {caracter = this.dameCaracter();if(caracter=='\n'){this.num_de_fila++;}} 
                            this.retrocedeixCaracter();
                            haciaAtras();
                            return t;
                            
                    }
                    
                    
                    break;
                        
                    case 10:
                        
                        charArr = new char[chars.size()];
                        for(r=0;r<chars.size();r++){        
                        charArr[r]=chars.get(r);   }
                        t = new Token();
                        t.setTipo("oper_rel"); 
                        t.setLexema(new String(charArr));
                        while(caracter==' ' || caracter =='\n' || caracter == '\t'|| caracter == '\r')                {caracter = this.dameCaracter();if(caracter=='\n'){this.num_de_fila++;}} 
                        this.retrocedeixCaracter();
                        haciaAtras();
                        return t;
                        
                    case 11: 
                        
                        charArr = new char[chars.size()];
                        for(r=0;r<chars.size();r++){        
                        charArr[r]=chars.get(r);   }
                        t = new Token();
                        t.setTipo("oper_rel"); 
                        t.setLexema(new String(charArr));
                        while(caracter==' ' || caracter =='\n' || caracter == '\t'|| caracter == '\r')                {caracter = this.dameCaracter();if(caracter=='\n'){this.num_de_fila++;}} 
                        this.retrocedeixCaracter();
                        haciaAtras();
                        return t;
                        
                        
                    case 12:
                        
                        charArr = new char[chars.size()];
                        for(r=0;r<chars.size();r++){        
                        charArr[r]=chars.get(r);   }
                        t = new Token();
                        t.setTipo("+"); 
                        t.setLexema(new String(charArr));
                        while(caracter==' ' || caracter =='\n' || caracter == '\t'|| caracter == '\r')                {caracter = this.dameCaracter();if(caracter=='\n'){this.num_de_fila++;}} 
                        this.retrocedeixCaracter();
                        haciaAtras();
                        return t; 
                        
                        
                    case 13:
                        
                        charArr = new char[chars.size()];
                        for(r=0;r<chars.size();r++){        
                        charArr[r]=chars.get(r);   }
                        t = new Token();
                        t.setTipo("-"); 
                        t.setLexema(new String(charArr));
                        while(caracter==' ' || caracter =='\n' || caracter == '\t'|| caracter == '\r')                {caracter = this.dameCaracter();if(caracter=='\n'){this.num_de_fila++;}} 
                        this.retrocedeixCaracter();
                        haciaAtras();
                        return t;     
                    
                        
                    case 14:
                        
                        charArr = new char[chars.size()];
                        for(r=0;r<chars.size();r++){        
                        charArr[r]=chars.get(r);   }
                        t = new Token();
                        t.setTipo("*"); 
                        t.setLexema(new String(charArr));
                        while(caracter==' ' || caracter =='\n' || caracter == '\t'|| caracter == '\r')                {caracter = this.dameCaracter();if(caracter=='\n'){this.num_de_fila++;}} 
                        this.retrocedeixCaracter();
                        haciaAtras();
                        return t;     
                   
                    case 15:
                        
                        charArr = new char[chars.size()];
                        for(r=0;r<chars.size();r++){        
                        charArr[r]=chars.get(r);   }
                        t = new Token();
                        t.setTipo("/"); 
                        t.setLexema(new String(charArr));
                        while(caracter==' ' || caracter =='\n' || caracter == '\t'|| caracter == '\r')                {caracter = this.dameCaracter();if(caracter=='\n'){this.num_de_fila++;}} 
                        this.retrocedeixCaracter();
                        haciaAtras();
                        return t; 
                    case 16:
                        
                        charArr = new char[chars.size()];
                        for(r=0;r<chars.size();r++){        
                        charArr[r]=chars.get(r);   }
                        t = new Token();
                        t.setTipo("("); 
                        t.setLexema(new String(charArr));
                        while(caracter==' ' || caracter =='\n' || caracter == '\t'|| caracter == '\r')                {caracter = this.dameCaracter();if(caracter=='\n'){this.num_de_fila++;}} 
                        this.retrocedeixCaracter();
                        haciaAtras();
                        return t;
                    case 17:
                        
                        charArr = new char[chars.size()];
                        for(r=0;r<chars.size();r++){        
                        charArr[r]=chars.get(r);   }
                        t = new Token();
                        t.setTipo(")"); 
                        t.setLexema(new String(charArr));
                        while(caracter==' ' || caracter =='\n' || caracter == '\t'|| caracter == '\r')                {caracter = this.dameCaracter();if(caracter=='\n'){this.num_de_fila++;}} 
                        this.retrocedeixCaracter();
                        haciaAtras();
                        return t;
                    case 18:
                        
                        charArr = new char[chars.size()];
                        for(r=0;r<chars.size();r++){        
                        charArr[r]=chars.get(r);   }
                        t = new Token();
                        t.setTipo("["); 
                        t.setLexema(new String(charArr));
                        while(caracter==' ' || caracter =='\n' || caracter == '\t'|| caracter == '\r')                {caracter = this.dameCaracter();if(caracter=='\n'){this.num_de_fila++;}} 
                        this.retrocedeixCaracter();
                        haciaAtras();
                        return t;
                    case 19:
                        
                        charArr = new char[chars.size()];
                        for(r=0;r<chars.size();r++){        
                        charArr[r]=chars.get(r);   }
                        t = new Token();
                        t.setTipo("]"); 
                        t.setLexema(new String(charArr));
                        while(caracter==' ' || caracter =='\n' || caracter == '\t'|| caracter == '\r')                {caracter = this.dameCaracter();if(caracter=='\n'){this.num_de_fila++;}} 
                        this.retrocedeixCaracter();
                        haciaAtras();
                        return t;
                    case 20:
                        
                        charArr = new char[chars.size()];
                        for(r=0;r<chars.size();r++){        
                        charArr[r]=chars.get(r);   }
                        t = new Token();
                        t.setTipo(":"); 
                        t.setLexema(new String(charArr));
                        while(caracter==' ' || caracter =='\n' || caracter == '\t'|| caracter == '\r')                {caracter = this.dameCaracter();if(caracter=='\n'){this.num_de_fila++;}} 
                        this.retrocedeixCaracter();
                        haciaAtras();
                        return t;
                    case 21:
                        
                        charArr = new char[chars.size()];
                        for(r=0;r<chars.size();r++){        
                        charArr[r]=chars.get(r);   }
                        t = new Token();
                        t.setTipo(";"); 
                        t.setLexema(new String(charArr));
                        while(caracter==' ' || caracter =='\n' || caracter == '\t'|| caracter == '\r')                {caracter = this.dameCaracter();if(caracter=='\n'){this.num_de_fila++;}} 
                        this.retrocedeixCaracter();
                        haciaAtras();
                        return t;
                    case 22:
                        
                        charArr = new char[chars.size()];
                        for(r=0;r<chars.size();r++){        
                        charArr[r]=chars.get(r);   }
                        t = new Token();
                        t.setTipo(","); 
                        t.setLexema(new String(charArr));
                        while(caracter==' ' || caracter =='\n' || caracter == '\t'|| caracter == '\r')                {caracter = this.dameCaracter();if(caracter=='\n'){this.num_de_fila++;}} 
                        this.retrocedeixCaracter();
                        haciaAtras();
                        return t;
                    case 23:
                        
                        charArr = new char[chars.size()];
                        for(r=0;r<chars.size();r++){        
                        charArr[r]=chars.get(r);   }
                        t = new Token();
                        t.setTipo("?"); 
                        t.setLexema(new String(charArr));
                        while(caracter==' ' || caracter =='\n' || caracter == '\t'|| caracter == '\r')                {caracter = this.dameCaracter();if(caracter=='\n'){this.num_de_fila++;}} 
                        this.retrocedeixCaracter();
                        haciaAtras();
                        return t;
                    case 24:
                    
                    switch (caracter){
                    
                        case '.':
                            
                            chars.add('.');
                            estado=25;
                            break;
                            
                        default:
                        
                        
                        this.retrocedeixCaracter();
                            
                        Token token_fallo = new Token();
                        token_fallo.setLexema(this.num_de_fila+", Token \"."+ caracter +"\" desconegut");
                        token_fallo.setTipo("ERR_LEX_3");
                        haciaAtras();
                        return token_fallo;    
                            
                    }
                    
                    
                    break;
                    case 25:
                        
                        charArr = new char[chars.size()];
                        for(r=0;r<chars.size();r++){        
                        charArr[r]=chars.get(r);   }
                        t = new Token();
                        t.setTipo(".."); 
                        t.setLexema(new String(charArr));
                        while(caracter==' ' || caracter =='\n' || caracter == '\t'|| caracter == '\r')                {caracter = this.dameCaracter();if(caracter=='\n'){this.num_de_fila++;}} 
                        this.retrocedeixCaracter();
                        haciaAtras();
                        return t;
            }
        
      
        }
    
        
        
        
        
        
        
        
        
        
        
    
    }
   
    // Metodos internos
    
    private char dameCaracter() throws FileNotFoundException, IOException {
        
        num_carac++;
        
        char caracter;
        FileReader f = new FileReader(this.ruta);
        BufferedReader b = new BufferedReader(f);
        b.skip(this.index_arxiu);
        caracter = (char)b.read();
        index_arxiu++;
        b.close();
        return caracter;
}
    
    private void haciaAtras(){
    
        this.index_arxiu= this.index_arxiu-num_carac;
        this.a_avancar= num_carac;
        
    }
    
    public void haciaAdelante(){
    
        this.index_arxiu= this.index_arxiu+this.a_avancar;
        
        
    }
    
    
    
    private boolean finalFitxer() throws FileNotFoundException, IOException {
        
        FileReader f = new FileReader(this.ruta);
        BufferedReader b = new BufferedReader(f);
        b.skip(this.index_arxiu);
        String s = b.readLine();
        b.close();
        if(s==null){return true;}
        return false;
}

    private void retrocedeixCaracter(){
    
    this.index_arxiu=this.index_arxiu-1;
    
    }
    
    private void comprovaToken(Token t){
        
        t.setLexema(t.getLexema().toLowerCase());//Normalizacion!
        String minuscules = t.getLexema().toLowerCase();
    
        if(minuscules.equals("cert")){t.setTipo("cte_logica");}
        
        
        if(minuscules.equals("fals")){t.setTipo("cte_logica");}
        
        
        if(minuscules.equals("logic")){t.setTipo("tipus_simple");}
        
        
        if(minuscules.equals("sencer")){t.setTipo("tipus_simple");}
        
        
        if(minuscules.equals("or")){t.setTipo("or");}
        
        
        if(minuscules.equals("not")){t.setTipo("not");}
        
        
        if(minuscules.equals("and")){t.setTipo("and");}
        
        
        if(minuscules.equals("prog")){t.setTipo("prog");}
        
        
        if(minuscules.equals("fiprog")){t.setTipo("fiprog");}
        
        
        if(minuscules.equals("const")){t.setTipo("const");}
        
        
        if(minuscules.equals("var")){t.setTipo("var");}
        
        
        if(minuscules.equals("funcio")){t.setTipo("funcio");}
        
        
        if(minuscules.equals("fifunc")){t.setTipo("fifunc");}
        
        
        if(minuscules.equals("func")){t.setTipo("func");}
        
        
        if(minuscules.equals("perval")){t.setTipo("perval");}
        
        
        if(minuscules.equals("perref")){t.setTipo("perref");}
        
        
        if(minuscules.equals("vector")){t.setTipo("vector");}
        
        
        if(minuscules.equals("de")){t.setTipo("de");}
        
        
        if(minuscules.equals("escriure")){t.setTipo("escriure");}
        
        
        if(minuscules.equals("llegir")){t.setTipo("llegir");}
        
        
        if(minuscules.equals("cicle")){t.setTipo("cicle");}
        
        
        if(minuscules.equals("fins")){t.setTipo("fins");}
        
        
        if(minuscules.equals("mentre")){t.setTipo("mentre");}
        
        
        if(minuscules.equals("fer")){t.setTipo("fer");}
        
        
        if(minuscules.equals("fimentre")){t.setTipo("fimentre");}
        
        
        if(minuscules.equals("si")){t.setTipo("si");}
        
        
        if(minuscules.equals("llavors")){t.setTipo("llavors");}
        
        
        if(minuscules.equals("sino")){t.setTipo("sino");}
        
        
        if(minuscules.equals("fisi")){t.setTipo("fisi");}
        
        
        if(minuscules.equals("retornar")){t.setTipo("retornar");}
        
        
        if(minuscules.equals("percada")){t.setTipo("percada");}
        
        
        if(minuscules.equals("en")){t.setTipo("en");}
        
        
        if(minuscules.equals("fiper")){t.setTipo("fiper");}
        
        
        
        
        
        
        
        
        
        
    
    }
  
  
}
