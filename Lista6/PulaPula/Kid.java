/**
 * @author Davi Silva Alves de Oliveira
 */

class Kid {
  private int age;
  private String name;

  /**
   * O método Kid é o construtor que seta os valores dos atributos
   * para o objeto.
   * @param name é o nome da criança
   * @param age é a idade da criança
   */
  public Kid(String name, int age) {
    this.name = name;
    this.age = age;
  }
  
  /**
   * O método getAge retorna a idade da criança
   * @return a idade
   */
  int getAge() {
    return age;
  }
  
  /**
   * O método getName retorna o nome da criança
   * @return o nome
   */
  String getName() {
    return name;
  }
  
  /**
   * O método setAge determina o valor da idade da criança
   * @param age é a idade a ser setada
   */
  void setAge(int age) {
    this.age = age;
  }
  
  /**
   * O método setName determinar o valor do nome da criança
   * @param name é o nome da criança a ser setado
   */
  public void setName(String name) {
    this.name = name;
  }
  
  /**
   * O método toString retorna os valores do objeto como uma string
   */
  public String toString() {
    return (name + ":" + age);
  }
}
