import java.util.Date;

public class TestaCategoria {
    public static void main(String[] args) {
        Categoria categoria1 = new Categoria("INFORMÁTICA");
        Categoria categoria2 = new Categoria("MÓVEIS", StatusCategoria.INATIVA);
        Categoria categoria3 = new Categoria("LIVROS");

        categoria1.detalhar();
        categoria2.detalhar();
        categoria3.detalhar();

        System.out.println(new Date());
    }
}
