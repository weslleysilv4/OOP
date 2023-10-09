// Discente: Weslley Silva - RA: A2410257
public class TstBalanca {
    private static Leitura l = new Leitura();
    private static final Menu menu = new Menu();
    private static Balanca_RODO b1 = new Balanca_RODO();
//    private static Balanca_Animal b2 = new Balanca_Animal();
    public static void main(String[] args) {
        int mainMenuDecision = 0;
        do {
            menu.mostrarMenu();
            mainMenuDecision = Integer.parseInt(l.entDados("Escolha uma opcao..:\n"));
            mainMenu(mainMenuDecision);
        } while(mainMenuDecision != 0);
    }

    public static void mainMenu(int mainMenuDecision) {
        int subMenuDecision = 0;
        do {
            switch (mainMenuDecision) {
                case 1:
                    System.out.println("\n *** Cadastrar Pesagem ***");
                    b1.setId();
                    b1.getVeiculo().setNomeMotorista(l.entDados("\nDigite o Nome do Motorista..: "));
                    b1.getVeiculo().setPlacaCavalo(l.entDados("\nDigite a Placa do Cavalo..: "));
                    int responseP = Integer.parseInt(l.entDados("\nDigite quantos Pallets a Carga possui Pallets" +
                            " Caso não saiba, Digite 0..:\n"));
                    if (responseP > 0){
                        b1.getPallets().setPesoPallets(responseP);
                    }
                    int responseB = Integer.parseInt(l.entDados("\nDigite quantos Pallets a Carga possui BigBags?\n" +
                            "Caso não saiba, Digite 0..:\n"));
                    if (responseB > 0){
                        b1.getBigBag().setPesoBigBag(responseB);
                    }
                    b1.setPesoInicial(Integer.parseInt(l.entDados("\nDigite o Peso Inicial..: ")));
                    b1.setPesoFinal(Integer.parseInt(l.entDados("\nDigite o Peso Final..:")));
                    b1.setDataPesagem();
                    System.out.println("Obrigado!");
                    break;
                case 2:


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