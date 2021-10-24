/**
 * O modelo Empregado representa um assalariado empregado
 * de alguma empresa. Como tal, temos como atributos o nome
 * do indivíduo, o departamento da empresa no qual ele trabalha,
 * as horas trabalhadas no mes e o salário por hora. Quanto às 
 * operações, nos basta que calculemos o salário mensal dele.
 * @author Davi Silva Alves de Oliveira
 */

package Lista2.Q5.Modelo1;

class Empregado {
  
  String nome = "undefined";
  String departamento = "undefined";
  float horasTrabalhadas = 0;
  float salarioPorHora = 0;

  /**
   * O método inicializaDados inicializa as variáveis com os valores
   * inseridos pelo usuário.
   * @param n é o nome do empregado
   * @param d é o departamento no qual ele trabalha
   * @param h é o valor das horas trabalhadas por mês desse empregado
   * @param s é o salário recebido por hora de trabalho dele
   */
  void inicializaDados(String n, String d, float h, float s) {
    nome = n;
    departamento = d;
    horasTrabalhadas = h;
    salarioPorHora = s;
  }

  /**
   * O método mostraDados imprime os dados do empregado.
   */
  void mostraDados() {
    System.out.printf("\n---------------------------------\n\n");
    System.out.printf("Dados solicitados do empregado %s\n\n", nome);
    System.out.printf("Departamento: %s\n", departamento);
    System.out.printf("Horas trabalhadas no mês: %.1f h\n", horasTrabalhadas);
    System.out.printf("Salário por hora: R$ %.2f\n", salarioPorHora);
    System.out.printf("Salário mensal: R$ %.2f\n", (calculaSalarioMensal()));
    System.out.printf("\n---------------------------------\n");
  }

  /**
   * O método calculaSalarioMensal, como diz o nome, calcula o salário mensal do
   * empregado a partir das horas trabalhadas e do salário por hora.
   * @return o valor do salário mensal
   */
  float calculaSalarioMensal() {
    return (horasTrabalhadas*salarioPorHora);
  }
}
