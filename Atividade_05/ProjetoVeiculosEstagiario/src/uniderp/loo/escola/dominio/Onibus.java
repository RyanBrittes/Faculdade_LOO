package uniderp.loo.escola.dominio;

public class Onibus extends BaseVeiculoTerrestre{
    private int qtdeMotorista;

    public int getQtdeMotorista() {
        return qtdeMotorista;
    }
    public void setQtdeMotorista(int qtdeMotorista) {
        this.qtdeMotorista = qtdeMotorista;
    }

    public Onibus(int codigo, String nome, String chassi, String nomeProprietario, String codigoRenavam, String placa,
            int anoModelo, int anoFabricacao, double pesoLiquido, double pesoTotal, String estadoUF, String cidadeUF,
            double potencia, String tipoCombustivel, int qtdeMotores, int qtdeOcupantes, String fabricante,
            String modelo, String cor, int eixos, int portas, int rodas, int assentos, String tipoVeiculo,
            String tipoTransporte, String categoriaCNH, int qtdeMotorista) {
        super(codigo, nome, chassi, nomeProprietario, codigoRenavam, placa, anoModelo, anoFabricacao, pesoLiquido,
                pesoTotal, estadoUF, cidadeUF, potencia, tipoCombustivel, qtdeMotores, qtdeOcupantes, fabricante,
                modelo, cor, eixos, portas, rodas, assentos, tipoVeiculo, tipoTransporte, categoriaCNH);
        this.qtdeMotorista = qtdeMotorista;
    }

    public void colocarChave() {
        System.out.println("teste" + this.qtdeMotorista);
    }
    public void girarChave() {
        System.out.println("teste" + this.qtdeMotorista);
    }

}
