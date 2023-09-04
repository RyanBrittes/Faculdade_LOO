package uniderp.loo.escola.dominio;

import java.time.LocalDate;

public class Passageiro extends BasePessoa{
    private String numeroCartao;
    private String documento;

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Passageiro(int codigo, String nome, String email, String telefone, LocalDate dataNascimento, String usuario,
        String senha, String registro, String numeroCartao, String documento) {
    super(codigo, nome, email, telefone, dataNascimento, usuario, senha, registro);
    this.numeroCartao = numeroCartao;
    this.documento = documento;
}
    
}
