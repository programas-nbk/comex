public class Pedido {

    private static int idClass;
    private  int id;
    private String data;
    private Cliente cliente;
    private Produto produto;
    private int quantidadeVendida;

    public Pedido(String data, Cliente cliente, Produto produto, int quantidadeVendida) {
        Pedido.idClass++;
        this.id = Pedido.getIdclass();
        this.data = data;
        this.cliente = cliente;
        this.produto = produto;
        this.quantidadeVendida = quantidadeVendida;
    }

    public static int getIdclass(){
        return idClass;
    }

    public int getId(){
        return id;
    }


    public String getData() {
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
        return this.produto.getPunit() * this.getQuantidadeVendida();
    }

    public double totalImpostos() {
        return this.produto.imposto() * this.getQuantidadeVendida();
    }

    @Override
    public String toString()
    {
        return "\nID Pedido: "+this.id+"\n Data: "+this.data+"\n Cliente: "+this.cliente.getNomeCompleto()+" | "+this.cliente.getEnderecoCompleto()+"\n Produto: "+this.produto.getCategoria()+"\n Quantidade Vendida: "+this.quantidadeVendida+"\n Valor total: "+valorTotal()+"\n Total de impostos: "+totalImpostos();
    }
}
