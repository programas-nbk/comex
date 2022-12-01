public class TestaCategoria {
  public static void main(String[] args) {
    Categoria informatica = new Categoria(1, "INFORMÁTICA", "ATIVA");
    Categoria moveis = new Categoria(2, "MÓVEIS", "INATIVA");
    Categoria livros = new Categoria(3, "LIVROS", "ATIVA");

    String dadosDaInformatica = String.format("Categoria %s (%d - %s)", informatica.getNome(), informatica.getId(),
        informatica.getStatus());

    String dadosDosMoveis = String.format("Categoria %s (%d - %s)", moveis.getNome(), moveis.getId(),
        moveis.getStatus());

    String dadosDosLivros = String.format("Categoria %s (%d - %s)", livros.getNome(), livros.getId(),
        livros.getStatus());

    System.out.println(dadosDaInformatica);
    System.out.println(dadosDosMoveis);
    System.out.println(dadosDosLivros);
  }
}
