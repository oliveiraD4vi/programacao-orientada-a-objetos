/**
 * @author Davi Silva Alves de Oliveira
 */

package Lista2.Q1.Modelo3;
import Lista2.Q1.Modelo1.HoraAproximada;

class DataHora {
  
  HoraAproximada hora = new HoraAproximada();
  byte dia;
  byte mes;
  short ano;

  void inicializaDados(byte h, byte m, byte d, byte ms, short a) {
    hora.inicializaHora(h, m);
    hora.horasNow = 12;
    hora.minutosNow = 30;
    dia = d;
    mes = ms;
    ano = a;
  }

  boolean verificaDataValida() {
    if (dia >= 1 && dia <= 31) {
      if (mes >= 1 && mes <= 12) {
        if (ano >= 1 && ano <= 9999) return true;
        else return false;
      } else return false;
    } else return false;
  }

  void mostraDados() {
    System.out.println();
    
    if (verificaDataValida()) System.out.println(dia + "/" + mes + "/" + ano);
    else System.out.println("01/01/2001");
    hora.mostraHora();

    System.out.println();
  }
}
