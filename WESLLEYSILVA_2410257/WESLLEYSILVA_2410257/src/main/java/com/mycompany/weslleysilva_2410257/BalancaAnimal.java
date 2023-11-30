/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.weslleysilva_2410257;

/**
 *
 * @author Família Silva
 */
//Discente: Weslley Silva - RA:2410257

public class BalancaAnimal extends Balanca{
    private Bovino bovino = new Bovino();
    private Equino equino = new Equino();

    public Bovino getBovino(){
        return bovino;
    }
    public Equino getEquino(){
        return equino;
    }

}
