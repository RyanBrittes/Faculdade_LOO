package src.escola.dominio;

public abstract class BasePessoa extends BaseIdentificador{
    protected String nome;
    protected String codigoTurma;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigoTurma() {
        return codigoTurma;
    }
    public void setCodigoTurma(String codigoTurma) {
        this.codigoTurma = codigoTurma;
    }
    public BasePessoa(int codigo, String nome) {
        super(codigo);
        this.nome = nome;
    }
    @Override
    public String toString() {
        return "BasePessoa [nome=" + nome + ", codigoTurma=" + codigoTurma + "]";
    }
    
}
