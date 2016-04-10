/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lprog;

/**
 *
 * @author francescroy
 */
public class Sintactico {
    
    private Lexicografico lex;
    
    public Sintactico(Lexicografico l){
        this.lex = l;
    }
    
    private void Tipus() throws Exception{
        if(lex.dameToken().getTipo().equals("tipus_simple")){
            Aceptar("tipus_simple");
        }else if(lex.dameToken().getTipo().equals("vector")){
            Aceptar("vector");
            Aceptar("[");
            Exp();
            Aceptar("..");
            Exp();
            Aceptar("]");
            Aceptar("de");
            Aceptar("tipus_simple");
        }else{
            Aceptar("error");
        }
    }
    
    private void Llista_var_prima() throws Exception{
        if(lex.dameToken().getTipo().equals(",")){
            Aceptar(",");
            Llista_var();
        }
    }
    private void Llista_var() throws Exception{
        Variable();
        Llista_var_prima();
    }
    
    private void Si_2() throws Exception{
        if(lex.dameToken().getTipo().equals("sino")){
            Aceptar("sino");
            Llista_inst();
        }
    }
    
    private void Inst_prima() throws Exception{
        if(lex.dameToken().getTipo().equals("(")){
            Aceptar("(");
            Exp();
            Aceptar(")");
            Aceptar("?");
            Exp();
            Aceptar(":");
            Exp();
        }else if(lex.dameToken().getTipo().equals("+") || lex.dameToken().getTipo().equals("-")
                 || lex.dameToken().getTipo().equals("not") || lex.dameToken().getTipo().equals("cte_entera")
                || lex.dameToken().getTipo().equals("cte_logica") || lex.dameToken().getTipo().equals("cte_cadena")
                || lex.dameToken().getTipo().equals("(") || lex.dameToken().getTipo().equals("id")){
            Exp();
        }else{
            Aceptar("error");
        }
    }
    
    
    private void Inst() throws Exception{
        if(lex.dameToken().getTipo().equals("escriure")){
            Aceptar("escriure");
            Aceptar("(");
            Llista_exp_2();
            Aceptar(")");
        }else if(lex.dameToken().getTipo().equals("llegir")){
           Aceptar("llegir");
           Aceptar("(");
           Llista_var();
           Aceptar(")");
        }else if(lex.dameToken().getTipo().equals("cicle")){
            Aceptar("cicle");
            Llista_inst();
            Aceptar("fins");
            Exp();
        }else if(lex.dameToken().getTipo().equals("mentre")){
            Aceptar("mentre");
            Exp();
            Aceptar("fer");
            Llista_inst();
            Aceptar("fimentre");
        }else if(lex.dameToken().getTipo().equals("si")){
            Aceptar("si");
            Exp();
            Aceptar("llavors");
            Llista_inst();
            Si_2();
            Aceptar("fisi");
        }else if(lex.dameToken().getTipo().equals("retornar")){
            Aceptar("retornar");
            Exp();
        }else if(lex.dameToken().getTipo().equals("percada")){
            Aceptar("percada");
            Aceptar("id");
            Aceptar("en");
            Aceptar("id");
            Aceptar("fer");
            Llista_inst();
            Aceptar("fiper");
        }else if(lex.dameToken().getTipo().equals("id")){
            Variable();
            Aceptar("=");
            Inst_prima();
        }else{
            Aceptar("error");
        }
    }
    
    private void Llista_inst_2_prima() throws Exception{
        if(lex.dameToken().getTipo().equals("escriure") || lex.dameToken().getTipo().equals("llegir") 
           || lex.dameToken().getTipo().equals("cicle") || lex.dameToken().getTipo().equals("mentre")
           || lex.dameToken().getTipo().equals("si") || lex.dameToken().getTipo().equals("retornar")
           || lex.dameToken().getTipo().equals("percada") || lex.dameToken().getTipo().equals("id")){
           Llista_inst_2();
        }
    }
    private void Llista_inst_2() throws Exception{
        Inst();
        Aceptar(";");
        Llista_inst_2_prima(); 
    }
    
    private void Llista_inst() throws Exception{
        Llista_inst_2();
    }
    
    private void Llista_exp_2_prima() throws Exception{
        if(lex.dameToken().getTipo().equals(",")){
            Aceptar(",");
            Llista_exp_2();
        }
    }
    
    private void Llista_exp_2() throws Exception{
        Exp();
        Llista_exp_2_prima();
    }
    private void Llista_exp() throws Exception{
        Llista_exp_2();
    }
    
    private void Terme_2() throws Exception{
        if(lex.dameToken().getTipo().equals("*")){
            Aceptar("*");
            Factor();
            Terme_2();
        }else if(lex.dameToken().getTipo().equals("/")){
            Aceptar("/");
            Factor();
            Terme_2();
        }else if(lex.dameToken().getTipo().equals("and")){
            Aceptar("and");
            Factor();
            Terme_2();
        }
    }
    
    private void Terme() throws Exception{
        Factor();
        Terme_2();
    }
    
    private void Exp_simple_2() throws Exception{
        if(lex.dameToken().getTipo().equals("+")){
            Aceptar("+");
            Terme();
            Exp_simple_2();
        }else if(lex.dameToken().getTipo().equals("-")){
            Aceptar("-");
            Terme();
            Exp_simple_2();
        }else if(lex.dameToken().getTipo().equals("or")){
            Aceptar("or");
            Terme();
            Exp_simple_2();
        }
    }
    
    
    private void Exp_simple() throws Exception{
        if(lex.dameToken().getTipo().equals("+")){
            Aceptar("+");
            Terme();
            Exp_simple_2();    
        }else if(lex.dameToken().getTipo().equals("-")){
            Aceptar("-");
            Terme();
            Exp_simple_2();
        }else if(lex.dameToken().getTipo().equals("not")){
            Aceptar("not");
            Terme();
            Exp_simple_2();
        }else{
            Terme();
            Exp_simple_2();
        }
        
        
    }
    
    private void Exp_prima() throws Exception{
        if(lex.dameToken().getTipo().equals("oper_rel")){
            Aceptar("oper_rel");
            Exp_simple();
        }
    }
    
    
    private void Exp() throws Exception{
        Exp_simple();
        Exp_prima();
    }
    
    
    private void Variable_prima() throws Exception{
        if(lex.dameToken().getTipo().equals("[")){
            Aceptar("[");
            Exp();
            Aceptar("]");
        }
    }
    private void Variable() throws Exception{
            Aceptar("id");
            Variable_prima();
        
    }
    private void Factor_prima() throws Exception{
        if(lex.dameToken().getTipo().equals("(")){
            Aceptar("(");
            Llista_exp();
            Aceptar(")");
        }else{
            Variable_prima();
        }
    }
    
    private void Factor() throws Exception{
        if(lex.dameToken().getTipo().equals("cte_entera")){
            Aceptar("cte_entera");
        }else if(lex.dameToken().getTipo().equals("cte_logica")){
            Aceptar("cte_logica");
        
        }else if(lex.dameToken().getTipo().equals("cte_cadena")){
            Aceptar("cte_cadena");
        
        }else if(lex.dameToken().getTipo().equals("id")){
            Aceptar("id");
            Factor_prima();
        }else if(lex.dameToken().getTipo().equals("(")){
            Aceptar("(");
            Exp();
            Aceptar(")");
        }else{
            Aceptar("error");
        }
    }
    
    
    private void Aceptar(String t) throws Exception{
        if(lex.dameToken().getTipo().equals(t)){
            lex.dameToken();
            lex.haciaAdelante();
        }else{
            
            throw new Exception();
        }
    }
}
