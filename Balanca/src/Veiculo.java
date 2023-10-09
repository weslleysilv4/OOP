//Discente: Weslley Silva - RA:2410257
public class Veiculo {
    private String placaCavalo;
    private String nomeTransportadora;
    private String nomeMotorista;

    public Veiculo(){
        placaCavalo = "";
        nomeTransportadora = "";
        nomeMotorista = "";
    }
    public String getPlacaCavalo() {
        return placaCavalo;
    }
    public void setPlacaCavalo(String placaCavalo) {
        this.placaCavalo = placaCavalo;
    }

    public String getNomeTransportadora() {
        return nomeTransportadora;
    }

    public void setNomeTransportadora(String nomeTransportadora) {
        this.nomeTransportadora = nomeTransportadora;
    }

    public String getNomeMotorista() {
        return nomeMotorista;
    }

    public void setNomeMotorista(String nomeMotorista) {
        this.nomeMotorista = nomeMotorista;
    }
}
