public class Categoria{
    static int contador = 0;
    private int id;
    private String nome;
    private boolean status;

    public Categoria(String nome){
        this.id = contador + 1;
        this.nome = nome;
        this.status = false;
        contador++;
    }

    public Categoria(String nome, boolean status){
        this.id = contador + 1;
        this.nome = nome;
        this.status = status;
        contador++;
    }

    public int getId(){
        return this.id;
    }

    public String getNome(){
        return this.nome;
    }

    public boolean getStatus(){
        return this.status;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setStatus(boolean status){
        this.status = status;
    }

    @Override
    public String toString(){
        String status = this.status? "ATIVA" : "INATIVA";
        return String.format("Categoria %s (%d - %s)", this.nome, this.id, status);
    }
}