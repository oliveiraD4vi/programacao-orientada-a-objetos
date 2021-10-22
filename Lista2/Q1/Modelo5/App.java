/**
 * @author Davi Silva Alves de Oliveira
 */

package Lista2.Q1.Modelo5;
import java.util.Locale;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner input = new Scanner(System.in);

    DataPrecisa data = new DataPrecisa();

    data.inicializaData((byte)29, (byte)02, (short)1900);
    data.mostraData();

    input.close();
  }
}
