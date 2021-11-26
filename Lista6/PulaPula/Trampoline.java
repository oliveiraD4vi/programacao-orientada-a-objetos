/**
 * @author Davi Silva Alves de Oliveira
 */

import java.util.LinkedList;

class Trampoline{
  private LinkedList<Kid> waiting = new LinkedList<Kid>();
  private LinkedList<Kid> playing = new LinkedList<Kid>();

  /**
   * O método remove_kid é utilizado pelo método remove para remover uma criança
   * de uma lista específica.
   * @param name é o nome da criança a ser buscada na lista
   * @param list é a lista a ser iterada
   * @return a criança retirada
   */
  private Kid remove_kid(String name, LinkedList<Kid> list) {
    Kid kid = new Kid(name, 10);

    for (int i = 0; i < list.size(); i++) {
      if (list.get(i).getName() == name) {
        kid = list.get(i);
        list.remove(kid);
        break;
      }
    }

    return kid;
  }
  
  /**
   * O método arrive coloca uma criança na lista de espera
   * @param kid é a criança a ser colocada na lista de espera
   */
  public void arrive(Kid kid) {
    waiting.addFirst(kid);
  }
  
  /**
   * O método in passa uma criança da lista de espera para a lista de playing
   */
  public void in() {
    playing.addFirst(waiting.getLast());
    waiting.removeLast();
  }
  
  /**
   * O método out retira uma criança da lista de play para a lista de espera
   */
  public void out() {
    waiting.addFirst(playing.getLast());
    playing.removeLast();
  }
  
  /**
   * O método remove retira a primeira criança que aparecer com o nome passado
   * de uma lista ou de outra, o primeiro que aparecer
   * @param name é o nome da criança a ser retirada
   * @return a criança retirada
   */
  public Kid remove(String name) {
    Kid kid = new Kid("undefined", 0);

    kid = remove_kid(name, waiting);
    if (kid.getName() == "undefined") remove_kid(name, playing);

    return kid;
  }
  
  /**
   * O método toString retorna o objeto como uma string
   */
  public String toString() {
    return ("=> " + waiting + " => " + playing);
  }
}
