/**
 * A classe Fone representa um número de telefone a ser adicionado a um contato
 * específico de uma agenda. Como tal, possui os atributos de id e number, resp
 * ectivamente utilizados para identificar que tipo de número é esse, seja come
 * rcial, casa, etc e o número prpriamente dito. Dentre seus métodos temos o co
 * nstrutor, os getters, setters e o método que valida o número.
 * @author Davi Silva Alves de Oliveira
 */

package Fone;

public class Fone {
  private String id;
  private String number;

  /**
   * O método construtor Fone determinar os valores iniciais dos atributos do objeto
   * @param id é o identificador do número do contato
   * @param number é o número
   */
  public Fone(String id, String number) {
    setId(id);
    setNumber(number);
  }
  
  /**
   * O método validate determina se o número de telefone é válido ou não
   * @param number é o número de telefone
   * @return true se válido, false se não
   */
  public boolean validate() {
    if (getNumber().matches("[0-9]*")) return true;
    else return false;
  }
  
  /**
   * O método toString retorna o objeto em formato de string
   */
  public String toString() {
    return (getId() + ":" + getNumber());
  }
  
  /**
   * O método getId retorna o id do contato
   * @return id
   */
  String getId() {
    return this.id;
  }
  
  /**
   * O método setId seta o identificador do contato da pessoa
   * @param id o identificador a ser setado
   */
  void setId(String id) {
    this.id = id;
  }
  
  /**
   * O método getNumber retorna o valor do número de telefone
   * @return number
   */
  String getNumber() {
    return this.number;
  }
  
  /**
   * O método setNumber seta o valor do numero de telefone
   * @param number é o número a ser setado
   */
  void setNumber(String number) {
    this.number = number;
  }
}
