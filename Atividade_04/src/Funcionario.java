import java.time.LocalDate;

public class Funcionario  extends BasePessoa{
    private String contaCorrente;
    private int cracha;
    
    public String getContaCorrente() {
        return contaCorrente;
    }
    public void setContaCorrente(String contaCorrente) {
        this.contaCorrente = contaCorrente;
    }
    public int getCracha() {
        return cracha;
    }
    public void setCracha(int cracha) {
        this.cracha = cracha;
    }

    public Funcionario(int codigo, String nome, String email, String telefone, LocalDate dataNascimento, String usuario,
            String senha, String registro, String documento, String contaCorrente, int cracha) {
        super(codigo, nome, email, telefone, dataNascimento, usuario, senha, registro, documento);
        this.contaCorrente = contaCorrente;
        this.cracha = cracha;
    }
}
