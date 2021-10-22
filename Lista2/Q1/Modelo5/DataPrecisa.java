/**
 * @author Davi Silva Alves de Oliveira
 */

package Lista2.Q1.Modelo5;

class DataPrecisa {
  
  byte dia;
  byte mes;
  short ano;

  void inicializaData(byte d, byte ms, short a) {
    dia = d;
    mes = ms;
    ano = a;
  }

  boolean verificaDataValida() {
    if (mes == 2) {
      if(ano%4==0 && (ano%100!=0 || ano%400==0)) {
        if (dia >= 1 && dia <= 29) return true;
        else return false;
      } else {
        if (dia >= 1 && dia <= 28) return true;
        else return false;
      }
    } else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
      if (dia >= 1 && dia <= 31) return true;
      else return false;
    } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
      if (dia >= 1 && dia <= 30) return true;
      else return false;
    } else return false;
  }

  void mostraData() {
    System.out.println();
    
    if (verificaDataValida()) System.out.println(dia + "/" + mes + "/" + ano);
    else System.out.println("Data inválida");

    System.out.println();
  }
}
