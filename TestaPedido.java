public class TestaPedido {
    public static void main(String[] args) {

        Categoria[] obj = new Categoria[2];
        obj[0] = new Categoria("INFORMÁTICA","ATIVA");
        obj[1] = new Categoria("LIVROS","ATIVA");

        Cliente cliente1 = new Cliente("John", "Wesley", "000.000.000.00",
                "3222222222", "Rua ABCD", "1234", "",
                "BAIRRO", "CIDADE", "ESTADO");

        Produto produto1 = new Produto("Notebook", "Samsung",3523.0, 1, obj[0]);
        Produto produto2 = new Produto("Livro","Clean Architecture", 102.90, 2, obj[1]);
        Produto produto3 = new Produto("Monitor", "Dell 27", 1889.0, 3, obj[0]);

        Pedido pedido1 = new Pedido("1/12/2022", cliente1, produto1, 1);
        Pedido pedido2 = new Pedido("1/12/2022", cliente1, produto2, 2);
        Pedido pedido3 = new Pedido("1/12/2022", cliente1, produto3, 3);

        System.out.println(pedido1);
        System.out.println(pedido2);
        System.out.println(pedido3);
    }
}
