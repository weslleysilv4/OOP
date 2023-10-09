//Discente: Weslley Silva - RA:2410257
public class TstBalanca {
    private static Leitura l = new Leitura();
    private static final Menu menu = new Menu();
    private static final Balanca_RODO b1 = new Balanca_RODO();
    private static final Balanca_Animal b2 = new Balanca_Animal();

    public static void main(String[] args) {
        int mainMenuDecision = 0;
        do {
            menu.mostrarMenu();
            mainMenuDecision = Integer.parseInt(l.entDados("Escolha uma opcao..:\n"));
            mainMenu(mainMenuDecision);
        } while (mainMenuDecision != 0);
    }

    public static void mainMenu(int mainMenuDecision) {
        int subMenuDecision = 0;
        do {
            switch (mainMenuDecision) {
                case 1:
                    System.out.println("\n *** Cadastrar Pesagem ***");
                    System.out.println("Escolha qual Balança deseja\n");
                    int decisionUper = Integer.parseInt(l.entDados("1 - Balança Rodoviario \n2 - Balanca Animal\n"));
                    switch (decisionUper) {
                        case 1:
                            System.out.println("\nSistema Balanca Rodoviaria");
                            b1.setId();
                            b1.getVeiculo().setNomeMotorista(l.entDados("\nDigite o Nome do Motorista..: "));
                            b1.getVeiculo().setPlacaCavalo(l.entDados("\nDigite a Placa do Cavalo..: "));
                            b1.getVeiculo().setNomeTransportadora(l.entDados("\nDigite o Nome da Transportadoar..: "));
                            int responseP = Integer.parseInt(l.entDados("\nDigite quantos Pallets a carga possui?" +
                                    " Caso não saiba, Digite 0..:\n"));
                            if (responseP > 0) {
                                b1.getPallets().setPesoPallets(responseP);
                            }
                            int responseB = Integer.parseInt(l.entDados("\nDigite quantos BigBags a Carga possui?\n" +
                                    "Caso não saiba, Digite 0..:\n"));
                            if (responseB > 0) {
                                b1.getBigBag().setPesoBigBag(responseB);
                            }
                            b1.setPesoInicial(Integer.parseInt(l.entDados("\nDigite o Peso Inicial..: ")));
                            b1.setPesoFinal(Integer.parseInt(l.entDados("\nDigite o Peso Final..:")));
                            b1.setDataPesagem();
                            System.out.println("Obrigado!");
                            break;
                        case 2:
                            System.out.println("\nSistema Balanca Animal");
                            b2.setId();
                            b2.getAnimal().setNomeAnimal(l.entDados("\nDigite a identificacao do Animal..: "));
                            b2.getAnimal().setEspecieAnimal(l.entDados("\nDigite a Especie do Animal..: "));
                            b2.getAnimal().setIdadeAnimal(Integer.parseInt(l.entDados("\nDigite a Idade do Animal..:")));
                            b2.setPesoInicial(Integer.parseInt(l.entDados("\nPeso Inicial..: ")));
                            b2.setPesoFinal(Integer.parseInt(l.entDados("\nPeso Final..: ")));
                            b2.setDataPesagem();
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("Opcao Invalida");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("\n *** Consultar Pesagens Pesagem ***");
                    int decisionLower = Integer.parseInt(l.entDados("\n1 - Balanca Rodoviaria \n2 - Balanca Animal\n"));
                    switch(decisionLower) {
                        case 1:
                            System.out.println("\nConsulta Balança Rodoviaria");
                            System.out.println("\nID Pesagem..: " + b1.getPesagemID());
                            System.out.println("\nData de Pesagem..: " + b1.getDataPesagem());
                            System.out.println("\nNome Motorista..: " +b1.getVeiculo().getNomeMotorista());
                            System.out.println("\nNome Transportadora..: " +b1.getVeiculo().getNomeTransportadora());
                            System.out.println("\nPlaca Cavalo..: " +b1.getVeiculo().getPlacaCavalo());
                            System.out.println("\nPeso Inicial..: " + b1.getPesoInicial());
                            System.out.println("\nPeso Final..: " + b1.getPesoFinal());
                            System.out.println("\nPeso Liquido..: " + b1.calcPeso());
                            System.out.println("\nQtde Pallets..: " + (b1.getPallets().getPesoPallets() / 27));
                            System.out.println("\nQtde BigBags..: " + (b1.getBigBag().getPesoBigBag() / 2));

                            break;
                        case 2:
                            System.out.println("\nConsulta Balança Animal");
                            System.out.println("\nID Pesagem..:  " + b2.getPesagemID());
                            System.out.println("\nData de Pesagem..: " + b2.getDataPesagem());
                            System.out.println("\nId do Animal..: " + b2.getAnimal().getNomeAnimal());
                            System.out.println("\nEspecie do Animal..: " + b2.getAnimal().getEspecieAnimal());
                            System.out.println("\nIdade do Animal..: " + b2.getAnimal().getIdadeAnimal());
                            System.out.println("\nPeso Inicial..: " + b2.getPesoInicial());
                            System.out.println("\nPeso Final..: " + b2.getPesoFinal());
                            System.out.println("\nPeso Liquido..: " + b2.calcPeso());
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("ERRO");
                    break;
            }
        } while (subMenuDecision != 0);
    }
}
