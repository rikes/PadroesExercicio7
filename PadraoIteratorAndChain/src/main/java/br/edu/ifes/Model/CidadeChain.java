package br.edu.ifes.Model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.util.ArrayList;


/**
 *
 * @author Henrique
 */
public class CidadeChain {
    
    protected CidadeChain nextPosicaoCidade;
    protected String comando;
    protected ArrayList<String> cidade;
    protected ArrayList<Enum> comandosEnum = new ArrayList<>();
    
    /*public CidadeChain(ArrayList<Enum> arrayEnum){
        Interpretador interpretador = new Interpretador(arrayEnum);
        this.cidade = interpretador.getCidade();
        this.comando = interpretador.getComando();   
        nextPosicaoCidade = null;
        this.arrayEnum = arrayEnum;
    }
*/    
    /*public void setNext(CidadeChain localiza){
        if(nextPosicaoCidade == null){
            nextPosicaoCidade = localiza;
        }else{
            nextPosicaoCidade.setNext(localiza);
        }
    }
*/   
    public void setNext(ArrayList<Enum> comandoEnum){
        Interpretador interpretador = new Interpretador(comandosEnum);
        this.cidade = interpretador.getCidade();
        this.comando = interpretador.getComando();   
        nextPosicaoCidade = null;
        this.comandosEnum = comandoEnum;
        
    }
    public void indicaLocalizacao() {
        
    } 
}
