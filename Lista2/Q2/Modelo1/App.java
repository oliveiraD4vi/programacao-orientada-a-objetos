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

    Ponto2D pontoA = new Ponto2D();
    Ponto2D pontoB = new Ponto2D();

    pontoA.inicializaDados("A", 2, 0);
    pontoA.mostraDados();

    System.out.println();

    pontoB.inicializaDados("B", 4, 5);
    pontoB.mostraDados();

    System.out.println();
    System.out.printf("A distância entre os dois pontos é: %.2f\n", pontoA.distanciaEntreDoisPontos(pontoB));

    input.close();
  }
}
