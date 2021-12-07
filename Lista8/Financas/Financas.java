package Financas;

import java.util.*;
import Label.Label;
import Operacao.Operacao;

public class Financas {
  private int nextId;
  private List<Operacao> extrato;
  
  private int saldo;
  
  public Financas() {
    
  }
  
  //Adiciona value ao saldo
  //Crie operação e adiciona ao vetor de operações
  //Incrementa o nextId
  public void addOperacao(Label label, int value) {
    this.saldo = value;
  }
  
  int getSaldo() {
    return saldo;
  }
  
  List<Operacao> getExtrato() {
    return extrato;
  }
  
  public List<Operacao> getExtrato(int qtdOp) {
    return extrato;
  }
}
