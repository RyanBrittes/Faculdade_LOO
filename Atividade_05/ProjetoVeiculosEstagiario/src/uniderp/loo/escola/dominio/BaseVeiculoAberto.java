package uniderp.loo.escola.dominio;

public abstract class BaseVeiculoAberto extends BaseDocumentacao implements ISinalizacao{
    //Atributos
    protected String placa;
    protected String chassi;
    protected String codigoRenavam;
    
    //Getters e Setters
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getChassi() {
        return chassi;
    }
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    public String getCodigoRenavam() {
        return codigoRenavam;
    }
    public void setCodigoRenavam(String codigoRenavam) {
        this.codigoRenavam = codigoRenavam;
    }

    //Construtor
    public BaseVeiculoAberto(int codigo, String nome, String cor, int rodas, String tipoVeiculo,
            String nomeProprietario, int anoModelo, int anoFabricacao, double pesoLiquido, double pesoTotal,
            String estadoUF, String cidadeUF, double potencia, String tipoCombustivel, int qtdeMotores,
            int qtdeOcupantes, String fabricante, String modelo, int eixos, int assentos, String placa, String chassi,
            String codigoRenavam) {
        super(codigo, nome, cor, rodas, tipoVeiculo, nomeProprietario, anoModelo, anoFabricacao, pesoLiquido, pesoTotal,
                estadoUF, cidadeUF, potencia, tipoCombustivel, qtdeMotores, qtdeOcupantes, fabricante, modelo, eixos,
                assentos);
        this.placa = placa;
        this.chassi = chassi;
        this.codigoRenavam = codigoRenavam;
    }
    
}
