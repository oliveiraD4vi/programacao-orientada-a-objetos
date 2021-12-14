package Conta;

import Financas.Financas;
import Label.Label;

public class Conta {
  private int id;
  private Financas financas = new Financas();
  
  public Conta(int id) {
    this.id = id;

    Label abertura = Label.abertura;
    financas.addOperacao(abertura, 0);
  }
  
  //só realiza a operação se houver dinheiro suficiente na conta
  public boolean sacar(int value) {
    if (value >= 0) {
      if (financas.getSaldo() >= value) {
        financas.addOperacao(Label.saque, value * -1);
        return true;
      } else {
        System.out.println("fail: saldo insuficiente");
        return false;
      }
    } else {
      System.out.println("fail: valor invalido");
      return false;
    }
  }
  
  //retira o dinheiro, mesmo que o saldo fique negativo
  public boolean tarifar(int value) {
    if (value >= 0) {
      financas.addOperacao(Label.tarifa, value * -1);
      return true;
    } else {
      System.out.println("fail: valor invalido");
      return false;
    }
  }
  
  //se o índice for válido e representar uma operação de tarifa
  //adicione o mesmo valor tarifado, mas com label de extorno
  public boolean extornar(int indice) {
    if (financas.getExtrato().size() > indice) {
      if ((financas.getExtrato().get(indice).getLabel().getName()).equals("tarifa")) {
        financas.addOperacao(Label.extorno, financas.getExtrato().get(indice).getValue() * -1);
        return true;
      } else {
        System.out.println("fail: indice " + indice + " nao e tarifa");
        return false;
      }
    } else {
      System.out.println("fail: indice " + indice + " invalido");
      return false;
    }
  }
  
  //adiciona valor à conta
  public boolean creditar(Label label, int value) {
    if (value >= 0) {
      financas.addOperacao(label, value);
      return true;
    } else {
      System.out.println("fail: valor invalido");
      return false;
    }
  }
  
  public String toString() {
    return ("conta:" + id + ", saldo:" + financas.getSaldo());
  }
  
  public Financas getFinancas() {
    return financas;
  }
}
