public class TestaPedido {

    public static void main(String[] args) {
        Categoria categoria1 = new Categoria("INFORMÁTICA");
        Categoria categoria2 = new Categoria("LIVROS");
        Produto produto1 = new Produto("Notebook Samsung", 3523.00, 1, categoria1);
        Produto produto2 = new Produto("Clean Architecture", 102.90, 1, categoria2);
        Produto produto3 = new Produto("Monitor Dell 27", 1889.00, 1, categoria1);
        Cliente cliente1 = new Cliente("Flavio", "Henrique", "111.111.111-11",
                "999999999", "Rua Salvados", "123", "Proximo ao Mercado", "Sao Luiz",
                "Sao Jose" ,"PARANA");
        Cliente cliente2 = new Cliente("Pedro", "Oliveira", "111.111.111-11",
                "999999999", "Rua Salvados", "123", "Proximo ao Mercado", "Sao Luiz",
                "Sao Jose" ,"PARANA");
        Cliente cliente3 = new Cliente("Maria", "Silva", "111.111.111-11",
                "999999999", "Rua Salvados", "123", "Proximo ao Mercado", "Sao Luiz",
                "Sao Jose" ,"PARANA");

        Pedido pedido1 = new Pedido(cliente1, produto1, 2);
        Pedido pedido2 = new Pedido(cliente2, produto2, 1);
        Pedido pedido3 = new Pedido(cliente3, produto3, 5);

        pedido1.detalhar();
        pedido2.detalhar();
        pedido3.detalhar();
    }

}
