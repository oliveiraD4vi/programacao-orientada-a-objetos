/**
 * O modelo Livro representa um livro sem nenhuma finalidade específica
 * que possui atributos com as informações básicas da obra, tais como 
 * título, nome do autor, nome da editora, local de publicação e ano de 
 * publicação.
 * @author Davi Silva Alves de Oliveira
 */

package Lista2.Q4.Modelo1;

class Livro {
  
  String nome;
  String autor;
  String editora;
  String localDePublicacao;
  short anoDePublicacao;

  /**
   * O método inicializaDados inicializa os valores das variáveis a partir
   * dos valores passados pelo usuário.
   * @param n é o nome/título do livro
   * @param a é o nome do autor
   * @param e é o nome da editora
   * @param local é o local de publicação da obra
   * @param ano é o ano de publicação da obra
   */
  void inicializaDados(String n, String a, String e, String local, short ano) {
    nome = n;
    autor = a;
    editora = e;
    localDePublicacao = local;
    anoDePublicacao = ano;
  }

  /**
   * O método mostraDados imprime os dados do livro
   */
  void mostraDados() {
    System.out.println();
    System.out.println(nome);
    System.out.println("-----------------------");
    System.out.println("Autor: " + autor);
    System.out.println("Editora: " + editora);
    System.out.println("Publicação: " + localDePublicacao + ", " + anoDePublicacao);
  }
}
