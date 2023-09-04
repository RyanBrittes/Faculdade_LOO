import java.time.LocalDate;

public class Tecnico extends Pessoa {
    private String cracha;

    public String getCracha() {
        return cracha;
    }

    public void setCracha(String cracha) {
        this.cracha = cracha;
    }

    public Tecnico(int codigo, String nome, String endereco, String telefone, LocalDate dataNascimento, String rg,
        String cpf, LocalDate dataInsercao, String cracha) {
    super(codigo, nome, endereco, telefone, dataNascimento, rg, cpf, dataInsercao);
        this.cracha = cracha;
    }
    public Tecnico(){

        
    }
    
}