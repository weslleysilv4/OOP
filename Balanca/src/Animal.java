public class Animal {
    private String nomeAnimal;
    private String especieAnimal;
    int idadeAnimal;

    public Animal() {
        setNomeAnimal("");
        setEspecieAnimal("");
        setIdadeAnimal(0);
    }

    //Getters and setters
    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    public String getEspecieAnimal() {
        return especieAnimal;
    }

    public void setEspecieAnimal(String especieAnimal) {
        this.especieAnimal = especieAnimal;
    }

    public int getIdadeAnimal() {
        return idadeAnimal;
    }

    public void setIdadeAnimal(int idadeAnimal) {
        this.idadeAnimal = idadeAnimal;
    }
}
