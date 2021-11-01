/**
 * A classe Voo [...]
 * @author Davi Silva Alves de Oliveira
 */

public class Voo {

  private int numeroDoVoo;
  private Data data = new Data();
  private int[] assentos = new int[100];

  /**
   * O método construtor define os dados passados por parâmetro.
   * @param numeroDoVoo é o número do voo passado
   * @param data é a data do voo em questão
   */
  public void construtor(int numeroDoVoo, byte dia, byte mes, short ano) {
    this.numeroDoVoo = numeroDoVoo;
    this.data.construtor(dia, mes, ano);
    for (int i = 0; i < 100; i++) assentos[i] = 0;
  }

  /**
   * O método proximoLivre retorna o número da próxima cadeira livre.
   * @return próxima cadeira livre
   */
  public int proximoLivre() {
    int element = -1;
    
    for (int i = 0; i < 100; i++) {
      if (assentos[i] == 0) {
        element = i;
        break;
      }
    }

    return element;
  }

  /**
   * O método verifica testa se a cadeira, cujo número recebido como parâmetro, está ocupada.
   * @param numeroDoAssento é o número do voo em questão
   * @return true se ocupada, false se não ocupada
   */
  public boolean verifica(int numeroDoAssento) {
    if (assentos[numeroDoAssento] == 0) return false;
    else return true;
  }

  /**
   * O método ocupa ocupa determinada cadeira do voo, cujo número é recebido como parâmetro.
   * @param numeroDoAssento é o número do voo em questão
   * @return true se a cadeira ainda não estiver ocupada e falso caso contrário
   */
  public boolean ocupa(int numeroDoAssento) {
    if (!verifica(numeroDoAssento)) {
      assentos[numeroDoAssento] = 1;
      return true;
    } else return false;
  }

  /**
   * O método vagas retorna o número de cadeiras vagas disponı́veis.
   * @return numero de vagas
   */
  public int vagas() {
    int vagas = 0;
    
    for (int i = 0; i < 100; i++) {
      if (assentos[i] == 0)
        vagas++;
    }

    return vagas;
  }

  /**
   * O método getVoo retorna o número do voo.
   * @return o número do voo
   */
  public int getVoo() {
    return numeroDoVoo;
  }

  /**
   * O método getData retorna a data do voo.
   * @return objeto data
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
    cloneVoo.construtor(numeroDoVoo, data.getDia(), data.getMes(), data.getAno());

    return cloneVoo;
  }
}
