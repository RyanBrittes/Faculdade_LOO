package uniderp.loo.escola.dominio;

public class Aviao extends BaseVeiculoAereo{
    private int qtdeHelices;
    private String tipoAsa;

    public int getQtdeHelices() {
        return qtdeHelices;
    }
    public void setQtdeHelices(int qtdeHelices) {
        this.qtdeHelices = qtdeHelices;
    }
    public String getTipoAsa() {
        return tipoAsa;
    }
    public void setTipoAsa(String tipoAsa) {
        this.tipoAsa = tipoAsa;
    }

    public Aviao(int codigo, String nome, String chassi, String nomeProprietario, String codigoRenavam, String placa,
            int anoModelo, int anoFabricacao, double pesoLiquido, double pesoTotal, String estadoUF, String cidadeUF,
            double potencia, String tipoCombustivel, int qtdeMotores, int qtdeOcupantes, String fabricante,
            String modelo, String cor, int eixos, int portas, int rodas, int assentos, String tipoVeiculo,
            String tipoAeronave, String licencaPiloto, int qtdeHelices, String tipoAsa) {
        super(codigo, nome, chassi, nomeProprietario, codigoRenavam, placa, anoModelo, anoFabricacao, pesoLiquido,
                pesoTotal, estadoUF, cidadeUF, potencia, tipoCombustivel, qtdeMotores, qtdeOcupantes, fabricante,
                modelo, cor, eixos, portas, rodas, assentos, tipoVeiculo, tipoAeronave, licencaPiloto);
        this.qtdeHelices = qtdeHelices;
        this.tipoAsa = tipoAsa;
    }

    public void Decolar() {
        System.out.println("teste" + this.tipoAsa);
    }
    public void Pousar() {
        System.out.println("teste" + this.tipoAsa);
    }
}
