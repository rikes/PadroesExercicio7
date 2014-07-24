/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifes.Model;

import br.edu.ifes.Util.NomeCidade;
import br.edu.ifes.Util.NomePosicao;
/**
 *
 * @author Henrique
 */
public class CidadeGrandeVitoria extends CidadeChain{

    @Override
    public void indicaLocalizacao() {
        
        if(comando.equals(NomePosicao.GRANDEVITORIA.toString())){
            if(cidade.contains(NomeCidade.CARIACICA.toString())){
                System.out.println("Cariacica");
            }else if(cidade.contains(NomeCidade.VITORIA.toString())){
                System.out.println("Vitória");
            }else if(cidade.contains(NomeCidade.VILAVELHA.toString())){
                System.out.println("Vila Velha");
            }else if(cidade.contains(NomeCidade.SERRA.toString())){
                System.out.println("SERRA");
            }else if(cidade.contains(NomeCidade.GUARAPARI.toString())){
                System.out.println("Guarapari");    
            }   
        }
        System.out.println("Passa o comando para o proximo da Lista");
    }

    
}
