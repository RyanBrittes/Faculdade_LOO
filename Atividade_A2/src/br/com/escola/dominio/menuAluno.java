package br.com.escola.dominio;

import java.util.Scanner;

import br.com.escola.dominio.turma.Turma;
import br.com.escola.dominio.turma.aluno.operacoesAluno;

public class menuAluno {
    public Scanner scan;

    operacoesAluno operacoes = new operacoesAluno();
    Turma turma = new Turma();

    public menuAluno() {
        this.scan = new Scanner(System.in);
    }
    
    public void Executar(){
        int opt;

        do{
        System.out.println("\n\tDigite uma opção para continuar:\n\n");
        System.out.println("Opcao 1 --> Gerenciar Alunos\n");
        System.out.println("Opcao 2 --> Rendimento Escolar\n");
        System.out.println("Opcao 9 --> Sair\n");
        opt = scan.nextInt();

            switch(opt){
                case 1:
                    menuGerenciarAlunos();
                    break;
                case 2:
                    menuRendimentoEscolar();
                    break;
                case 9:
                    System.out.println("Finalizando o programa!");
                    System.exit(1);
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente!");
                    break;
            }
        }
        while(opt != 9);
    }

    public void menuGerenciarAlunos(){
        int opt;

        do{
            System.out.println("\n\nDigite uma opção:\n\n");
            System.out.println("Opcao 1 --> Adicionar Aluno\n");
            System.out.println("Opcao 2 --> Alterar nome do Aluno\n");
            System.out.println("Opcao 3 --> Excluir Aluno\n");
            System.out.println("Opcao 4 --> Listar Alunos\n");
            System.out.println("Opcao 5 --> Adicionar nota:\n");
            System.out.println("Opcao 0 --> Voltar\n");
            opt = scan.nextInt();

            switch (opt) {
                case 1:
                    operacoes.adicionarAluno();
                    break;
                case 2:
                    verificarLista();
                    operacoes.alterarNomeAluno();
                    break;
                case 3:
                    verificarLista();
                    operacoes.excluirAluno();
                    break;
                case 4:
                    verificarLista();
                    operacoes.listarAluno();
                    break;
                case 5:
                    verificarLista();
                    operacoes.adicionarNota();
                    break;
                case 0:
                    System.out.println("Voltando...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente!");
                    break;
            }
        } 
        while (opt != 0);
    }

    public void menuRendimentoEscolar(){
        int opt;

        do{
            System.out.println("\n\nDigite uma opção:\n\n");
            System.out.println("Opcao 1 --> Analisar o rendimento de um aluno\n");
            System.out.println("Opcao 2 --> Analisar o rendimento da turma\n");
            System.out.println("Opcao 0 --> Voltar\n");
            opt = scan.nextInt();

            switch (opt) {
                case 1:
                    verificarLista();
                    operacoes.rendimentoAluno();
                    break;
                case 2:
                    verificarLista();
                    operacoes.rendimentoTurma();
                    break;
                case 0:
                    System.out.println("Voltando...");
                    break;
                default:
                System.out.println("Opção inválida, tente novamente!");
                    break;
            }
        } 
        while (opt != 0);
    }

    private void verificarLista(){
        if (operacoes.analisarLista()){
            System.out.println("Lista vazia, adiciona algum aluno!");
            menuGerenciarAlunos();
        } else {}
    }
}