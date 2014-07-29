/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifes.Model;

import java.util.ArrayList;

/**
 *
 * @author Henrique
 */
public class Interpretador {
    ArrayList<Enum> arrayEnum = new ArrayList<>();
    ArrayList <String> cidades = new ArrayList<>();
    String comando;
    
    
    
    public Interpretador(ArrayList<Enum> arrayEnum){
        this.arrayEnum = arrayEnum;
        int i = arrayEnum.size() - 1 ;
        this.comando = arrayEnum.get(i).toString();
        
        for (int j=0; j <= i; j++){
            cidades.add(arrayEnum.get(j).toString());
        }
    }
    /*Fazer um for que varra os camandos passados,
    deve primeiramente verificar qual a direção o mesmo deseja.
    Após isso percorrer as cidades, ao percorrer as cidades, verificar
    qual região é esta cidade e retornar o nome dela.
    */
    
    
    public ArrayList getCidade() {
        return this.cidades;
    }

    public String getComando() {
        return this.comando;
    }
    
}
