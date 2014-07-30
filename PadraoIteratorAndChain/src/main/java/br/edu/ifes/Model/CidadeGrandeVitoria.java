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
public class CidadeGrandeVitoria{

    public void indicaLocalizacao(ArrayList<Enum> comandosEnum) {

            if(comandosEnum.contains(NomeCidade.CARIACICA.toString())){
                System.out.println("Cariacica");
            }else if(comandosEnum.contains(NomeCidade.VITORIA.toString())){
                System.out.println("Vitória");
            }else if(comandosEnum.contains(NomeCidade.VILAVELHA.toString())){
                System.out.println("Vila Velha");
            }else if(comandosEnum.contains(NomeCidade.SERRA.toString())){
                System.out.println("SERRA");
            }else if(comandosEnum.contains(NomeCidade.GUARAPARI.toString())){
                System.out.println("Guarapari");    
            }
    }

    
}
