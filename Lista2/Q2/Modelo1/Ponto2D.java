/**
 * O modelo Ponto2D representa um ponto no plano cartesiano
 * dado pelas coordenadas x e y, portanto utiliza os atributos
 * valorX e valorY. Dentre as operações, podemos indicar se o 
 * ponto se encontra em um dos eixos, no centro do plano ou 
 * em um dos quadrantes. Atrelado a isso, poderíamos ainda 
 * determinar o quadrante em que ele está e ainda passar um
 * segundo ponto como instância e determinar a distância entre
 * os dois pontos.
 * @author Davi Silva Alves de Oliveira
 */

package Lista2.Q2.Modelo1;
import java.lang.Math;

public class Ponto2D {
  
  public int valorX;
  public int valorY;
  public String identificador;

  /**
   * O método inicializaData inicializa os valores das variáveis.
   * @param id é o valor de identificação do ponto
   * @param x é o valor da coordenada X passado pelo usuário
   * @param y é o valor da coordenada Y passado pelo usuário
   */
  public void inicializaDados(String id, int x, int y) {
    valorX = x;
    valorY = y;
    identificador = id;
  }

  /**
   * O método determinaQuadrante testa os valores de X e Y
   * para determinar o quadrante no qual o ponto se encontra.
   * @return 1, 2, 3 ou 4 dependendo do quadrante encontrado
   */
  public int determinaQuadrante() {
    if (valorX >= 0 && valorY >= 0) return 1;
    else if (valorX < 0 && valorY >= 0) return 2;
    else if (valorX < 0 && valorY < 0) return 3;
    else return 4;
  }

  /**
   * O método determinaSeEixoCentroQuadrante testa os valores de X e Y
   * para encontrar zeros nesses valores e determinar se o ponto
   * está em um desses locais.
   * @return ordenadas, abscissas, quadrante ou centro dependendo 
   * de onde o ponto se localiza a partir do teste dos zeros
   */
  public String determinaSeEixoCentroQuadrante() {
    if (valorX == 0 && valorY != 0) return "ordenadas";
    else if (valorX != 0 && valorY == 0) return "abscissas";
    else if (valorX != 0 && valorY != 0) return "quadrante";
    else return "centro";
  }

  /**
   * O método distânciaEntreDoisPontos determina, a partir da fórmula
   * matemática para tal, a distância entre o ponto que chama a função
   * e um outro ponto de mesma instância passado.
   * @param ponto é uma instância do próprio modelo Ponto2D
   * @return o resultado do cálculo
   */
  public double distanciaEntreDoisPontos(Ponto2D ponto) {
    return (Math.sqrt(Math.pow((ponto.valorX - valorX), 2) + Math.pow((ponto.valorY - valorY), 2)));
  }

  public void mostraDados() {
    System.out.printf("Coordenadas do ponto: ");
    System.out.println(identificador + "(" + valorX + ", " + valorY + ")");
    System.out.printf("Localização: ");
    
    if (determinaSeEixoCentroQuadrante().intern() == "ordenadas") System.out.println("Eixo das ordenadas");
    else if (determinaSeEixoCentroQuadrante().intern() == "abscissas") System.out.println("Eixo das abscissas");
    else if (determinaSeEixoCentroQuadrante().intern() == "centro") System.out.println("Centro do plano");
    else System.out.println(determinaQuadrante() + "º Quadrante");
  }
}
