class Car {
  private int pass; // Passageiros
  private int passMax; // limite de Passageiros
  private int gas; // tanque
  private int gasMax; // limite do tanque
  private int km; // quantidade de quilometragem
  public Car();
  public String toString();
  public void in();
  public void out();
  public void fuel(int gas);
  public void drive (int km);
};

class Solver {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Car car = new Car();

    while(true) {
      String line = scanner.nextLine();
      String ui[] = line.split(" ");
      System.out.println("$" + line);
      if(ui[0].equals("end")) {
          break;
      } else if(ui[0].equals("in")) {
          car.in();
      } else if(ui[0].equals("out")) {
          car.out();
      } else if(ui[0].equals("show")) {
          System.out.println(car.toString());
      } else if (ui[0].equals("drive")) {//km
          car.drive(Integer.parseInt(ui[1]));
      } else if (ui[0].equals("fuel")) {//gas
          car.fuel(Integer.parseInt(ui[1]));
      } else{
          System.out.println("fail: comando invalido");
      }
    }
  }
};

class Manual {
  public static void main(String[] args) {
    Car car = new Car();
    System.out.println(car);
    //pass: 0, gas: 0, km: 0
    car.in();
    car.in();
    System.out.println(car);
    //pass: 2, gas: 0, km: 0
    car.in();
    //fail: limite de pessoas atingido
    System.out.println(car);
    //pass: 2, gas: 0, km: 0
    car.out();
    car.out();
    car.out();
    //fail: nao ha ninguem no carro
    System.out.println(car);
    //pass: 0, gas: 0, km: 0

    car = new Car();
    car.fuel(60);
    System.out.println(car);
    //pass: 0, gas: 60, km: 0

    car.drive(10);
    //fail: nao ha ninguem no carro

    car.in();
    car.drive(10);
    System.out.println(car);
    //pass: 1, gas: 50, km: 10

    car.drive(70);
    //fail: tanque vazio apos andar 50 km
    car.drive(10);
    //fail: tanque vazio
    System.out.println(car);
    //pass: 1, gas: 0, km: 60

    car.fuel(200);
    System.out.println(car);
    //pass: 1, gas: 100, km: 60
  }
}
