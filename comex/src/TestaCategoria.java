public class TestaCategoria {
    public static void main(String[] args) {
        Categoria informatica = new Categoria("INFORMÁTICA", "ATIVA");
        Categoria moveis = new Categoria( "MÓVEIS", "INATIVA");
        Categoria livros = new Categoria("LIVROS", "ATIVA");
        informatica.print();
        moveis.print();
        livros.print();
    }
}