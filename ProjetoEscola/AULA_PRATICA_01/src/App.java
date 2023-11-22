import java.time.LocalDate;

public class App{
    public static void main (String [] args){
        Cliente C1 = new Cliente();
        C1.setCodigo(1);
        C1.setNome("Pedro");
        C1.setEndereco("Rua X, 10");
        C1.setTelefone("984687516");
        C1.setDataNascimento(LocalDate.of(1945, 10, 5));
        C1.setRg("45616559");
        C1.setCpf("1321654981");
        C1.setDataInsercao(LocalDate.now());
    }
}