package src.escola.dominio;

import java.time.LocalDate;

public class Aluno extends BasePessoa{
    private double a1;
    private double p1;
    private double a2;
    private double p2;
    private double media;

    public double getA1() {
        return a1;
    }
    public void setA1(double a1) {
        this.a1 = a1;
    }
    public double getP1() {
        return p1;
    }
    public void setP1(double p1) {
        this.p1 = p1;
    }
    public double getA2() {
        return a2;
    }
    public void setA2(double a2) {
        this.a2 = a2;
    }
    public double getP2() {
        return p2;
    }
    public void setP2(double p2) {
        this.p2 = p2;
    }
    public double getMedia() {
        return media;
    }
    public void setMedia(double media) {
        this.media = media;
    }

    public Aluno(int codigo, String nome, LocalDate dataNascimento, double a1, double p1, double a2, double p2,
            double media) {
        super(codigo, nome, dataNascimento);
        this.a1 = a1;
        this.p1 = p1;
        this.a2 = a2;
        this.p2 = p2;
        this.media = media;
    }

    @Override
    public String toString() {
        return "Aluno [a1=" + a1 + ", p1=" + p1 + ", a2=" + a2 + ", p2=" + p2 + ", media=" + media + "]";
    };
}
