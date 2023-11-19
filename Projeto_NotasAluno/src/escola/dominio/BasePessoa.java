package src.escola.dominio;

import java.time.LocalDate;

public abstract class BasePessoa extends BaseIdentificador{
    protected String nome;
    protected LocalDate dataNascimento;
    protected String codigoTurma;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public String getCodigoTurma() {
        return codigoTurma;
    }
    public void setCodigoTurma(String codigoTurma) {
        this.codigoTurma = codigoTurma;
    }
    public BasePessoa(int codigo, String nome, LocalDate dataNascimento) {
        super(codigo);
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }
    @Override
    public String toString() {
        return "BasePessoa [nome=" + nome + ", dataNascimento=" + dataNascimento + ", codigoTurma=" + codigoTurma + "]";
    }
    
}
