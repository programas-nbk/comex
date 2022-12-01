public class Produto {
  int id;
  String nome;
  String descricao;
  double precoUnitario;
  int quantidadeEmEstoque;
  Categoria categoria;

  public Produto(int id, String nome, double precoUnitario, int quantidadeEmEstoque, Categoria categoria) {
    this.id = id;
    this.nome = nome;
    this.precoUnitario = precoUnitario;
    this.quantidadeEmEstoque = quantidadeEmEstoque;
    this.categoria = categoria;
  }

  public Produto(int id, String nome, String descricao, double precoUnitario, int quantidadeEmEstoque,
      Categoria categoria) {
    this(id, nome, precoUnitario, quantidadeEmEstoque, categoria);
    this.descricao = descricao;
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getDescricao() {
    return this.descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public double getPrecoUnitario() {
    return this.precoUnitario;
  }

  public void setPrecoUnitario(double precoUnitario) {
    this.precoUnitario = precoUnitario;
  }

  public int getQuantidadeEmEstoque() {
    return this.quantidadeEmEstoque;
  }

  public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
    this.quantidadeEmEstoque = quantidadeEmEstoque;
  }

  public Categoria getCategoria() {
    return this.categoria;
  }

  public void setCategoria(Categoria categoria) {
    this.categoria = categoria;
  }

  public double valorTotalEmEstoque() {
    return this.getQuantidadeEmEstoque() * this.getPrecoUnitario();
  }

  public double calculaImposto() {
    return (this.getPrecoUnitario() * 40) / 100;
  }
}
