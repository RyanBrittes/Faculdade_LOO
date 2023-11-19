package clinica.fakedb;

import java.time.LocalDate;

import clinica.dominio.Responsavel;

public class ResponsavelFakeDB  extends BaseGenericaFakeDB<Responsavel>{
    //Construtor declarado para apontar para o construtor do pai e executar os metodos dentro do construtor do pai
    public ResponsavelFakeDB(){
        super();
    }
    
    //Método herdado de BaseGenericaFakeDB para carregar os dados da Entidade
    public void CarregarDados() {
        //Instanciamento da entidade para adicionar os dados ao FakeDB
        this.tabela.add(new Responsavel(1, "Joao", "joao@gmail.com", "09238", "0927817289", LocalDate.of(1970, 12, 21), "Irmao"));
        this.tabela.add(new Responsavel(2, "Maria", "maria@gmail.com", "892001", "0927812711", LocalDate.of(1990, 7, 8), "Tia"));
        this.tabela.add(new Responsavel(3, "Lucas", "lucas@gmail.com", "78310", "9887817289", LocalDate.of(1990, 2, 19), "Irmao"));
        this.tabela.add(new Responsavel(4, "Otavio", "otavio@gmail.com", "89400", "7861117289", LocalDate.of(1970, 2, 9), "Pai"));
        this.tabela.add(new Responsavel(5, "Mariana", "mariana@gmail.com", "111234", "8827817289", LocalDate.of(2010, 5, 10), "Prima"));
        
    }
    
}
