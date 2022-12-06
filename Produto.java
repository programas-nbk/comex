public class Produto {
    static int contador = 0;
    private int id;
    private String nome;
    private String descricao;
    private double preco;
    private int estoque;
    private Categoria categoria;


    public Produto(String nome, String desc, double preco, int qtd, Categoria cat){
        this.setId(contador + 1);
        this.setNome(nome);
        this.setDescricao(desc);
        this.setPreco(preco);
        this.setEstoque(qtd);
        this.setCategoria(cat);
        contador++;
    }

    public int getId(){
        return this.id;
    }

    public String getNome(){
        return this.nome;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public double getPreco(){
        return this.preco;
    }

    public int getEstoque(){
        return this.estoque;
    }

    public Categoria getCategoria(){
        return this.categoria;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public void setEstoque(int estoque){
        this.estoque = estoque;
    }

    public void setCategoria(Categoria categoria){
        this.categoria = categoria;
    }

    public double valorTotal(){
        return this.estoque * this.preco;
    }

    public double imposto(){
        return this.preco * 0.4;
    }

    @Override
    public String toString(){
        return String.format("%s (%s) - id:%d (qtd: %s) -> preco: R$%.2f", this.nome, this.categoria.getNome(), this.id, this.estoque, this.preco);
    }
}
