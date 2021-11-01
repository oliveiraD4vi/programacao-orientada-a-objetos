/**
 * A classe Voo [...]
 * @author Davi Silva Alves de Oliveira
 */

public class Voo {

  private int numeroDoVoo;
  private Data data;
  private int[] assentos = new int[100];

  /**
   * 
   * @param numeroDoVoo
   * @param data
   */
  public void construtor(int numeroDoVoo, Data data) {

  }

  /**
   * 
   * @return
   */
  public int proximoLivre() {
    return 1;
  }

  /**
   * 
   * @param numeroDoAssento
   * @return
   */
  public boolean verifica(int numeroDoAssento) {
    return true;
  }

  /**
   * 
   * @param numeroDoAssento
   * @return
   */
  public boolean ocupa(int numeroDoAssento) {
    return true;
  }

  /**
   * 
   * @return
   */
  public int vagas() {
    return 10;
  }

  /**
   * 
   * @return
   */
  public int getVoo() {
    return 1;
  }

  /**
   * 
   * @return
   */
  public Data getData() {
    return data;
  }

  /**
   * O método clone cria um novo objeto da classe Voo com os mesmos valores de
   * atributos e retorna sua referência.
   * @return referência do clone da data corrente
   */
  public Voo clone() {
    Voo cloneVoo = new Voo();
    cloneVoo.construtor(numeroDoVoo, data);

    return cloneVoo;
  }
}
