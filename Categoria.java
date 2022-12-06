public class Categoria {
    private static int idClass;
    private int id;
    private String nome;
    private String status = "ATIVA";

    public Categoria(String nome, String status){
        Categoria.idClass++;
        this.id = getIdclass();
        this.nome = nome;
        this.status = status;
    }

    public static int getIdclass(){
        return idClass;
    }

    public int getId(){
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