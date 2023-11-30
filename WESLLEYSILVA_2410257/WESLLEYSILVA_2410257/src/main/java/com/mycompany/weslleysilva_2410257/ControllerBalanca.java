/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.weslleysilva_2410257;

/**
 *
 * @author Família Silva
 */
public class ControllerBalanca {
    private final Leitura l = new Leitura();
    private final GerAnimal gerAnimal = new GerAnimal();
    private final GerBovino gerBovino = new GerBovino();
    private final GerEquino gerEquino = new GerEquino();
    private final MenuBalanca menu = new MenuBalanca();
    public void balancaControll(){
        int op = 0;
        do {
            menu.menuOption();
            try {
                op = Integer.parseInt(l.entDados("\nEscolha uma opcao..: "));
                switch (op) {
                case 3:
                    boolean subSwitch = true;

                    int subOp = 0;

                    while(subSwitch){
                        menu.menuEspecie();
                        try {
                            subOp = Integer.parseInt(l.entDados("\nEscolha uma opcao..: "));
                        }
                        catch (NumberFormatException nfe){
                            l.entDados("\nO valor deve ser um inteiro. Press <ENTER> para continuar.");
                            continue;
                        }
                        switch (subOp){
                            case 1:
                                Bovino bov1 = new Bovino();
                                gerBovino.cadBovino(bov1);
                                break;
                            case 2:
                                Equino equi1 = new Equino();
                                gerEquino.cadEquino(equi1);
                                break;
                            case 0:
                                subSwitch = false;
                                break;
                            default:
                                System.out.println("Digite um valor entre 0 - 2");
                        }
                    }
                    break;
                case 6:
                    gerAnimal.impAllAnimal(gerBovino.getListBovino(), gerEquino.getListEquino());
                    break;
                case 7:
                    System.out.println("Em construcao, desculpa professor!");
                case 8:
                    System.out.println("Em construcao, desculpa professor!");
                }
            }
            catch (NumberFormatException nfe){
                l.entDados("\nO valor deve ser um inteiro. Press <ENTER> para continuar.");
            }
            
        } while (op != 0);
    }
}
