package uniderp.loo.escola.dominio;

public class Onibus extends BaseVeiculoTerrestre{
    //Atributos
    private String tipoOnibus;

    //Getters e Setters
    public String getTipoOnibus() {
        return tipoOnibus;
    }

    public void setTipoOnibus(String tipoOnibus) {
        this.tipoOnibus = tipoOnibus;
    }

    //Construtor
    public Onibus(int codigo, String nome, String cor, int rodas, String tipoVeiculo, String nomeProprietario,
            int anoModelo, int anoFabricacao, double pesoLiquido, double pesoTotal, String estadoUF, String cidadeUF,
            double potencia, String tipoCombustivel, int qtdeMotores, int qtdeOcupantes, String fabricante,
            String modelo, int eixos, int assentos, int portas, String placa, String chassi, String codigoRenavam,
            String tipoOnibus) {
        super(codigo, nome, cor, rodas, tipoVeiculo, nomeProprietario, anoModelo, anoFabricacao, pesoLiquido, pesoTotal,
                estadoUF, cidadeUF, potencia, tipoCombustivel, qtdeMotores, qtdeOcupantes, fabricante, modelo, eixos,
                assentos, portas, placa, chassi, codigoRenavam);
        this.tipoOnibus = tipoOnibus;
    }

    //Método
    public void acionarSeta() {
        System.out.println("Acionando Seta");
    }
}
