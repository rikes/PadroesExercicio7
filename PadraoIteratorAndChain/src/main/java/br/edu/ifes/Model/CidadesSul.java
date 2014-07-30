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
public class CidadesSul implements Expression{
        
    /**
     *
     * @param comandosEnum
     */
    @Override
    public void indicaLocalizacao(ArrayList<Enum> comandosEnum) {
        for (Enum enum1 : comandosEnum) {
            if (comandosEnum.contains(NomeCidade.CACHOEIROITAPEMIRIM.toString())) {
                System.out.println("CACHOEIRO DO ITAPEMIRIM");
            }else if (enum1 == NomeCidade.ALEGRE){
                System.out.println("ALEGRE!");
            }else if (comandosEnum.contains(NomeCidade.VENDANOVA.toString())) {
                System.out.println("VENDA NOVA Do Imigrante");
            }else if (comandosEnum.contains(NomeCidade.SERRA.toString())) {
                System.out.println("CASTELO");
            }else if (comandosEnum.contains(NomeCidade.PIUMA.toString())) {
                System.out.println("PIUMA");
            }
        }
       
    }

}
