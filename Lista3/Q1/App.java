import java.util.Locale;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner input = new Scanner(System.in);

    NumeroComplexo num1 = new NumeroComplexo();
    NumeroComplexo num2 = new NumeroComplexo();

    num1.inicializaNumero((double) 5, (double) 4);
    num2.inicializaNumero((double) 1, (double) 2);

    System.out.println("Serão realizadas as operações com os seguintes números complexos: ");
    num1.imprimeNumero();
    num2.imprimeNumero();

    System.out.println();
    if (num1.ehIgual(num2)) System.out.println("Os dois números complexos inseridos são iguais!");
    else System.out.println("Os números complexos inseridos são distintos.");
    System.out.println();

    System.out.println("Soma: " + num1.soma(num2));
    System.out.println("Subtração: " + num1.subtrai(num2));
    System.out.println("Produto: " + num1.multiplica(num2));
    System.out.println("Divisão: " + num1.divide(num2));

    input.close();
  }
}
