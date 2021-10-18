/**
 * Este é um programa que recebe um inteiro e retorna true para primo e false para não primo
 * @author Davi Oliveira
 */

package Lista1;
import java.util.Locale;
import java.util.Scanner;

public class ConstroiTriangulo {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner input = new Scanner(System.in);

    // recebe valor de n
    int n = input.nextInt();
    // declara auxiliar com valor de n-1 para utilizar posteriormente
    int aux = n-1;
    
    // testa linha de impressão para determinar quantidade de pontos e elementos do triangulo
    for (int i = 0; i < n; i++) {                               //
      if (i == 0) {                                             // caso primeira linha
        for (int j = 1; j < n; j++) System.out.print(".");      //
        System.out.print(n);                                    //
        for (int j = 1; j < n; j++) System.out.print(".");      //
      } else if (i == n-1) {                                    // caso última linha
        for (int j = 0; j < n; j++) {                           //
          System.out.print(n);                                  //
          if (j != n-1) System.out.print(".");                  //
        }                                                       //
      } else {                                                  // caso linhas do meio
        for (int j = 1; j < aux-1; j++) System.out.print(".");  //
        for (int j = 1; j < i+2; j++) {                         //
          System.out.print(".");                                //  
          System.out.print(n);                                  //
        }                                                       //
        for (int j = 1; j < aux; j++) System.out.print(".");    //
                                                              
        // decrementa auxiliar para uso posterior             
        aux--;                                                  //
      }                                                         //

      // imprime linha após o fim das impressões de cada linha  
      System.out.println();                                     //
    }                                                           //

    input.close();
  }
}
