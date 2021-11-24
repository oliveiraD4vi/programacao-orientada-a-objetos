import java.util.ArrayList;

class Lapiseira {
  float calibre;
  Grafite grafite;
  ArrayList<Grafite> tambor =  new ArrayList<Grafite>();

  /**
   * 
   * @param calibre
   */
  Lapiseira(float calibre) {
    this.calibre = calibre;
    this.grafite = null;
  }
  
  /**
   * 
   */
  public String toString() {
    return ("calibre: " + calibre + ", " + grafite);
  }
  
  /**
   * 
   * @param grafite
   * @return
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
   * 
   * @return
   */
  Grafite remover() {
    Grafite aux = new Grafite((float)0.5, "2B", 50);
    aux = grafite;
    if (grafite != null) grafite = null;

    return aux;
  }

  /**
   * 
   * @return
   */
  boolean puxar() {
    return true;
  }
  
  /**
   * 
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
