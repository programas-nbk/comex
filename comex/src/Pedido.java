import java.util.Date;

public class Pedido extends Base {
    private Date data;
    private Produto produto;
    private int quantidade;
    private Cliente cliente;
    private static int ultimoId;

    public Pedido(Cliente cliente, Produto produto, int quantidade){
        ultimoId = setId(ultimoId);
        this.data = new Date();
        this.cliente = cliente;
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public int getId() {
        return id;
    }

    public Date getData() {
        return data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double calcularValorTotalPedido() { return this.produto.getPreco() * this.quantidade; }
    public double calcularValorTotalImposto() { return this.produto.calcularImposto() * this.quantidade; }

    public void detalhar(){
        System.out.println(String.format("(Id: %s - Data: %s - Cliente: ( %s ) - Produto: %s - Categoria: %s " +
                        "- Quantidade: %s - Valor total pedido: %.2f - Valor total imposto: %.2f)",
                this.id, this.data, String.format("%s - Endereco: %s", this.cliente.nomeCompleto(), this.cliente.enderecoCompleto()),
                this.produto.getNome(), this.produto.getCategoria().getNome(), this.quantidade,
                this.calcularValorTotalPedido(), this.calcularValorTotalImposto()));
    }
}
