/**
 * @author Davi Silva Alves de Oliveira
 */

package Lista2.Q1.Modelo4;

class Data {
  
  byte dia;
  byte mes;
  short ano;

  void inicializaData(byte d, byte ms, short a) {
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

  void mostraData() {
    System.out.println();
    
    if (verificaDataValida()) System.out.println(dia + "/" + mes + "/" + ano);
    else System.out.println("Data inválida");

    System.out.println();
  }
}
