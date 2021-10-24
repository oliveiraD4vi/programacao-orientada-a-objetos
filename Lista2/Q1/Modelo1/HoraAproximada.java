/**
 * O modelo HoraAproximada representa uma hora qualquer e possui os atributos
 * presentes neste código, tais como a necessidade de se ter em memória o
 * horário atual para comparar com o horário inserido e determinar se a hora
 * é ou não aproximada. Quanto as operações, além da inicialização e da operação
 * de mostrar os dados, seria necessária a validação do formato de horas e
 * minutos inseridos, bem como a verificação de proximidade do horário inserido
 * com o horário estabelecido como atual.
 * @author Davi Silva Alves de Oliveira
 */

package Lista2.Q1.Modelo1;

public class HoraAproximada {
  
  public byte horas;
  public byte minutos;

  public byte horasNow = 23;
  public byte minutosNow = 59;

  public boolean horaValida;

  /**
   * O método inicializaHora inicializa os valores das variáveis.
   * @param h é o valor das horas passada pelo usuário
   * @param m é o valor dos minutos passado pelo usuário
   */
  public void inicializaHora(byte h, byte m) {
    if (horaEhValida(h, m)) {
      horas = h;
      minutos = m;
    } else {
      horas = 0;
      minutos = 0;
    }
  }

  /**
   * O método horaEhValida verifica se os valores passados pelo usuário
   * são válidos enquanto elementos de hora e minuto.
   * @param h é o valor das horas passada pelo usuário
   * @param m é o valor dos minutos passado pelo usuário
   * @return true se for válido e false se não for
   */
  public boolean horaEhValida(byte h, byte m) {
    if (h <= 23 && h >= 0) {
      if (m <= 59 && m >= 0) {
        horaValida = true;
        return true;
      } else {
        horaValida = false;
        return false;
      }
    } else {
      horaValida = false;
      return false;
    }
  }

  /**
   * O método horaEhAproximada verifica se a hora é pelo ou menos
   * 1 hora para mais ou para menos aproximada do valor proposto
   * como o horário atual.
   * @return true se for válido e false se não for
   */
  public boolean horaEhAproximada() {
    if ((horas <= horasNow && horas >= horasNow-1) || (horas >= horasNow && horas <= horasNow+1)) return true;
    else if (horas == 0 && horasNow == 23) return true;
    else if (horas == 23 && horasNow == 0) return true;
    else return false;
  }

  /**
   * O método mostraHora imprime os valores dependendo da composição
   * e imprime também se a hora é aproximada ou não, bem como se
   * não forem inseridos dados válidos.
   */
  public void mostraHora() {
    if (horaValida) {
      if (horas < 10 && horas >= 0) {
        if (minutos < 10 && minutos >= 0) {
          System.out.println();
          System.out.println("Horário inserido:    " + horas + horas + "h" + minutos + minutos + "min");
          System.out.println("Horário atual:       " + horasNow + "h" + minutosNow + "min");
          System.out.println();
        } else {
          System.out.println();
          System.out.println("Horário inserido:    " + horas + horas + "h" + minutos + "min");
          System.out.println("Horário atual:       " + horasNow + "h" + minutosNow + "min");
          System.out.println();
        }
      } else {
        if (minutos < 10 && minutos >= 0) {
          System.out.println();
          System.out.println("Horário inserido:    " + horas + "h" + minutos + minutos + "min");
          System.out.println("Horário atual:       " + horasNow + "h" + minutosNow + "min");
          System.out.println();
        } else {
          System.out.println();
          System.out.println("Horário inserido:    " + horas + "h" + minutos + "min");
          System.out.println("Horário atual:       " + horasNow + "h" + minutosNow + "min");
          System.out.println();
        }
      }

      if (horaEhAproximada()) System.out.println("O horário inserido é próximo do horário atual");
      else System.out.println("O horário inserido não está próximo do horário atual");
      
      System.out.println();
    } else {
      System.out.println("Horário inserido não é válido!");
    }
  }
}
