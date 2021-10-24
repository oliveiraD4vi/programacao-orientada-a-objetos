/** 
 * O modelo Linha possuirá atributos de instâncias do modelo Ponto2D para
 * representar os pontos de união da linha e um atributo de distânciaEntrePontos
 * que guarda esse valor de forma que ele seja o comprimento da linha. De tal forma
 * as operações incluem apenas a verificação se os dados inseridos não indicam
 * o mesmo ponto, uma vez que o cálculo da distância entre dois pontos pode ser
 * feito com o modelo Ponto2D.
 * @author Davi Silva Alves de Oliveira
 */

package Lista2.Q2.Modelo3;
import Lista2.Q2.Modelo1.Ponto2D;

class Linha {
  
  Ponto2D pontoA = new Ponto2D();
  Ponto2D pontoB = new Ponto2D();
  double distanciaEntrePontos;

  /**
   * O método inicializaDados inicializa os dados passados.
   * @param xA é o valor de x do ponto A
   * @param yA é o valor de y do ponto A
   * @param xB é o valor de x do ponto B
   * @param yB é o valor de y do ponto B
   */
  void inicializaDados(int xA, int yA, int xB, int yB) {
    pontoA.inicializaDados("A", xA, yA);
    pontoB.inicializaDados("B", xB, yB);
    distanciaEntrePontos = pontoA.distanciaEntreDoisPontos(pontoB);
  }

  /**
   * O método verificaSeNaoEPonto faz os testes para determinar se os
   * dados passados não representam o mesmo ponto.
   * @param xA é o valor de x do ponto A
   * @param yA é o valor de y do ponto A
   * @param xB é o valor de x do ponto B
   * @param yB é o valor de y do ponto B
   * @return true se for ponto, false se não for
   */
  boolean verificaSeNaoEPonto(int xA, int yA, int xB, int yB) {
    if (xA == xB && yA == yB) return true;
    else return false;
  }

  /**
   * O método mostraDados imprime os dados depois de verificar se são válidos
   */
  void mostraDados() {
    if (verificaSeNaoEPonto(pontoA.valorX, pontoA.valorY, pontoB.valorX, pontoB.valorY)) System.out.println("Não é uma linha!");
    else {
      System.out.println();

      System.out.printf("Coordenadas do ponto A: ");
      System.out.println(pontoA.identificador + "(" + pontoA.valorX + ", " + pontoA.valorY + ")");
      
      System.out.printf("Coordenadas do ponto B: ");
      System.out.println(pontoB.identificador + "(" + pontoB.valorX + ", " + pontoB.valorY + ")");

      System.out.println();

      System.out.printf("Medida da linha: %.2fcm\n", distanciaEntrePontos);

      System.out.println();
    }
  }
}
