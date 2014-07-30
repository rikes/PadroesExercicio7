package br.edu.ifes.Model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import br.edu.ifes.Util.NomePosicao;
import java.util.ArrayList;
import sun.security.provider.PolicyParser;


/**
 *
 * @author Henrique
 */
public class CidadeChain {
    
    protected CidadeChain nextPosicaoCidade;
    protected String comando,posicao;
    protected ArrayList<String> cidade;
    protected ArrayList<Enum> comandosEnum = new ArrayList<>();
    Interpretador interpretador = new Interpretador();
    
    public CidadeChain(ArrayList<Enum> arrayEnum){
        nextPosicaoCidade = null;
        this.comandosEnum = arrayEnum;
    }
    
    public void setNext(){
        interpretador.localizacao(comandosEnum);
    } 
}
