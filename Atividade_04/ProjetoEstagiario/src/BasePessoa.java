import java.time.LocalDate;

public abstract class BasePessoa {
    protected int codigo;
    protected String nome;
    protected String email;
    protected String telefone;
    protected LocalDate dataNascimento;
    protected String usuario;
    protected String senha;
    protected String registro;
    protected String documento;

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getRegistro() {
        return registro;
    }
    public void setRegistro(String registro) {
        this.registro = registro;
    }
    public String getDocumento() {
        return documento;
    }
    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public BasePessoa(int codigo, String nome, String email, String telefone, LocalDate dataNascimento, String usuario,
        String senha, String registro, String documento) {
            this.codigo = codigo;
            this.nome = nome;
            this.email = email;
            this.telefone = telefone;
            this.dataNascimento = dataNascimento;
            this.usuario = usuario;
            this.senha = senha;
            this.registro = registro;
            this.documento = documento;
        }
}
