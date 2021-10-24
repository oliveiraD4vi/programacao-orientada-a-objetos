/**
 * @author Davi Silva Alves de Oliveira
 */

package Lista2.Q4.Modelo2;
import java.util.Locale;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner input = new Scanner(System.in);

    LivroDeLivraria livro = new LivroDeLivraria();

    livro.inicializaDados("A Menina Que Roubava Livros", "Markus Zusak", "Intrínseca", "London", (short)2007, (float)45.99, (float)0.2, 1);
    livro.mostraDados();

    input.close();
  }
}
