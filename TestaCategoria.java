public class TestaCategoria {
  public static void main(String[] args) {
    Categoria informatica = new Categoria(1, "INFORMÁTICA", "ATIVA");

    String dadosDaInformatica = String.format("Categoria %s (%d - %s)", informatica.getNome(), informatica.getId(),
        informatica.getStatus());

    System.out.println(dadosDaInformatica);
  }
}
