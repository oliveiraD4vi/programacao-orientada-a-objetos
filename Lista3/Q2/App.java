import java.util.Scanner;
import java.util.Locale;

public class App {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner input = new Scanner(System.in);

    Data hoje = new Data();
    hoje.construtor((byte)28, (byte)10, (short)2021);

    Data onzeSetembro = new Data();
    onzeSetembro.construtor((byte)11, (byte)9, (short)2001);
    
    Data independenciaBrasil = new Data();
    independenciaBrasil.construtor((byte)7, (byte)9, (short)1822);

    Data meuAniversario = new Data();
    meuAniversario.construtor((byte)8, (byte)10, (short)2001);

    input.close();
  }
}
