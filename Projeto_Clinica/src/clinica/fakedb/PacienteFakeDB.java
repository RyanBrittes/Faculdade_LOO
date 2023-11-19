package clinica.fakedb;

import java.time.LocalDate;

import clinica.dominio.Paciente;

public class PacienteFakeDB extends BaseGenericaFakeDB<Paciente>{

    public PacienteFakeDB(){
        super();
    }

    public void CarregarDados() {
        this.tabela.add(new Paciente(1, "Jonas", "jonas@hotmail.com", "035674", "16584589612", LocalDate.of(2000, 8, 10), "Julia"));
        this.tabela.add(new Paciente(2, "Luis", "luis@hotmail.com", "8564263", "06485231569", LocalDate.of(1966, 11, 20), "Suelem"));
        this.tabela.add(new Paciente(3, "Anaís", "anaís@hotmail.com", "1236845", "9635274896", LocalDate.of(1988, 12, 10), "Rafaela"));
        this.tabela.add(new Paciente(4, "Jerry", "jerry@hotmail.com", "168745", "36645258968", LocalDate.of(1985, 2, 3), "Luiza"));
        this.tabela.add(new Paciente(5, "Leonard", "leonard@hotmail.com", "987456", "15698745636", LocalDate.of(2002, 1,31), "Larissa"));
    }

    
}
