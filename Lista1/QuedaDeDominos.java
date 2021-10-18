/**
 * Este é um programa que recebe um inteiro e retorna true para primo e false para não primo
 * @author Davi Oliveira
 */

package Lista1;
import java.util.Locale;
import java.util.Scanner;

public class QuedaDeDominos {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner input = new Scanner(System.in);
    
    // recebe quantidade de dominos
    int n = input.nextInt();
    // declara vetor com quantidade de dominos
    int[] dominos = new int[n];
    // binario que determina se o vetor está ordenado ou não
    boolean ordenado = true;

    // recebe altura de cada domino
    for (int i = 0; i < n; i++) {
      dominos[i] = input.nextInt();
    }

    // testa se ordenado
    for (int i = 0; i < n; i++) {
      for (int j = i; j < n; j++) {
        if (dominos[i] > dominos[j]) ordenado = false;
      }
    }

    // se ordenado imprime ok, se não imprime precisa de ajuste
    if (ordenado) System.out.println("ok");
    else System.out.println("precisa de ajuste");

    input.close();
  }
}
