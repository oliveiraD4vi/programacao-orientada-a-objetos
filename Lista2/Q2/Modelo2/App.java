/**
 * @author Davi Silva Alves de Oliveira
 */

package Lista2.Q2.Modelo2;
import java.util.Locale;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner input = new Scanner(System.in);

    Retangulo retangulo = new Retangulo();

    retangulo.inicializaDadosIniciais(0, 2, 10, 10);
    retangulo.mostraDados();

    input.close();
  }
}
