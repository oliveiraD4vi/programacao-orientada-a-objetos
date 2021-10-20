/**
 * @author Davi Silva Alves de Oliveira
 */

package Lista2.Q5.Modelo3;
import java.util.Locale;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner input = new Scanner(System.in);

    Empregado empregado = new Empregado();

    String nome = input.nextLine();
    String depart = input.nextLine();
    float salPorHora = input.nextFloat();
    float horasPorMes = input.nextFloat();
    float horasExtras = input.nextFloat();

    empregado.inicializaDados(nome, depart, horasPorMes, salPorHora, horasExtras);
    empregado.mostraDados();

    input.close();
  }
}
