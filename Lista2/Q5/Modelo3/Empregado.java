/**
 * @author Davi Silva Alves de Oliveira
 */

package Lista2.Q5.Modelo3;

class Empregado {
  
  String nome = "undefined";
  String departamento = "undefined";
  float horasTrabalhadas = 0;
  float horasTrabalhadasExtras = 0;
  float salarioPorHora = 0;
  final double salarioPorHoraExtra = 12.45;

  void inicializaDados(String n, String d, float h, float s, float ex) {
    nome = n;
    departamento = d;
    horasTrabalhadas = h;
    horasTrabalhadasExtras = ex;
    salarioPorHora = s;
  }

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

  boolean verificaDiretoria() {
    if (departamento.intern() == "Diretoria") return true;
    else return false;
  }

  float calculaSalarioMensal() {
    float salarioBase = (horasTrabalhadas*salarioPorHora) + (horasTrabalhadasExtras*(float)salarioPorHoraExtra);
    
    if (verificaDiretoria()) return (salarioBase + salarioBase*10/100);
    else return salarioBase;
  }
}
