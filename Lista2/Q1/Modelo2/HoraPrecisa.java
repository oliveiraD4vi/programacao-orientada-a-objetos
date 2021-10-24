/**
 * O modelo HoraPrecisa necessita de atributos para cada um dos elementos
 * a serem representados: horas, minutos, segundo e centésimos de segundo.
 * Para além destes, declaramos atributos com a suposta hora atual para
 * comparação. Do modelo anterior, podemos reutilizar o método de horaEhValida
 * com algumas alterações de forma a se encaixar no novo formato de hora
 * utilizado. Em acréscimo temos o método horaEhPrecisa que verifica se os
 * valores passados são idênticos aos valores atribuidos.
 * @author Davi Silva Alves de Oliveira
 */

package Lista2.Q1.Modelo2;

class HoraPrecisa {
  
  byte horas;
  byte minutos;
  byte segundos;
  byte centesimos;

  byte horasNow = 23;
  byte minutosNow = 59;
  byte segundosNow = 59;
  byte centesimosNow = 99;

  boolean horaValida;

  /**
   * O método inicializaHora inicializa os valores das variáveis.
   * @param h é o valor das horas passada pelo usuário
   * @param m é o valor dos minutos passado pelo usuário
   * @param s é o valor dos segundos passado pelo usuário
   * @param c é o valor dos centésimos de segundos passado pelo usuário
   */
  void inicializaHora(byte h, byte m, byte s, byte c) {
    if (horaEhValida(h, m, s, c)) {
      horas = h;
      minutos = m;
      segundos = s;
      centesimos = c;
    } else {
      horas = 0;
      minutos = 0;
      segundos = 0;
      centesimos = 0;
    }
  }

