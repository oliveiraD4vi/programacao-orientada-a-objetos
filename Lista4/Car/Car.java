/**
 * A classe car representa um carro cujos atributos incluem o número de passageiros,
 * bem como a quantidade máxima de passageiros suportados; o combustível e a quanti-
 * dade máxima de combustível que cabe no tanque; a quilometragem. Seus métodos inc-
 * luem embarcar e desembarcar passageiros; colocar combustível e adicionar quilome-
 * tragem ao carro. Para além destes, temos o construtor e o método toString, cujas
 * finalidade já são do nosso conhecimento.
 * @author Davi Silva Alves de Oliveira
 */

public class Car {
  private int pass;     // Passageiros
  private int passMax;  // limite de Passageiros
  private int gas;      // tanque
  private int gasMax;   // limite do tanque
  private int km;       // quantidade de quilometragem
  
  /**
   * O construtor Car inicia os valores para os atributos da classe
   */
  public Car() {
    pass = 0;
    passMax = 2;
    gas = 0;
    gasMax = 100;
    km = 0;
  };

  /**
   * O método toString seta um comportamente padrão para a saída do objeto como string
   */
  public String toString() {
    return ("pass: " + pass + ", gas: " + gas + ", km: " + km);
  };
  
  /**
   * O método in embarca novos passageiros a depender do limite
   */
  public void in() {
    if (pass < passMax) pass++;
    else System.out.println("fail: limite de pessoas atingido");
  };
  
  /**
   * O método out desembarca passageiros a depender da quantidade
   */
  public void out(){
    if (pass > 0) pass--;
    else System.out.println("fail: nao ha ninguem no carro");
  };
  
  /**
   * O método fuel insere combustível no carro a partir do parametro gas
   * @param gas é o valor a ser inserido de combustível
   */
  public void fuel(int gas){
    if ((gas + this.gas) <= gasMax) this.gas = this.gas + gas;
    else this.gas = 100;
  };
  
  /**
   * O método drive insere a quantidade de quilometros dirigidos
   * @param km o valor inserido de quilometros
   */
  public void drive (int km){
    if (pass > 0) {
      if (gas <= 0) {
        System.out.println("fail: tanque vazio");
      } else if (gas - km <= 0) {
        System.out.println("fail: tanque vazio apos andar " + gas + " km");
        this.km = this.km + gas;
        gas = 0;
      } else {
        this.km = this.km + km;
        gas = this.gas - km;
      }
    } else {
      System.out.println("fail: nao ha ninguem no carro");
    }
  };
}
