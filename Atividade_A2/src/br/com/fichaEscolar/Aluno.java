package br.com.fichaEscolar;

//Classe responsável por conter os dados do alunos
public class Aluno {
    //Atributos
    private String nome;
    private int codigo;
    private double A1;
    private double A2;
    private double P1;
    private double P2;

    //Getters e Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public double getA1() {
        return A1;
    }
    public void setA1(double a1) {
        A1 = a1;
    }
    public double getA2() {
        return A2;
    }
    public void setA2(double a2) {
        A2 = a2;
    }
    public double getP1() {
        return P1;
    }
    public void setP1(double p1) {
        P1 = p1;
    }
    public double getP2() {
        return P2;
    }
    public void setP2(double p2) {
        P2 = p2;
    }

    //Construtor
    public Aluno(String nome, int codigo, double a1, double a2, double p1, double p2) {
        this.nome = nome;
        this.codigo = codigo;
        A1 = a1;
        A2 = a2;
        P1 = p1;
        P2 = p2;
    }

    //Exibição dos valores
    public String toString() {
        return "\nAluno = " + nome + "\nCodigo = " + codigo + "\nA1 = " + A1 + "\nA2 = " + A2 + "\nP1 = " + P1 + "\nP2 = " + P2;
    }

}
