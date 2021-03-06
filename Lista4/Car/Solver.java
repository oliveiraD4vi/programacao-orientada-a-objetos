import java.util.Scanner;

public class Solver {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    Car car = new Car();

    while(true) {
      String line = input.nextLine();
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

    input.close();
  }
}
