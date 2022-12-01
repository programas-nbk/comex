enum StatusCategoria {
    ATIVA, INATIVA
}

public class Categoria extends Base {
    private String nome;
    private StatusCategoria status = StatusCategoria.ATIVA;
    private static int ultimoId;

    public Categoria(String nome){
        ultimoId = setId(ultimoId);
        this.nome = nome;
    }

    public Categoria(String nome, StatusCategoria status){
        ultimoId = setId(ultimoId);
        this.nome = nome;
        this.status = status;
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

    public StatusCategoria getStatus() {
        return status;
    }

    public void setStatus(StatusCategoria status) {
        this.status = status;
    }

    public void detalhar(){
        System.out.printf("Categoria %s (%s - %s)%n", this.nome, this.id, this.status.name());
    }

}


