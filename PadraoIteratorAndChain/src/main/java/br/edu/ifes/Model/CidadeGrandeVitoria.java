/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifes.Model;

import br.edu.ifes.Util.NomeCidade;
import java.util.ArrayList;
/**
 *
 * @author Henrique
 */
public class CidadeGrandeVitoria implements Expression{

    @Override
    public void indicaLocalizacao(ArrayList<Enum> comandosEnum) {
        for (Enum enum1 : comandosEnum) {
            if(enum1 == NomeCidade.CARIACICA){
                System.out.println("Cariacica");
                break;
            }else if(enum1 == NomeCidade.VITORIA){
                System.out.println("Vitória");
                break;
            }else if(enum1 == NomeCidade.VILAVELHA){
                System.out.println("Vila Velha");
                break;
            }else if(enum1 == NomeCidade.SERRA){
                System.out.println("SERRA");
                break;
            }else if(enum1 == NomeCidade.GUARAPARI){
                System.out.println("Guarapari");    
                break;
            }
        }
    }    

    
}
