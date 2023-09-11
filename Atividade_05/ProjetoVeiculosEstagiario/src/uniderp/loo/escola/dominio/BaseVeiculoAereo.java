package uniderp.loo.escola.dominio;

public abstract class BaseVeiculoAereo extends BaseCaracteristicas implements ILocomocaoAereo{
    protected String tipoAeronave;
    protected String licencaPiloto;
    
    public String getTipoAeronave() {
        return tipoAeronave;
    }
    public void setTipoAeronave(String tipoAeronave) {
        this.tipoAeronave = tipoAeronave;
    }
    public String getLicencaPiloto() {
        return licencaPiloto;
    }
    public void setLicencaPiloto(String licencaPiloto) {
        this.licencaPiloto = licencaPiloto;
    }

    public BaseVeiculoAereo(int codigo, String nome, String chassi, String nomeProprietario, String codigoRenavam,
            String placa, int anoModelo, int anoFabricacao, double pesoLiquido, double pesoTotal, String estadoUF,
            String cidadeUF, double potencia, String tipoCombustivel, int qtdeMotores, int qtdeOcupantes,
            String fabricante, String modelo, String cor, int eixos, int portas, int rodas, int assentos,
            String tipoVeiculo, String tipoAeronave, String licencaPiloto) {
        super(codigo, nome, chassi, nomeProprietario, codigoRenavam, placa, anoModelo, anoFabricacao, pesoLiquido,
                pesoTotal, estadoUF, cidadeUF, potencia, tipoCombustivel, qtdeMotores, qtdeOcupantes, fabricante,
                modelo, cor, eixos, portas, rodas, assentos, tipoVeiculo);
        this.tipoAeronave = tipoAeronave;
        this.licencaPiloto = licencaPiloto;
    }

    public void Decolar() {
        System.out.println("teste" + this.tipoAeronave);
    }
    public void Pousar() {
        System.out.println("teste" + this.tipoAeronave);
    }

    
}
