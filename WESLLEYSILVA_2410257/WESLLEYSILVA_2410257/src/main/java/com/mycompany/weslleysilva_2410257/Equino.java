/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.weslleysilva_2410257;

/**
 *
 * @author Família Silva
 */
public class Equino extends Animal implements CalcPeso{
    private Double perimetroToracico;
    private Double alturaEquino;

    public Equino(){
        try {
            setCodAnimal(0);
            setIdadeAnimal(0);
            setDoencaAnimal(false);
            setPesoAnimal(0.0);
            // Equinos
            perimetroToracico = 0.0;

        } catch (Exception e){
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    public Double getPerimetroToracico() {
        return perimetroToracico;
    }

    public void setPerimetroToracico(Double perimetroToracico) throws AlturaException{
        if (perimetroToracico >= 0){
            this.perimetroToracico = perimetroToracico;
            return;
        }
        throw new AlturaException();
    }

    public Double getAlturaEquino() {
        return alturaEquino;
    }

    public void setAlturaEquino(Double alturaEquino) throws AlturaException{
        if( alturaEquino >= 0){
            this.alturaEquino = alturaEquino;
            return;
        }
        throw new AlturaException();
    }

    //
    public Double calcPeso(Double perimetroToracico) {
        return (Math.pow(perimetroToracico,3) * 80);
    }
}
