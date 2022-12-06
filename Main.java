import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Cliente cl1 = new Cliente("Emily", "Sombra", "cpf1", "fone1", "Capote Valente", "39", "", "Pinheiros", "Sao Paulo", "SP");
        Cliente cl2 = new Cliente("Emi", "Sombra", "cpf2", "fone2", "Capote Valente", "39", "", "Pinheiros", "Sao Paulo", "SP");
        Cliente cl3 = new Cliente("Emme", "Sombra", "cpf3", "fone3", "Capote Valente", "39", "", "Pinheiros", "Sao Paulo", "SP");
        Categoria cat1 = new Categoria("INFORMÁTICA", true);
        Categoria cat2 = new Categoria("MÓVEIS");
        Categoria cat3 = new Categoria("LIVROS", true);
        Produto prod1 = new Produto("Notebook Samsung", null, 3523, 1, cat1);
        Produto prod2 = new Produto("Clean Architecture", null, 102.9, 2, cat3);
        Produto prod3 = new Produto("Monitor Dell 27", null, 1889, 3, cat1);
        Pedido ped1 = new Pedido(LocalDate.now(), cl1, prod3, 1);
        Pedido ped2 = new Pedido(LocalDate.now(), cl2, prod2, 2);
        Pedido ped3 = new Pedido(LocalDate.now(), cl3, prod1, 4);
        System.out.println("--Teste Categoria--");
        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(cat3);
        System.out.println("--Teste Produto--");
        System.out.println(prod1);
        System.out.println(prod2);
        System.out.println(prod3);
        System.out.println("--Teste Pedido--");
        System.out.println(ped1);
        System.out.println(ped2);
        System.out.println(ped3);
    }
}
