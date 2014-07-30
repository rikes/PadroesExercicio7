/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifes.Model;

import br.edu.ifes.Util.NomeCidade;
import java.util.ArrayList;

/**
 *
 * @author Henrique
 */
public class CidadeNorte implements Expression{
        
    
    @Override
    public void indicaLocalizacao(ArrayList<Enum> comandosEnum) {
        for (Enum enum1 : comandosEnum) {
            if(enum1 == NomeCidade.LINHARES){
                System.out.println("Linhares");
                break;
            }else if(enum1 == NomeCidade.PEDROCANARIO){
                System.out.println("PEDRO CANARIO");
                break;
            }    
        }    
    }
    
}
