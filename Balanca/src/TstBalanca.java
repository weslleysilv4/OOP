// Discente: Weslley Silva - RA: A2410257
public class TstBalanca {
  public static void main(String[] args){
      Leitura l = new Leitura();
      Balanca_RODO b1 = new Balanca_RODO();

      System.out.println("\n--- Sistema Balanca Rodoviaria ---");
      //Inputs
      b1.veiculo.setPlacaCavalo(l.entDados("\nQual a Placa do Cavalo..: "));
      b1.setPesoInicial(Integer.parseInt(l.entDados("\nQual o Peso Inicial..: ")));
      b1.setPesoFinal(Integer.parseInt(l.entDados("\nQual o Peso Final..: ")));

      //Outputs

  }
}