/**
 * A classe Motorcycle representa uma moto infantil que só
 * pode ser pilotada por crianças de 10 anos ou menos. Co-
 * mo tal possui os atributos de power e time, que indicam
 * a potência de inicialização da motocicleta e o tempo co
 * mprado para andar no veículo. Além disso, utiliza-se um
 * objeto da classe person para indicar o piloto da motoci
 * cleta. Os métodos businar, embarcar, desembarcar, dirig
 * ir e comprar são necessários para seu funcionamento. Pa
 * ra além destes, temos ainda o método construtor e o toS
 * tring, cuja finalidade já nos é conhecida.
 * @author Davi Silva Alves de Oliveira
 */

public class Motorcycle {
  private Person person; //agregacao
  private int power;
  private int time;

  /**
   * O construtor Motorcycle inicia o atributo power, time com zero e person com null.
   * @param power é a potência da moto
   */
  public Motorcycle(int power) {
    person = null;
    this.power = power;
    time = 0;
  };

  /**
   * O método buy compra mais tempo.
   * @param time é o tempo a ser comprado
   */
  public void buy(int time) {
    this.time = this.time + time;
  };
  
  /**
   * O método in se estiver vazio, coloca a pessoa na moto e retorna true.
   * @param person é a pessoa a ser colocada na moto
   * @return true se der certo, false se não
   */
  public boolean in(Person person) {
    if (this.person == null) {
      this.person = person;
      return true;
    } else {
      System.out.println("fail: moto ocupada");
      return false;
    }
  };
  
  /**
   * O método out retira a pessoa, se ouver.
   * @return person se tiver quem tirar, null se não tiver
   */
  public Person out() {
    if (person == null) {
      System.out.println("fail: moto vazia");
      return null;
    } else {
      Person aux = person;
      person = null;
      return aux;
    }
  };
  
  /**
   * O método drive indica um tempo para a direção.
   * @param time é o tempo para dirigir
   */
  public void drive(int time) {
    if (person.getAge() <= 10 && this.time != 0) {
      if (this.time > 0) {
        if (this.time - time >= 0) {
          this.time = this.time - time;
        } else {
          System.out.println("fail: andou " + this.time + " min e acabou o time");
          this.time = 0;
        }
      } else {
        System.out.println("fail: time zerado");
      }
    } else {
      System.out.println("fail: muito grande para andar de moto");
    }
  };
  
  /**
   * O método honk sinaliza a buzina.
   */
  public void honk() {
    if (person == null) {
      System.out.println("fail: moto vazia");
    } else {
      System.out.printf("p");
      for (int i = 0; i < power; i++) {
        System.out.printf("e");
      }
      System.out.println("m");
    }
  };

  /**
   * O método toString retorna o objeto Motorcycle como uma string só.
   */
  public String toString() {
    if (person == null) return ("power: " + power + ", minutos: " + time + ", person: " + person);
    else return ("power: " + power + ", minutos: " + time + ", person: " + person.toString());
  };
}
