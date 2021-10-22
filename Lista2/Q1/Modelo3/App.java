/**
 * @author Davi Silva Alves de Oliveira
 */

package Lista2.Q1.Modelo3;
import java.util.Locale;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner input = new Scanner(System.in);

    DataHora dataHora = new DataHora();

    dataHora.inicializaDados((byte)12, (byte)59, (byte)10, (byte)10, (short)2010);
    dataHora.mostraDados();

    input.close();
  }
}
