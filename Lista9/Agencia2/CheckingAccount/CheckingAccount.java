/**
 * A classe CheckingAccount é uma subclasse da classe Account que determina uma
 * conta do tipo corrente.
 * @author Davi Silva Alves de Oliveira
 */

package CheckingAccount;

import Account.Account;

public class CheckingAccount extends Account {
  /**
   * O método construtor SavingsAccount() inicia os valores da superclasse Account e
   * determina o tipo de conta como CC (conta corrente).
   * @param id é o id a ser inserido
   * @param idClient é o nome do cliente
   */
  public CheckingAccount(int id, String idClient) {
    super(id, idClient);
    setType("CC");
  }
  
  /**
   * O método monthlyUpdate retira 20 do saldo.
   */
  public void monthlyUpdate() {
    withdraw(20);
  }
}
