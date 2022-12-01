import java.time.LocalDate;

public class Pedido {
  private int id;
  private LocalDate data;
  private String CPF;
  private Produto produto;
  private int quantidadeVendida;

  public Pedido(int id, LocalDate data, String CPF, Produto produto, int quantidadeVendida) {
    this.id = id;
    this.data = data;
    this.CPF = CPF;
    this.produto = produto;
    this.quantidadeVendida = quantidadeVendida;
  }

  public int getId() {
    return this.id;
  }

  public LocalDate getData() {
    return this.data;
  }

  public String getCPF() {
    return this.CPF;
  }

  public Produto getProduto() {
    return this.produto;
  }

  public int getQuantidadeVendida() {
    return this.quantidadeVendida;
  }

  public double valorTotal() {
    return this.produto.getPrecoUnitario() * this.getQuantidadeVendida();
  }

  public double totalDeImpostos() {
    return this.produto.calculaImposto() * this.getQuantidadeVendida();
  }
}
