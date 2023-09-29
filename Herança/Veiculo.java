import java.util.Calendar;
import java.util.GregorianCalendar;
public abstract class Veiculo {
    private String placa;
    private String marca;
    private String modelo;
    private String cor;
    private int qtdRodas;
    private int velocMax;

    private Motor motor = new Motor();
    private String dataCadastro;
    private Calendar calendario = new GregorianCalendar();


    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getQtdRodas() {
        return qtdRodas;
    }

    public void setQtdRodas(int qtdRodas) {
        this.qtdRodas = qtdRodas;
    }

    public int getVelocMax() {
        return velocMax;
    }

    public void setVelocMax(int velocMax) {
        this.velocMax = velocMax;
        if (velocMax < 10 || velocMax > 250) {
            System.out.println("\nVelocidade fora dos limites brasileiros!");
            setVelocMax(100);
            return;
        }
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro() {
        this.dataCadastro = calendario.get(Calendar.DAY_OF_MONTH) + "/" +
                            calendario.get(Calendar.MONTH) + "/" +
                            calendario.get(Calendar.YEAR);
    }

    public abstract int calcVel();
}
