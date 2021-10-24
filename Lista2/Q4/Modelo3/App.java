/**
 * @author Davi Silva Alves de Oliveira
 */

package Lista2.Q4.Modelo3;
import java.util.Locale;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner input = new Scanner(System.in);

    LivroDeBiblioteca livro = new LivroDeBiblioteca();

    livro.inicializaDados("A Menina Que Roubava Livros", "Markus Zusak", "Intrínseca", "London", (short)2007, 1, "Infanto Juvenil", 3);
    livro.mostraDados();

    input.close();
  }
}
