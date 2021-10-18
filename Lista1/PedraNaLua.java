/**
 * Este é um programa que recebe o numero de competidores e os valores marcados por cada um, retornando o indice do ganhador da competição
 * @author Davi Oliveira
 */

package Lista1;
import java.util.Scanner;

public class PedraNaLua {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // recebe o numero de competidores
    int n = input.nextInt();

    // variavel que guarda o índice do vencedor
    int vencedor = 0;
    // variavel que guarda o valor da menor diferenca
    int menorDistancia = 1000;
    // variavel que conta o numero de jogadores eliminados
    int contEliminados = 0;
    // variavel que guarda menor indice de emapte
    int empateIndice = 0;
    // boolean que diz se houve empate ou não
    boolean empate = false;
    // boolean que diz se teve ganhador ou não
    boolean semGanhador = false;

    // vetor que guarda o valor das diferenças de A e B de cada competidor
    int[] valores = new int[n];
    // vetores que guardam distâncias de A e B de cada competidor
    int[] distanciaA = new int[n];
    int[] distanciaB = new int[n];

    // recebe valores de A e B e compara elementos intrínsecos
    for (int i = 0; i < n; i++) {
      distanciaA[i] = input.nextInt();
      distanciaB[i] = input.nextInt();

      if (distanciaA[i] > distanciaB[i]) valores[i] = distanciaA[i] - distanciaB[i];
      else valores[i] = distanciaB[i] - distanciaA[i];

      if (distanciaA[i] < 10 || distanciaB[i] < 10) {
        valores[i] = 1001;
        contEliminados++;
      }

      if (valores[i] < menorDistancia) {
        menorDistancia = valores[i];
        vencedor = i;
      }
    }

    // testa se todos os competidores foram eliminados, se nao testa o empate
    if (contEliminados == n) semGanhador = true;
    else {
      for (int i = 0; i < n; i++) {
        if (i == n-2) {
          if (valores[i] == valores[i+1]) {
            empateIndice = i;
            empate = true;
          }
        }
      }
    }

    // imprime saída esperada
    if (semGanhador) System.out.println("sem ganhador");
    else if (empate) System.out.println(empateIndice);
    else System.out.println(vencedor);

    input.close();
  }
}
