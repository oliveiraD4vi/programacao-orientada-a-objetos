/**
 * A classe Data [...]
 * @author Davi Silva Alves de Oliveira
 */

public class Data {

  private byte dia;
  private byte mes;
  private short ano;

  /**
   * O método construtor define a data de determinado objeto através de parâmetros.
   * @param dia é o dia passado
   * @param mes é o mês passado
   * @param ano é o ano passado
   */
  public void construtor(byte dia, byte mes, short ano) {
    if (mes == 2) {
      if(isBissexto()) {
        if (dia >= 1 && dia <= 29) {
          this.dia = dia;
          this.mes = mes;
          this.ano = ano;
        } else {
          this.dia = 1;
          this.mes = 1;
          this.ano = 1;
        }
      } else {
        if (dia >= 1 && dia <= 28) {
          this.dia = dia;
          this.mes = mes;
          this.ano = ano;
        } else {
          this.dia = 1;
          this.mes = 1;
          this.ano = 1;
        }
      }
    } else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
      if (dia >= 1 && dia <= 31) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
      } else {
        this.dia = 1;
        this.mes = 1;
        this.ano = 1;
      }
    } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
      if (dia >= 1 && dia <= 30) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
      } else {
        this.dia = 1;
        this.mes = 1;
        this.ano = 1;
      }
    } else {
      this.dia = 1;
      this.mes = 1;
      this.ano = 1;
    }
  }

  /**
   * O método compara recebe como parâmetro um outro objeto da Classe data, compara
   * com a data corrente.
   * @param data é uma instância da classe Data a ser comparada com a data atual
   * @return 0 se as datas são iguais, 1 se a data corrente for maior e -1 se não
   */
  public int compara(Data data) {
    if (this.ano == data.getAno()) {
      if (this.mes == data.getMes()) {
        if (this.dia == data.getDia()) {
          return 0;
        } else if (this.dia > data.getDia()) {
            return 1;
          } else return -1;
      } else if (this.mes > data.getMes()) {
        return 1;
      } else return -1;
    } else if (this.ano > data.getAno()) {
      return 1;
    } else return -1;
  }

  /**
   * O método getDia retorna o dia da data.
   * @return dia
   */
  public byte getDia() {
    return dia;
  }

  /**
   * O método getMes retorna o mês da data.
   * @return mes
   */
  public byte getMes() {
    return mes;
  }

  /**
   * O método getMesExtenso retorna o mês da data corrente por extenso.
   * @return mes na forma de uma String
   */
  public String getMesExtenso() {
    switch (mes) {
      case 1:
        return "Janeiro";

      case 2:
        return "Fevereiro";

      case 3:
        return "Março";

      case 4:
        return "Abril";

      case 5:
        return "Maio";

      case 6:
        return "Junho";

      case 7:
        return "Julho";

      case 8:
        return "Agosto";

      case 9:
        return "Setembro";

      case 10:
        return "Outubro";

      case 11:
        return "Novembro";

      case 12:
        return "Dezembro";
    
      default:
        return "inválido";
    }
  }

  /**
   * O método getAno retorna o ano da data.
   * @return ano
   */
  public short getAno() {
    return ano;
  }

  /**
   * O método isBissexto testa se o ano é bissexto ou não.
   * @return true se o ano é bissexto, false se não
   */
  public boolean isBissexto() {
    if (ano%4==0 && (ano%100!=0 || ano%400==0)) return true;
    else return false;
  }

  /**
   * O método clone cria um novo objeto da classe Data com os mesmos valores de
   * atributos e retorna sua referência.
   * @return referência do clone da data corrente
   */
  // public Data clone() {
  //   return data;
  // }
}
