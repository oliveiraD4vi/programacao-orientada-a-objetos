/**
 * O modelo Empregado representa um assalariado empregado
 * de alguma empresa. Como tal, temos como atributos o nome
 * do indivíduo, o departamento da empresa no qual ele trabalha,
 * as horas trabalhadas no mes e o salário por hora. Além disso,
 * nesse caso temos dois valores de salário para horas extras e
 * para horas normais. As operações se mantém.
 * @author Davi Silva Alves de Oliveira
 */

package Lista2.Q5.Modelo2;

class Empregado {
  
  String nome = "undefined";
  String departamento = "undefined";
  float horasTrabalhadas = 0;
  float horasTrabalhadasExtras = 0;
  float salarioPorHora = 0;
  final double salarioPorHoraExtra = 12.45;

  /**
   * O método inicializaDados inicializa as variáveis com os valores
   * passados pelos usuários.
   * @param n é o nome do empregado
   * @param d é o departamento no qual ele trabalha
   * @param h é o valor das horas trabalhadas por mês por ele
   * @param s é o salario por hora de trabalho
   * @param ex é o valor de horas extras trabalhadas
   */
  void inicializaDados(String n, String d, float h, float s, float ex) {
    nome = n;
    departamento = d;
    horasTrabalhadas = h;
    horasTrabalhadasExtras = ex;
    salarioPorHora = s;
  }

  /**
   * O método mostraDados imprime os dados do empregado.
   */
  void mostraDados() {
    System.out.printf("\n---------------------------------\n\n");
    System.out.printf("Dados solicitados do empregado %s\n\n", nome);
    System.out.printf("Departamento: %s\n\n", departamento);
    System.out.printf("Horas trabalhadas no mês: %.1f h\n", horasTrabalhadas);
    System.out.printf("Salário por hora: R$ %.2f\n\n", salarioPorHora);
    System.out.printf("Horas extras trabalhadas no mês: %.1f h\n", horasTrabalhadasExtras);
    System.out.printf("Valor fixo da hora extra: R$ %.2f\n\n", salarioPorHoraExtra);
    System.out.printf("Salário mensal: R$ %.2f\n", (calculaSalarioMensal()));
    System.out.printf("\n---------------------------------\n");
  }

  /**
   * O método calculaSalarioMensal, como diz o nome, calcula o salário mensal do
   * empregado a partir das horas trabalhadas e do salário por hora, bem como
   * das horas extras e do salário por hora extra.
   * @return o valor do salário mensal
   */
  float calculaSalarioMensal() {
    return ((horasTrabalhadas*salarioPorHora) + (horasTrabalhadasExtras*(float)salarioPorHoraExtra));
  }
}
