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
   * 
   * @param id
   * @param number
   */
  public Fone(String id, String number) {
    setId(id);
    setNumber(number);
  }
  
  /**
   * 
   * @param number
   * @return
   */
  public static boolean validate(String number) {
    return true;
  }
  
  /**
   * 
   */
  public String toString() {
    return (getId() + ":" + getNumber());
  }
  
  /**
   * 
   * @return
   */
  public String getId() {
    return this.id;
  }
  
  /**
   * 
   * @param id
   */
  public void setId(String id) {
    this.id = id;
  }
  
  /**
   * 
   * @return
   */
  public String getNumber() {
    return this.number;
  }
  
  /**
   * 
   * @param number
   */
  public void setNumber(String number) {
    this.number = number;
  }
  
  /**
   * 
   * @return
   */
  public boolean isValid() {
    return validate(this.number);
  }
}
