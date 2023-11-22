package clinica_revisao.dominio;

public class EspecialidadePorMedico extends BaseIdentificador{
    private int codigoEspecialidade;
    private int codigoMedico;
    
    public int getCodigoEspecialidade() {
        return codigoEspecialidade;
    }
    public void setCodigoEspecialidade(int codigoEspecialidade) {
        this.codigoEspecialidade = codigoEspecialidade;
    }
    public int getCodigoMedico() {
        return codigoMedico;
    }
    public void setCodigoMedico(int codigoMedico) {
        this.codigoMedico = codigoMedico;
    }

    public EspecialidadePorMedico(int codigo, int codigoEspecialidade, int codigoMedico) {
        super(codigo);
        this.codigoEspecialidade = codigoEspecialidade;
        this.codigoMedico = codigoMedico;
    } 
}