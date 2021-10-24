/**
 * O modelo Data utiliza como base o modelo visto em aula e adiciona
 * uma mensagem de Data Inválida caso algum dos atributos passados não
 * seja válido como elemento próprio
 * @author Davi Silva Alves de Oliveira
 */

package Lista2.Q1.Modelo4;

class Data {
  
  byte dia;
  byte mes;
  short ano;

  /**
   * O método inicializaData inicializa os valores das variáveis.
   * @param d é o valor do dia passado pelo usuário
   * @param ms é o valor do mês passado pelo usuário
   * @param a é o valor do ano passado pelo usuário
   */
  void inicializaData(byte d, byte ms, short a) {
    dia = d;
    mes = ms;
    ano = a;
  }

  /**
   * O método verificaDataValida verifica se os valores passados pelo usuário
   * são válidos enquanto elementos de hora e minuto.
   * @return true se for válido e false se não for
   */
  boolean verificaDataValida() {
    if (dia >= 1 && dia <= 31) {
      if (mes >= 1 && mes <= 12) {
        if (ano >= 1 && ano <= 9999) return true;
        else return false;
      } else return false;
    } else return false;
  }

  /**
   * O método mostraData imprime os valores dependendo da composição
   * e imprime também se os dados inseridos não forem válidos.
   */
  void mostraData() {
    System.out.println();
    
    if (verificaDataValida()) System.out.println(dia + "/" + mes + "/" + ano);
    else System.out.println("Data inválida");

    System.out.println();
  }
}
