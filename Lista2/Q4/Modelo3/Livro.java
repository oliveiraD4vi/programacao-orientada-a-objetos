/**
 * @author Davi Silva Alves de Oliveira
 */

package Lista2.Q4.Modelo3;

class Livro {
  
  String nome;
  String autor;
  String editora;
  String localDePublicacao;
  short anoDePublicacao;
  int qntdEstoque;
  int corredor;
  String secao;
  boolean disponivel;

  void inicializaDados(String nam, String aut, String edit, String local, short ano, int est, String sec, int corred) {
    nome = nam;
    autor = aut;
    editora = edit;
    localDePublicacao = local;
    anoDePublicacao = ano;
    qntdEstoque = est;
    secao = sec;
    corredor = corred;
  }

  boolean verificaDisponibilidade() {
    if (qntdEstoque <= 0) disponivel = false;
    else disponivel = true;

    return disponivel;
  }

  void mostraDados() {
    System.out.println();
    System.out.println(nome);
    System.out.println("-----------------------");
    System.out.println("Autor: " + autor);
    System.out.println("Editora: " + editora);
    System.out.println("Publicação: " + localDePublicacao + ", " + anoDePublicacao);
    System.out.println("-----------------------");
    
    if (verificaDisponibilidade()) {
      System.out.println("Disponível");
      System.out.println("Quantidade: " + qntdEstoque);
      System.out.println("Procure na seção " + secao + ", corredor " + corredor);
    } else {
      System.out.println("Indisponível");
    }
  }
}
