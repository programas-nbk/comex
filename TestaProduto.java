public class TestaProduto {
  public static void main(String[] args) {
    Categoria informatica = new Categoria(1, "INFORMÁTICA");
    Categoria livros = new Categoria(3, "LIVROS");

    Produto notebook = new Produto(1, "Notebook Samsung", 3523.00, 1, informatica);

    Produto livro = new Produto(1, "Clean Architecture", 102.90, 2, livros);

    Produto monitor = new Produto(3, "Monitor Dell 27", 1889.00, 3, informatica);
  }
}
