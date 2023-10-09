import java.util.ArrayList;

public class Balanca_Animal extends Balanca implements setIds {
    private ArrayList<Integer> pesagem_ID = new ArrayList<Integer>();
    private Animal animal;

    public Balanca_Animal(){
        // Atributos Balanca
        setPesoInicial(0);
        setPesoFinal(0);
        setPesoTara(0);
        setPesoBruto(0);
        setPesoLiquido(0);

        // Atributos Animal
        animal.setNomeAnimal("");
        animal.setEspecieAnimal("");
        animal.setIdadeAnimal(0);
    }

    public void setId(){
        for (Integer i: pesagem_ID) {
            pesagem_ID.add(i+1);
            System.out.println("\n *** Pesagem ID: "+ i +" ***");
        }
    }
    public int calcPeso(){
        int pesoBruto = getPesoInicial() - getPesoFinal();
        if(getPesoInicial() > getPesoFinal()){
            System.out.println("\n *** Animal Emagreceu "+ pesoBruto +" ***");
        } else {
            System.out.println("\n *** Animal Engordou "+ pesoBruto +" ***");
        }
        return pesoBruto;
    }
}
