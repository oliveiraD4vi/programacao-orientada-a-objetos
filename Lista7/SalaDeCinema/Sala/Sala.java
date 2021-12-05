/**
 * A Classe Sala utiliza-se de outra classe, a classe Client, para
 * determinar os assentos de uma sala de cinema. Dentre os atribut
 * os necessários para isso temos, essencialmente, um arraylist qu
 * e determina as cadeiras da sala. Quanto aos métodos desta class
 * e, temos, para além do construtor e do método toString, os méto
 * dos reservar e cancelar que, respectivamente, aloca um clientea
 * uma cadeira solicitada se disponível e cancela esta mesma reser
 * va caso o cliente se encontre na sala.
 * @author Davi Silva Alves de Oliveira
 */

package Sala;
import java.util.ArrayList;

import Cliente.*;

public class Sala{
  private ArrayList<Client> cadeiras = new ArrayList<Client>();
  
  /**
   * O construtor Sala inicia os valores das cadeiras como vazias
   * @param capacidade
   */
  public Sala(int capacidade) {
    Client emptyChair = new Client("", "");

    for (int i = 0; i < capacidade; i++)
      cadeiras.add(emptyChair);
  }
  
  /**
   * O método reservar reserva uma cadeira vazia para um cliente
   * @param id é o id do cliente a ser reservado
   * @param fone é o telefone do cliente a ser reservado
   * @param ind é o índice da cadeira do cliente
   * @return true caso sucessos, false caso não
   */
  public boolean reservar(String id, String fone, int ind) {
    Client newClient = new Client(id, fone);
    Client cadeiraInd = cadeiras.get(ind);

    for (int i = 0; i < cadeiras.size(); i++) {
      if (cadeiras.get(i).getId().equals(id)) {
        System.out.println("fail: cliente ja esta no cinema");
        return false;
      }
    }

    if (cadeiraInd.getId() == "") {
      cadeiras.remove(ind);
      cadeiras.add(ind, newClient);
      return true;
    } else {
      System.out.println("fail: cadeira ja esta ocupada");
      return false;
    }
  }
  
  /**
   * O método cancelar retira a reserva de um cliente da sala
   * @param id é o id do cliente a ser retirado
   */
  public void cancelar(String id) {
    Client emptyChair = new Client("", "");
    boolean exit = false;

    for (int i = 0; i < cadeiras.size(); i++) {
      Client cadeiraInd = cadeiras.get(i);

      if (cadeiraInd.getId().equals(id)) {
        cadeiras.remove(i);
        cadeiras.add(i, emptyChair);
        exit = true;
      }
    }

    if (!exit) System.out.println("fail: cliente nao esta no cinema");
  }
  
  /**
   * O método toString retorna o elemento em formato de string
   */
  public String toString() {
    return ("" + cadeiras + "");
  }
}
