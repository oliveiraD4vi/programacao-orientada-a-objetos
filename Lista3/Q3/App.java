import java.util.Scanner;
import java.util.Locale;

public class App {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner input = new Scanner(System.in);

    Voo voo = new Voo();
    Data dataDoVoo = new Data();

    System.out.printf("Insira o número do voo: ");
    int num = input.nextInt();

    System.out.println("Insira a data da sua viagem: ");
    byte dia = input.nextByte();
    byte mes = input.nextByte();
    short ano = input.nextShort();

    voo.construtor(num, dia, mes, ano);

    System.out.println();
    if (voo.vagas() != 0) {
      System.out.println("Há " + voo.vagas() + " vagas livres neste voo.");
      System.out.println("Um assento será escolhido dentre os vagos. O próximo vago é o de número " + (voo.proximoLivre() + 1) + ".");
      voo.ocupa(voo.proximoLivre());

      System.out.println();

      System.out.println("Dados do voo:");
      System.out.println("------------------");
      System.out.println();

      dataDoVoo = voo.getData();

      System.out.println("Número do voo: " + voo.getVoo());
      System.out.println("Número do assento: " + voo.proximoLivre());
      System.out.println("Data : " + dataDoVoo.getDia() + "/" + dataDoVoo.getMes() + "/" + dataDoVoo.getAno());
    } else 
      System.out.println("Não há assentos livres!");

    input.close();
  }
}
