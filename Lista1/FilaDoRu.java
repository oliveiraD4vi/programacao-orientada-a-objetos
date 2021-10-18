/**
 * Este é um programa que separa os pares e impares de um vetor em vetores distintos e os imprime
 * @author Davi Oliveira
 */

package Lista1;
import java.util.Scanner;
import java.util.Locale;

public class FilaDoRu {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner input = new Scanner(System.in);

    // recebe valor n de tamanho do vetor
    int n = input.nextInt();
    
    // declara variaveis que vão guardar a quantidade de pares e impares do vetor
    int paresNum = 0;
    int imparesNum = 0;

    // declara vetor de tamanho n
    int[] vet = new int[n];

    // recebe os valores do vetor e verifica quantos pares e ímpares há
    for (int i = 0; i < n; i++) {
      vet[i] = input.nextInt();
      
      if (vet[i] % 2 == 0) paresNum++;
      else imparesNum++;
    }

    // declara vetores para guardar pares e impares
    int[] pares = new int[paresNum];
    int[] impares = new int[imparesNum];

    // testa cada elemento do vetor e o inclui em um dos vetores de pares ou ímpares
    for (int i = 0, j = 0, l = 0; i < n; i++) {
      if(vet[i] % 2 == 0) {
        pares[j] = vet[i];
        j++;
      } else {
        impares[l] = vet[i];
        l++;
      }
    }

    // imprime ímpares
    System.out.print("[ ");
    for (int i = 0; i < imparesNum; i++) {
      System.out.printf("%d ", impares[i]);
    }
    System.out.println("]");

    // imprime pares
    System.out.print("[ ");
    for (int i = 0; i < paresNum; i++) {
      System.out.printf("%d ", pares[i]);
    }
    System.out.print("]");

    input.close();
  }
}
