package uniderp.loo.escola.dominio;

public abstract class BaseVeiculoAereo extends BaseVeiculoFechado implements ILocomocaoAerea{
    //Atributos
    protected String tipoAeronave;

    //Getters e Setters
    public String getTipoAeronave() {
        return tipoAeronave;
    }

    public void setTipoAeronave(String tipoAeronave) {
        this.tipoAeronave = tipoAeronave;
    }

    //Construtor
    public BaseVeiculoAereo(int codigo, String nome, String cor, int rodas, String tipoVeiculo, String nomeProprietario,
            int anoModelo, int anoFabricacao, double pesoLiquido, double pesoTotal, String estadoUF, String cidadeUF,
            double potencia, String tipoCombustivel, int qtdeMotores, int qtdeOcupantes, String fabricante,
            String modelo, int eixos, int assentos, int portas, String tipoAeronave) {
        super(codigo, nome, cor, rodas, tipoVeiculo, nomeProprietario, anoModelo, anoFabricacao, pesoLiquido, pesoTotal,
                estadoUF, cidadeUF, potencia, tipoCombustivel, qtdeMotores, qtdeOcupantes, fabricante, modelo, eixos,
                assentos, portas);
        this.tipoAeronave = tipoAeronave;
    }

}
