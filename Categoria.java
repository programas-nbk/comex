public class Categoria {
  private static int idClass = 0;
  private int id;
  private String nome;
  private String status = "ATIVA";

  public Categoria(String nome) {
    Categoria.idClass += 1;
    setId(Categoria.idClass);
    this.nome = nome;
  }

  public Categoria(String nome, String status) {
    this(nome);
    this.status = status;
  }

  public int getId() {
    return this.id;
  }

  private void setId(int id) {
    this.id = id;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }
}
