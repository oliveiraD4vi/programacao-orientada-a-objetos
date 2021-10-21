/**
 * @author Davi Silva Alves de Oliveira
 */

package Lista2.Q2.Modelo3;
import java.util.Locale;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner input = new Scanner(System.in);

    Linha linha = new Linha();

    linha.inicializaDados(0, 5, 0, 5);
    linha.mostraDados();

    input.close();
  }
}
