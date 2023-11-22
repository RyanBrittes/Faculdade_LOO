package clinica_revisao.dominio;

import java.time.LocalDate;

public class Paciente extends BasePessoa{
    private String nomeMae;

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public Paciente(int codigo, String nome, String email, String rg, String cpf, LocalDate dataNascimento,
            String nomeMae) {
        super(codigo, nome, email, rg, cpf, dataNascimento);
        this.nomeMae = nomeMae;
    }

    @Override
    public String toString() {
        String msg = "=============================================================================\n";
        msg += "BaseIdentificador [codigo=" + codigo + "]\n";
        msg += "BasePessoa [nome=" + nome + ", email=" + email + ", rg=" + rg + ", cpf=" + cpf + ", dataNascimento="
        + dataNascimento + ", codigoProfissao=" + codigoProfissao + ", codigoEscolaridade=" + codigoEscolaridade
        + ", enderecos=" + enderecos + "]\n";
        msg += "Paciente [nomeMae=" + nomeMae + "]\n";

        return msg;
    }
    
}
