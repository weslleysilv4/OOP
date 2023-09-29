public class Carga extends Veiculo implements Calc{
    private int tara;
    private int cargaMax;

    public Carga (){
        tara = 0;
        cargaMax = 0;

        setPlaca("");
        setCor("");
        setMarca("");
        setModelo("");
        setMarca("");
        setQtdRodas(8);
        setVelocMax(120);

        getMotor().setQtdPistoes(12);
        getMotor().setPotencia(300);
    }
    public int getTara() {
        return tara;
    }

    public void setTara(int tara) {
        this.tara = tara;
    }

    public int getCargaMax() {
        return cargaMax;
    }

    public void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }

    @Override
    public int calcVel() {
        return getVelocMax() * 100000;
    }

    @Override
    public int calcular() {
        return getQtdRodas() + getVelocMax() + getCargaMax() + getTara() + getMotor().getQtdPistoes() + getMotor().getPotencia();
    }
}
