/**
 * @author Davi Silva Alves de Oliveira
 */

package Lista2.Q3;
import java.util.Locale;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner input = new Scanner(System.in);

    Poligono poligono = new Poligono();

    int ladosDoPoligono = input.nextInt();
    int medidaDoLado = input.nextInt();

    poligono.inicializaDados(ladosDoPoligono, medidaDoLado);
    poligono.mostraDados();

    input.close();
  }
}
