/**
 * Este é um programa que recebe 5 numeros inteiros e retorna o menor valor entre eles
 * @author Davi Oliveira
 */

package Lista1;
import java.util.Scanner;

public class NumeroDaCalca {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int[] numeros = new int[5];

    for (int i = 0; i < 5; i++) {
      numeros[i] = input.nextInt();
    }

    int maiorNumero = numeros[0];

    for (int i = 1; i < 5; i++) {
      if (maiorNumero > numeros[i]) maiorNumero = numeros[i];
    }

    System.out.println(maiorNumero);

    input.close();
  }
}
