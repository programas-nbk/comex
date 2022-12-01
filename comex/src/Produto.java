public class Produto {
    int id;
    static int counter = 0;
    String nome;
    String descricao;
    float precoUnitario;
    int quantidadeEmEstoque;
    String categoria;

    public Produto(String nome, String descricao, float precoUnitario, int quantidadeEmEstoque, String categoria) {
        this.id += counter + 1;
        this.nome = nome;
        this.descricao = descricao;
        this.precoUnitario = precoUnitario;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
        this.categoria = categoria;
        counter++;
    }

    public float calculaValorTotal() {
        return this.precoUnitario*this.quantidadeEmEstoque;
    }

    public float calculaImposto() {
        return (float) (this.precoUnitario*0.4);
    }

    public void print() {
        System.out.println("Descrição: "+this.descricao+"\n"+"ID: "+this.id+"\n"+"Nome: "+this.nome+"\n"+"Categoria: "+this.categoria+"\n"+"Valor total em estoque: "+calculaValorTotal()+"\n"+"Imposto: "+calculaImposto()+"\n"+"Preço Unitário: "+this.precoUnitario+"\n"+"Quantidade em estoque: "+this.quantidadeEmEstoque+"\n");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(float precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
