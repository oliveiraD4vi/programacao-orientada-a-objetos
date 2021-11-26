/**
 * @author Davi Silva Alves de Oliveira
 */

class Lapiseira {
  float calibre;
  Grafite grafite;

  /**
   * O método Lapiseira é o construtor que seta os atributos do objeto
   * @param calibre é o calibre da lapiseira a ser setado
   */
  Lapiseira(float calibre) {
    this.calibre = calibre;
    this.grafite = null;
  }
  
  /**
   * O método toString retorna o objeto como uma string
   */
  public String toString() {
    return ("calibre: " + calibre + ", grafite: " + grafite);
  }
  
  /**
   * O método inserir põe um grafite na lapiseira
   * @param grafite é o objeto grafite a ser inserido na lapiseira
   * @return true se der certo, false se não
   */
  boolean inserir(Grafite grafite) {
    if (calibre == grafite.calibre) {
      if (this.grafite == null)
        this.grafite = grafite;
      else 
        System.out.println("fail: ja existe grafite");
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
    aux = grafite;
    if (grafite != null) grafite = null;

    return aux;
  }
  
  /**
   * O método escrever utiliza o grafite e diminuir seu tamanho conforme o uso
   */
  void escrever() {
    if (grafite.tamanho <= 10) {
      System.out.println("warning: grafite acabou");
    } else if (grafite.tamanho - grafite.desgastePorFolha() == 10) {
      grafite.tamanho = 10;
      System.out.println("warning: grafite acabou");
    } else if (grafite.tamanho - grafite.desgastePorFolha() < 10) {
      grafite.tamanho = 10;
      System.out.println("fail: folha incompleta");
      System.out.println("warning: grafite acabou");
    } else {
      grafite.tamanho = grafite.tamanho - grafite.desgastePorFolha();
    }
  }
}
