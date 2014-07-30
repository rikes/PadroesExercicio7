/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifes.Model;

import br.edu.ifes.Util.NomeCidade;
import br.edu.ifes.Util.NomePosicao;
import java.util.ArrayList;

/**
 *
 * @author Henrique
 */
public class CidadeNorte {
        
    
    public void indicaLocalizacao(ArrayList<Enum> comandosEnum) {
            if(comandosEnum.contains(NomeCidade.LINHARES.toString())){
                System.out.println("Linhares");
            }else if(comandosEnum.contains(NomeCidade.PEDROCANARIO.toString())){
                System.out.println("PEDRO CANARIO");
            }else if(comandosEnum.contains(NomeCidade.SERRA.toString())){
                System.out.println("SERRA");
            }    
    }
    
}
