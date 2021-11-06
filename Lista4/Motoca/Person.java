/**
 * A classe Person representa a pessoa que utilizará a motocicleta.
 * @author Davi Silva Alves de Oliveira
 */

public class Person {
  private String name;
  private int age;

  /**
   * O construtor person inicializa os atributos da classe.
   * @param name é o nome da pessoa
   * @param age é a idade da pessoa
   */
  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  };

  /**
   * O método getAge retorna a idade da pessoa.
   * @return idade
   */
  public int getAge() {
    return age;
  };
  
  /**
   * O método toString retorna o elemento Person como uma única string.
   */
  public String toString(){
    return ("[" + name + ":" + age + "]");
  };
}
