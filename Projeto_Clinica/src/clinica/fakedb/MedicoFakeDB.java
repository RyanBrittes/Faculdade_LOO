package clinica.fakedb;

import java.time.LocalDate;

import clinica.dominio.Medico;

public class MedicoFakeDB extends BaseGenericaFakeDB<Medico>{
    public MedicoFakeDB(){
        super();
    }

    public void CarregarDados() {
        this.tabela.add(new Medico(1, "Rafael", "rafael@terra.com", "314153", "12312334576", LocalDate.of(1986,6,14), "124AB"));
        this.tabela.add(new Medico(2, "Josue", "josue@terra.com", "168945", "03215478964", LocalDate.of(1984,3,24), "134AJ"));
        this.tabela.add(new Medico(3, "James", "james@terra.com", "164528", "65894578211", LocalDate.of(1985,2,5), "154AB"));
        this.tabela.add(new Medico(4, "Lucas", "lucas@terra.com", "765138", "96428365148", LocalDate.of(1910,7,10), "164OO"));
        this.tabela.add(new Medico(5, "Luan", "luan@terra.com", "201684", "85416897526", LocalDate.of(1990,3,4), "114AA"));
        this.tabela.add(new Medico(6, "Ester", "ester@terra.com", "984265", "32159746825", LocalDate.of(1980,6,2), "174HB"));
    }

}
