public class TestaProduto {
    public static void main(String[] args) {
        Categoria categoria1 = new Categoria("INFORMÁTICA");
        Categoria categoria2 = new Categoria("LIVROS");
        Produto produto1 = new Produto("Notebook Samsung", 3523.00, 1, categoria1);
        Produto produto2 = new Produto("Clean Architecture", 102.90, 1, categoria2);
        Produto produto3 = new Produto("Monitor Dell 27", 1889.00, 1, categoria1);

        produto1.detalhar();
        produto2.detalhar();
        produto3.detalhar();
    }
}
