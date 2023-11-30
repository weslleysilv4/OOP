/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.weslleysilva_2410257;

/**
 *
 * @author Família Silva
 */
//Discente: Weslley Silva - RA:2410257
public abstract class Animal {
    private int codAnimal;
    private int idadeAnimal;
    private Double pesoAnimal;
    private Boolean doencaAnimal;

    //Getters and setters

    public int getCodAnimal() {
        return codAnimal;
    }

    public void setCodAnimal(int codAnimal) {
        this.codAnimal = codAnimal;
    }

    public int getIdadeAnimal() {
        return idadeAnimal;
    }

    public void setIdadeAnimal(int idadeAnimal) {
        this.idadeAnimal = idadeAnimal;
    }

    public Double getPesoAnimal() {
        return pesoAnimal;
    }

    public void setPesoAnimal(Double pesoAnimal) throws PesoException {
        if(pesoAnimal >= 0){
            this.pesoAnimal = pesoAnimal;
            return;
        }
        throw new PesoException();
    }

    public Boolean getDoencaAnimal() {
        return doencaAnimal;
    }

    public void setDoencaAnimal(Boolean doencaAnimal) {
        this.doencaAnimal = doencaAnimal;
    }

}
