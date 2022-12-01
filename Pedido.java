import java.time.LocalDate;

public class Pedido {
  private static int idClass;
  private int id;
  private LocalDate data;
  private Cliente cliente;
  private Produto produto;
  private int quantidadeVendida;

  public Pedido(LocalDate data, Cliente cliente, Produto produto, int quantidadeVendida) {
    Pedido.idClass +=1;
    setId(Pedido.idClass);
    this.data = data;
    this.cliente = cliente;
    this.produto = produto;
    this.quantidadeVendida = quantidadeVendida;
  }

  public int getId() {
    return this.id;
  }

  private void setId(int id) {
    this.id = id;
  }

  public LocalDate getData() {
    return this.data;
  }

  public Cliente getCliente() {
    return this.cliente;
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
