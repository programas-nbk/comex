public class Categoria {
    private static int id;
    private String nome;
    private String status = "ATIVA";

    public Categoria(String nome, String status){
        Categoria.id++;
        this.nome = nome;
        this.status = status;
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

    public String getStatus(){
        return status;
    }
    public void setStatus(String setstatus){
        this.status = setstatus;
    }
}