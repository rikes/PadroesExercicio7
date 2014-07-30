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
public class CidadeOeste implements Expression{
        
    @Override
    public void indicaLocalizacao(ArrayList<Enum> comandosEnum) {

        if (comandosEnum.contains(NomeCidade.BAIXOGUANDO.toString())) {
            System.out.println("BAIXO GUANDO");
        } else if (comandosEnum.contains(NomeCidade.COLATINA.toString())) {
            System.out.println("Colatina");
        }
    }

}
