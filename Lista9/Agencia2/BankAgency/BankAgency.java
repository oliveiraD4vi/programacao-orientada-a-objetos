package BankAgency;

import Account.Account;
import Client.Client;
import java.util.*;

public class BankAgency {
  private Map<String, Client> clients;
  private Map<Integer, Account> accounts;
  private int nextAccountId = 0;
  
  //obtém conta ou lança exceção
  private Account getAccount(int id) {

  }
  
  public BankAgency() {

  }
  
  //se o cliente não existir
  //cria o cliente
  //cria uma conta poupança e uma conta corrent para o cliente
  //adiciona essas contas no vetor de contas e no vetor do cliente
  //adiciona o cliente no mapa de clientes
  public void addClient(String clientId) {

  }
  
  //obtem o cliente e invoca as ações
  public void withdraw(int idConta, float value) {

  }
  
  public void deposit(int idConta, float value) {

  }
  
  public void transfer(int contaDe, int contaPara, float value) {

  }
  
  public void monthlyUpdate() {

  }
  
  public String toString() {
    return "aa";
  }
};
