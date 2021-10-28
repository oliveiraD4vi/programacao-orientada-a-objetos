import java.util.Locale;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner input = new Scanner(System.in);

    NumeroComplexo num = new NumeroComplexo();

    num.inicializaNumero((double) 5, (double) 4);
    num.imprimeNumero();

    input.close();
  }
}
