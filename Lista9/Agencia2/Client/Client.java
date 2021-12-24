/**
 * A classe Client...
 * @author Davi Silva Alves de Oliveira
 */

package Client;

import Account.Account;
import java.util.*;

public class Client {
  private String clientId;
  private List<Account> accounts;

  /**
   * 
   * @param clientId
   */
  public Client(String clientId) {
    setClientId(clientId);
  }
  
  /**
   * 
   * @param account
   */
  public void addAccount(Account account) {

  }
  
  /**
   * 
   */
  public java.lang.String toString() {
    return "aa";
  }
  
  /**
   * 
   * @return
   */
  String getClientId() {
    return this.clientId;
  }
  
  /**
   * 
   * @param clientId
   */
  void setClientId(String clientId) {
    this.clientId = clientId;
  }
  
  /**
   * 
   * @return
   */
  List<Account> getAccounts() {
    return accounts;
  }
  
  /**
   * 
   * @param accounts
   */
  void setAccounts(List<Account> accounts) {
    this.accounts = accounts;
  }
};
