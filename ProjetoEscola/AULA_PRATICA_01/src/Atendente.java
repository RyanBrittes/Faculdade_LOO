import java.time.LocalDate;

public class Atendente extends Pessoa {
    private int cabine;

    public int getCabine() {
        return cabine;
    }

    public void setCabine(int cabine) {
        this.cabine = cabine;
    }

    public Atendente(int codigo, String nome, String endereco, String telefone, LocalDate dataNascimento, String rg,
            String cpf, LocalDate dataInsercao, int cabine) {
        super(codigo, nome, endereco, telefone, dataNascimento, rg, cpf, dataInsercao);
        this.cabine = cabine;
    }
    public Atendente (){
        
    }
    
}