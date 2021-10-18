/**
 * Este é um programa que determina o vencedor de uma competição de chute de preços
 * @author Davi Oliveira
 */

package Lista1;
import java.util.Scanner;
import java.util.Locale;

public class Mercado {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner input = new Scanner(System.in);

    // recebe quantidade de produtos
    int n = input.nextInt();

    // declara variáveis que guardam quantidade de vitórias de cada jogador
    int vitoriasJ1 = 0;
    int vitoriasJ2 = 0;

    // declara vetor de preços e recebe valores
    float[] precos = new float[n];
    for (int i = 0; i < n; i++) precos[i] = input.nextFloat();

    // declara vetor de chutes do primeiro jogador e recebe valores
    float[] chutes = new float[n];
    for (int i = 0; i < n; i++) chutes[i] = input.nextFloat();

    // declara vetor de escolhas do segundo jogador e recebe valores
    char[] escolhas = new char[n];
    for (int i = 0; i < n; i++) escolhas[i] = input.next().charAt(0);

    // testa se iguais, se não testa outros possiveis estados da disputa
    for (int i = 0; i < n; i++) {
      if (precos[i] == chutes[i]) vitoriasJ1++;
      else if (precos[i] > chutes[i] && escolhas[i] == 'M') vitoriasJ2++;
      else if (precos[i] > chutes[i] && escolhas[i] == 'm') vitoriasJ1++;
      else if (precos[i] < chutes[i] && escolhas[i] == 'm') vitoriasJ2++;
      else if (precos[i] < chutes[i] && escolhas[i] == 'M') vitoriasJ1++;
    }

    // testa quem venceu ou se deu empate e imprime a mensagem correspondente
    if (vitoriasJ1 > vitoriasJ2) System.out.println("primeiro");
    else if (vitoriasJ1 < vitoriasJ2) System.out.println("segundo");
    else System.out.println("empate");

    input.close();
  }
}
