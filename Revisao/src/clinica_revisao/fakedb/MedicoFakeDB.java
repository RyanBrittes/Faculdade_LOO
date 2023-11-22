package clinica_revisao.fakedb;

import java.time.LocalDate;

import clinica_revisao.dominio.Medico;

public class MedicoFakeDB extends BaseGenericaFakeDB<Medico>{

    public MedicoFakeDB(){
        super();
    }

    public void CarregarDados() {
        this.tabela.add(new Medico(3, "James", "james@terra.com", "164528", "65894578211", LocalDate.of(1985,2,5), "154AB"));
    }

    
}
