/**
 * @author Davi Silva Alves de Oliveira
 */

package Lista2.Q1.Modelo4;
import java.util.Locale;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner input = new Scanner(System.in);

    Data data = new Data();

    data.inicializaData((byte)00, (byte)10, (short)2010);
    data.mostraData();

    input.close();
  }
}
