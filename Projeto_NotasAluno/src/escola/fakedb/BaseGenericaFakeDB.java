package src.escola.fakedb;

import java.util.ArrayList;

public abstract class BaseGenericaFakeDB<TDominio> {
    protected ArrayList<TDominio> alunoList;

    public ArrayList<TDominio> getTabela(){
        if (this.alunoList == null){
            this.alunoList = new ArrayList<>();
        }
        return this.alunoList;
    }

    public abstract void adicionarAluno();

    public BaseGenericaFakeDB(){
        this.getTabela();
        this.adicionarAluno();
    }
}
