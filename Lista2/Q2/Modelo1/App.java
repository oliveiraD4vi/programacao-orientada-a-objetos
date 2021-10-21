/**
 * @author Davi Silva Alves de Oliveira
 */

package Lista2.Q2.Modelo1;
import java.util.Locale;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner input = new Scanner(System.in);

    Ponto2D ponto = new Ponto2D();

    ponto.inicializaDados("A", 2, 0);
    ponto.mostraDados();

    input.close();
  }
}
