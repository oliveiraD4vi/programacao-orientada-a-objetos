/**
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

  boolean horaEhPrecisa() {
    if (horas == horasNow && minutos == minutosNow && segundos == segundosNow && centesimos == centesimosNow) return true;
    else return false;
  }

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
