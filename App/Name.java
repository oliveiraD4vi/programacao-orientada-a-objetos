package App;
import java.util.Scanner;

public class Name {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Qual o seu nome?");
    String nome = input.nextLine();

    System.out.println("Qual a sua idade?");
    int idade = input.nextInt();

    System.out.println("Olá " + nome + ". \nPróximo ano você completará " + (idade + 1) + " anos.");

    input.close();
  }
}
