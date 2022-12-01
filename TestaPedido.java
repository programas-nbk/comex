import java.time.LocalDate;

public class TestaPedido {
  public static void main(String[] args) {
    Categoria informatica = new Categoria(1, "INFORMÁTICA");
    Categoria livros = new Categoria(3, "LIVROS");

    Produto notebook = new Produto(1, "Notebook Samsung", 3523.00, 10, informatica);
    Produto livro = new Produto(2, "Clean Architecture", 102.90, 5, livros);

    Pedido pedido1 = new Pedido(1, LocalDate.now(), "123.456.789-01", notebook, 4);

    Pedido pedido2 = new Pedido(2, LocalDate.now(), "123.456.789-01", livro, 3);

    Pedido pedido3 = new Pedido(3, LocalDate.now(), "999.777.789-01", livro, 1);

    Pedido[] listaDePedidos = { pedido1, pedido2, pedido3 };

    for (Pedido pedido : listaDePedidos) {
      String dadosDoProduto = String.format(
          "id: %d, data: %s, CPF: %s, nome do produto: %s, quantidade vendida: %s",
          pedido.getId(), pedido.getData(), pedido.getCPF(), pedido.getProduto().getNome(),
          pedido.getQuantidadeVendida());

      System.out.println(dadosDoProduto);
    }
  }
}
