/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifes.App;

import br.edu.ifes.Model.CidadeChain;
import br.edu.ifes.Model.Interpretador;
import br.edu.ifes.Util.NomeCidade;
import br.edu.ifes.Util.NomePosicao;
import java.util.ArrayList;

/**
 *
 * @author Henrique
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Enum> list = new ArrayList<>();
        list.add(NomeCidade.ALEGRE);
        list.add(NomeCidade.VITORIA);
        list.add(NomeCidade.VENDANOVA);
        list.add(NomePosicao.GRANDEVITORIA);
        CidadeChain navegarCidade = new CidadeChain(list);
        navegarCidade.setNext();
    }
    
}
