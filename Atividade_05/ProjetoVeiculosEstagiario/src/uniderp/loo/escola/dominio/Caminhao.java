package uniderp.loo.escola.dominio;

public class Caminhao extends BaseVeiculoTerrestre{
    //Atributos
    private String tipoCarga;

    //Getters e Setters
    public String getTipoCarga() {
        return tipoCarga;
    }

    public void setTipoCarga(String tipoCarga) {
        this.tipoCarga = tipoCarga;
    }

    //Construtor
    public Caminhao(int codigo, String nome, String cor, int rodas, String tipoVeiculo, String nomeProprietario,
            int anoModelo, int anoFabricacao, double pesoLiquido, double pesoTotal, String estadoUF, String cidadeUF,
            double potencia, String tipoCombustivel, int qtdeMotores, int qtdeOcupantes, String fabricante,
            String modelo, int eixos, int assentos, int portas, String placa, String chassi, String codigoRenavam,
            String tipoCarga) {
        super(codigo, nome, cor, rodas, tipoVeiculo, nomeProprietario, anoModelo, anoFabricacao, pesoLiquido, pesoTotal,
                estadoUF, cidadeUF, potencia, tipoCombustivel, qtdeMotores, qtdeOcupantes, fabricante, modelo, eixos,
                assentos, portas, placa, chassi, codigoRenavam);
        this.tipoCarga = tipoCarga;
    }
    
    //Método
    public void acionarSeta() {
        System.out.println("Acionando Seta");
    }
}
