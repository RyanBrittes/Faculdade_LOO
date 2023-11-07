package br.com.escola.dominio.turma.aluno;

import java.util.ArrayList;
import java.util.Scanner;

public class operacoesAluno {
    private ArrayList<Aluno> alunoList;
    private Scanner scan;
    Scanner input = new Scanner(System.in);

    public operacoesAluno() {
        this.alunoList = new ArrayList<>();
        this.scan = new Scanner(System.in);
    }

    public void adicionarAluno(){
        System.out.println("\nInforme o nome do aluno: ");
        String nome = input.nextLine();

        System.out.println("\nInforme o codigo do aluno: ");
        int codigo = scan.nextInt();

        double a1 = 0;
        double p1 = 0;
        double a2 = 0;
        double p2 = 0;
        double media = 0;

        alunoList.add(new Aluno(nome, codigo, a1, p1, a2, p2, media));
    }

    public void alterarNomeAluno(){
        System.out.println("Digite o codigo do aluno que deseja atualizar: ");
        int cod = scan.nextInt();

        Aluno lista = percorrerLista(cod);
        if(lista == null){
            System.out.println("\nAluno não encontrado, tente novamente!");
        } else {
            int tam = indiceLista(cod);

            System.out.println("Digite o nome que deseja colocar: ");
            String nomeAlterar = input.nextLine();

            Aluno alterar = alunoList.get(tam);

            System.out.println("\nAluno " + alterar.getNome() + " alterado com sucesso!");
            alterar.setNome(nomeAlterar);
        }
        
    }

    public void excluirAluno(){
        System.out.println("Digite o codigo do aluno que deseja excluir: ");
        int cod = scan.nextInt();

        Aluno lista = percorrerLista(cod);
        if(lista == null){
            System.out.println("\nAluno não encontrado, tente novamente!");
        } else {
            int tam = indiceLista(cod);
            Aluno alterar = alunoList.get(tam);
            
            System.out.println("\nAluno " + alterar.getNome() + " removido com sucesso!");
            alunoList.remove(tam);
        }
    }

    public void listarAluno(){
        int i = 0;
        System.out.println("Lista de alunos: ");

        for(Aluno al : alunoList){
            i++;
            System.out.println("\nAluno " + i + ": " +  al.getNome() + "\nCodigo: " + al.getCodigo());
            if(al.getNome() == null){
                break;
            }
        }
    }

    public void adicionarNota(){
        System.out.println("Digite o codigo do aluno que deseja adicionar nota: ");
        int cod = scan.nextInt();

        Aluno lista = percorrerLista(cod);
        if(lista == null){
            System.out.println("\nAluno não encontrado, tente novamente!");
        } else {
            int tam = indiceLista(cod);
            int opt;
            double a1 = 0;
            double p1 = 0;
            double a2 = 0;
            double p2 = 0;
            double media = 0;
            Aluno alterarNota = alunoList.get(tam);

            do{
                System.out.println("\n\nDigite uma opção:\n\n");
                System.out.println("Opcao 1 --> Adicionar a nota A1\n");
                System.out.println("Opcao 2 --> Adicionar a nota P1\n");
                System.out.println("Opcao 3 --> Adicionar a nota A2\n");
                System.out.println("Opcao 4 --> Adicionar a nota P2\n");
                System.out.println("Opcao 5 --> Calcular a Média do aluno\n");
                System.out.println("Opcao 0 --> Voltar\n");
                opt = scan.nextInt();

                switch (opt) {    
                    case 1:
                        System.out.println("Digite a nota A1: ");
                        a1 = scan.nextDouble();

                        alterarNota.setA1(a1);
                        System.out.println("NOTA A1 ADICIONADA!!");
                        break;
                    case 2:
                        System.out.println("Digite a nota P1: ");
                        p1 = scan.nextDouble();

                        alterarNota.setP1(p1);
                        System.out.println("NOTA P1 ADICIONADA!!");
                        break;
                    case 3:
                        System.out.println("Digite a nota A2: ");
                        a2 = scan.nextDouble();
                    
                        alterarNota.setA2(a2);
                        System.out.println("NOTA A2 ADICIONADA!!");
                        break;
                    case 4:
                        System.out.println("Digite a nota P2: ");
                        p2 = scan.nextDouble();
                    
                        alterarNota.setP2(p2);
                        System.out.println("NOTA P2 ADICIONADA!!");
                        break;
                    case 5:
                        media = (((p1 + a1)/2) + ((p2 + a2)/2)) / 2;
                        if(media < 6){
                            System.out.println("Aluno reprovado, média: " + media);
                        } else {
                            System.out.println("Aluno aprovado, média: " + media);
                        }
                        alterarNota.setMedia(media);
                        break;
                    case 0:
                        System.out.println("Voltando...!");
                        break;
                    default:   
                        System.out.println("Opção inválida, tente novamente!");
                        break;
                }
            }
            while (opt != 0);
        }
        
    }
    
    public void rendimentoAluno(){
        System.out.println("Digite o código do aluno que deseja verificar: ");
        int cod = scan.nextInt();

        Aluno lista = percorrerLista(cod);
        if(lista == null){
            System.out.println("\nAluno não encontrado, tente novamente!");
        } else {
            System.out.println("\nAluno " + lista.getNome() + " selecionado!");
            System.out.println("\nNota A1: " + lista.getA1());
            System.out.println("\nNota P1: " + lista.getP1());
            System.out.println("\nNota A2: " + lista.getA2());
            System.out.println("\nNota P2: " + lista.getP2());
            System.out.println("\nMédia: " + lista.getMedia());
        }
    }

    private int indiceLista(int cod){
        int tam = 0;
        for (Aluno aluno : alunoList) {
            if (aluno.getCodigo() == cod) {
                break;
            }
            tam++;
        }
        return tam;
    }

    private Aluno percorrerLista (int cod){
        Aluno nomeLista = null;

        for(Aluno al : alunoList){
            if(al.getCodigo() == cod){
                nomeLista = al;
                break;
            } 
        }
        return nomeLista;
    }

    public boolean analisarLista(){
        boolean estado;
        if(alunoList.isEmpty()){
            estado = true;
        } else {
            estado = false;
        }
        return estado;
    }

    public void rendimentoTurma(){
        int i = 0;
        System.out.println("\nLista de alunos: ");

        for(Aluno al : alunoList){
            i++;
            double media = (((al.getA1() + al.getP1())/2) + ((al.getA2() + al.getP2())/2)) / 2;
            System.out.println("\nAluno " + i + " --> " +  al.getNome() + "\n\n***Notas***" + "\nNota A1: " + al.getA1() + "\nNota P1: " + al.getP1() + "\nNota A2: " + al.getA2() + "\nNota P2: " + al.getP2() + "\nMedia: " + media);
            if(al.getNome() == null){
                break;
            }
        }
    }

}