  /**
   * O método horaEhValida verifica se os valores passados pelo usuário
   * são válidos enquanto elementos de hora e minuto.
   * @param h é o valor das horas passada pelo usuário
   * @param m é o valor dos minutos passado pelo usuário
   * @param s é o valor dos segundos passado pelo usuário
   * @param c é o valor dos centésimos de segundos passado pelo usuário
   * @return true se for válido e false se não for
   */
  boolean horaEhValida(byte h, byte m, byte s, byte c) {
    if (h <= 23 && h >= 0) {
      if (m <= 59 && m >= 0) {
        if (s <= 59 && s >= 0) {
          if (c <= 99 && s >= 0) {
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
   * O método horaEhPrecisa verifica se a hora é igual ao valor proposto
   * como o horário atual.
   * @return true se for válido e false se não for
   */
  boolean horaEhPrecisa() {
    if (horas == horasNow && minutos == minutosNow && segundos == segundosNow && centesimos == centesimosNow) return true;
    else return false;
  }

  /**
   * O método mostraHora imprime os valores dependendo da composição
   * e imprime também se a hora é precisa ou não, bem como se
   * não forem inseridos dados válidos.
   */
  void mostraHora() {
    if (horaValida) {
      if (horas < 10 && horas >= 0) {
        if (minutos < 10 && minutos >= 0) {
          if (segundos < 10 && segundos >= 0) {
            if (centesimos < 10 && centesimos >= 0) {
              System.out.println();
              System.out.println("Horário inserido:    " + horas + horas + ":" + minutos + minutos + ":" + segundos + segundos + ":" + centesimos + centesimos);
              System.out.println("Horário atual:       " + horasNow + ":" + minutosNow + ":" + segundosNow + ":" + centesimosNow + ":");
              System.out.println();
            } else {
              System.out.println();
              System.out.println("Horário inserido:    " + horas + horas + ":" + minutos + minutos + ":" + segundos + segundos + ":" + centesimos);
              System.out.println("Horário atual:       " + horasNow + ":" + minutosNow + ":" + segundosNow + ":" + centesimosNow);
              System.out.println();
            }
          } else {
            if (centesimos < 10 && centesimos >= 0) {
              System.out.println();
              System.out.println("Horário inserido:    " + horas + horas + ":" + minutos + minutos + ":" + segundos + ":" + centesimos + centesimos);
              System.out.println("Horário atual:       " + horasNow + ":" + minutosNow + ":" + segundosNow + ":" + centesimosNow);
              System.out.println();
            } else {
              System.out.println();
              System.out.println("Horário inserido:    " + horas + horas + ":" + minutos + minutos + ":" + segundos + ":" + centesimos);
              System.out.println("Horário atual:       " + horasNow + ":" + minutosNow + ":" + segundosNow + ":" + centesimosNow);
              System.out.println();
            }
          }
        } else {
          if (segundos < 10 && segundos >= 0) {
            if (centesimos < 10 && centesimos >= 0) {
              System.out.println();
              System.out.println("Horário inserido:    " + horas + horas + ":" + minutos + ":" + segundos + segundos + ":" + centesimos + centesimos);
              System.out.println("Horário atual:       " + horasNow + ":" + minutosNow + ":" + segundosNow + ":" + centesimosNow);
              System.out.println();
            } else {
              System.out.println();
              System.out.println("Horário inserido:    " + horas + horas + ":" + minutos + ":" + segundos + segundos + ":" + centesimos);
              System.out.println("Horário atual:       " + horasNow + ":" + minutosNow + ":" + segundosNow + ":" + centesimosNow);
              System.out.println();
            }
          } else {
            if (centesimos < 10 && centesimos >= 0) {
              System.out.println();
              System.out.println("Horário inserido:    " + horas + horas + ":" + minutos + ":" + segundos + ":" + centesimos + centesimos);
              System.out.println("Horário atual:       " + horasNow + ":" + minutosNow + ":" + segundosNow + ":" + centesimosNow);
              System.out.println();
            } else {
              System.out.println();
              System.out.println("Horário inserido:    " + horas + horas + ":" + minutos + ":" + segundos + ":" + centesimos);
              System.out.println("Horário atual:       " + horasNow + ":" + minutosNow + ":" + segundosNow + ":" + centesimosNow);
              System.out.println();
            }
          }
        }
      } else {
        if (minutos < 10 && minutos >= 0) {
          if (segundos < 10 && segundos >= 0) {
            if (centesimos < 10 && centesimos >= 0) {
              System.out.println();
              System.out.println("Horário inserido:    " + horas + ":" + minutos + minutos + ":" + segundos + segundos + ":" + centesimos + centesimos);
              System.out.println("Horário atual:       " + horasNow + ":" + minutosNow + ":" + segundosNow + ":" + centesimosNow);
              System.out.println();
            } else {
              System.out.println();
              System.out.println("Horário inserido:    " + horas + ":" + minutos + minutos + ":" + segundos + segundos + ":" + centesimos);
              System.out.println("Horário atual:       " + horasNow + ":" + minutosNow + ":" + segundosNow + ":" + centesimosNow);
              System.out.println();
            }
          } else {
            if (centesimos < 10 && centesimos >= 0) {
              System.out.println();
              System.out.println("Horário inserido:    " + horas + ":" + minutos + minutos + ":" + segundos + ":" + centesimos + centesimos);
              System.out.println("Horário atual:       " + horasNow + ":" + minutosNow + ":" + segundosNow + ":" + centesimosNow);
              System.out.println();
            } else {
              System.out.println();
              System.out.println("Horário inserido:    " + horas + ":" + minutos + minutos + ":" + segundos + ":" + centesimos);
              System.out.println("Horário atual:       " + horasNow + ":" + minutosNow + ":" + segundosNow + ":" + centesimosNow);
              System.out.println();
            }
          }
        } else {
          if (segundos < 10 && segundos >= 0) {
            if (centesimos < 10 && centesimos >= 0) {
              System.out.println();
              System.out.println("Horário inserido:    " + horas + ":" + minutos + ":" + segundos + segundos + ":" + centesimos + centesimos);
              System.out.println("Horário atual:       " + horasNow + ":" + minutosNow + ":" + segundosNow + ":" + centesimosNow);
              System.out.println();
            } else {
              System.out.println();
              System.out.println("Horário inserido:    " + horas + ":" + minutos + ":" + segundos + segundos + ":" + centesimos);
              System.out.println("Horário atual:       " + horasNow + ":" + minutosNow + ":" + segundosNow + ":" + centesimosNow);
              System.out.println();
            }
          } else {
            if (centesimos < 10 && centesimos >= 0) {
              System.out.println();
              System.out.println("Horário inserido:    " + horas + ":" + minutos + ":" + segundos + ":" + centesimos + centesimos);
              System.out.println("Horário atual:       " + horasNow + ":" + minutosNow + ":" + segundosNow + ":" + centesimosNow);
              System.out.println();
            } else {
              System.out.println();
              System.out.println("Horário inserido:    " + horas + ":" + minutos + ":" + segundos + ":" + centesimos);
              System.out.println("Horário atual:       " + horasNow + ":" + minutosNow + ":" + segundosNow + ":" + centesimosNow);
              System.out.println();
            }
          }
        }
      }

      if (horaEhPrecisa()) System.out.println("O horário inserido é preciso");
      else System.out.println("O horário inserido não é preciso");
      
      System.out.println();
    } else {
      System.out.println("Horário inserido não é válido!");
    }
  }
}
