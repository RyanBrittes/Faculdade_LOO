package uniderp.loo.escola.dominio;

import java.time.LocalDate;

public class Fornecedor extends BasePessoaJuridica{
    private String servico;
    private LocalDate dataContrato;
    private int periodoEmMeses;
    
    public String getServico() {
        return servico;
    }
    public void setServico(String servico) {
        this.servico = servico;
    }
    public LocalDate getDataContrato() {
        return dataContrato;
    }
    public void setDataContrato(LocalDate dataContrato) {
        this.dataContrato = dataContrato;
    }
    public int getPeriodoEmMeses() {
        return periodoEmMeses;
    }
    public void setPeriodoEmMeses(int periodoEmMeses) {
        this.periodoEmMeses = periodoEmMeses;
    }
    
    public Fornecedor(int codigo, LocalDate dataInsercao, String endereco, String telefone, String nomeFantasia,
            String razaoSocial, String cnpj, String ie, LocalDate dataAbertura, String servico, LocalDate dataContrato,
            int periodoEmMeses) {
        super(codigo, dataInsercao, endereco, telefone, nomeFantasia, razaoSocial, cnpj, ie, dataAbertura);
        this.servico = servico;
        this.dataContrato = dataContrato;
        this.periodoEmMeses = periodoEmMeses;
    }
}
