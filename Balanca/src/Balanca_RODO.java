//Discente: Weslley Silva - RA:2410257
public class Balanca_RODO extends Balanca implements setIds {
    private static int nextPesagemID = 1; // Variável estática para gerar IDs únicos
    private int pesagemID; // ID da pesagem atual
    private final Veiculo veiculo = new Veiculo();
    private final BigBag bigBag = new BigBag();
    private final Pallets pallets = new Pallets();

    public Balanca_RODO() {
        // Atributos Balanca
        setPesoInicial(0);
        setPesoFinal(0);
        setPesoLiquido(0);

        // Atributos Veiculo
        veiculo.setNomeMotorista("");
        veiculo.setNomeTransportadora("");
        veiculo.setPlacaCavalo("");

        // Define o ID da pesagem atual
        pesagemID = 0;
    }

    public void setId(){
        pesagemID = nextPesagemID++;
    }
    public Veiculo getVeiculo() {
        return veiculo;
    }

    public BigBag getBigBag() {
        return bigBag;
    }

    public Pallets getPallets() {
        return pallets;
    }

    public int calcPeso() {
        int pesoLiquido;
        if (getPesoInicial() > getPesoFinal()) {
            System.out.println("\n *** Operacao de Descarregamento ***");
            pesoLiquido = (getPesoInicial() - getPesoFinal()) - pallets.getPesoPallets() - bigBag.getPesoBigBag();
        } else {
            System.out.println("\n *** Operacao de Carregamento ***");
            pesoLiquido = (getPesoFinal() - getPesoInicial()) - pallets.getPesoPallets() - bigBag.getPesoBigBag();
        }
        return pesoLiquido;
    }

    public int getPesagemID() {
        return pesagemID;
    }
}

