/**
 * Para o modelo Poligono os atributos incluem apenas quantidade
 * de lados e a medida do lado. Dentre as operações temos operações
 * que retornam o valor de alguns dados que podem ser mostrados na 
 * operação mostraDados, tais como a quantidade de diagonais, a soma
 * dos ângulos internos do polígono e a medida do ângulo interno do
 * polígono.
 * @author Davi Silva Alves de Oliveira
 */

package Lista2.Q3;

class Poligono {
  
  int qntdLados;
  int medidaDoLado;

  /**
   * O método inicializaDados inicializa as variáveis com os dados
   * passados pelo usuário.
   * @param lados é o número de lados do polígono
   * @param medidaLado é a medida do lado do polígono
   */
  void inicializaDados(int lados, int medidaLado) {
    qntdLados = lados;
    medidaDoLado = medidaLado;
  }

  /**
   * O método mostraDados imprime os dados de interesse do polígono.
   */
  void mostraDados() {
    System.out.println();
    mostraNomeDoPoligono();
    System.out.println("----------------");
    System.out.println("Quantidade de lados: " + qntdLados);
    System.out.println("Medida do lado do polígono: " + medidaDoLado + "cm");
    System.out.println("Quantidade de diagonais do polígono: " + calculaNumeroDiagonais());
    System.out.println("Soma dos ângulos internos do polígono: " + calculaSomaDosAngulosInternos());
    System.out.println("Medida do ângulo interno do polígono " + calculaMedidaDoAnguloInterno());
    System.out.println("----------------");
  }

  /**
   * O método calculaSomaDosAngulosInternos calcula a soma dos angulos internos
   * a partir da fórmula próŕia.
   * @return o resultado do cálculo
   */
  int calculaSomaDosAngulosInternos() {
    return ((qntdLados-2)*180);
  }

  /**
   * O método calculaNumeroDiagonais calcula o número de diagonais do polígono
   * a partir da fórmula já conhecida para tal.
   * @return o resultado do cálculo
   */
  int calculaNumeroDiagonais() {
    return ((qntdLados*(qntdLados-3)/2));
  }

  /**
   * O método calculaMedidaDoAnguloInterno calcula a medida do angulo interno 
   * do polígono a partir do calculo da soma dos angulos internos.
   * @return valor da medida do angulo interno
   */
  int calculaMedidaDoAnguloInterno() {
    return (calculaSomaDosAngulosInternos()/qntdLados);
  }

  /**
   * O método mostraNomeDoPoligono imprime o nome do polígono a partir do número de lados
   */
  void mostraNomeDoPoligono() {
    switch (qntdLados) {
      case 3:
        System.out.println("Triângulo");
        break;
      case 4:
        System.out.println("Quadrado");
        break;
      case 5:
        System.out.println("Pentágono");
        break;
      case 6:
        System.out.println("Hexágono");
        break;
      case 7:
        System.out.println("Heptágono");
        break;
      case 8:
        System.out.println("Octógono");
        break;
      case 9:
        System.out.println("Eneágono");
        break;
      case 10:
        System.out.println("Decágono");
        break;
      default:
        System.out.println("Não é um polígono de até 10 lados");
    }
  }
}
