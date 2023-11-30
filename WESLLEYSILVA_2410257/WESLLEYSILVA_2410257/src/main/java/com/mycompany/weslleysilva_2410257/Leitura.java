/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.weslleysilva_2410257;

/**
 *
 * @author Família Silva
 */
//Discente: Weslley Silva - RA:2410257

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Leitura {
    public String entDados(String rotulo) {
        System.out.print(rotulo);
        String resp = "";

        InputStreamReader teclado = new InputStreamReader(System.in);
        BufferedReader buff = new BufferedReader(teclado);

        try {
            resp = buff.readLine();
        }

        catch(IOException ioe) {
            System.out.println("ERRO");
        }

        return resp;
    }
}