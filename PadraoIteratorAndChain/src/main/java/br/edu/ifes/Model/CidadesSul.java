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
            if (enum1 == NomeCidade.CACHOEIROITAPEMIRIM) {
                System.out.println("CACHOEIRO DO ITAPEMIRIM");
                break;
            }else if (enum1 == NomeCidade.ALEGRE){
                System.out.println("ALEGRE!");
                break;
            }else if (enum1 == NomeCidade.VENDANOVA) {
                System.out.println("VENDA NOVA Do Imigrante");
                break;
            }else if (enum1 == NomeCidade.CASTELO) {
                System.out.println("CASTELO");
                break;
            }else if (enum1 == NomeCidade.PIUMA) {
                System.out.println("PIUMA");
                break;
            }
        }
       
    }

}
