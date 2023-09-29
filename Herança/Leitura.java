// Aluno: Weslley Silva - RA:2410257
// Leitura
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Leitura{

    public String entDados(String label){

        System.out.println(label);
        String resp = "";

        InputStreamReader teclado = new InputStreamReader(System.in);
        BufferedReader buff = new BufferedReader(teclado);

        try {
            resp = buff.readLine();
        } catch(IOException ioe) {
            System.out.println("ERRO");
        }
        return resp;
    }
}