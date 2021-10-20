/**
 * @author Davi Silva Alves de Oliveira
 */

package Lista2.Q4.Modelo1;

class Livro {
  
  String nome;
  String autor;
  String editora;
  String localDePublicacao;
  short anoDePublicacao;

  void inicializaDados(String n, String a, String e, String local, short ano) {
    nome = n;
    autor = a;
    editora = e;
    localDePublicacao = local;
    anoDePublicacao = ano;
  }

  void mostraDados() {
    System.out.println();
    System.out.println(nome);
    System.out.println("-----------------------");
    System.out.println("Autor: " + autor);
    System.out.println("Editora: " + editora);
    System.out.println("Publicação: " + localDePublicacao + ", " + anoDePublicacao);
  }
}
