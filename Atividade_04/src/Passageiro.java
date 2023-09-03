import java.time.LocalDate;

public class Passageiro extends BasePessoa{
    private String numeroCartao;

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public Passageiro(int codigo, String nome, String email, String telefone, LocalDate dataNascimento, String usuario,
            String senha, String registro, String documento, String numeroCartao) {
        super(codigo, nome, email, telefone, dataNascimento, usuario, senha, registro, documento);
        this.numeroCartao = numeroCartao;
    }

    
}
