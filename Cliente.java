public class Cliente {
  private static int idClass;
  private int id;
  private String primeiroNome;
  private String sobrenome;
  private String CPF;
  private int telefone;
  private String rua;
  private int numeroDaCasa;
  private String complemento;
  private String bairro;
  private String cidade;
  private String estado;

  public Cliente(String primeiroNome, String sobrenome, String CPF, int telefone, String rua, int numeroDaCasa,
      String complemento, String bairro, String cidade, String estado) {
    Cliente.idClass += 1;
    setId(Cliente.idClass);
    this.primeiroNome = primeiroNome;
    this.sobrenome = sobrenome;
    this.CPF = CPF;
    this.telefone = telefone;
    this.rua = rua;
    this.numeroDaCasa = numeroDaCasa;
    this.complemento = complemento;
    this.bairro = bairro;
    this.cidade = cidade;
    this.estado = estado;
  }

  public int getId() {
    return this.id;
  }

  private void setId(int id) {
    this.id = id;
  }

  public String getPrimeiroNome() {
    return this.primeiroNome;
  }

  public String getSobrenome() {
    return this.sobrenome;
  }

  public String getCPF() {
    return this.CPF;
  }

  public int getTelefone() {
    return this.telefone;
  }

  public String getRua() {
    return this.rua;
  }

  public int getNumeroDaCasa() {
    return this.numeroDaCasa;
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

  public String nomeCompleto() {
    return String.format("%s %s", this.getPrimeiroNome(), this.getSobrenome());
  }

  public String enderecoCompleto() {
    return String.format("%s, %s, %s, %s, %s, %s", this.getRua(), this.getNumeroDaCasa(), this.getComplemento(),
        this.getBairro(), this.getCidade(), this.getEstado());
  }
}
