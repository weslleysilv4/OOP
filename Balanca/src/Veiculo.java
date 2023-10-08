public class Veiculo {
    private String placaCavalo;
    private int pesoTaraVeiculo;
    private String nomeMotorista;

    public Veiculo(){
        placaCavalo = "";
        pesoTaraVeiculo = 0;
        nomeMotorista = "";
    }
    public String getPlacaCavalo() {
        return placaCavalo;
    }
    public void setPlacaCavalo(String placaCavalo) {
        this.placaCavalo = placaCavalo;
    }

    public int getPesoTaraVeiculo() {
        return pesoTaraVeiculo;
    }

    public void setPesoTaraVeiculo(int pesoTaraVeiculo) {
        this.pesoTaraVeiculo = pesoTaraVeiculo;
    }

    public String getNomeMotorista() {
        return nomeMotorista;
    }

    public void setNomeMotorista(String nomeMotorista) {
        this.nomeMotorista = nomeMotorista;
    }
}
