/**
 * A classe BankAgency representa a agência de um determinado ba
 * nco que possui clientes e contas associadas a esses clientes.
 * O id da conta destes clientes é proposto por uma única variáv
 * el que é sempre incrementada quando uma nova conta é adiciona
 * da nesta agência.
 * @author Davi Silva Alves de Oliveira
 */

package BankAgency;

import Client.Client;
import Account.Account;
import SavingsAccount.SavingsAccount;
import CheckingAccount.CheckingAccount;
import AccountException.AccountException;
import java.util.*;

public class BankAgency {
  private Map<String, Client> clients = new HashMap<String, Client>();
  private Map<Integer, Account> accounts = new HashMap<Integer, Account>();
  private int nextAccountId = 0;
  
  /**
   * O método getAccount() busca a e retorna a conta procurada.
   * @param id é o id da conta procurada
   * @return o objeto Account encontrado na lista
   */
  private Account getAccount(int id) {
    Account account = new SavingsAccount(-1, "undefined");

    for (Map.Entry<Integer, Account> pair : accounts.entrySet()) {
      if (pair.getKey().equals(id))
        account = pair.getValue();
    }
    
    if (account.getId() != -1)
      return account;
    else {
      AccountException exception = new AccountException("fail: conta nao encontrada");
      exception.printStackTrace();
      return account;
    }
  }
  
  /**
   * 
   */
  public BankAgency(){}
  
  /**
   * O método addClient() adiciona um cliente se ele não existir, cria
   * uma CP e uma CC para ele e salva essas contas nas respectivas lis
   * tas da classe Agency e do Client.
   * @param clientId é o nome do cliente
   */
  public void addClient(String clientId) {
    boolean exist = false;

    for (Map.Entry<String, Client> pair : clients.entrySet()) {
      if (pair.getKey().equals(clientId)) {
        exist = true;
        break;
      }
    }

    if (!exist) {
      Client newClient = new Client(clientId);
      clients.put(clientId, newClient);

      CheckingAccount accountCC = new CheckingAccount(getNextId(), clientId);
      accounts.put(getNextId(), accountCC);
      newClient.addAccount(accountCC);
      setNextId();

      SavingsAccount accountCP = new SavingsAccount(getNextId(), clientId);
      accounts.put(getNextId(), accountCP);
      newClient.addAccount(accountCP);
      setNextId();
    } else {
      AccountException exception = new AccountException("fail: cliente ja existe");
      exception.printStackTrace();
    }
  }
  
  /**
   * O método withdraw() realiza um saque da conta determinada.
   * @param idConta é o id de onde o saque será feito
   * @param value é o valor a ser sacado
   */
  public void withdraw(int idConta, float value) {
    if (getAccount(idConta).getId() != -1)
      getAccount(idConta).withdraw(value);
  }
  
  /**
   * O método deposit() realiza um depósito na conta determinada.
   * @param idConta é o id de onde o depósito será feito
   * @param value é o valor a ser depositado
   */
  public void deposit(int idConta, float value) {
    if (getAccount(idConta).getId() != -1)
      getAccount(idConta).deposit(value);
  }
  
  /**
   * O método transfer() realiza uma transferência de uma conta para outra.
   * @param contaDe é o id da conta de origem
   * @param contaPara é o id da conta de destino
   * @param value é o valor a ser transferido
   */
  public void transfer(int contaDe, int contaPara, float value) {
    if (getAccount(contaDe).getId() != -1 && getAccount(contaPara).getId() != -1)
      getAccount(contaDe).transfer(getAccount(contaPara), value);
  }
  
  /**
   * O método monthlyUpdate faz o update mensal de todas as contas na lista.
   */
  public void monthlyUpdate() {
    for (Map.Entry<Integer, Account> pair : accounts.entrySet())
      pair.getValue().monthlyUpdate();
  }

  /**
   * O método setNextId() incrementa o atributo nextAccountId.
   */
  private void setNextId() {
    this.nextAccountId++;
  }

  /**
   * O método getNextId() retorna o valor do próximo id de conta.
   * @return atributo nextAccountId
   */
  private int getNextId() {
    return this.nextAccountId;
  }
  
  /**
   * O método toString() retorna a classe em formato de string.
   */
  public String toString() {
    StringBuffer stringBuffer = new StringBuffer();

    stringBuffer.append("Clients:\n");

    for (Map.Entry<String, Client> pair : clients.entrySet()) {
      stringBuffer.append("- " + pair.getKey() + " [");

      List<Account> accounts = pair.getValue().getAccounts();
      for (int i = 0; i < accounts.size(); i++) {
        stringBuffer.append(accounts.get(i).getId());
        if (i == 0) stringBuffer.append(", ");
      }

      stringBuffer.append("]\n");
    }

    stringBuffer.append("Accounts:\n");

    for (int i = 0; i < accounts.size(); i++) {
      stringBuffer.append(accounts.get(i).toString());
      if (i < accounts.size() - 1) stringBuffer.append("\n");
    }

    return stringBuffer.toString();
  }
};
