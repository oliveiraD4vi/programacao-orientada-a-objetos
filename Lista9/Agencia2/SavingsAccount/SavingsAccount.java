/**
 * A classe SavingsAccount é uma subclasse da classe Account que determina uma
 * conta do tipo poupança.
 * @author Davi Silva Alves de Oliveira
 */

package SavingsAccount;

import Account.Account;

public class SavingsAccount extends Account {
  /**
   * O método construtor SavingsAccount() inicia os valores da superclasse Account e
   * determina o tipo de conta como CP (conta poupança).
   * @param id é o id a ser inserido
   * @param idClient é o nome do cliente
   */
  public SavingsAccount(int id, String idClient) {
    super(id, idClient);
    setType("CP");
  }

  /**
   * O método monthlyUpdate aumenta o saldo em 1%.
   */
  public void monthlyUpdate() {
    float increase = getBalance() * (float)0.01;
    deposit(increase);
  }
}
