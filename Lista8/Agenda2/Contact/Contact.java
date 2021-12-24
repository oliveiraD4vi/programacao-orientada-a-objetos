/**
 * A classe Contact representa o contato de uma determinada
 * pessoa que possui uma lista de números a ela relacionado
 * s. Como tal possui atributos name e fones.
 * @author Davi Silva Alves de Oliveira
 */

package Contact;

import Fone.Fone;
import java.util.*;

public class Contact {
  private String name;
  private List<Fone> fones = new ArrayList<Fone>();
  protected String prefix = "-"; //utilizado no toString
  
  /**
   * O método construtor Contact inicia os atributos da classe
   * @param name é o nome do contato
   * @param fones é a lista de fones do contato
   */
  public Contact(String name, List<Fone> fones) {
    setName(name);
    if (fones != null) setFones(fones);
  }
  
  /**
   * O método addFone() adiciona um fone à lista de fones.
   * @param fone é o fone a ser adicionado
   */
  public void addFone(Fone fone) {
    if (fone.isValid())
      this.fones.add(fone);
    else
      System.out.println("fail: fone invalido");
  }
  
  /**
   * O método rmFone() remove um determinado telefone da lista de fones
   * a partir do índice desse fone
   * @param index é o índice a ser retirado da lista
   */
  public void rmFone(int index) {
    if (index < fones.size())
      fones.remove(index);
    else 
      System.out.println("fail: indice nao existe");
  }
  
  /**
   * O método toString() retorna a classe Contact como string.
   */
  public String toString() {
    StringBuffer stringBuffer = new StringBuffer();
    int count = 0;
    
    stringBuffer.append(prefix);
    stringBuffer.append(" ");
    stringBuffer.append(getName());
    stringBuffer.append(" ");
    
    for (int i = 0; i < fones.size(); i++) {
      stringBuffer.append("[");
      stringBuffer.append(count + ":");
      stringBuffer.append(fones.get(i).toString());
      stringBuffer.append("] ");
      count++;
    }

    return stringBuffer.toString();
  }
  
  /**
   * O método getName() retorna o nome do contato.
   * @return atributo name
   */
  public String getName() {
    return this.name;
  }
  
  /**
   * O método setName() seta o nome do contato.
   * @param name é o nome a ser setado
   */
  public void setName(String name) {
    this.name = name;
  }
  
  /**
   * O método getFones() retorna a lista de fones do contato.
   * @return atributos fones
   */
  public List<Fone> getFones() {
    return this.fones;
  }
  
  /**
   * O método setFones() seta a lista de telefones de um contato.
   * @param fones é a lista a ser setada
   */
  public void setFones(List<Fone> fones) {
    for (int i = 0; i < fones.size(); i++)
      addFone(fones.get(i));
  }
}
