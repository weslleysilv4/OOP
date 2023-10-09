import java.util.ArrayList;

public class Balanca_RODO extends Balanca implements setIds{
    private ArrayList<Integer> pesagem_ID = new ArrayList<Integer>();
    private Veiculo veiculo = new Veiculo();
    private  BigBag bigBag = new BigBag();
    private  Pallets pallets = new Pallets();
    public Balanca_RODO(){
        // Atributos Balanca
        setPesoInicial(0);
        setPesoFinal(0);
        setPesoTara(0);
        setPesoBruto(0);
        setPesoLiquido(0);

        // Atributos Veiculo
        veiculo.setPesoTaraVeiculo(0);
        veiculo.setNomeMotorista("");
        veiculo.setPlacaCavalo("");

        // Atributos BigBag
        bigBag.setPesoBigBag(2);

        // Atributos Pallets
        pallets.setPesoPallets(27);
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

    public int calcPeso(){
        int pesoBruto = getPesoInicial() - getPesoFinal();
        if(getPesoInicial() > getPesoFinal()){
            System.out.println("\n *** Operacao de Descarregamento ***");
        } else {
            System.out.println("\n *** Operacao de Carregamento ***");
        }
        return pesoBruto - pallets.getPesoPallets() - bigBag.getPesoBigBag();
    }
    public void setId(){
        for (Integer i: pesagem_ID) {
            pesagem_ID.add(i+1);
            System.out.println("\n *** Pesagem ID: "+ i +" ***");
        }
    }
}
