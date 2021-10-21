/**
 * @author Davi Silva Alves de Oliveira
 */

package Lista2.Q2.Modelo2;
import Lista2.Q2.Modelo1.Ponto2D;

class Retangulo {
  
  Ponto2D pontoA = new Ponto2D();
  Ponto2D pontoC = new Ponto2D();
  Ponto2D pontoB = new Ponto2D();
  Ponto2D pontoD = new Ponto2D();
  boolean linha = false;
  boolean ponto = false;

  void inicializaDadosIniciais(int xA, int yA, int xB, int yB) {
    if ((xA != xB && yA == yB) || (xA == xB && yA != yB)) linha = true;
    else if (xA == xB && yA == yB) ponto = true;
    else {
      pontoA.inicializaDados("A", xA, yA);
      pontoB.inicializaDados("B", xA, yB);
      pontoC.inicializaDados("C", xB, yB);
      pontoD.inicializaDados("D", xB, yA);
    }
  }

  int calculaAltura(int yA, int yB) {
    if (yB > yA) return (yB - yA);
    else return (yA - yB);
  }
  
  int calculaBase(int xA, int xB) {
    if (xB > xA) return (xB - xA);
    else return (xA - xB);
  }

  void mostraDados() {
    if (linha || ponto) System.out.println("Não são dados válidos!");
    else {
      System.out.println();

      if (calculaAltura(pontoA.valorY, pontoC.valorY) == calculaBase(pontoA.valorX, pontoC.valorX)) {
        System.out.println("Quadrado");
        System.out.println("----------------------");
        System.out.println("Medida da altura do quadrado: " + calculaAltura(pontoA.valorY, pontoC.valorY));
        System.out.println("Medida da base do quadrado: " + calculaBase(pontoA.valorX, pontoC.valorX));
      } else {
        System.out.println("Retângulo regular");
        System.out.println("----------------------");
        System.out.println("Medida da altura do retângulo: " + calculaAltura(pontoA.valorY, pontoC.valorY));
        System.out.println("Medida da base do retângulo: " + calculaBase(pontoA.valorX, pontoC.valorX));
      }

      System.out.printf("\nCoordenadas do ponto A: ");
      System.out.println(pontoA.identificador + "(" + pontoA.valorX + ", " + pontoA.valorY + ")");
      
      System.out.printf("Coordenadas do ponto B: ");
      System.out.println(pontoB.identificador + "(" + pontoB.valorX + ", " + pontoB.valorY + ")");

      System.out.printf("Coordenadas do ponto C: ");
      System.out.println(pontoC.identificador + "(" + pontoC.valorX + ", " + pontoC.valorY + ")");

      System.out.printf("Coordenadas do ponto D: ");
      System.out.println(pontoD.identificador + "(" + pontoD.valorX + ", " + pontoD.valorY + ")");

      System.out.println();
    }
  }
}
