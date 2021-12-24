/**
 * A classe AgendaStar representa uma subclasse da classe a
 * genda proposta anteriormente.
 * @author Davi Silva Alves de Oliveira
 */

package AgendaStar;

import Agenda.Agenda;
import ContactStar.ContactStar;
import java.util.*;

public class AgendaStar extends Agenda {
  /**
   * O método star() insere ou retira o valor star de um contato.
   * @param name é o nome a ser buscado
   * @param value é o valor a ser inserido no atributo star
   */
  public void star(String name, boolean value) {
    List<ContactStar> contacts = getContacts();
    boolean exist = true;

    for (int i = 0; i < contacts.size(); i++)
      if (contacts.get(i).getName().equals(name)) {
        contacts.get(i).setStar(value);
        exist = true;
        break;
      } else exist = false;

    if (!exist) System.out.println("fail: contato " + name + " nao existe");
  }
  
  /**
   * O método getStarred() retorna uma lista com apenas os contatos estrela
   * @return lista de contatos starred
   */
  public List<ContactStar> getStarred() {
    List<ContactStar> contacts = getContacts();
    List<ContactStar> contactsAux = new ArrayList<ContactStar>();

    for (int i = 0; i < contacts.size(); i++)
      if (contacts.get(i).getStar())
        contactsAux.add(contacts.get(i));

    return contactsAux;
  }
}
