package uniderp.loo.escola.dominio;

public class Motocicleta extends BaseVeiculoTerrestre{
    private String posicaoCondutor;
    private int cilindragem;
    
    public String getPosicaoCondutor() {
        return posicaoCondutor;
    }
    public void setPosicaoCondutor(String posicaoCondutor) {
        this.posicaoCondutor = posicaoCondutor;
    }
    public int getCilindragem() {
        return cilindragem;
    }
    public void setCilindragem(int cilindragem) {
        this.cilindragem = cilindragem;
    }

    public Motocicleta(int codigo, String nome, String chassi, String nomeProprietario, String codigoRenavam,
            String placa, int anoModelo, int anoFabricacao, double pesoLiquido, double pesoTotal, String estadoUF,
            String cidadeUF, double potencia, String tipoCombustivel, int qtdeMotores, int qtdeOcupantes,
            String fabricante, String modelo, String cor, int eixos, int portas, int rodas, int assentos,
            String tipoVeiculo, String tipoTransporte, String categoriaCNH, String posicaoCondutor, int cilindragem) {
        super(codigo, nome, chassi, nomeProprietario, codigoRenavam, placa, anoModelo, anoFabricacao, pesoLiquido,
                pesoTotal, estadoUF, cidadeUF, potencia, tipoCombustivel, qtdeMotores, qtdeOcupantes, fabricante,
                modelo, cor, eixos, portas, rodas, assentos, tipoVeiculo, tipoTransporte, categoriaCNH);
        this.posicaoCondutor = posicaoCondutor;
        this.cilindragem = cilindragem;
    }

    public void colocarChave() {
        System.out.println("teste" + this.posicaoCondutor);
    }
    public void girarChave() {
        System.out.println("teste" + this.posicaoCondutor);
    }
    
}
