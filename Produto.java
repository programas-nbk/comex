
public class Produto {
    private static int id;
    private String nome;
    private String desc;
    private double punit;
    private  int quantest;
    private Categoria categoria;

    public Produto(String nome, String desc, double punit, int quantest, Categoria categoria){
        Produto.id++;
        this.nome = nome;
        this.desc = desc;
        this.punit = punit;
        this.quantest = quantest;
        this.categoria = categoria;
    }

    public static int getId(){
        return id;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String setnome){
        this.nome = setnome;
    }

    public String getDesc(){
        return desc;
    }
    public void setDesc(String setdesc){
        this.desc = setdesc;
    }

    public double getPunit(){ return punit;}
    public void setPunit(double setpunit){ this.punit = setpunit;}

    public double getQuantest(){ return quantest;}
    public void setQuantest(double setquantest){ this.punit = setquantest;}

    public Categoria getCategoria(){return categoria;}
    public void setCategoria(Categoria setcategoria){this.categoria = setcategoria;}

    public double valorTotal(){
        return  quantest*punit;
    }

    public double imposto(){
        return 0.4*punit;
    }

    @Override
    public String toString()
    {
        return Produto.id +" "+this.nome + " " + this.desc + " " + this.punit + " " + this.quantest + " "
                + this.categoria.getNome() + " Valor Total: " + this.valorTotal() + " Imposto: " + this.imposto();
    }

}
