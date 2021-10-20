/**
 * @author Davi Silva Alves de Oliveira
 */

package Lista2.Q4.Modelo2;

class Livro {
  
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

  float calculaPrecoDeVenda(float pB, float pD) {
    precoVenda = (precoBase-precoBase*desconto);

    return precoVenda;
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
      System.out.println("Preco: " + calculaPrecoDeVenda(precoBase, desconto));
    } else {
      System.out.println("Indisponível");
      System.out.println("Preco: " + precoBase);
    }
  }
}
