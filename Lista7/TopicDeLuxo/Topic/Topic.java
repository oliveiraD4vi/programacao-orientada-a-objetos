/**
 * A Classe Topic representa uma topic que leva diversos passageiros,
 * dentre eles, temos aqueles que se colocam em assentos normais e aq
 * ueles que ficam em assentos prioritários. Temos então duas listasd
 * e passageiros relacionadas a cada um desses tipos. Quanto aos méto
 * dos, temos para além do construtor e do toString, o insert(), usad
 * o para inserir alguém na topic sob determinadas condições, utiliza
 * ndo de forma auxiliar os métodos insertOnList() e FindByName(), qu
 * e respectivamente insere o passageiro na lista específica e encont
 * ra a posição pelo nome do passageiro. No caso do insertOnList(), e
 * le ainda faz uso do método findFirstFree() que retorna a posição l
 * ivre mais próxima encontrada. Temos também o método remove() que u
 * tiliza o método removeFromList() para retirar o passageiro.
 * @author Davi Silva Alves de Oliveira
 */

package Topic;
import java.util.*;
import Pass.*;

public class Topic {
  private ArrayList<Pass> prioritySeats = new ArrayList<Pass>();
  private ArrayList<Pass> normalSeats =  new ArrayList<Pass>();

  /**
   * O método construtor Topic seta os valores iniciais da duas listas com valores coringa
   * @param capacity é a capacidade máxima da topic
   * @param qtdPriority é a quantidade de assentos prioritários
   */
  public Topic(int capacity, int qtdPriority) {
    Pass emptyNormal = new Pass("", 0);
    Pass emptyOlder = new Pass("", 65);

    for (int i = 0; i < qtdPriority; i++)
      prioritySeats.add(emptyOlder);

    for (int i = 0; i < capacity - qtdPriority; i++)
      normalSeats.add(emptyNormal);
  }
  
  /**
   * O método findFirstFreePos encontra a primeira posição livre na lita passada
   * @param list é a lista a ser pesquisada
   * @return posição se der certo, -1 se não tiver
   */
  private int findFirstFreePos(ArrayList<Pass> list) {
    int firstFree = 0;

    for (int i = 0; i < list.size(); i++) {
      if (list.get(i).getName().equals("")) {
        firstFree = i;
        break;
      } else firstFree = -1;
    }

    return firstFree;
  }
  
  /**
   * O método findByName encontra um passageiro na lista especificada
   * @param name é o nome do passageiro a ser procurado
   * @param list é a lista a ser pesquisada
   * @return posição do passageiro, -1 se não encontrar
   */
  private int findByName(String name, ArrayList<Pass> list) {
    int position = 0;

    for (int i = 0; i < list.size(); i++) {
      if (list.get(i).getName().equals(name)) {
        position = i;
        break;
      } else position = -1;
    }

    return position;
  }
  
  /**
   * O método insertOnList insere um passageiro em uma lista especifica
   * @param pass é o passageiro a ser inserido
   * @param list é a lista a ser testada
   * @return true se der certo, false se não
   */
  private boolean insertOnList(Pass pass, ArrayList<Pass> list) {
    int firstFree = findFirstFreePos(list);

    if (firstFree != -1) {
      list.remove(firstFree);
      list.add(firstFree, pass);
      return true;
    } else {
      System.out.println("fail: topic lotada");
      return false;
    }
  }
  
  /**
   * O método removeFromList remove o passageiro da lista especificada
   * @param name é o nome da passageiro a ser removido
   * @param list é a lista a ser testada
   * @return true se der certo, false se não
   */
  private boolean removeFromList(String name, ArrayList<Pass> list) {
    Pass empty = new Pass("", 0);
    int position = findByName(name, list);

    if (position != -1) {
      list.remove(position);
      list.add(position, empty);
      return true;
    } else {
      System.out.println("fail: pass nao esta na topic");
      return false;
    }
  }
  
  /**
   * O método insert insere o passageiro na lista determinada
   * @param pass é o passageiro a ser inserido
   * @return true se der certo, false se não
   */
  public boolean insert(Pass pass) {
    ArrayList<Pass> list = new ArrayList<Pass>();

    if (pass.isPriority()) list = prioritySeats;
    else list = normalSeats;

    if (findByName(pass.getName(), list) == -1) {
      insertOnList(pass, list);
      return true;
    } else {
      System.out.println("fail: pass ja esta na topic");
      return false;
    }
  }
  
  /**
   * O método remove tenta remover o passageiro das duas listas
   * @param name é o nome do passageiro a ser removido
   * @return true se removido, false se não
   */
  public boolean remove(String name) {
    boolean removed = false;

    if (removeFromList(name, prioritySeats)) removed = true; 
    if (removeFromList(name, normalSeats)) removed = true;
    
    return removed;
  }

  /**
   * O método toString retorna o objeto em forma de string
   */
  public String toString() {
    return ("" + prioritySeats + normalSeats);
  }
}
