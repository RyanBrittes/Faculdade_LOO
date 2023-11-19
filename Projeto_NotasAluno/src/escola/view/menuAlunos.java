package src.escola.view;

import java.util.Scanner;

import src.escola.fakedb.AlunoFakeDB;

public class menuAlunos {
    private Scanner scan;

    AlunoFakeDB db = new AlunoFakeDB();

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

    private void menuGerenciarAlunos(){
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
                    db.adicionarAluno();
                    break;
                case 2:
                    verificarLista();
                    db.alterarNomeAluno();
                    break;
                case 3:
                    verificarLista();
                    db.excluirAluno();
                    break;
                case 4:
                    verificarLista();
                    db.listarAluno();
                    break;
                case 5:
                    verificarLista();
                    db.adicionarNota();
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

    private void menuRendimentoEscolar(){
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
                    db.rendimentoAluno();
                    break;
                case 2:
                    verificarLista();
                    db.rendimentoTurma();
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
        if (db.analisarLista()){
            System.out.println("Lista vazia, adiciona algum aluno!");
            menuGerenciarAlunos();
        } else {}
    }
}
