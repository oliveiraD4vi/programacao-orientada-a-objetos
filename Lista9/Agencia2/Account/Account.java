/**
 * A classe Account representa uma conta de uma agência bancária
 * e como tal possui atributos de identificação, saldo, identifi
 * cação do cliente que possui aquela conta e o tipo de conta, s
 * e é corrente (CC) ou poupança (CP).
 * @author Davi Silva Alves de Oliveira
 */

package Account;

import AccountException.AccountException;

abstract public class Account {
  protected int id;
  protected float balance;
  protected String clientId;
  protected String type; //CC or CP

  /**
   * O método construtor Account() inicializa os atributos principais id e clientId.
   * @param id é o id a ser inserido
   * @param clientId o id do cliente a ser inserido
   */
  public Account(int id, String clientId) {
    this.id = id;
    this.clientId = clientId;
  }
  
  /**
   * O método abstrato monthlyUpdate() define o método para as classes derivadas utilizarem
   */
  public abstract void monthlyUpdate();
  
  /**
   * O método withdraw() retira um valor do saldo da conta.
   * @param value é o valor a ser retirado
   */
  public void withdraw(float value) {
    if (getBalance() - value >= 0)
      this.balance = this.balance - value;
    else {
      AccountException exception = new AccountException("fail: saldo insuficiente");
      exception.printStackTrace();
    }
  }
  
  /**
   * O método deposit() insere um valor definido no saldo da conta.
   * @param value é o valor a ser inserido
   */
  public void deposit(float value) {
    this.balance = this.balance + value;
  }
  
  /**
   * O método transfer() transfere o valor definido para outra conta.
   * @param other conta destino
   * @param value valor a ser transferido
   */
  public void transfer(Account other, float value) {
    if (getBalance() - value >= 0) {
      this.balance = this.balance - value;
      other.deposit(value);
    } else {
      AccountException exception = new AccountException("fail: saldo insuficiente");
      exception.printStackTrace();
    }
  }
  
  /**
   * O método toString() retorna a classe em formato de string.
   */
  public String toString() {
    return (id + ":" + clientId + ":" + balance + ":" + type);
  }

  /**
   * O método setType() determina o tipo de conta.
   * @param type é o tipo de conta a ser setado
   */
  public void setType(String type) {
    this.type = type;
  }
  
  /**
   * O método getId() retorna o Id da conta.
   * @return atributo id
   */
  public int getId() {
    return this.id;
  }
  
  /**
   * O método getBalance() retorna o balanço do mês.
   * @return atributo balance
   */
  public float getBalance() {
    return this.balance;
  }
  
  /**
   * O método getClientId() retorna o ID do Cliente daquela determinada conta.
   * @return atributo clientId
   */
  public String getClientId() {
    return this.clientId;
  }
  
  /**
   * O método getType() retorna o tipo da conta.
   * @return atributo type
   */
  public String getType() {
    return this.type;
  }
}
