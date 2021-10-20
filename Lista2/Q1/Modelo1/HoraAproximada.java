/**
 * @author Davi Silva Alves de Oliveira
 */

package Lista2.Q1.Modelo1;

class HoraAproximada {
  
  byte horas;
  byte minutos;

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
      if (m <= 59 && m >= 0) return true;
      else return false;
    } else return false;
  }

  boolean horaEhAproximada() {
    return true;
  }

  void mostraHora() {
    System.out.println(horas + ":" + minutos);
  }
}
