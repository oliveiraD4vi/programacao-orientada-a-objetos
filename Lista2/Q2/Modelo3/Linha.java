/**
 * @author Davi Silva Alves de Oliveira
 */

package Lista2.Q2.Modelo3;
import Lista2.Q2.Modelo1.Ponto2D;

class Linha {
  
  Ponto2D pontoA = new Ponto2D();
  Ponto2D pontoB = new Ponto2D();
  double distanciaEntrePontos;

  void inicializaDados(int xA, int yA, int xB, int yB) {
    pontoA.inicializaDados("A", xA, yA);
    pontoB.inicializaDados("B", xB, yB);
    distanciaEntrePontos = pontoA.distanciaEntreDoisPontos(pontoB);
  }

  boolean verificaSeNaoEPonto(int xA, int yA, int xB, int yB) {
    if (xA == xB && yA == yB) return true;
    else return false;
  }

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
