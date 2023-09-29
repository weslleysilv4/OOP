public class Passeio extends Veiculo implements Calc{
    private int qtdePassageiros;
    //Construct
    public Passeio(){
        qtdePassageiros= 0;
        setMarca("");
        setModelo("");
        setCor("");
        setPlaca("");
        setQtdRodas(4);
        setVelocMax(100);

        getMotor().setPotencia(200);
        getMotor().setQtdPistoes(4);
    }
    public int getQtdePassageiros() {
        return qtdePassageiros;
    }

    public void setQtdePassageiros(int qtdePassageiros) {
        this.qtdePassageiros = qtdePassageiros;
    }

    @Override
    public int calcVel() {
        return getVelocMax() * 1000;
    }

    @Override
    public int calcular() {
        String letras = getMarca() + getModelo() + getCor() + getPlaca();
        return letras.replaceAll("\\s", "").length();
    }
}
