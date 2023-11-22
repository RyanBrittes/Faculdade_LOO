package clinica_revisao.fakedb;

import java.time.LocalDate;

import clinica_revisao.dominio.Paciente;

public class PacienteFakeDB extends BaseGenericaFakeDB<Paciente>{
    public PacienteFakeDB(){
        super();
    }

    public void CarregarDados() {
        this.tabela.add(new Paciente(5, "Leonard", "leonard@hotmail.com", "987456", "15698745636", LocalDate.of(2002, 1,31), "Larissa"));
    }
}
