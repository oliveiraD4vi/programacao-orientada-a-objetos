/**
 * Este é um programa que calcula o numero de Euler associado a um inteiro n
 * @author Davi Oliveira
 */

package Lista1;
import java.util.Locale;
import java.util.Scanner;

public class CalculaEuler {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner input = new Scanner(System.in);

    // recebe inteiro n
    int n = input.nextInt();

    // chama a função euler e imprime o resultado com aproximação de 6 casas decimais
    System.out.printf("%.6f\n", euler(n));

    input.close();
  }

  public static double fatorial(int n) {
    // declara a variavel que guardara o valor do fatorial
    double fat;

    // calcula o fatorial com produto sucessivo
    for (fat = 1; n > 1; n--) {
      fat = fat * n;
    }

    return fat;
  }

  public static double euler(int n) {
    // declara euler com valor base 1
    double e = 1;

    // calcula euler para n
    for (int i = 1; i <= n; i++) {
      e += 1.0/fatorial(i);
    }
    
    return e;
  }
}
