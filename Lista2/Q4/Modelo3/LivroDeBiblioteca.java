/**
 * O modelo LivroDeBiblioteca representa um livro disponível
 * para empréstimo em uma biblioteca. Como tal, para além dos
 * atributos do modelo Livro original, aqui, temos ainda 
 * qntdEstoque, corredor, secao e disponível, este último
 * representando a disponibilidade do livro para empréstimo.
 * QUanto às operações, nos basta que saibamos se está 
 * disponível ou não.
 * @author Davi Silva Alves de Oliveira
 */

package Lista2.Q4.Modelo3;

class LivroDeBiblioteca {
  
  String nome;
  String autor;
  String editora;
  String localDePublicacao;
  short anoDePublicacao;
  int qntdEstoque;
  int corredor;
  String secao;
  boolean disponivel;

  /**
   * O método inicializaDados inicializa os valores das variáveis a partir
   * dos valores passados pelo usuário.
   * @param nam é o nome/título do livro
   * @param aut é o nome do autor
   * @param edit é o nome da editora
   * @param local é o local de publicação da obra
   * @param ano é o ano de publicação da obra
   * @param est é a quantidade em estoque do livro
   * @param sec é a seção da biblioteca onde ele se encontra
   * @param corred é o número do corredor da seção onde o livro se encontra
   */
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

  /**
   * O método verificaDisponibilidade verifica se o livro está disponível
   * ou não.
   * @return true se disponível, false se não
   */
  boolean verificaDisponibilidade() {
    if (qntdEstoque <= 0) disponivel = false;
    else disponivel = true;

    return disponivel;
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
