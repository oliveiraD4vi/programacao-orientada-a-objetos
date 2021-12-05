package Sala;
import java.util.ArrayList;

import Cliente.Client;

public class Sala{
  private int capacidade;
  private ArrayList<Client> cadeiras = new ArrayList();
  // ArrayList<Client> getCadeiras();
  
  /**
   * 
   * @param capacidade
   */
  public Sala(int capacidade) {
    this.capacidade = capacidade;
  }
  
  /**
   * 
   * @param id
   * @param fone
   * @param ind
   * @return
   */
  public boolean reservar(String id, String fone, int ind) {
    return true;
  }
  
  /**
   * 
   * @param id
   */
  public void cancelar(String id) {

  }
  
  /**
   * 
   */
  public String toString() {
    return ("sala");
  }
}
