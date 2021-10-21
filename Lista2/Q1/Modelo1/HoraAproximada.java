/**
 * @author Davi Silva Alves de Oliveira
 */

package Lista2.Q1.Modelo1;

class HoraAproximada {
  
  byte horas;
  byte minutos;

  byte horasNow = 23;
  byte minutosNow = 59;

  boolean horaValida;

  void inicializaHora(byte h, byte m) {
    if (horaEhValida(h, m)) {
      horas = h;
      minutos = m;
    } else {
      horas = 0;
      minutos = 0;
    }
  }

  boolean horaEhValida(byte h, byte m) {
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

  boolean horaEhAproximada() {
    if ((horas <= horasNow && horas >= horasNow-1) || (horas >= horasNow && horas <= horasNow+1)) return true;
    else if (horas == 0 && horasNow == 23) return true;
    else if (horas == 23 && horasNow == 0) return true;
    else return false;
  }

  void mostraHora() {
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
