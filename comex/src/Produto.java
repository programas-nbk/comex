public class Produto extends Base {
    private String nome;
    private double preco;
    private int quantidade;
    private Categoria categoria;
    private static int ultimoId;

    public Produto(String nome, double preco, int quantidade, Categoria categoria){
        ultimoId = setId(ultimoId);
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public double calcularImposto(){ return preco * 0.40; }

    public double calcularValorTotalEstoque(){ return preco * quantidade; }

    public void detalhar(){
        System.out.println(String.format("(Id: %s - Produto: %s - Preco: %.2f - Estoque: %s - Categoria: %s " +
                        "- Valor total em estoque: %.2f - Imposto por unidade: %.2f)",
                this.id, this.nome, this.preco, this.quantidade, this.categoria.getNome(),
                this.calcularValorTotalEstoque(), this.calcularImposto()));
    }
}
