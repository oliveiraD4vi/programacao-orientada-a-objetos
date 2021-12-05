/**
 * A Classe Pass representa o passageiro de uma topic que irá
 * embarcar na mesma em determinado assento. O passageiro pos
 * sui nome e idade, de forma a identificá-lo e determinar se
 * ele se enquadra como prioritário ou não. Temos então os mé
 * todos construtores, os getter e setters e o método isPrior
 * ity que determina se o passageiro é prioritário ou não.
 * @author Davi Silva Alves de Oliveira
 */

package Pass;

public class Pass {
  private String name;
  private int age;

  /**
   * O método construtor Pass atribui os valores iniciais dos atributos do objeto
   * @param name é o nome do passageiro
   * @param age é a idade do passageiro
   */
  public Pass(String name, int age) {
    setName(name);
    setAge(age);
  }
  
  /**
   * O método isPriority determina se o passageiro é para assentos prioritários ou não
   * @return true se idade maior ou igual a 65, false se menor
   */
  public boolean isPriority() {
    if (getAge() >= 65) return true;
    else return false;
  }

  /**
   * O método getName retorna o nome do passageiro
   * @return name
   */
  public String getName() {
    return this.name;
  }
  
  /**
   * O método setName seta o nome do passageiro
   * @param name é o nome do passageiro
   */
  public void setName(String name) {
    this.name = name;
  }
  
  /**
   * O método getAge retorna a idade do passageiro
   * @return age
   */
  public int getAge() {
    return this.age;
  }
  
  /**
   * O método setAge seta a idade do passageiro
   * @param age é a idade do passageiro
   */
  public void setAge(int age) {
    this.age = age;
  }
  
  /**
   * O método toString retorna o objeto em forma de string
   */
  public String toString() {
    if (isPriority()) {
      if (getName() == "") return ("@");
      else return ("@" + getName() + ":" + getAge());
    } else {
      if (getName() == "") return ("=");
      else return ("=" + getName() + ":" + getAge());
    }
  }
}
