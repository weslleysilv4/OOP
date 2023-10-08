public class Balanca_RODO extends Balanca implements Calc{
    private int pesagemId;
    private int pesoInicial;
    private int pesoFinal;

    public int getPesoInicial() {
        return pesoInicial;
    }

    public void setPesoInicial(int pesoInicial) {
        this.pesoInicial = pesoInicial;
    }

    public int getPesoFinal() {
        return pesoFinal;
    }

    public void setPesoFinal(int pesoFinal) {
        this.pesoFinal = pesoFinal;
    }
    public Balanca_RODO(){
        // Atributos Balanca
        setPesoTara(0);
        setPesoBruto(0);
        setPesoLiquido(0);

        // Atributos Veiculo
        getVeiculo().setPesoTaraVeiculo(0);
        getVeiculo().setNomeMotorista("");
        getVeiculo().setPlacaCavalo("");

        // Atributos Balanca_RODO
        setPesoInicial(0);
        setPesoFinal(0);

        // Atributos BigBag
        getBigBag().setPesoBigBag(2);

        // Atributos Pallets
        getPallets().setPesoPallets(27);
    }
    public int calcPeso(){
        int pesoBruto = getPesoFinal() - getPesoInicial();
        return pesoBruto - getPallets().getPesoPallets() - getBigBag().getPesoBigBag();
    }

    @Override
    public int Calc() {
        int pesoCarro = getVeiculo().getPesoTaraVeiculo();
        return pesoCarro - getPesoLiquido();
    }
}
