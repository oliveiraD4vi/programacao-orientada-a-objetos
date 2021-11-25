public class Grafite {
  float calibre;
  String dureza;
  int tamanho;

  /**
   * 
   * @param calibre
   * @param dureza
   * @param tamanho
   */
  Grafite(float calibre, String dureza, int tamanho) {
    this.calibre = calibre;
    this.dureza = dureza;
    this.tamanho = tamanho;
  }
  
  /**
   * 
   */
  public String toString() {
    return ("[" + calibre + ":" + dureza + ":" + tamanho + "]");
  }
  
  /**
   * 
   * @return
   */
  int desgastePorFolha() {
    if (dureza == "HB") return 1;
    else if (dureza == "2B") return 2;
    else if (dureza == "4B") return 4;
    else return 6;
  }
}
