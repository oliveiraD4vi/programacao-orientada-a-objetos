import java.util.Scanner;
import java.util.Locale;

public class App {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner input = new Scanner(System.in);
    
    Data data = new Data();

    System.out.println("Insira uma data: ");
    byte dia = input.nextByte();
    byte mes = input.nextByte();
    short ano = input.nextShort();

    data.construtor(dia, mes, ano);

    System.out.println();
    System.out.println("Você digitou: " + data.getDia() + "/" + data.getMes() + "/" + data.getAno());

    testaSeCombina(data);

    Data dataClone = new Data();

    dataClone = data.clone();

    System.out.println("Você clonou a data: " + dataClone.getDia() + "/" + dataClone.getMes() + "/" + dataClone.getAno());

    input.close();
  }

  public static void testaSeCombina(Data dataArg) {
    Data hoje = new Data();
    Data onzeSetembro = new Data();
    Data independenciaBrasil = new Data();
    
    hoje.construtor((byte)28, (byte)10, (short)2021);
    onzeSetembro.construtor((byte)11, (byte)9, (short)2001);
    independenciaBrasil.construtor((byte)7, (byte)9, (short)1822);

    if (hoje.compara(dataArg) == 0) {
      System.out.println("A data digitada é hoje! Estamos em " + hoje.getMesExtenso());
    }

    if (onzeSetembro.compara(dataArg) == 0)
      System.out.println("A data digitada é a data do atentado às torres gêmeas!");

    if (independenciaBrasil.compara(dataArg) == 0)
      System.out.println("A data digitada é o dia da independência do Brasil!");

    if (dataArg.isBissexto())
      System.out.println("O mês de Fevereiro possui 29 dias este ano!");

    System.out.println();
  }
}
