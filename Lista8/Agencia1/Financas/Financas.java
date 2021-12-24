package Financas;

import java.util.*;
import Label.Label;
import Operacao.Operacao;

public class Financas {
  private int nextId;
  private List<Operacao> extrato = new ArrayList<Operacao>();
  
  private int saldo;
  
  public Financas() {
    this.saldo = 0;
    this.nextId = 0;
  }
  
  //Adiciona value ao saldo
  //Crie operação e adiciona ao vetor de operações
  //Incrementa o nextId
  public void addOperacao(Label label, int value) {
    this.saldo = getSaldo() + value;

    Operacao operacao = new Operacao(nextId, label, value, getSaldo());
    extrato.add(operacao);

    nextId++;
  }
  
  public int getSaldo() {
    return saldo;
  }
  
  public List<Operacao> getExtrato() {
    return extrato;
  }
  
  public List<Operacao> getExtrato(int qtdOp) {
    List<Operacao> lastExtrato = new ArrayList<Operacao>();

    for (int i = 0; i < extrato.size(); i++)
      if (i >= extrato.size() - qtdOp) lastExtrato.add(extrato.get(i));

    return lastExtrato;
  }
}
