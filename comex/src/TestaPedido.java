public class TestaPedido {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Lucas", "Piazzi", "111.222.333.44", "3222222222", "Rua A", "13", "", "Estrela", "Juiz de Fora", "MG");

        Produto produto1 = new Produto("Notebook Samsung", "", 3523.00F, 1, "Informática");
        Produto produto2 = new Produto("Clean Architecture", "", 102.90F, 1, "Livros");
        Produto produto3 = new Produto("Monitor Dell 27", "", 1889.00F, 1, "Informática");

        Pedido pedido1 = new Pedido("1/12/2022", cliente1, produto1, 1);
        Pedido pedido2 = new Pedido("1/12/2022", cliente1, produto2, 2);
        Pedido pedido3 = new Pedido("1/12/2022", cliente1, produto3, 3);

        pedido1.print();
        pedido2.print();
        pedido3.print();
    }


}
