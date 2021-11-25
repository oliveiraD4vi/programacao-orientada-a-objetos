import java.util.ArrayList;

class Lapiseira {
  float calibre;
  Grafite bico;
  ArrayList<Grafite> tambor = new ArrayList<Grafite>();

  /**
   * 
   * @param calibre
   */
  Lapiseira(float calibre) {
    this.calibre = calibre;
    this.bico = null;
  }
  
  /**
   * 
   */
  public String toString() {
    if (bico != null)
      return ("calibre: " + calibre + ", bico: " + bico + ", tambor: {" + tambor + "}");
    else
      return ("calibre: " + calibre + ", bico: [], tambor: {" + tambor + "}");
  }
  
  /**
   * 
   * @param grafite
   * @return
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
   * 
   * @return
   */
  Grafite remover() {
    Grafite aux = new Grafite((float)0.5, "2B", 50);
    aux = bico;
    if (bico != null) bico = null;

    return aux;
  }

  /**
   * 
   * @return
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
   * 
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
