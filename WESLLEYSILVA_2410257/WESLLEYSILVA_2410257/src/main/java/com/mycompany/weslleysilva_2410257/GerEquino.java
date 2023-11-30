/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.weslleysilva_2410257;

/**
 *
 * @author Família Silva
 */
import java.util.ArrayList;
import java.util.List;

public class GerEquino {
    private Equino equino;
    private final List<Equino> bdEquino = new ArrayList<Equino>();
    private final Leitura l = new Leitura();
    public Equino cadEquino(Equino cavalo){
        try {
            cavalo.setCodAnimal(Integer.parseInt(l.entDados("\nCODIGO ANIMAL: ")));
            cavalo.setIdadeAnimal(Integer.parseInt(l.entDados("IDADE: ")));
            cavalo.setAlturaEquino(Double.parseDouble(l.entDados("ALTURA CAVALO: ")));
            cavalo.setPerimetroToracico(Double.parseDouble(l.entDados("PERIMETRO TORACICO: ")));
            cavalo.setPesoAnimal(cavalo.calcPeso(cavalo.getPerimetroToracico()));
            String response = l.entDados("O animal possui alguma doenca? <S/N>");
            cavalo.setDoencaAnimal(response.equalsIgnoreCase("S"));
        }  catch (Exception e){
            System.out.println("ERRO: "+ e.getMessage());
        }
        if (consEquino(cavalo) == null){
            bdEquino.add(cavalo);
            return equino;
        }
        else {
            return null;
        }
    }

    public Equino consEquino(Equino bov1) {
        for(Equino equino : bdEquino){
            if(equino.getCodAnimal() == bov1.getCodAnimal()){
                return this.equino;
            }
        }
        return null;
    }

    public List<Equino> getListEquino(){
        return bdEquino;
    }
}

