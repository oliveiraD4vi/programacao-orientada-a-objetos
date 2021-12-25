/**
 * A classe Client representa o cliente de uma determinada agência bancária
 * que pode possuir dois tipos de conta: CC e CP. Como tal, este cliente po
 * ssui um atributo clientId e um atributo accounts que representa uma list
 * a das contas deste determinado cliente.
 * @author Davi Silva Alves de Oliveira
 */

package Client;

import Account.Account;
import java.util.*;

public class Client {
  private String clientId;
  private List<Account> accounts = new ArrayList<Account>();

  /**
   * O método construtor Client inicializa os atributos desta classe.
   * @param clientId nome do cliente a ser inserido
   */
  public Client(String clientId) {
    setClientId(clientId);
  }
  
  /**
   * O método addAccount() adiciona uma determinada conta à lista de
   * contas do cliente.
   * @param account conta a ser adicionada à lista
   */
  public void addAccount(Account account) {
    accounts.add(account);
  }
  
  /**
   * O método toString() retorna a classe em formato de string.
   */
  public java.lang.String toString() {
    StringBuffer stringBuffer = new StringBuffer();
    for (int i = 0; i < accounts.size(); i++)
      stringBuffer.append(accounts.get(i).toString());

    return stringBuffer.toString();
  }
  
  /**
   * O método getClientId() retorna o nome do cliente
   * @return atributo clientId
   */
  String getClientId() {
    return this.clientId;
  }
  
  /**
   * O método setClientId() determina o nome do cliente no atributo.
   * @param clientId nome a ser setado
   */
  void setClientId(String clientId) {
    this.clientId = clientId;
  }
  
  /**
   * O método getAccounts() retorna a lista de contas referentes ao
   * cliente.
   * @return atributo accounts
   */
  List<Account> getAccounts() {
    return accounts;
  }
  
  /**
   * O método setAccounts() determina uma nova lista de contas a serem
   * associadas ao cliente.
   * @param accounts lista a ser setada
   */
  void setAccounts(List<Account> accounts) {
    this.accounts = accounts;
  }
};
