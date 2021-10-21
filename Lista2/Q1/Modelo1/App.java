/**
 * @author Davi Silva Alves de Oliveira
 */

package Lista2.Q1.Modelo1;
import java.util.Locale;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner input = new Scanner(System.in);

    HoraAproximada horaAproximada = new HoraAproximada();

    horaAproximada.inicializaHora((byte) 0, (byte) 59);
    horaAproximada.mostraHora();

    input.close();
  }
}
