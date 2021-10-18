/**
 * Este é um programa que conta os elementos repetidos do vetor
 * @author Davi Oliveira
 */

package Lista1;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Locale;

public class Zoologico {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner input = new Scanner(System.in);

    // recebe valor n de tamanho do vetor
    int n = input.nextInt();

    // declara vetor de tamanho n
    int[] vet = new int[n];

    // recebe os valores do vetor
    for (int i = 0; i < n; i++) {
      vet[i] = input.nextInt();
    }

    // declara arraylist com especies
    ArrayList<Integer> especies = new ArrayList<Integer>();

    // testa se o numero se repete, se sim adiciona na lista depois de testar se ele já se encontra lá, se não adiciona depois de testar se ele já está lá
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if (vet[i] == vet[j]) {
          boolean verifica = false;
          
          for (int l = 0; l < especies.size(); l++) {
            if (vet[i] == especies.get(l)) verifica = true;
          }

          if (verifica == false) especies.add(vet[i]);
        } else {
          boolean verifica = false;
          
          for (int l = 0; l < especies.size(); l++) {
            if (vet[i] == especies.get(l)) verifica = true;
          }

          if (verifica == false) especies.add(vet[i]);
        }
      }
    }

    // imprime tamanho do arraylist, que se caracteriza aqui como o número de espécies
    System.out.println(especies.size());

    input.close();
  }
}
