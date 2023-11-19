package clinica.fakedb;

import java.util.ArrayList;

public abstract class BaseGenericaFakeDB<TDominio> {
    protected ArrayList<TDominio> tabela;

    public ArrayList<TDominio> getTabela(){
        if (this.tabela == null){
            this.tabela = new ArrayList<>();
        }
        return this.tabela;
    }

    public abstract void CarregarDados();

    public BaseGenericaFakeDB(){
        this.getTabela();
        this.CarregarDados();
    }
}
