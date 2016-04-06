/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lprog;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;



public class LProg {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    
    
    
    public static void main(String[] args) throws IOException, Exception {
        
        
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.print("Ruta absoluta del fitxer a compilar: ");
        String nom = reader.nextLine();
        
        Path path = Paths.get(nom);
        String file_ = path.getFileName().toString();
        if(!file_.endsWith(".bab")){
        System.out.println("Nomes fitxers *.bab");
        }
        
        String nom_tokens = file_.replaceAll(".bab", ".lex");
        String nom_errors = file_.replaceAll(".bab", ".err");
        
        
        FileWriter fichero;
        PrintWriter pw;
        fichero = new FileWriter(path.getParent()+"/"+nom_tokens);
        pw = new PrintWriter(fichero);
        
        FileWriter fichero2;
        PrintWriter pw2;
        fichero2 = new FileWriter(path.getParent()+"/"+nom_errors);
        pw2 = new PrintWriter(fichero2);

            
        
        
        pw.println("\t------------------------");
        pw2.println("\t------------------------");
        
        
        
        
        
        Lexicografico l1 = new Lexicografico(nom);
        
        Token t0;
        
        do{
        
            
            
                t0 = l1.dameToken();
                     l1.haciaAdelante();
                
            
                if(!t0.getTipo().equals("PROUU") && !t0.getTipo().equals("ERR_LEX_1")
                        && !t0.getTipo().equals("ERR_LEX_2")&& !t0.getTipo().equals("ERR_LEX_3")
                        && !t0.getTipo().equals("ERR_LEX_4")){

                      pw.println();
                      pw.print("\t"+t0.getTipo()+":\t");
                      pw.println("["+t0.getLexema()+"]");
                      pw.println();
                      pw.print("\t------------------------");
                      pw.println();
                    
                }
                else if(!t0.getTipo().equals("PROUU")){
                
                      pw2.println();
                      pw2.print("\t"+t0.getTipo()+":\t");
                      pw2.println("["+t0.getLexema()+"]");
                      pw2.println();
                      pw2.print("\t------------------------");
                      pw2.println();
                    
                }
            
            
                    
        }while(!t0.getTipo().equals("PROUU"));
        
        
        fichero.close();
        fichero2.close();
        
        
    }
    
}
