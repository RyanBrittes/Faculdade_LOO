package uniderp.loo.escola.dominio;

public class Motocicleta extends BaseVeiculoAberto{
    //Atributos
    private int cilindragem;

    //Getters e Setters
    public int getCilindragem() {
        return cilindragem;
    }

    public void setCilindragem(int cilindragem) {
        this.cilindragem = cilindragem;
    }

    //Construtor
    public Motocicleta(int codigo, String nome, String cor, int rodas, String tipoVeiculo, String nomeProprietario,
            int anoModelo, int anoFabricacao, double pesoLiquido, double pesoTotal, String estadoUF, String cidadeUF,
            double potencia, String tipoCombustivel, int qtdeMotores, int qtdeOcupantes, String fabricante,
            String modelo, int eixos, int assentos, String placa, String chassi, String codigoRenavam,
            int cilindragem) {
        super(codigo, nome, cor, rodas, tipoVeiculo, nomeProprietario, anoModelo, anoFabricacao, pesoLiquido, pesoTotal,
                estadoUF, cidadeUF, potencia, tipoCombustivel, qtdeMotores, qtdeOcupantes, fabricante, modelo, eixos,
                assentos, placa, chassi, codigoRenavam);
        this.cilindragem = cilindragem;
    }

    //Método
    public void acionarSeta() {
        System.out.println("Acionando Seta");
    }
}
