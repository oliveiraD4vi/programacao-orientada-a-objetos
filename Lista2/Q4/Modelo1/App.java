/**
 * @author Davi Silva Alves de Oliveira
 */

package Lista2.Q4.Modelo1;
import java.util.Locale;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner input = new Scanner(System.in);

    Livro livro = new Livro();

    String n = input.nextLine();
    String a = input.nextLine();
    String e = input.nextLine();
    String local = input.nextLine();
    short ano = input.nextShort();

    livro.inicializaDados(n, a, e, local, ano);
    livro.mostraDados();

    input.close();
  }
}
