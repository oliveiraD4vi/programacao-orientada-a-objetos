/**
 * @author Davi Silva Alves de Oliveira
 */

package Lista2.Q2.Modelo1;
import java.lang.Math;

public class Ponto2D {
  
  public int valorX;
  public int valorY;
  public String identificador;

  public void inicializaDados(String id, int x, int y) {
    valorX = x;
    valorY = y;
    identificador = id;
  }

  public int determinaQuadrante() {
    if (valorX >= 0 && valorY >= 0) return 1;
    else if (valorX < 0 && valorY >= 0) return 2;
    else if (valorX < 0 && valorY < 0) return 3;
    else return 4;
  }

  public String determinaSeEixoCentroQuadrante() {
    if (valorX == 0 && valorY != 0) return "ordenadas";
    else if (valorX != 0 && valorY == 0) return "abscissas";
    else if (valorX != 0 && valorY != 0) return "quadrante";
    else return "centro";
  }

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
