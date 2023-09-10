package uniderp.loo.escola.dominio;

import java.time.LocalDate;

public class Aluno extends BasePessoaFisica {
    private String matricula;
    private LocalDate dataMatricula;

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public LocalDate getDataMatricula() {
        return dataMatricula;
    }
    public void setDataMatricula(LocalDate dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public Aluno(int codigo, LocalDate dataInsercao, String endereco, String telefone, String nome, String rg,
            String cpf, LocalDate dataNascimento, String matricula, LocalDate dataMatricula) {
        super(codigo, dataInsercao, endereco, telefone, nome, rg, cpf, dataNascimento);
        this.matricula = matricula;
        this.dataMatricula = dataMatricula;
    }
    @Override
    public void Imprimir() {
        System.out.println("Código: " + this.codigo);
        System.out.println("Nome: " + this.nome);
        System.out.println("Endereço: " + this.endereco);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("RG: " + this.rg);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Data de Nascimento: " + this.dataNascimento);
        System.out.println("Matrícula: " + this.matricula);
        System.out.println("Data de Matrícula: " + this.dataMatricula);
    }
}
