/**
 * A classe Agenda representa uma agenda eltrônica de conta
 * tos. Como tal, possui uma lista de Contatos. Nesta class
 * e, é possível inserir contatos, remove-los e também remo
 * ver um número específico de um contato, entre outras ope
 * rações.
 * @author Davi Silva Alves de Oliveira
 */

package Agenda;

import Contact.Contact;
import java.util.*;

public class Agenda {
  private List<Contact> contacts = new ArrayList<Contact>();
  
  /**
   * 
   */
  public Agenda() {}
  
  /**
   * 
   * @param name
   * @return
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
   * 
   * @param name
   * @return
   */
  public Contact findContact(String name) {
    return contacts.get(findPosByName(name));
  }
  
  /**
   * 
   * @param contact
   */
  public void addContact(Contact contact) {
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

    this.contacts.sort((Contact c1, Contact c2) -> (c1.getName().compareTo(c2.getName())));
  }
  
  /**
   * 
   * @param name
   */
  public void rmContact(String name) {
    contacts.remove(findPosByName(name));
  }
  
  /**
   * 
   * @param pattern
   * @return
   */
  public List<Contact> search(String pattern) {
    List<Contact> contactsAux = new ArrayList<Contact>();

    for (int i = 0; i < contacts.size(); i++)
      if (contacts.get(i).toString().contains(pattern))
        contactsAux.add(contacts.get(i));

    return contactsAux;
  }
  
  /**
   * 
   * @return
   */
  public List<Contact> getContacts() {
    return this.contacts;
  }
  
  /**
   * 
   */
  public String toString() {
    StringBuffer stringBuffer = new StringBuffer();

    for (int i = 0; i < contacts.size(); i++) {
      stringBuffer.append(contacts.get(i).toString());
      if (i != contacts.size()-1) stringBuffer.append("\n");
    }

    return stringBuffer.toString();
  }
}
