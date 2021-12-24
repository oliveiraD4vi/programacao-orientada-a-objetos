/**
 * A classe Fone representa um determinado numero referente
 * a um determinado contato que possui uma identificacao, t
 * al como Oi, Vivo, Tim ou qualquer outra. Como tal, possu
 * i os atributos id e number.
 * @author Davi Silva Alves de Oliveira
 */

package Fone;

public class Fone {
  private String id;
  private String number;
  
  /**
   * O construtor Fone iniciar os atributos da classe Fone.
   * @param id é a label de identificação do número
   * @param number é o número
   */
  public Fone(String id, String number) {
    setId(id);
    setNumber(number);
  }
  
  /**
   * O método validate() determinar se o numero passado é válido.
   * @param number é o número a ser testado
   * @return true se sim, false se não
   */
  public static boolean validate(String number) {
    return true;
  }
  
  /**
   * O método toString() retorna a classe Fone em formato de string.
   */
  public String toString() {
    return (getId() + ":" + getNumber());
  }
  
  /**
   * O método getId() retorna a label de identificação do número.
   * @return atributo id
   */
  public String getId() {
    return this.id;
  }
  
  /**
   * O méotod setId() seta a label de identificação
   * do número.
   * @param id é a label a ser setada
   */
  public void setId(String id) {
    this.id = id;
  }
  
  /**
   * O método getNumber() retorna o número
   * @return atributo number
   */
  public String getNumber() {
    return this.number;
  }
  
  /**
   * O método setNumber() seta o número do fone.
   * @param number é o número a ser setado
   */
  public void setNumber(String number) {
    this.number = number;
  }
  
  /**
   * O método isValid() utiliza a static validate() para determinar
   * se o numero é válido ou não.
   * @return o valor retornado de validate()
   */
  public boolean isValid() {
    return validate(getNumber());
  }
}
