/**
 * A classe Pet é uma representação de um game de cuidados de um pet virtual
 * baseada no famoso Tamagotchi, popular na década de 90. Como tal apresenta
 * os atributos de energia, fome e limpeza, bem como os atributos referentes
 * ao máximo que eles podem valer. Além desses, temos os atributos de diaman
 * tes, que são como recompensas de ações, a idade, que aumenta sempre que u
 * ma atividade é realizada, e o atributo que informa se o pet está vivo. Qu
 * anto aos métodos, temos o construtor e o método toString, cujas funcional
 * idades já conhecemos. Além desses, temos os getters e setters para os atr
 * ibutos com exceção de diamantes, idade e vida. Adicionalmente, temos os m
 * étodos para a atividade de brincar, de dormir, comer e banhar.
 * @author Davi Silva Alves de Oliveira
 */

class Pet{
  private int energyMax, hungryMax, cleanMax;
  private int energy, hungry, shower;
  private int diamonds;
  private int age;
  private boolean alive;

  /**
   * O método setEnergy seta o valor do atributo energy
   * @param value é o valor passado para o atributo energy
   */
  void setEnergy(int value){
    if(value <= 0){
      this.energy = 0;
      System.out.println("fail: pet morreu de fraqueza");
      this.alive = false;
    }
    else if(value > this.energyMax)
      this.energy = this.energyMax;
    else
      this.energy = value;
  }

  /**
   * O método setHungry seta o valor do atributo hungry
   * @param value é o valor passado para o atributo hungry
   */
  void setHungry(int value) {
    if(value <= 0){
      this.hungry = 0;
      System.out.println("fail: pet morreu de fome");
      this.alive = false;
    }
    else if(value > this.hungryMax)
      this.hungry = this.hungryMax;
    else
      this.hungry = value;
  }
  
  /**
   * O método setClean seta o valor do atributo shower
   * @param value é o valor passado para o atributo shower
   */
  void setClean(int value) {
    if(value <= 0){
      this.shower = 0;
      System.out.println("fail: pet morreu de sujeira");
      this.alive = false;
    }
    else if(value > this.cleanMax)
      this.shower = this.cleanMax;
    else
      this.shower = value;
  }

  /**
   * O método construtor Pet inicializa os valores energy, hungry e shower
   * @param energy é o valor passado para energyMax e energy
   * @param hungry é o valor passado para hungryMax e hungry
   * @param shower é o valor passado para cleanMax e shower
   */
  public Pet(int energy, int hungry, int shower) {
    this.energyMax = energy;
    setEnergy(energy);

    this.hungryMax = hungry;
    setHungry(hungry);

    this.cleanMax = shower;
    setClean(shower);

    this.diamonds = this.age = 0;
    this.alive = true;
  }
  
  /**
   * O método getClean retorna o valor do atributo shower
   * @return valor de clean
   */
  int getClean() {
    return this.shower;
  }
  
  /**
   * O método getHungry retorna o valor do atributo hungry
   * @return valor de hungry
   */
  int getHungry() {
    return this.hungry;
  }
  
  /**
   * O método getEnergy retorna o valor do atributo energy
   * @return valor de energy
   */
  int getEnergy() {
    return this.energy;
  }
  
  /**
   * O método getEnergyMax retorna o valor do atributo energyMax
   * @return valor de energyMax
   */
  int getEnergyMax() {
    return this.energyMax;
  }
  
  /**
   * O método getCleanMax retorna o valor do atributo cleanMax
   * @return valor de cleanMax
   */
  int getCleanMax() {
    return this.cleanMax;
  }
  
  /**
   * O método getHungryMax retorna o valor do atributo hungryMax
   * @return valor de hungryMax
   */
  int getHungryMax() {
    return this.hungryMax;
  }
  
  /**
   * O método toString imprime as informações do pet em forma de string
   */
  public String toString() {
    return (
      "E:" + this.energy + "/" + this.energyMax + 
      ", S:" + this.hungry + "/" + this.hungryMax + 
      ", L:" + this.shower + "/" + this.cleanMax + 
      ", D:" + this.diamonds + ", I:" + this.age + "\n"
    );
  }

  /**
   * O método testAlive testa se o pet está vivo
   * @return true se vivo, false se não
   */
  public boolean testAlive() {
    if (this.alive) return true;
    else return false;
  }

  /**
   * O método play executa uma ação de brincar com o pet
   */
  public void play() {
    if (testAlive()) {
      setEnergy(this.energy - 2);
      setHungry(this.hungry - 1);
      setClean(this.shower - 3);

      this.diamonds++;
      this.age++;
    } else {
      System.out.println("fail: pet esta morto");
    }
  }
  
  /**
   * O método shower recuperar o atributo shower do pet
   */
  public void shower() {
    if (testAlive()) {
      if (getClean() < getCleanMax()) {
        setEnergy(getEnergy() - 3);
        setHungry(getHungry() - 1);
        setClean(getCleanMax());
        this.age = this.age + 2;
      } else {
        System.out.println("fail: nao esta sujo");
      }
    } else {
      System.out.println("fail: pet esta morto");
    }
  }
  
  /**
   * O método eat recupera o atributo hungry do pet
   */
  public void eat() {
    if (testAlive()) {
      if (getHungry() < getHungryMax()) {
        setEnergy(getEnergy() - 1);
        setHungry(getHungryMax());
        setClean(getClean() - 2);
        this.age++;
      } else {
        System.out.println("fail: nao esta com fome");
      }
    } else {
      System.out.println("fail: pet esta morto");
    }
  }
  
  /**
   * O método sleep recupera a energia do pet
   */
  public void sleep() {
    if (testAlive()) {
      if (getEnergy() < getEnergyMax()) {
        setEnergy(getEnergyMax());
        setHungry(getHungry() - 1);
        this.age = this.age + 5;
      } else {
        System.out.println("fail: nao esta com sono");
      }
    } else {
      System.out.println("fail: pet esta morto");
    }
  }
}