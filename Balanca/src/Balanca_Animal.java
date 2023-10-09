//Discente: Weslley Silva - RA:2410257

public class Balanca_Animal extends Balanca implements setIds {
    private static int nextPesagemID = 1; // Variável estática para gerar IDs únicos
    private int pesagemID; // ID da pesagem atual
    private Animal animal = new Animal();

    public Balanca_Animal(){
        // Atributos Balanca
        setPesoInicial(0);
        setPesoFinal(0);
        setPesoLiquido(0);

        // Atributos Animal
        animal.setNomeAnimal("");
        animal.setEspecieAnimal("");
        animal.setIdadeAnimal(0);

        pesagemID = 0;
    }
    public Animal getAnimal(){
        return animal;
    }
    public void setId(){
        pesagemID = nextPesagemID++;
    }
    public int getPesagemID(){
        return pesagemID;
    }
    public int calcPeso() {
        int pesoLiquido;
        if (getPesoInicial() > getPesoFinal()) {
            System.out.println("\n *** Ocorreu Emagrecimento do Animal ***");
            pesoLiquido = (getPesoInicial() - getPesoFinal());
        } else {
            System.out.println("\n *** Ocorreu Enrgoda no Animal ***");
            pesoLiquido = (getPesoFinal() - getPesoInicial());
        }
        return pesoLiquido;
    }
}
