public class Pallets {
    private int pesoPallets;

    public Pallets(){
        pesoPallets = 27;
    }
    public int getPesoPallets() {
        return pesoPallets;
    }

    public void setPesoPallets(int pesoPallets) {
        this.pesoPallets = this.pesoPallets * pesoPallets;
    }
}
