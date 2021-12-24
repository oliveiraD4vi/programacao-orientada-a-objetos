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
   * 
   * @param name
   * @param fones
   */
  public Contact(String name, List<Fone> fones) {
    setName(name);
    if (fones != null) setFones(fones);
  }
  
  /**
   * 
   * @param fone
   */
  public void addFone(Fone fone) {
    if (fone.isValid())
      this.fones.add(fone);
    else
      System.out.println("fail: fone invalido");
  }
  
  /**
   * 
   * @param index
   */
  public void rmFone(int index) {
    if (index < fones.size())
      fones.remove(index);
    else 
      System.out.println("fail: indice nao existe");
  }
  
  /**
   * 
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
   * 
   * @return
   */
  public String getName() {
    return this.name;
  }
  
  /**
   * 
   * @param name
   */
  public void setName(String name) {
    this.name = name;
  }
  
  /**
   * 
   * @return
   */
  public List<Fone> getFones() {
    return this.fones;
  }
  
  /**
   * 
   * @param fones
   */
  public void setFones(List<Fone> fones) {
    for (int i = 0; i < fones.size(); i++)
      addFone(fones.get(i));
  }
}
