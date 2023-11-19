//import clinica.dominio.Medico;
//import clinica.dominio.Paciente;
import clinica.dominio.Responsavel;
import clinica.fakedb.ResponsavelFakeDB;

public class App {
    public static void main(String[] args) throws Exception {
        /*MedicoFakeDB db = new MedicoFakeDB();

        for(Medico med : db.getTabela()) {
            System.out.println(med.toString());
        }*/

        /*PacienteFakeDB db = new PacienteFakeDB();

        for (Paciente pac : db.getTabela()){
            System.out.println(pac.toString());
        }*/

        ResponsavelFakeDB db = new ResponsavelFakeDB();

        for(Responsavel resp : db.getTabela()){
            System.out.println(resp.toString());
        }
    }
}
