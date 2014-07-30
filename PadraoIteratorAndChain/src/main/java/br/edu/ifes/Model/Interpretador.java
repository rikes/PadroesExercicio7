/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifes.Model;

import br.edu.ifes.Util.NomePosicao;
import java.util.ArrayList;

/**
 *
 * @author Henrique
 */
public class Interpretador {
    //ArrayList<Enum> arrayEnum = new ArrayList<>();
    //ArrayList <String> cidades = new ArrayList<>();
    String comando,posicao;
    ArrayList<Enum> backup;

    public Expression localizacao(ArrayList<Enum> comandosEnum) {
        backup = comandosEnum;
        for (Enum comandosEnum1 : comandosEnum) {
            if (comandosEnum1 == NomePosicao.GRANDEVITORIA) {
                posicao = NomePosicao.GRANDEVITORIA.name();
                //comandosEnum.remove(this);
                return new CidadeGrandeVitoria();
            }else if (comandosEnum1 == NomePosicao.OESTE) {
                posicao = NomePosicao.OESTE.name();
                //comandosEnum.remove(this);
                return new CidadeOeste();
            } else if (comandosEnum1 == NomePosicao.NORTE) {
                posicao = NomePosicao.NORTE.name();
                //comandosEnum.remove(this);
                return new CidadeNorte();
            } else if (comandosEnum1 == NomePosicao.SUL) {
                posicao = NomePosicao.SUL.name();
                //comandosEnum.remove(this);
                return new CidadesSul();
            }
            //System.out.println("Enum"+comandosEnum1.name());    
        }

        return null;
    }

    public ArrayList getComando() {
        
        return this.backup;
    }
    
}
