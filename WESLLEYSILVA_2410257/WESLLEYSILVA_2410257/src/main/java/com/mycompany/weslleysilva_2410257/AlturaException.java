/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.weslleysilva_2410257;

/**
 *
 * @author Família Silva
 */
public class AlturaException extends Exception{
    public AlturaException(){
        super("ALTURA NEGATIVA");
        System.out.println("\nA Altura não pode ser Negativa, Ze");
    }
}
