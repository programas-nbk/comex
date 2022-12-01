public class TestaProduto {
  public static void main(String[] args) {
    Categoria informatica = new Categoria(1, "INFORMÁTICA");
    Categoria livros = new Categoria(3, "LIVROS");

    Produto notebook = new Produto(1, "Notebook Samsung", 3523.00, 1, informatica);

    Produto livro = new Produto(1, "Clean Architecture", 102.90, 2, livros);

    Produto monitor = new Produto(3, "Monitor Dell 27", 1889.00, 3, informatica);

    Produto[] listaDeProdutos = { notebook, livro, monitor };

    for (Produto produto : listaDeProdutos) {
      String dadosDoProduto = String.format(
          "id: %d, produto: %s, preço unitário: %s, estoque: %s, categoria: %s, valor total em estoque: %s, imposto cobrado: %s",
          produto.getId(), produto.getNome(), produto.getPrecoUnitario(), produto.getQuantidadeEmEstoque(),
          produto.getCategoria().getNome(), produto.valorTotalEmEstoque(), produto.calculaImposto());

      System.out.println(dadosDoProduto);
    }
  }
}
