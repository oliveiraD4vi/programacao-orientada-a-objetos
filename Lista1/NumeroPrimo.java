/**
 * Este é um programa que recebe um inteiro e retorna true para primo e false para não primo
 * @author Davi Oliveira
 */

package Lista1;
import java.util.Locale;
import java.util.Scanner;

public class NumeroPrimo {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner input = new Scanner(System.in);

    // recebe o intervalo a ser testado
    int numA = input.nextInt();
    int numB = input.nextInt();

    // testa os números nesse intervalo e imprime caso o valor de retorno seja true
    for (int i = numA; i <= numB; i++) {
      if (primo(i) == true) System.out.println(i);
    }

    input.close();
  }

  public static boolean primo(int n) {
    // conta elementos divisíveis do teste
    int contDivisiveis = 0;

    // testa se há divisíveis a partir de 2 até n/2
    for (int i = 2; i <= n/2; i++) {
      if (n % i == 0) {
        contDivisiveis++;
        break;
      }
    }

    // retorna true se não houver divisíveis e false se houver algum
    if (contDivisiveis == 0) return true;
    else return false;
  }
}
