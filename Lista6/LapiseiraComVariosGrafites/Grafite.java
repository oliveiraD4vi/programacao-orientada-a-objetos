/**
 * @author Davi Silva Alves de Oliveira
 */

public class Grafite {
  float calibre;
  String dureza;
  int tamanho;

  /**
   * O método Grafite é o construtor que seta os valores dos atributos
   * iniciais do objeto
   * @param calibre é o valor do calibre do grafite
   * @param dureza é a dureza do grafite
   * @param tamanho é o tamanho do grafite em mm
   */
  Grafite(float calibre, String dureza, int tamanho) {
    this.calibre = calibre;
    this.dureza = dureza;
    this.tamanho = tamanho;
  }
  
  /**
   * O método toString retorna o objeto como String
   */
  public String toString() {
    return ("[" + calibre + ":" + dureza + ":" + tamanho + "]");
  }
  
  /**
   * O método desgastePorFolha retorna o desgastePorFolha do grafite
   * @return o desgaste por folha dependendo da dureza do grafite
   */
  int desgastePorFolha() {
    if (dureza == "HB") return 1;
    else if (dureza == "2B") return 2;
    else if (dureza == "4B") return 4;
    else return 6;
  }
}
