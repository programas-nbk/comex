public class Cliente {
    static int contador = 0;
    int id;
    String nome;
    String sobrenome;
    String cpf;
    String telefone;
    String rua;
    String numero;
    String complemento;
    String bairro;
    String cidade;
    String estado;

    public Cliente(String nome, String sobrenome, String cpf, String telefone, String rua, String num, String complemento, String bairro, String cidade, String estado) {
        this.id += contador + 1;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.rua = rua;
        this.numero = num;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        contador++;
    }

    public int getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public String getRua() {
        return this.rua;
    }

    public String getNumero() {
        return this.numero;
    }

    public String getComplemento() {
        return this.complemento;
    }

    public String getBairro() {
        return this.bairro;
    }

    public String getCidade() {
        return this.cidade;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String nomeCompleto(){
        return this.nome + " " + this.sobrenome;
    }

    public String enderecoCompleto() {
        return String.format("%s, %s - %s - %s - %s - %s", this.rua, this.numero, this.complemento, this.bairro, this. cidade, this.estado);
    }
}
