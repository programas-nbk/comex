import java.time.LocalDate;

public class Pedido {
    static int contador = 0;
    private int id;
    private LocalDate data;
    private Cliente cliente;
    private Produto produto;
    private int qtd;

    public Pedido(LocalDate dt, Cliente cl, Produto prod, int qtd){
        this.setId(contador + 1);
        this.setData(dt);
        this.setCliente(cl);
        this.setProduto(prod);
        this.setQuantidade(qtd);
        contador++;
    }

    public int getId(){
        return this.id;
    }

    public LocalDate getData(){
        return this.data;
    }

    public Cliente getCliente(){
        return this.cliente;
    }

    public Produto getProduto(){
        return this.produto;
    }

    public int getQuantidade(){
        return this.qtd;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setData(LocalDate data){
        this.data = data;
    }

    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }

    public void setProduto(Produto produto){
        this.produto = produto;
    }

    public void setQuantidade(int qtd){
        this.qtd = qtd;
    }

    public double valorTotal(){
        return this.qtd * this.produto.getPreco();
    }

    public double valorImpostos(){
        return this.qtd * this.produto.imposto();
    }

    @Override
    public String toString(){
        return String.format("Pedido #%d\nqtd: %d %s\nvalor total: R$%.2f", this.id, this.qtd, this.produto.getNome(), this.valorTotal());
    }
}
