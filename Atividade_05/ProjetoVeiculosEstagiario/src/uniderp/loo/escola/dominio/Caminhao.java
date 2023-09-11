package uniderp.loo.escola.dominio;

public class Caminhao extends BaseVeiculoTerrestre{
    private String tipoRNTRC;
    private String tipoCarga;
    
    public String getTipoRNTRC() {
        return tipoRNTRC;
    }
    public void setTipoRNTRC(String tipoRNTRC) {
        this.tipoRNTRC = tipoRNTRC;
    }
    public String getTipoCarga() {
        return tipoCarga;
    }
    public void setTipoCarga(String tipoCarga) {
        this.tipoCarga = tipoCarga;
    }

    public Caminhao(int codigo, String nome, String chassi, String nomeProprietario, String codigoRenavam, String placa,
            int anoModelo, int anoFabricacao, double pesoLiquido, double pesoTotal, String estadoUF, String cidadeUF,
            double potencia, String tipoCombustivel, int qtdeMotores, int qtdeOcupantes, String fabricante,
            String modelo, String cor, int eixos, int portas, int rodas, int assentos, String tipoVeiculo,
            String tipoTransporte, String categoriaCNH, String tipoRNTRC, String tipoCarga) {
        super(codigo, nome, chassi, nomeProprietario, codigoRenavam, placa, anoModelo, anoFabricacao, pesoLiquido,
                pesoTotal, estadoUF, cidadeUF, potencia, tipoCombustivel, qtdeMotores, qtdeOcupantes, fabricante,
                modelo, cor, eixos, portas, rodas, assentos, tipoVeiculo, tipoTransporte, categoriaCNH);
        this.tipoRNTRC = tipoRNTRC;
        this.tipoCarga = tipoCarga;
    }

    public void colocarChave() {
        System.out.println("teste" + this.tipoCarga);
    }
    public void girarChave() {
        System.out.println("teste" + this.tipoCarga);
    }

}
