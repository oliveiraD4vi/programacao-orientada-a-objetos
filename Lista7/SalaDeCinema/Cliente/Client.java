/**
 * A Classe Client é usada pela classe Sala para setar
 * as reservas de cadeiras de uma sala de cinema. Esta
 * s cadeiras são registradas com um nome e o telefone
 * do cliente, daí o uso dos atributos id e fone. Quan
 * to aos métodos, temos, para além do construtor e do
 * toString, getters e setters para os atributos citad
 * os acima.
 * @author Davi Silva Alves de Oliveira
 */

package Cliente;

public class Client {
  private String id;
  private String fone;
  
  /**
   * O método construtor Client seta os valores inicias dos
   * atributos da classe
   * @param id é o nome do cliente
   * @param fone é o telefone do cliente
   */
  public Client(String id, String fone) {
    this.id = id;
    this.fone = fone;
  }
  
  /**
   * O método toString retorna o objeto em formato de string
   */
  public String toString() {
    if (getId() == "") return ("-");
    else return (getId() + ":" + getFone());
  }
  
  /**
   * O método getId retorna o id do cliente
   * @return id
   */
  public String getId() {
    return this.id;
  }
  
  /**
   * O método setId seta o id do cliente
   * @param id é o id a ser colocado
   */
  void setId(String id) {
    this.id = id;
  }
  
  /**
   * O método getFone retorna o telefone do cliente
   * @return fone
   */
  public String getFone() {
    return this.fone;
  }
  
  /**
   * O método setFone seta o telefone do cliente
   * @param fone é o telefone a ser colocado
   */
  void setFone(String fone) {
    this.fone = fone;
  }
}
