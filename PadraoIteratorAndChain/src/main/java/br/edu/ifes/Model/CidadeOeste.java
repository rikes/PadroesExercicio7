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
        for (Enum enum1 : comandosEnum) {
            if (enum1 == NomeCidade.BAIXOGUANDO) {
                System.out.println("BAIXO GUANDO");
                break;
            } else if (enum1 == NomeCidade.COLATINA) {
                System.out.println("Colatina");
                break;
            }
        }
    }

}
