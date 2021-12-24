/**
 * A classe Agenda representa uma agenda eltrônica de conta
 * tos. Como tal, possui uma lista de Contatos. Nesta class
 * e, é possível inserir contatos, remove-los e também remo
 * ver um número específico de um contato, entre outras ope
 * rações.
 * @author Davi Silva Alves de Oliveira
 */

package Agenda;

import ContactStar.ContactStar;
import java.util.*;

public class Agenda {
  private List<ContactStar> contacts = new ArrayList<ContactStar>();
  public Agenda() {}
  
  /**
   * O método findPosByName() encontra a posição de um determinado contato
   * pelo nome passado para o método.
   * @param name é o nome a ser pesquisado
   * @return a posição encontrada se existir, -1 se não existir
   */
  private int findPosByName(String name) {
    int pos = -1;
    
    for (int i = 0; i < contacts.size(); i++)
      if(contacts.get(i).getName().equals(name)) {
        pos = i;
        break;
      }

    return pos;
  }
  
  /**
   * O método findContact() utiliza o método findPosByName()
   * para encontrar um determinado contato.
   * @param name o nome do contato a ser buscado
   * @return o contato encontrado
   */
  public ContactStar findContact(String name) {
    return contacts.get(findPosByName(name));
  }
  
  /**
   * O método addContact() adiciona um contato à lista de contatos
   * da agenda se ele for válido. Se o contato já existir, ele ape
   * nas adiciona os fones a ele.
   * @param contact é o contato a ser adicionado
   */
  public void addContact(ContactStar contact) {
    boolean exist = false;
    
    for (int i = 0; i < contacts.size(); i++)
      if(contacts.get(i).getName().equals(contact.getName())) {
        exist = true;
        break;
      }
    
    if (exist)
      contacts.get(findPosByName(contact.getName())).setFones(contact.getFones());
    else
      contacts.add(contact);

    this.contacts.sort((ContactStar c1, ContactStar c2) -> (c1.getName().compareTo(c2.getName())));
  }
  
  /**
   * O método rmContact remove o contato especificado da lista de cont
   * atos da agenda utilizando sua posição, encontrada com a função fi
   * ndPosByName().
   * @param name é o nome a ser passado para o método findPosByName()
   */
  public void rmContact(String name) {
    contacts.remove(findPosByName(name));
  }
  
  /**
   * O método search() procura pela ocorrência do padrão passado para ele.
   * @param pattern é o padrão pesquisado
   * @return lista auxiliar de contatos onde o padrão foi encontrado
   */
  public List<ContactStar> search(String pattern) {
    List<ContactStar> contactsAux = new ArrayList<ContactStar>();

    for (int i = 0; i < contacts.size(); i++)
      if (contacts.get(i).toString().contains(pattern))
        contactsAux.add(contacts.get(i));

    return contactsAux;
  }
  
  /**
   * O método getContacts() retorna a lista de contatos.
   * @return atributos contacts
   */
  public List<ContactStar> getContacts() {
    return this.contacts;
  }
  
  /**
   * O método toString() retorna a classe Agenda como uma string
   */
  public String toString() {
    StringBuffer stringBuffer = new StringBuffer();

    for (int i = 0; i < contacts.size(); i++) {
      if (contacts.get(i).getStar()) stringBuffer.append("@ ");
      else stringBuffer.append("- ");

      stringBuffer.append(contacts.get(i).toString());
      if (i != contacts.size()-1) stringBuffer.append("\n");
    }

    return stringBuffer.toString();
  }
}
