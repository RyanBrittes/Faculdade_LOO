package clinica_revisao.fakedb;

import java.time.LocalDate;

import clinica_revisao.dominio.Responsavel;

public class ResponsavelFakeDB extends BaseGenericaFakeDB<Responsavel>{
    public ResponsavelFakeDB(){
        super();
    }

    public void CarregarDados() {
        this.tabela.add(new Responsavel(5, "Mariana", "mariana@gmail.com", "111234", "8827817289", LocalDate.of(2010, 5, 10), "Prima"));
    }
    
    
}
