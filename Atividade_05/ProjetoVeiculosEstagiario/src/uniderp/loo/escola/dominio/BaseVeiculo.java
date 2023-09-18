package uniderp.loo.escola.dominio;

public abstract class BaseVeiculo {
    //Atributos
    protected int codigo;
    protected String nome;
    protected String cor;
    protected int rodas;
    protected String tipoVeiculo;

    //Getters e Setters
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
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public int getRodas() {
        return rodas;
    }
    public void setRodas(int rodas) {
        this.rodas = rodas;
    }
    public String getTipoVeiculo() {
        return tipoVeiculo;
    }
    public void setTipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    //Construtor
    public BaseVeiculo(int codigo, String nome, String cor, int rodas, String tipoVeiculo) {
        this.codigo = codigo;
        this.nome = nome;
        this.cor = cor;
        this.rodas = rodas;
        this.tipoVeiculo = tipoVeiculo;
    }
    
}
