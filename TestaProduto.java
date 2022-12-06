

public class TestaProduto {
    public static void main(String[] args){
        Categoria[] obj = new Categoria[2];
        obj[0] = new Categoria("INFORMÁTICA","ATIVA");
        obj[1] = new Categoria("LIVROS","ATIVA");

        Produto[] pobj = new Produto[3];
        pobj[0] = new Produto("Notebook", "Samsung",3523.0, 1, obj[0]);
        System.out.println(pobj[0]);
        pobj[1] = new Produto("Livro","Clean Architecture", 102.90, 2, obj[1]);
        System.out.println(pobj[1]);
        pobj[2] = new Produto("Monitor", "Dell 27", 1889.0, 3, obj[0]);
        System.out.println(pobj[2]);
    }
}
