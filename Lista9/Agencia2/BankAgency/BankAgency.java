package BankAgency;

import Account.Account;
import Client.Client;
import AccountException.AccountException;
import java.util.*;

public class BankAgency {
  private Map<String, Client> clients = new HashMap<String, Client>();
  private Map<Integer, Account> accounts = new HashMap<Integer, Account>();
  private int nextAccountId = 0;
  
  //obtém conta ou lança exceção
  /**
   * 
   * @param id
   * @return
   */
  // private Account getAccount(int id) {
  //   Account account;

  //   for (Map.Entry<Integer, Account> pair : accounts.entrySet()) {
  //     if (id == pair.getKey())
  //       account = pair.getValue();
  //   }

  //   return account;
  // }
  
  /**
   * 
   */
  public BankAgency(){}
  
  //se o cliente não existir
  //cria o cliente
  //cria uma conta poupança e uma conta corrent para o cliente
  //adiciona essas contas no vetor de contas e no vetor do cliente
  //adiciona o cliente no mapa de clientes
  /**
   * 
   * @param clientId
   */
  public void addClient(String clientId) {
    boolean exist = false;

    for (Map.Entry<String, Client> pair : clients.entrySet()) {
      if (pair.getKey() == clientId) {
        exist = true;
        break;
      }
    }

    if (!exist) {
      
    }
  }
  
  //obtem o cliente e invoca as ações
  /**
   * 
   * @param idConta
   * @param value
   */
  public void withdraw(int idConta, float value) {

  }
  
  /**
   * 
   * @param idConta
   * @param value
   */
  public void deposit(int idConta, float value) {

  }
  
  /**
   * 
   * @param contaDe
   * @param contaPara
   * @param value
   */
  public void transfer(int contaDe, int contaPara, float value) {

  }
  
  /**
   * 
   */
  public void monthlyUpdate() {

  }
  
  /**
   * 
   */
  public String toString() {
    return "aa";
  }
};
