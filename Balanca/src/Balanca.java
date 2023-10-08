import java.util.GregorianCalendar;

public abstract class Balanca {
    private int pesoTara;
    private int pesoBruto;
    private int pesoLiquido;
    private String dataPesagem = String.valueOf(new GregorianCalendar());
    private Veiculo veiculo = new Veiculo();
    private BigBag bigBag = new BigBag();
    private Pallets pallets = new Pallets();

    public abstract int calcPeso();

    public int getPesoTara() {
        return pesoTara;
    }

    public void setPesoTara(int pesoTara) {
        this.pesoTara = pesoTara;
    }

    public int getPesoBruto() {
        return pesoBruto;
    }

    public void setPesoBruto(int pesoBruto) {
        this.pesoBruto = pesoBruto;
    }

    public int getPesoLiquido() {
        return pesoLiquido;
    }

    public void setPesoLiquido(int pesoLiquido) {
        this.pesoLiquido = pesoLiquido;
    }

    public String getDataPesagem() {
        return dataPesagem;
    }

    public void setDataPesagem(String dataPesagem) {
        this.dataPesagem = dataPesagem;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public BigBag getBigBag() {
        return bigBag;
    }

    public void setBigBag(BigBag bigBag) {
        this.bigBag = bigBag;
    }

    public Pallets getPallets() {
        return pallets;
    }

    public void setPallets(Pallets pallets) {
        this.pallets = pallets;
    }
}
