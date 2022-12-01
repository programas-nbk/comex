public class TestaCategoria {
  public static void main(String[] args) {
    Categoria informatica = new Categoria(1, "INFORMÁTICA", "ATIVA");
    Categoria moveis = new Categoria(2, "MÓVEIS", "INATIVA");

    String dadosDaInformatica = String.format("Categoria %s (%d - %s)", informatica.getNome(), informatica.getId(),
        informatica.getStatus());

    String dadosDosMoveis = String.format("Categoria %s (%d - %s)", moveis.getNome(), moveis.getId(),
        moveis.getStatus());

    System.out.println(dadosDaInformatica);
    System.out.println(dadosDosMoveis);
  }
}
