package uniderp.loo.escola.dominio;

public abstract class BaseCaracteristicas extends BaseDocumento{
    protected String cor;
    protected int eixos;
    protected int portas;
    protected int rodas;
    protected int assentos;
    protected String tipoVeiculo;

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public int getEixos() {
        return eixos;
    }
    public void setEixos(int eixos) {
        this.eixos = eixos;
    }
    public int getPortas() {
        return portas;
    }
    public void setPortas(int portas) {
        this.portas = portas;
    }
    public int getRodas() {
        return rodas;
    }
    public void setRodas(int rodas) {
        this.rodas = rodas;
    }
    public int getAssentos() {
        return assentos;
    }
    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }
    public String getTipoVeiculo() {
        return tipoVeiculo;
    }
    public void setTipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public BaseCaracteristicas(int codigo, String nome, String chassi, String nomeProprietario, String codigoRenavam,
            String placa, int anoModelo, int anoFabricacao, double pesoLiquido, double pesoTotal, String estadoUF,
            String cidadeUF, double potencia, String tipoCombustivel, int qtdeMotores, int qtdeOcupantes,
            String fabricante, String modelo, String cor, int eixos, int portas, int rodas, int assentos,
            String tipoVeiculo) {
        super(codigo, nome, chassi, nomeProprietario, codigoRenavam, placa, anoModelo, anoFabricacao, pesoLiquido,
                pesoTotal, estadoUF, cidadeUF, potencia, tipoCombustivel, qtdeMotores, qtdeOcupantes, fabricante,
                modelo);
        this.cor = cor;
        this.eixos = eixos;
        this.portas = portas;
        this.rodas = rodas;
        this.assentos = assentos;
        this.tipoVeiculo = tipoVeiculo;
    }
    
}
