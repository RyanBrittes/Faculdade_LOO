import clinica_revisao.dominio.Medico;
import clinica_revisao.fakedb.MedicoFakeDB;

public class App {
    public static void main(String[] args) {
        MedicoFakeDB medicodb = new MedicoFakeDB();

        for(Medico med : medicodb.getTabela()){
            System.out.println(med.toString());
        }
    }
}
