package Sala;
import java.util.ArrayList;

import Cliente.*;

public class Sala{
  private ArrayList<Client> cadeiras = new ArrayList<Client>();
  
  /**
   * 
   * @param capacidade
   */
  public Sala(int capacidade) {
    Client emptyChair = new Client("", "");

    for (int i = 0; i < capacidade; i++)
      cadeiras.add(emptyChair);
  }
  
  /**
   * 
   * @param id
   * @param fone
   * @param ind
   * @return
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
   * 
   * @param id
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
   * 
   */
  public String toString() {
    return ("" + cadeiras + "");
  }
}
