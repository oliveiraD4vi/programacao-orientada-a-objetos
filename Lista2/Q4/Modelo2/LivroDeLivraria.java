/**
 * O modelo LivroDeLivraria representa um livro que está a venda
 * e como tal possui como atributos, para além dos atributos do
 * modelo Livro, temos precoBase, precoVenda, desconto, qntdEstoque
 * e disponível, este último representando a disponibilidade do
 * livro. Quanto às operações, podemos considerar o cálculo do
 * preco de venda do livro e a verificação da disponibilidade do livro.
 * @author Davi Silva Alves de Oliveira
 */

package Lista2.Q4.Modelo2;

class LivroDeLivraria {
  
  String nome;
  String autor;
  String editora;
  String localDePublicacao;
  short anoDePublicacao;
  float precoBase;
  float precoVenda;
  float desconto;
  int qntdEstoque;
  boolean disponivel;

  /**
   * O método inicializaDados inicializa os valores das variáveis a partir
   * dos valores passados pelo usuário.
   * @param nam é o nome/título do livro
   * @param aut é o nome do autor
   * @param edit é o nome da editora
   * @param local é o local de publicação da obra
   * @param ano é o ano de publicação da obra
   * @param prec é o preco base da obra
   * @param desc é o desconto aplicado
   * @param est é a quantidade daquele livro em estoque
   */
  void inicializaDados(String nam, String aut, String edit, String local, short ano, float prec, float desc, int est) {
    nome = nam;
    autor = aut;
    editora = edit;
    localDePublicacao = local;
    anoDePublicacao = ano;
    precoBase = prec;
    qntdEstoque = est;
    desconto = desc;
  }

  /**
   * O método calculaPrecoDeVenda calcula o preco de venda final do produto
   * a partir do preco base e do desconto aplicado.
   * @param pB é o preço base do produto
   * @param pD é o desconto aplicado
   * @return valor do preço de venda final
   */
  float calculaPrecoDeVenda(float pB, float pD) {
    precoVenda = (precoBase-precoBase*desconto);

    return precoVenda;
  }

  /**
   * O método verificaDisponibilidade testa a disponibilidade do livro
   * @return true se estiver disponível, false se não
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
      System.out.println("Preco: " + calculaPrecoDeVenda(precoBase, desconto));
    } else {
      System.out.println("Indisponível");
      System.out.println("Preco: " + precoBase);
    }
  }
}
