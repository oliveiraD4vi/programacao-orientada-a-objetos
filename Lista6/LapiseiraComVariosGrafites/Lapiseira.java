/**
 * @author Davi Silva Alves de Oliveira
 */

import java.util.ArrayList;

class Lapiseira {
  float calibre;
  Grafite bico;
  ArrayList<Grafite> tambor = new ArrayList<Grafite>();

  /**
   * O método Lapiseira é o construtor que seta os atributos do objeto
   * @param calibre é o calibre da lapiseira a ser setado
   */
  Lapiseira(float calibre) {
    this.calibre = calibre;
    this.bico = null;
  }
  
  /**
   * O método toString retorna o objeto como uma string
   */
  public String toString() {
    if (bico != null)
      return ("calibre: " + calibre + ", bico: " + bico + ", tambor: {" + tambor + "}");
    else
      return ("calibre: " + calibre + ", bico: [], tambor: {" + tambor + "}");
  }
  
  /**
   * O método inserir põe um grafite na lapiseira
   * @param grafite é o objeto grafite a ser inserido na lapiseira
   * @return true se der certo, false se não
   */
  boolean inserir(Grafite grafite) {
    if (calibre == grafite.calibre) {
      tambor.add(grafite);
      return true;
    } else {
      System.out.println("fail: calibre incompativel");
      return false;
    }
  }
  
  /**
   * O método remover remove o grafite da lapiseira
   * @return o objeto Grafite retirado
   */
  Grafite remover() {
    Grafite aux = new Grafite((float)0.5, "2B", 50);
    aux = bico;
    if (bico != null) bico = null;

    return aux;
  }

  /**
   * O método puxar puxa um grafite do tambor para o bico
   * @return true se der certo, false se não
   */
  boolean puxar() {
    if (tambor != null) {
      if (bico == null) {
        bico = tambor.get(tambor.size()-1);
        tambor.remove(tambor.size()-1);
        return true;
      } else {
        System.out.println("fail: ja existe grafite no bico");
        return false;
      }
    } else {
      System.out.println("fail: nao existe grafite no tambor");
      return false;
    }
  }
  
  /**
   * O método escrever utiliza o grafite e diminuir seu tamanho conforme o uso
   */
  void escrever() {
    if (bico != null) {
      if (bico.tamanho <= 10) {
        System.out.println("warning: grafite acabou");
      } else if (bico.tamanho - bico.desgastePorFolha() == 10) {
        bico.tamanho = 10;
        System.out.println("warning: grafite acabou");
      } else if (bico.tamanho - bico.desgastePorFolha() < 10) {
        bico.tamanho = 10;
        System.out.println("fail: folha incompleta");
        System.out.println("warning: grafite acabou");
      } else {
        bico.tamanho = bico.tamanho - bico.desgastePorFolha();
      }
    } else {
      System.out.println("fail: nao existe grafite no bico");
    }
  }
}
