package uniderp.loo.escola.dominio;

public abstract class BaseVeiculoTerrestre extends BaseCaracteristicas implements IPartida{
    protected String tipoTransporte;
    protected String categoriaCNH;
    
    public String getTipoTransporte() {
        return tipoTransporte;
    }
    public void setTipoTransporte(String tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }
    public String getCategoriaCNH() {
        return categoriaCNH;
    }
    public void setCategoriaCNH(String categoriaCNH) {
        this.categoriaCNH = categoriaCNH;
    }

    public BaseVeiculoTerrestre(int codigo, String nome, String chassi, String nomeProprietario, String codigoRenavam,
            String placa, int anoModelo, int anoFabricacao, double pesoLiquido, double pesoTotal, String estadoUF,
            String cidadeUF, double potencia, String tipoCombustivel, int qtdeMotores, int qtdeOcupantes,
            String fabricante, String modelo, String cor, int eixos, int portas, int rodas, int assentos,
            String tipoVeiculo, String tipoTransporte, String categoriaCNH) {
        super(codigo, nome, chassi, nomeProprietario, codigoRenavam, placa, anoModelo, anoFabricacao, pesoLiquido,
                pesoTotal, estadoUF, cidadeUF, potencia, tipoCombustivel, qtdeMotores, qtdeOcupantes, fabricante,
                modelo, cor, eixos, portas, rodas, assentos, tipoVeiculo);
        this.tipoTransporte = tipoTransporte;
        this.categoriaCNH = categoriaCNH;
    }
    
    public void colocarChave() {
        System.out.println("teste" + this.tipoTransporte);
    }
    public void girarChave() {
        System.out.println("teste" + this.tipoTransporte);
    }
}
