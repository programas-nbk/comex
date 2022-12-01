public class TestaProduto {
    public static void main(String[] args) {
       Produto produto1 = new Produto("Notebook Samsung", "", 3523.00F, 1, "Informática");
       Produto produto2 = new Produto("Clean Architecture", "", 102.90F, 1, "Livros");
       Produto produto3 = new Produto("Monitor Dell 27", "", 1889.00F, 1, "Informática");
       produto1.print();
       produto2.print();
       produto3.print();
    }
}
