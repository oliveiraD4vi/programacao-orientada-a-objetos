/**
 * @author Davi Silva Alves de Oliveira
 */

package Lista2.Q3;

class Poligono {
  
  int qntdLados;
  int medidaDoLado;
  int qntdDeDiagonais;
  int medidaDoAnguloInterno;
  int somaDosAngulosInternos;

  void inicializaDados(int lados, int medidaLado) {
    qntdLados = lados;
    medidaDoLado = medidaLado;
    qntdDeDiagonais = calculaNumeroDiagonais();
    somaDosAngulosInternos = calculaSomaDosAngulosInternos();
    medidaDoAnguloInterno = somaDosAngulosInternos/qntdLados;
  }

  void mostraDados() {
    System.out.println();
    mostraNomeDoPoligono();
    System.out.println("----------------");
    System.out.println("Quantidade de lados: " + qntdLados);
    System.out.println("Medida do lado do polígono: " + medidaDoLado + "cm");
    System.out.println("Quantidade de diagonais do polígono: " + qntdDeDiagonais);
    System.out.println("Soma dos ângulos internos do polígono: " + somaDosAngulosInternos);
    System.out.println("Medida do ângulo interno do polígono " + medidaDoAnguloInterno);
    System.out.println("----------------");
  }

  int calculaSomaDosAngulosInternos() {
    return ((qntdLados-2)*180);
  }

  int calculaNumeroDiagonais() {
    return ((qntdLados*(qntdLados-3)/2));
  }

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
