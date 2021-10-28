/**
 * A classe NumeroComplexo [...]
 * @author Davi Silva Alves de Oliveira
 */

public class NumeroComplexo {

  public double real;
  public double imgn;

  /**
   * O método inicializaNumero inicializa os campos da classe (parte real e imaginária).
   */
  public void inicializaNumero(double real, double imgn) {
    this.real = real;
    this.imgn = imgn;
  }

  /**
   * O método imprimeNumero imprime o número complexo encapsulado usando a notação a + bi,
   * onde a é a parte real e b a imaginária.
   */
  public void imprimeNumero() {
    System.out.printf("%.2f + %.2fi\n", real, imgn);
  }

  /**
   * O método ehIgual recebe outra instância da classe NumeroComplexo e compara com os
   * valores encapsulados.
   * @param num é uma instância da classe NumeroComplexo a ser comparada com os valo-
   * res encapsulados.
   * @return true se os valores dos campos encapsulados forem iguais aos da instância
   * passada como argumento, false se não.
   */
  public boolean ehIgual(NumeroComplexo num) {
    if (real == num.real && imgn == num.imgn) return true;
    else return false;
  }

  /**
   * O método soma recebe outra instância da classe NumeroComplexo e soma este número
   * complexo com o encapsulado.
   * @param num é uma instância da classe NumeroComplexo a ser somada com os valo-
   * res encapsulados.
   * @return resultado do cálculo efetuado.
   */
  public double soma (NumeroComplexo num) {
    return (double) 1;
  }

  /**
   * O método subtrai recebe outra instância da classe NumeroComplexo e subtrai este 
   * número complexo com o encapsulado.
   * @param num é uma instância da classe NumeroComplexo a ser subtraída dos valo-
   * res encapsulados.
   * @return resultado do cálculo efetuado.
   */
  public double subtrai (NumeroComplexo num) {
    return (double) 1;
  }

  /**
   * O método multiplica recebe outra instância da classe NumeroComplexo e myltiplica este 
   * número complexo com o encapsulado.
   * @param num é uma instância da classe NumeroComplexo a ser multiplicada com os 
   * valores encapsulados.
   * @return resultado do cálculo efetuado.
   */
  public double multiplica (NumeroComplexo num) {
    return (double) 1;
  }

  /**
   * O método divide recebe outra instância da classe NumeroComplexo e divide este número
   * complexo com o encapsulado.
   * @param num é uma instância da classe NumeroComplexo a ser divididos dos valo-
   * res encapsulados.
   * @return resultado do cálculo efetuado.
   */
  public double divide (NumeroComplexo num) {
    return (double) 1;
  }
}
