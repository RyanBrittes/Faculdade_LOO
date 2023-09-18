package uniderp.loo.escola.dominio;

public abstract class BaseDocumentacao extends BaseVeiculo{
    //Atributos
    protected String nomeProprietario;
    protected int anoModelo;
    protected int anoFabricacao;
    protected double pesoLiquido;
    protected double pesoTotal;
    protected String estadoUF;
    protected String cidadeUF;
    protected double potencia;
    protected String tipoCombustivel;
    protected int qtdeMotores;
    protected int qtdeOcupantes;
    protected String fabricante;
    protected String modelo;
    protected int eixos;
    protected int assentos;

    //Getters e Setters
    public String getNomeProprietario() {
        return nomeProprietario;
    }
    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }
    public int getAnoModelo() {
        return anoModelo;
    }
    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }
    public int getAnoFabricacao() {
        return anoFabricacao;
    }
    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
    public double getPesoLiquido() {
        return pesoLiquido;
    }
    public void setPesoLiquido(double pesoLiquido) {
        this.pesoLiquido = pesoLiquido;
    }
    public double getPesoTotal() {
        return pesoTotal;
    }
    public void setPesoTotal(double pesoTotal) {
        this.pesoTotal = pesoTotal;
    }
    public String getEstadoUF() {
        return estadoUF;
    }
    public void setEstadoUF(String estadoUF) {
        this.estadoUF = estadoUF;
    }
    public String getCidadeUF() {
        return cidadeUF;
    }
    public void setCidadeUF(String cidadeUF) {
        this.cidadeUF = cidadeUF;
    }
    public double getPotencia() {
        return potencia;
    }
    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }
    public String getTipoCombustivel() {
        return tipoCombustivel;
    }
    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
    public int getQtdeMotores() {
        return qtdeMotores;
    }
    public void setQtdeMotores(int qtdeMotores) {
        this.qtdeMotores = qtdeMotores;
    }
    public int getQtdeOcupantes() {
        return qtdeOcupantes;
    }
    public void setQtdeOcupantes(int qtdeOcupantes) {
        this.qtdeOcupantes = qtdeOcupantes;
    }
    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getEixos() {
        return eixos;
    }
    public void setEixos(int eixos) {
        this.eixos = eixos;
    }
    public int getAssentos() {
        return assentos;
    }
    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }

    //Construtor
    public BaseDocumentacao(int codigo, String nome, String cor, int rodas, String tipoVeiculo, String nomeProprietario,
            int anoModelo, int anoFabricacao, double pesoLiquido, double pesoTotal, String estadoUF, String cidadeUF,
            double potencia, String tipoCombustivel, int qtdeMotores, int qtdeOcupantes, String fabricante,
            String modelo, int eixos, int assentos) {
        super(codigo, nome, cor, rodas, tipoVeiculo);
        this.nomeProprietario = nomeProprietario;
        this.anoModelo = anoModelo;
        this.anoFabricacao = anoFabricacao;
        this.pesoLiquido = pesoLiquido;
        this.pesoTotal = pesoTotal;
        this.estadoUF = estadoUF;
        this.cidadeUF = cidadeUF;
        this.potencia = potencia;
        this.tipoCombustivel = tipoCombustivel;
        this.qtdeMotores = qtdeMotores;
        this.qtdeOcupantes = qtdeOcupantes;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.eixos = eixos;
        this.assentos = assentos;
    }
    
}
