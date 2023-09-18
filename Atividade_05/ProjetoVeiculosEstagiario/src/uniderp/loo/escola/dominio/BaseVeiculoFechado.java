package uniderp.loo.escola.dominio;

public abstract class BaseVeiculoFechado extends BaseDocumentacao{
    //Atributos
    protected int portas;

    //Getters e Setters
    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    //Construtor
    public BaseVeiculoFechado(int codigo, String nome, String cor, int rodas, String tipoVeiculo,
            String nomeProprietario, int anoModelo, int anoFabricacao, double pesoLiquido, double pesoTotal,
            String estadoUF, String cidadeUF, double potencia, String tipoCombustivel, int qtdeMotores,
            int qtdeOcupantes, String fabricante, String modelo, int eixos, int assentos, int portas) {
        super(codigo, nome, cor, rodas, tipoVeiculo, nomeProprietario, anoModelo, anoFabricacao, pesoLiquido, pesoTotal,
                estadoUF, cidadeUF, potencia, tipoCombustivel, qtdeMotores, qtdeOcupantes, fabricante, modelo, eixos,
                assentos);
        this.portas = portas;
    }
}
