/**
 * A classe CheckingAccount...
 * @author Davi Silva Alves de Oliveira
 */

package CheckingAccount;

import Account.Account;

class CheckingAccount extends Account {
  //inicializa conta.type com "CC"
  /**
   * 
   * @param id
   * @param idClient
   */
  public CheckingAccount(int id, String idClient) {
    super(id, idClient);
  }
  
  //retira 20 do saldo
  /**
   * 
   */
  public void monthlyUpdate() {

  }
}
