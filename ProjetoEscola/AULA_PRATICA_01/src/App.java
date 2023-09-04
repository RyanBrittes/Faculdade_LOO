import java.time.LocalDate;

public class App{
    public static void main (String [] args){
        Cliente C1 = new Cliente();
        C1.setCodigo(codigo:1);
        C1.setNome(nome:"Pedro");
        C1.setEndereco(endereco:"Rua X, 10");
        C1.setTelefone(telefone:"984687516");
        C1.setDataNascimento(LocalDate.of(year:1945, month:10));
        C1.setRg(rg:"45616559");
        C1.setCpf(cpf:"1321654981");
        C1.setDataInsercao(LocalDate.now());
    }
}