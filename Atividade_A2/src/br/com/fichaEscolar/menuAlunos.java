package br.com.fichaEscolar;

import java.util.ArrayList;
import java.util.Scanner;

//Classe responsável por criar um menu para que os dados dos alunos possam ser visualizados e modificados
public class menuAlunos {
    //Atributos
    private ArrayList<Aluno> alunoList;
    private Scanner scan;

    //Construtor
    public menuAlunos() {
        this.alunoList = new ArrayList<>();
        this.scan = new Scanner(System.in);
    }
    
    //Função responsável por imprimir o menu de opções
    public void menuExecutar(){
        int opt;
        do
        {
        System.out.println("\n\tDigite uma opção para continuar:\n\n");
        System.out.println("Opcao 1 --> Gerenciar Alunos\n");
        System.out.println("Opcao 2 --> Rendimento Escolar\n");
        System.out.println("Opcao 9 --> Sair\n");
        opt = this.scan.nextInt();

            switch(opt){
                case 1:
                    this.menuGerenciarAlunos();
                    break;

                case 2:
                    this.menuRendimentoEscolar();
                    break;

                case 9:
                    System.out.println("Finalizando o programa!");
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente!");
                    break;
            } 
        }while(opt != 9);
    }

    //Função responsável por abrir o submenu da opção 1 do menuExecutar
    public void menuGerenciarAlunos(){
        int opt;

        do{
            System.out.println("\n\nDigite uma opção:\n\n");
            System.out.println("Opcao 1 --> Adicionar Aluno\n");
            System.out.println("Opcao 2 --> Alterar nome do Aluno\n");
            System.out.println("Opcao 3 --> Excluir Aluno\n");
            System.out.println("Opcao 4 --> Listar Alunos\n");
            System.out.println("Opcao 5 --> Selecionar uma aluno para:\n");
            System.out.println("Opcao 0 --> Sair\n");

            opt = this.scan.nextInt();

            switch (opt) {
                case 1:
                    this.adicionarAluno();
                    break;
                
                case 2:
                    this.alterarNomeAluno();
                    break;

                case 3:
                    this.excluirAluno();
                    break;

                case 4:
                    this.listarAluno();
                    break;

                case 5:
                    this.adicionarNota();
                        break;

                case 0:
                    System.out.println("Finalizando Programa!");
                    break;
                
                default:
                System.out.println("Opção inválida, tente novamente!");
                    break;
            }
        } while (opt != 0);
    }
    
    //Função responsável por adicionar um aluno
    private void adicionarAluno(){
        double a1 = 0;
        double p1 = 0;
        double a2 = 0;
        double p2 = 0;
        String nome = "";
        int codigo = 0;

        System.out.println("Informe o nome do aluno: \n");
        nome = scan.next();

        System.out.println("Informe o codigo do aluno: \n");
        codigo = scan.nextInt();
        alunoList.add(new Aluno(nome, codigo, a1, p1, a2, p2));
    }

    //Função responsável por alterar o nome de uma aluno
    private void alterarNomeAluno(){
        if(alunoList.isEmpty()){
            System.out.println("Lista vazia, adicione um aluno para continuar.");
        } else {
            System.out.println("Digite o nome do aluno que deseja atualizar: ");
            String n = scan.next();
            Aluno nomeExcluir = null;
            int tam = -1;

            for(Aluno al : alunoList){
                tam++;
                if(al.getNome().equalsIgnoreCase(n)){
                    nomeExcluir = al;
                    break;
                } 
            }

            if(nomeExcluir == null){
                System.out.println("Aluno não encontrado, tente novamente!");
            } else {
                System.out.println("Digite o nome que deseja colocar: ");
                String nomeAlterar = scan.next(); 

                Aluno alterar = alunoList.get(tam);
                alterar.setNome(nomeAlterar);
                System.out.println("ALUNO ALTERADO!!");

            }
        }
    }

    //Função responsável por excluir um aluno
    private void excluirAluno(){
        if(alunoList.isEmpty()){
            System.out.println("Lista vazia, adicione um aluno para continuar.");
        } else {
            System.out.println("Digite o nome do aluno que deseja excluir: ");
            String n = scan.next();
            Aluno nomeExcluir = null;
            int tam = -1;

            for(Aluno al : alunoList){
                tam++;
                if(al.getNome().equalsIgnoreCase(n)){
                    nomeExcluir = al;
                    break;
                }
            }
            if(nomeExcluir == null){
                System.out.println("Aluno não encontrado, tente novamente!");
            } else {
                alunoList.remove(tam);
                System.out.println("ALUNO EXCLUIDO!!");
            }
        }
    }

    //Função responsável por imprimir uma lista dos alunos com seus nomes e códigos
    private void listarAluno(){
        if(alunoList.isEmpty()){
            System.out.println("Lista vazia, adicione um aluno para continuar.");
        } else {
            int i = 0;
            System.out.println("Lista de alunos: ");
            for(Aluno al : alunoList){
                i++;
                System.out.println("\nAluno: " + i + " - " +  al.getNome() + "\nCodigo: " + al.getCodigo());
                if(al.getNome() == null){
                    break;
                }
            }
        }
    }

