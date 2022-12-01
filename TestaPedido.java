import java.time.LocalDate;

public class TestaPedido {
  public static void main(String[] args) {
    Categoria informatica = new Categoria("INFORMÁTICA");
    Categoria livros = new Categoria("LIVROS");

    Produto notebook = new Produto("Notebook Samsung", 3523.00, 10, informatica);
    Produto livro = new Produto("Clean Architecture", 102.90, 5, livros);

    Cliente cliente = new Cliente("joão", "silva", "999.888.777-66", 999887766, "rua do balão", 69, "casa", "Centro",
        "esteites unids", "WE");

    Pedido pedido1 = new Pedido(LocalDate.now(), cliente, notebook, 4);

    Pedido pedido2 = new Pedido(LocalDate.now(), cliente, livro, 3);

    Pedido[] listaDePedidos = { pedido1, pedido2 };

    for (Pedido pedido : listaDePedidos) {
      String dadosDoProduto = String.format(
          "id: %d, data: %s, cliente: %s, nome do produto: %s, quantidade vendida: %s, endereço: %s",
          pedido.getId(), pedido.getData(), pedido.getCliente().nomeCompleto(), pedido.getProduto().getNome(),
          pedido.getQuantidadeVendida(), pedido.getCliente().enderecoCompleto());

      System.out.println(dadosDoProduto);
    }
  }
}
