import java.util.Calendar;
import java.util.GregorianCalendar;

public abstract class Balanca {
    private int pesoInicial;
    private int pesoFinal;
    private int pesoTara;
    private int pesoBruto;
    private int pesoLiquido;
    private String dataPesagem;
    private Calendar calendario = new GregorianCalendar();

    //Abstract methodd
    public abstract int calcPeso();

    //Getters and Setters
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

    public void setDataPesagem() {
        dataPesagem = calendario.get(Calendar.DAY_OF_MONTH) +
                "/" + calendario.get(Calendar.MONTH) +
                "/" + calendario.get(Calendar.YEAR);
    }
}

