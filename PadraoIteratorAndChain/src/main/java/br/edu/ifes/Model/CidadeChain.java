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
    protected String comando,posicao;
    protected ArrayList<String> cidade;
    protected ArrayList<Enum> comandosEnum,AuxEnum;
    Interpretador interpretador = new Interpretador();
    protected Expression exp;
    
    public CidadeChain(ArrayList<Enum> arrayEnum){
        nextPosicaoCidade = null;
        this.comandosEnum = arrayEnum;
    }
    
    public void setNext(){
        exp = interpretador.localizacao(comandosEnum);
        this.AuxEnum = interpretador.getComando();
        for (Enum enum1 : AuxEnum) {
            System.out.println("Nome Cidades+ "+ enum1.name());
        }
        exp.indicaLocalizacao(AuxEnum);
        
    } 
}
