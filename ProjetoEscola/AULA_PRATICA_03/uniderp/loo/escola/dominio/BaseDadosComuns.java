package uniderp.loo.escola.dominio;

import java.time.LocalDate;

public abstract class BaseDadosComuns extends BaseIdentificador{
    protected LocalDate datainsercao;

    public LocalDate getDatainsercao() {
        return datainsercao;
    }

    public void setDatainsercao(LocalDate datainsercao) {
        this.datainsercao = datainsercao;
    }

    public BaseDadosComuns(int codigo, LocalDate datainsercao) {
        super(codigo);
        this.datainsercao = datainsercao;
    }
    
}
