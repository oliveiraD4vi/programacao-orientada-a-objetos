import java.text.DecimalFormat;

public class Calculator {
  private int batteryMax;
  private int battery;
  private float display;
  
  //Inicia os atributos, battery e display começam com o zero.
  public Calculator(int batteryMax) {
    this.batteryMax = batteryMax;
    battery = 0;
    display = 0;
  };

  /**
   * O método chargeBattery aumenta a bateria, porém não além do máximo.
   * @param value é o valor a ser aumentado da bateria
   */
  public void chargeBattery(int value) {
    if (battery + value < batteryMax) battery = battery + value;
    else battery = batteryMax;
  }; 

  /**
   * O método useBattery tenta gastar uma unidade da bateria e emite um erro se não conseguir.
   * @return true se conseguir, false se não
   */
  public boolean useBattery() {
    if (battery > 0) {
      battery--;
      return true;
    } else {
      System.out.println("fail: bateria vazia");
      return false;
    }
  }; 

  /**
   * O método sum se conseguir gastar bateria, armazena a soma no atributo display.
   * @param a é um dos valores a serem somados
   * @param b é um dos valores a serem somados
   */
  public void sum(int a, int b) {
    if (useBattery()) display = a + b;
  }; 

  /**
   * O método division divide se conseguir gastar bateria e não for divisão por 0.
   * @param num é o numerador da divisão
   * @param den é o denominador da divisão
   */
  public void division(int num, int den) {
    if (useBattery() && den != 0) display = num/den;
  };

  /**
   * O método toString retorna o conteúdo do display com duas casas decimais.
   */
  public String toString() {
    DecimalFormat d = new DecimalFormat("0.00");
    return ("display = " + d.format(display) + ", battery = " + battery);
  };
}