    //Função responsável adicionar notas ao aluno
    private void adicionarNota(){
        if(alunoList.isEmpty()){
            System.out.println("Lista vazia, adicione um aluno para continuar.");
            } else {
                System.out.println("Digite o nome do aluno que deseja adicionar nota: ");
                String n = scan.next();

                Aluno nomeLista = null;
                double a1 = 0;
                double p1 = 0;
                double a2 = 0;
                double p2 = 0;

                for(Aluno al : alunoList){
                    if(al.getNome().equalsIgnoreCase(n)){
                        nomeLista = al;
                        break;
                    } 
                }

                if(nomeLista == null){
                    System.out.println("Aluno não encontrado, tente novamente!");
                } else {
                    int opt;

                    do{
                        System.out.println("\n\nDigite uma opção:\n\n");
                        System.out.println("Opcao 1 --> Adicionar a nota A1\n");
                        System.out.println("Opcao 2 --> Adicionar a nota P1\n");
                        System.out.println("Opcao 3 --> Adicionar a nota A2\n");
                        System.out.println("Opcao 4 --> Adicionar a nota P2\n");
                        System.out.println("Opcao 5 --> Calcular a Média do aluno\n");
                        System.out.println("Opcao 0 --> Sair\n");

                        opt = this.scan.nextInt();

                        switch (opt) {
                            case 1:
                                System.out.println("Digite a nota A1: ");
                                a1 = scan.nextDouble();
                                int tam = 0;

                                for(Aluno al : alunoList){
                                    if(al.getNome().equalsIgnoreCase(n)){
                                        break;
                                    }
                                    tam++;
                                }
                                    Aluno alterar = alunoList.get(tam);
                                    alterar.setA1(a1);
                                    System.out.println("NOTA A1 ADICIONADA!!");
                                break;
                            
                            case 2:
                                System.out.println("Digite a nota P1: ");
                                p1 = scan.nextDouble();
                                tam = 0;

                                for(Aluno al : alunoList){
                                    if(al.getNome().equalsIgnoreCase(n)){
                                        break;
                                    }
                                    tam++;
                                }
                                    alterar = alunoList.get(tam);
                                    alterar.setP1(p1);
                                    System.out.println("NOTA P1 ADICIONADA!!");
                                break;

                            case 3:
                                System.out.println("Digite a nota A2: ");
                                a2 = scan.nextDouble();
                                tam = 0;

                                for(Aluno al : alunoList){                      
                                    if(al.getNome().equalsIgnoreCase(n)){
                                        break;
                                    } 
                                    tam++;
                                }
                                    alterar = alunoList.get(tam);
                                    alterar.setA2(a2);
                                    System.out.println("NOTA A2 ADICIONADA!!");
                                break;

                            case 4:
                                System.out.println("Digite a nota P2: ");
                                p2 = scan.nextDouble();
                                tam = 0;

                                for(Aluno al : alunoList){
                                    if(al.getNome().equalsIgnoreCase(n)){
                                        break;
                                    }
                                    tam++;
                                }
                                    alterar = alunoList.get(tam);
                                    alterar.setP2(p2);
                                    System.out.println("NOTA P2 ADICIONADA!!");
                                break;

                            case 5:
                                double media = (((p1 + a1)/2) + ((p2 + a2)/2)) / 2;
                                if(media < 6){
                                    System.out.println("Aluno reprovado, média: " + media);
                                } else {
                                    System.out.println("Aluno aprovado, média: " + media);
                                }
                                break;

                            case 0:
                                System.out.println("Finalizando Programa!");
                                break;
                        
                            default:   
                                System.out.println("Opção inválida, tente novamente!");
                                break;
                        }
                    }
                    while (opt != 0);
                }
            }
    }

    //Função responsável por abrir o submenu da opção 2 do menuExecutar
    public void menuRendimentoEscolar(){
        int opt;
        do{
            System.out.println("\n\nDigite uma opção:\n\n");
            System.out.println("Opcao 1 --> Analisar o rendimento de um aluno\n");
            System.out.println("Opcao 2 --> Analisar o rendimento da turma\n");
            System.out.println("Opcao 0 --> Sair\n");

            opt = this.scan.nextInt();

            switch (opt) {
                case 1:
                    this.rendimentoAluno();
                    break;
                
                case 2:
                    this.rendimentoTurma();
                    break;

                case 0:
                    System.out.println("Finalizando Programa!");
                    break;
            
                default:
                System.out.println("Opção inválida, tente novamente!");
                    break;
            }
        } while (opt != 0);
    }

    //Função responsável por analisar o rendimento escolar de um aluno
    private void rendimentoAluno(){
        if(alunoList.isEmpty()){
            System.out.println("Lista vazia, adicione um aluno para continuar.");
        } else {
            System.out.println("Digite o aluno que deseja verificar: ");
            String n = scan.next();
            Aluno nomeLista = null;

            for(Aluno al : alunoList){
                if(al.getNome().equalsIgnoreCase(n)){
                    nomeLista = al;
                    break;
                } 
            }

            if(nomeLista == null){
                System.out.println("Aluno não encontrado, tente novamente!");
            } else {
                double media = (((nomeLista.getA1() + nomeLista.getP1())/2) + ((nomeLista.getA2() + nomeLista.getP2())/2)) / 2;
                System.out.println("Aluno " + nomeLista.getNome() + " selecionado!");
                System.out.println("\nNota A1: " + nomeLista.getA1());
                System.out.println("\nNota P1: " + nomeLista.getP1());
                System.out.println("\nNota A2: " + nomeLista.getA2());
                System.out.println("\nNota P2: " + nomeLista.getP2());
                System.out.println("\nMédia: " + media);
            }
        }
    }

    //Função responsável por analisar o rendimento escolar da turma
    private void rendimentoTurma(){
        if(alunoList.isEmpty()){
            System.out.println("Lista vazia, adicione um aluno para continuar.");
        } else {
            int i = 0;
            System.out.println("Lista de alunos: ");
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
}
