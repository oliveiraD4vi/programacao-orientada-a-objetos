/**
 * @author Davi Silva Alves de Oliveira
 */

package Lista2.Q1.Modelo2;
import java.util.Locale;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner input = new Scanner(System.in);

    HoraPrecisa horaPrecisa = new HoraPrecisa();

    horaPrecisa.inicializaHora((byte) 23, (byte) 59, (byte) 59, (byte) 98);
    horaPrecisa.mostraHora();

    input.close();
  }
}
