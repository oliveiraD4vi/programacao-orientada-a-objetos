public class Car {
  private int pass;     // Passageiros
  private int passMax;  // limite de Passageiros
  private int gas;      // tanque
  private int gasMax;   // limite do tanque
  private int km;       // quantidade de quilometragem
  
  public Car();

  public String toString();
  
  public void in();
  
  public void out();
  
  public void fuel(int gas);
  
  public void drive (int km);
}
