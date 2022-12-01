public class Cliente extends Base {
    private String primeiroNome;
    private String sobrenome;
    private String cpf;
    private String telefone;
    private String rua;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private static int ultimoId;

    public Cliente(String primeiroNome, String sobrenome, String cpf, String telefone, String rua, String numero,
                   String complemento, String bairro, String cidade, String estado) {

        ultimoId = setId(ultimoId);
        this.primeiroNome = primeiroNome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    private String estado;

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getRua() {
        return rua;
    }

    public String getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String nomeCompleto(){
        return String.format("%s %s",this.primeiroNome, this.sobrenome);
    }

    public String enderecoCompleto(){
        return String.format("(Rua: %s - Numero: %s - Complemento: %s - Bairro: %s - Cidade: %s - Estado: %s)",
                this.rua, this.numero, this.complemento, this.bairro, this.cidade, this.estado);
    }
}
