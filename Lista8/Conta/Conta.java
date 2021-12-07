package Conta;

import Financas.Financas;
import Label.Label;

public class Conta {
  private int id;
  private Financas financas;
  
  public Conta(int id) {
    this.id = id;
  }
  
  //só realiza a operação se houver dinheiro suficiente na conta
  public boolean sacar(int value) {
    return true;
  }
  
  //retira o dinheiro, mesmo que o saldo fique negativo
  public boolean tarifar(int value) {
    return true;
  }
  
  //se o índice for válido e representar uma operação de tarifa
  //adicione o mesmo valor tarifado, mas com label de extorno
  public boolean extornar(int indice) {
    return true;
  }
  
  //adiciona valor à conta
  public boolean creditar(Label label, int value) {
    return true;
  }
  
  public String toString() {
    return (id + ":");
  }
  
  Financas getFinancas() {
    return financas;
  }
}
