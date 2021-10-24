/**
 * O modelo DataHora representa uma data e uma hora aproximada simultaneamente
 * e utiliza os atributos correspondentes aos valores de dia, mês e ano, para
 * além desses, utiliza uma instância do modelo HoraAproximada para determinar
 * os valores para a hora.
 * @author Davi Silva Alves de Oliveira
 */

package Lista2.Q1.Modelo3;
import Lista2.Q1.Modelo1.HoraAproximada;

class DataHora {
  
  HoraAproximada hora = new HoraAproximada();
  byte dia;
  byte mes;
  short ano;

  /**
   * O método inicializaDados inicializa os valores das variáveis.
   * @param h é o valor das horas passada pelo usuário
   * @param m é o valor dos minutos passado pelo usuário
   * @param d é o valor dos segundos passado pelo usuário
   * @param ms é o valor dos centésimos de segundos passado pelo usuário
   * @param a é o valor do ano passado pelo usuário
   */
  void inicializaDados(byte h, byte m, byte d, byte ms, short a) {
    hora.inicializaHora(h, m);
    hora.horasNow = 12;
    hora.minutosNow = 30;
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
   * O método mostraDados imprime os valores dependendo da composição
   * e imprime também se os dados inseridos não forem válidos.
   */
  void mostraDados() {
    System.out.println();
    
    if (verificaDataValida()) System.out.println(dia + "/" + mes + "/" + ano);
    else System.out.println("01/01/2001");
    hora.mostraHora();

    System.out.println();
  }
}
