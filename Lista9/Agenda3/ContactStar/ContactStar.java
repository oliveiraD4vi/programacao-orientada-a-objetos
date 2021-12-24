/**
 * A classe ContactStar é uma subclasse da classe Contact e representa
 * um contato com um atributo a mais, star, determinando níveis de imp
 * ortância entre os contatos na agenda.
 * @author Davi Silva Alves de Oliveira
 */

package ContactStar;

import Contact.Contact;
import Fone.Fone;
import java.util.*;

public class ContactStar extends Contact {
  private boolean star;
  
  /**
   * O método construtor ContactStar() passa os valores name e fones para
   * o construtor da superclasse e seta o valor de star.
   * @param name é o nome do contato
   * @param fones é a lista de fones do contato
   * @param star é o valor do atributo star
   */
  public ContactStar(String name, List<Fone> fones, boolean star) {
    super(name, fones);
    setStar(star);
  }
  
  /**
   * O método setStar() determina o valor do atributo star.
   * @param value é o valor a ser setado
   */
  public void setStar(boolean value) {
    this.star = value;
  }

  /**
   * O método getStar() retorna o valor do atributo star.
   * @return atributo star
   */
  public boolean getStar() {
    return this.star;
  }
}
