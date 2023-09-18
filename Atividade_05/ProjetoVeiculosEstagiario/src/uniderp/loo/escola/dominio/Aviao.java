package uniderp.loo.escola.dominio;

public class Aviao extends BaseVeiculoAereo{
    //Atributos
    private int qtdeHelices;

    //Getters e Setters
    public int getQtdeHelices() {
        return qtdeHelices;
    }

    public void setQtdeHelices(int qtdeHelices) {
        this.qtdeHelices = qtdeHelices;
    }

    //Construtor
    public Aviao(int codigo, String nome, String cor, int rodas, String tipoVeiculo, String nomeProprietario,
            int anoModelo, int anoFabricacao, double pesoLiquido, double pesoTotal, String estadoUF, String cidadeUF,
            double potencia, String tipoCombustivel, int qtdeMotores, int qtdeOcupantes, String fabricante,
            String modelo, int eixos, int assentos, int portas, String tipoAeronave, int qtdeHelices) {
        super(codigo, nome, cor, rodas, tipoVeiculo, nomeProprietario, anoModelo, anoFabricacao, pesoLiquido, pesoTotal,
                estadoUF, cidadeUF, potencia, tipoCombustivel, qtdeMotores, qtdeOcupantes, fabricante, modelo, eixos,
                assentos, portas, tipoAeronave);
        this.qtdeHelices = qtdeHelices;
    }
    
    //Métodos
    public void Decolar(){
        System.out.println("Decolando");
    }
    public void Pousar(){
        System.out.println("Pousando");
    }
}
