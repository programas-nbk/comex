public class TesteCategoria {
    public static void main(String[] args){
        Categoria[] obj = new Categoria[3];

        obj[0] = new Categoria("INFORMÁTICA","ATIVA");
        obj[1] = new Categoria("MÓVEIS","INATIVA");
        obj[2] = new Categoria("LIVROS","ATIVA");

       for (int i=0;i<obj.length;i++){
           System.out.println("Categoria " + obj[i].getNome() +  " (" + obj[i].getId() + " - " + obj[i].getStatus() + ")");
        }

    }
}
