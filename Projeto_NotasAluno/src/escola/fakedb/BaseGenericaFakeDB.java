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
    public abstract void alterarNomeAluno();
    public abstract void excluirAluno();
    public abstract void listarAluno();
    public abstract void adicionarNota();
    public abstract void rendimentoAluno();
    

    public BaseGenericaFakeDB(){
        this.getTabela();
        this.adicionarAluno();
        this.alterarNomeAluno();
        this.excluirAluno();
        this.listarAluno();
        this.adicionarNota();
        this.rendimentoAluno();
    }
}
