package uniderp.loo.escola.dominio;

public abstract class BaseVeiculo {
    protected int codigo;
    protected String nome;

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
    
    public BaseVeiculo(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

}