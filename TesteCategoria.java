public class TesteCategoria {
    public static void main(String[] args){
        Categoria[] obj = new Categoria[3];

        obj[0] = new Categoria("INFORMÁTICA","ATIVA");
        System.out.println("Categoria " + obj[0].getNome() +  " (" + Categoria.getId() + " - " + obj[0].getStatus() + ")");
        obj[1] = new Categoria("MÓVEIS","INATIVA");
        System.out.println("Categoria " + obj[1].getNome() +  " (" + Categoria.getId() + " - " + obj[1].getStatus() + ")");
        obj[2] = new Categoria("LIVROS","ATIVA");
        System.out.println("Categoria " + obj[2].getNome() +  " (" + Categoria.getId() + " - " + obj[2].getStatus() + ")");
       /* for (int i=0;i<obj.length;i++){

        }*/

    }
}
