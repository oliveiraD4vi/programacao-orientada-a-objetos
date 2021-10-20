/**
 * @author Davi Silva Alves de Oliveira
 */

package Lista2.Q5.Modelo1;

class Empregado {
  
  String nome = "undefined";
  String departamento = "undefined";
  float horasTrabalhadas = 0;
  float salarioPorHora = 0;

  void inicializaDados(String n, String d, float h, float s) {
    nome = n;
    departamento = d;
    horasTrabalhadas = h;
    salarioPorHora = s;
  }

  void mostraDados() {
    System.out.printf("\n---------------------------------\n\n");
    System.out.printf("Dados solicitados do empregado %s\n\n", nome);
    System.out.printf("Departamento: %s\n", departamento);
    System.out.printf("Horas trabalhadas no mês: %.1f h\n", horasTrabalhadas);
    System.out.printf("Salário por hora: R$ %.2f\n", salarioPorHora);
    System.out.printf("Salário mensal: R$ %.2f\n", (calculaSalarioMensal()));
    System.out.printf("\n---------------------------------\n");
  }

  float calculaSalarioMensal() {
    return (horasTrabalhadas*salarioPorHora);
  }
}
