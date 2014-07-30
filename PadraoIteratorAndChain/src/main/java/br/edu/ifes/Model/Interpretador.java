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

    public void localizacao(ArrayList<Enum> comandosEnum) {
        for (Enum comandosEnum1 : comandosEnum) {
            if (comandosEnum1 == NomePosicao.GRANDEVITORIA) {
                posicao = NomePosicao.GRANDEVITORIA.name();
                new CidadeGrandeVitoria().indicaLocalizacao(comandosEnum);
                break;
            
            }else if (comandosEnum1 == NomePosicao.OESTE) {
                posicao = NomePosicao.OESTE.name();
                new CidadeOeste().indicaLocalizacao(comandosEnum);

            } else if (comandosEnum1 == NomePosicao.OESTE) {
                posicao = NomePosicao.NORTE.name();
                new CidadeNorte().indicaLocalizacao(comandosEnum);

            } else if (comandosEnum1 == NomePosicao.SUL) {
                posicao = NomePosicao.SUL.name();
                new CidadesSul().indicaLocalizacao(comandosEnum);
            }
            System.out.println("Enum"+comandosEnum1.name());    
        }
    }

    public String getComando() {
        return this.posicao;
    }
    
}
