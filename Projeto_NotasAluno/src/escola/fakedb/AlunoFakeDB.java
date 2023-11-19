package src.escola.fakedb;

import java.time.LocalDate;

import src.escola.dominio.Aluno;

public class AlunoFakeDB extends BaseGenericaFakeDB<Aluno>{
    public AlunoFakeDB(){
        super();
    }

    public void adicionarAluno() {

        alunoList.add(new Aluno(1,"Jonas", LocalDate.of(2000, 2, 23), 0, 0, 0, 0, 0));
    }
}
