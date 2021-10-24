/**
 * O modelo Retangulo representa um retângulo no plano cartesiano
 * utilizando instâncias do modelo Ponto2D. Este modelo utiliza os
 * atributos linha e ponto para guardar os valores true ou false 
 * caso não seja possível formar um retângulo com os valores 
 * passados.
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

  /**
   * O método inicializaDadosIniciais inicializa os dados dos pontos
   * do retângulo a partir dos dois pontos inseridos pelo usuário.
   * @param xA é o valor de x do ponto A
   * @param yA é o valor de y do ponto A
   * @param xB é o valor de x do ponto B
   * @param yB é o valor de y do ponto B
   */
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

  /**
   * O método calculaAltura calcula o valor da altura do retângulo
   * a partir dos valores de y passados.
   * @param yA é o valor de y do ponto A
   * @param yB é o valor de y do ponto B
   * @return o valor da altura
   */
  int calculaAltura(int yA, int yB) {
    if (yB > yA) return (yB - yA);
    else return (yA - yB);
  }
  
  /**
   * O método calculaBase calcula o valor da base do retângulo
   * a partir dos valores de x passados.
   * @param xA é o valor de x do ponto A
   * @param xB é o valor de x do ponto B
   * @return o valor da base
   */
  int calculaBase(int xA, int xB) {
    if (xB > xA) return (xB - xA);
    else return (xA - xB);
  }

  /**
   * O método mostraDados imprime os dados depois de verificar se são válidos
   */
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
