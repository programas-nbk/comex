public class Pedido {
    int id;
    static int counter = 0;
    String data;
    Cliente cliente;
    Produto produto;
    int quantidadeVendida;

    public Pedido(String data, Cliente cliente, Produto produto, int quantidadeVendida) {
        this.id += counter + 1;
        this.data = data;
        this.cliente = cliente;
        this.produto = produto;
        this.quantidadeVendida = quantidadeVendida;
        counter++;
    }

    public float calculaValorTotal() {
        return this.produto.precoUnitario*this.quantidadeVendida;
    }

    public float calculaTotalDeImpostos() {
        return this.quantidadeVendida*this.produto.calculaImposto();
    }

    public void print() {
        System.out.println("\nID: "+this.id+"\n Data: "+this.data+"\n Cliente: "+this.cliente.getNomeCompleto()+" | "+this.cliente.getEnderecoCompleto()+"\n Produto: "+this.produto.categoria+"\n Quantidade Vendida: "+this.quantidadeVendida+"\n Valor total: "+calculaValorTotal()+"\n Total de impostos: "+calculaTotalDeImpostos());
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidadeVendida() {
        return quantidadeVendida;
    }

    public void setQuantidadeVendida(int quantidadeVendida) {
        this.quantidadeVendida = quantidadeVendida;
    }
}
