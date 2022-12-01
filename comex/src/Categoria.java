public class Categoria {
    static int counter = 0;
    int id;
    String name;
    String status = "ATIVA";

    public Categoria(String name, String status) {
        this.id += counter + 1;
        this.name = name;
        this.status = status;
        counter++;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void print() {
        System.out.println("Categoria "+this.name+" ("+this.id+" - "+this.status+")");
    }
}
