/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.weslleysilva_2410257;

/**
 *
 * @author Família Silva
 */

public class PesoException extends Exception {
    public PesoException(){
         super("PESO NEGATIVO");
        System.out.println("\n O peso não pode ser negativo! ");
    }
}
