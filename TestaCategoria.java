public class TestaCategoria {
  public static void main(String[] args) {
    Categoria informatica = new Categoria("INFORMÁTICA");
    Categoria moveis = new Categoria("MÓVEIS", "INATIVA");
    Categoria livros = new Categoria("LIVROS");

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
