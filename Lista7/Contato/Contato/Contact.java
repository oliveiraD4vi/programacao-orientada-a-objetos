package Contato;

import Fone.*;
import java.util.*;

public class Contact {
  private String name;
  private ArrayList<Fone> fones = new ArrayList<Fone>();
  protected String prefix = "-"; //utilizado no toString

  /**
   * O método construtor Contact determina os valores iniciais dos atributos do objeto
   * @param name é o nome do contato
   * @param fones é o array de telefones do contato
   */
  public Contact(String name, ArrayList<Fone> fones) {
    setName(name);
    if (fones != null)
      for (int i = 0; i < fones.size(); i++)
        addFone(fones.get(i));
  }
  
  /**
   * O método addFone adiciona o telefone específico na lista de telefones se ele for um número válido
   * @param fone é o número a ser adicionado
   */
  public void addFone(Fone fone) {
    if (fone.validate()) {
      fones.add(fone);
    } else {
      System.out.println("fail: invalid number");
    }
  }
  
  /**
   * O método rmFone remove um telefone da lista de telefones do contato se o índice existir
   * @param index é o índice a ser testado
   */
  public void rmFone(int index) {
    if (index < fones.size() && index >= 0) fones.remove(index);
    else System.out.println("fail: o indice nao existe");
  }
  
  /**
   * O método toString retorna o objeto em formato de string
   */
  public String toString() {
    return (prefix + " " + getName() + " " + fones);
  }
  
  /**
   * O método getName retorna o nome do contato
   */
  String getName() {
    return this.name;
  }
  
  /**
   * O método setName seta o nome do contato
   * @param name o nome a ser setado
   */
  void setName(String name) {
    this.name = name;
  }

  /**
   * O método getFones
   * @return
   */
  ArrayList<Fone> getFones() {
    return this.fones;
  }
}
