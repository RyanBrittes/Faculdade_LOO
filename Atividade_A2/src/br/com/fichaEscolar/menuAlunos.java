package br.com.fichaEscolar;

import java.util.ArrayList;
import java.util.Scanner;

//Classe responsável por criar um menu para que os dados dos alunos possam ser visualizados e modificados
public class menuAlunos {
    //Atributos
    private ArrayList<Aluno> alunoList;
    private Scanner scan;
    Scanner input = new Scanner(System.in);

    //Construtor
    public menuAlunos() {
        this.alunoList = new ArrayList<>();
        this.scan = new Scanner(System.in);
    }
    
    //Função responsável por imprimir o menu de opções
    public void menuExecutar(){
        //Atributos
        int opt;

        //Menu de opções utilizado para chamar funções e interagir com o usuário
        do{
        System.out.println("\n\tDigite uma opção para continuar:\n\n");
        System.out.println("Opcao 1 --> Gerenciar Alunos\n");
        System.out.println("Opcao 2 --> Rendimento Escolar\n");
        System.out.println("Opcao 9 --> Sair\n");
        opt = scan.nextInt();

            //Recurso Switch utilizado para chamar funções a depender do que o usuário digitar
            switch(opt){
                //Função responsável por abrir um submenu com opções para analisar e modificar dados de alunos
                case 1:
                    this.menuGerenciarAlunos();
                    break;

                //Função responsável por abrir um submenu que analisa os dados da nota de um aluno ou da turma inteira
                case 2:
                    this.menuRendimentoEscolar();
                    break;

                //Mensagem de finalização do programa, devido ao usuário ter digitado "9"
                case 9:
                    System.out.println("Finalizando o programa!");
                    break;

                //Mensagem responsável por informar que o usuário digitou algum dado inválido ao que o sistema reconhece
                default:
                    System.out.println("Opção inválida, tente novamente!");
                    break;
            }
        }
        //Condiçao de repetição do loop de "menuExecutar"
        while(opt != 9);
    }

    //Função responsável por abrir o submenu da opção 1 do menuExecutar
    public void menuGerenciarAlunos(){
        //Atributos
        int opt;

        //Menu de opções utilizado para chamar funções e interagir com o usuário
        do{
            System.out.println("\n\nDigite uma opção:\n\n");
            System.out.println("Opcao 1 --> Adicionar Aluno\n");
            System.out.println("Opcao 2 --> Alterar nome do Aluno\n");
            System.out.println("Opcao 3 --> Excluir Aluno\n");
            System.out.println("Opcao 4 --> Listar Alunos\n");
            System.out.println("Opcao 5 --> Adicionar nota:\n");
            System.out.println("Opcao 0 --> Voltar\n");
            opt = scan.nextInt();

            //Recurso Switch utilizado para chamar funções a depender do que o usuário digitar
            switch (opt) {
                //Função resposável por adicionar um novo usuário no sistema, coletando o nome e o código do aluno no sistema
                case 1:
                    this.adicionarAluno();
                    break;
                
                //Função responsável por alterar o nome de um usuário no sistema
                case 2:
                    this.alterarNomeAluno();
                    break;

                //Função responsável por excluir um aluno no sistema
                case 3:
                    this.excluirAluno();
                    break;

                //Função responsável por lista os alunos no sistema com os atributos de nome e código
                case 4:
                    this.listarAluno();
                    break;

                //Função responsável por adicionar as notas de um aluno no sistema
                case 5:
                    this.adicionarNota();
                        break;

                //Mensagem de aviso de transição ao menu anterior
                case 0:
                    System.out.println("Voltando...");
                    break;
                
                //Mensagem responsável por informar que o usuário digitou algum dado inválido no sistema 
                default:
                System.out.println("Opção inválida, tente novamente!");
                    break;
            }
        } 
        //Condiçao de repetição do loop de "menuGerenciarAluno"
        while (opt != 0);
    }
    
    //Função responsável por adicionar um aluno
    public void adicionarAluno(){
        //Atributo do tipo ArrayList Aluno com a função de armazenar a informação do índice ao percorrer a lista
        Aluno alunoAlterar = null;

        //Interação com o usuário para solicitar o nome e armazenar em uma variável o valor
        System.out.println("\nInforme o nome do aluno: ");
        String nome = input.nextLine();

        //Interação com o usuário para solicitar o código e armazenar em uma variável o valor
        System.out.println("\nInforme o codigo do aluno: ");
        int codigo = scan.nextInt();

        //Verificação na lista se o código digitado já está vinculado a algum aluno, responsável para evitar duplicidade de código
        for(Aluno al : alunoList){
            if(al.getCodigo() == codigo){
                alunoAlterar = al;
                break;
            }
        }
        //Caso exista algum código ja adicionado na lista será informada uma mensagem solicitando uma nova tentativa com código diferente
        if(alunoAlterar != null){
            System.out.println("O código digitado já está vinculado a um aluno, tente novamente.");
        } 
        //Caso não exista nenhum aluno com o código na lista o mesmo será adicionado junto com suas notas
        else {
            //Atribuição de valores às notas do aluno
            double a1 = 0;
            double p1 = 0;
            double a2 = 0;
            double p2 = 0;

            //Criação de um novo aluno na lista com notas, nome e código
            alunoList.add(new Aluno(nome, codigo, a1, p1, a2, p2));
        }
    }

    //Função responsável por alterar o nome de uma aluno
    private void alterarNomeAluno(){
        //Verificação se a lista está vazia, caso esteja será solicitado ao usuário para adicionar um aluno para continuar com a ação
        if(alunoList.isEmpty()){
            System.out.println("Lista vazia, adicione um aluno para continuar.");
        } 
        //Caso a lista não esteja vazia será solicitado o código do aluno para realizar a alteração do nome
        else {
            //Solicitação do código do aluno que o usuário dejesa alterar
            System.out.println("Digite o codigo do aluno que deseja atualizar: ");
            int cod = scan.nextInt();

            //Atributo do tipo ArrayList Aluno com a função de armazenar a informação do índice ao percorrer a lista
            Aluno alunoAlterar = null;

            //Atributo responsável por armazenar a quantidade de índices percorridos
            int tam = 0;

            //Verificação na lista se o código digitado existe na lista
            for(Aluno al : alunoList){
                if(al.getCodigo() == cod){
                    alunoAlterar = al;
                    break;
                }
                tam++; 
            }

            //Caso o código digitado não exista, será exibida uma mensagem informando ao usuário que não foi encontrado
            if(alunoAlterar == null){
                System.out.println("\nAluno não encontrado, tente novamente!");
            } 
            
            //Caso seja encontrado, será solicitada a informação de alteração
            else {
                System.out.println("Digite o nome que deseja colocar: ");
                String nomeAlterar = input.nextLine(); 

                //Atributo responsável por receber a informação de alteração
                Aluno alterar = alunoList.get(tam);

                //Mensagem informando o usuário que foi alterado
                System.out.println("\nAluno " + alterar.getNome() + " alterado com sucesso!");

                //Operação responsável por alterar o nome com a informação fornecida pelo usuário
                alterar.setNome(nomeAlterar);
            }
        }
    }

    //Função responsável por excluir um aluno
    private void excluirAluno(){
        //Verificação se a lista está vazia, caso esteja será solicitado ao usuário para adicionar um aluno para continuar com a ação
        if(alunoList.isEmpty()){
            System.out.println("Lista vazia, adicione um aluno para continuar.");
        } 
        //Caso a lista não esteja vazia será solicitado o código do aluno para realizar a remoção do aluno
        else {
            //Solicitação do código do aluno que o usuário dejesa excluir
            System.out.println("Digite o codigo do aluno que deseja excluir: ");
            int cod = scan.nextInt();

            //Atributo do tipo ArrayList Aluno com a função de armazenar a informação do índice ao percorrer a lista
            Aluno alunoExcluir = null;

            //Atributo responsável por armazenar a quantidade de índices percorridos
            int tam = 0;

            //Verificação na lista se o código digitado existe na lista
            for(Aluno al : alunoList){
                if(al.getCodigo() == cod){
                    alunoExcluir = al;
                    break;
                }
                tam++;
            }

            //Caso o código digitado não exista, será exibida uma mensagem informando ao usuário que não foi encontrado
            if(alunoExcluir == null){
                System.out.println("\nAluno não encontrado, tente novamente!");
            } 

            //Caso seja encontrado, será solicitada a informação de excluir
            else {
                //Mensagem informando o usuário que foi alterado
                System.out.println("\nAluno " + alunoExcluir.getNome() + " removido com sucesso!");

                //Operação responsável por remover o aluno com a informação fornecida pelo usuário
                alunoList.remove(tam);
            }
        }
    }

    //Função responsável por imprimir uma lista dos alunos com seus nomes e códigos
    private void listarAluno(){
        //Verificação se a lista está vazia, caso esteja será solicitado ao usuário para adicionar um aluno para continuar com a ação
        if(alunoList.isEmpty()){
            System.out.println("Lista vazia, adicione um aluno para continuar.");
        } 
        
        //Caso a lista não esteja vazia será solicitado o código do aluno para realizar a exibição do nome e código dos alunos
        else {
            //Atributo responsável por armazenar a quantidade de índices percorridos
            int i = 0;

            System.out.println("Lista de alunos: ");

            //Função responsável por percorrer a lista e exibir o nome e código de cada índice da lista até para quando chegar ao fim da lista
            for(Aluno al : alunoList){
                i++;
                System.out.println("\nAluno " + i + ": " +  al.getNome() + "\nCodigo: " + al.getCodigo());
                if(al.getNome() == null){
                    break;
                }
            }
        }
    }

    //Função responsável adicionar notas ao aluno
    private void adicionarNota(){
        //Verificação se a lista está vazia, caso esteja será solicitado ao usuário para adicionar um aluno para continuar com a ação
        if(alunoList.isEmpty()){
            System.out.println("Lista vazia, adicione um aluno para continuar.");
            } 
            
            //Caso a lista não esteja vazia será solicitado o código do aluno para que o usuário possa adicionar notas ao aluno
            else {
                //Solicitação do código do aluno que o usuário dejesa adicionar nota
                System.out.println("Digite o codigo do aluno que deseja adicionar nota: ");
                int cod = scan.nextInt();

                //Atributo responsável por armazenar a quantidade de índices percorridos
                int tam = 0;

                //Atributo do tipo ArrayList Aluno com a função de armazenar a informação do índice ao percorrer a lista
                Aluno alunoNota = null;

                //Verificação na lista se o código digitado existe na lista
                for(Aluno al : alunoList){
                    if(al.getCodigo() == cod){
                        alunoNota = al;
                        break;
                    }
                    tam++;
                }

                //Caso o código digitado não exista, será exibida uma mensagem informando ao usuário que não foi encontrado
                if(alunoNota == null){
                    System.out.println("Aluno não encontrado, tente novamente!");
                } 
                
                //Caso seja encontrado, será exibido um menu com opções para o usuário adicionar cada nota do aluno
                else {

                    //Atributos
                    int opt;
                    double a1 = 0;
                    double p1 = 0;
                    double a2 = 0;
                    double p2 = 0;
                    
                    //Atributo responsável por receber a informação do índice que a lista percorreu e parou
                    Aluno alterarNota = alunoList.get(tam);

                    //Menu de opções utilizado para chamar realizar operações e interagir com o usuário
                    do{
                        System.out.println("\n\nDigite uma opção:\n\n");
                        System.out.println("Opcao 1 --> Adicionar a nota A1\n");
                        System.out.println("Opcao 2 --> Adicionar a nota P1\n");
                        System.out.println("Opcao 3 --> Adicionar a nota A2\n");
                        System.out.println("Opcao 4 --> Adicionar a nota P2\n");
                        System.out.println("Opcao 5 --> Calcular a Média do aluno\n");
                        System.out.println("Opcao 0 --> Voltar\n");
                        opt = scan.nextInt();

                        //Recurso Switch utilizado para chamar funções a depender do que o usuário digitar
                        switch (opt) {    
                            //Operação responsável por solicitar a nota A1 ao usuário e atribuir o valor digitado  
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
                                double media = (((p1 + a1)/2) + ((p2 + a2)/2)) / 2;
                                if(media < 6){
                                    System.out.println("Aluno reprovado, média: " + media);
                                } else {
                                    System.out.println("Aluno aprovado, média: " + media);
                                }
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
    }

    //Função responsável por abrir o submenu da opção 2 do menuExecutar
    public void menuRendimentoEscolar(){
        int opt;
        do{
            System.out.println("\n\nDigite uma opção:\n\n");
            System.out.println("Opcao 1 --> Analisar o rendimento de um aluno\n");
            System.out.println("Opcao 2 --> Analisar o rendimento da turma\n");
            System.out.println("Opcao 0 --> Voltar\n");

            opt = this.scan.nextInt();

            switch (opt) {
                case 1:
                    this.rendimentoAluno();
                    break;
                
                case 2:
                    this.rendimentoTurma();
                    break;

                case 0:
                    System.out.println("Voltando...");
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
            System.out.println("Digite o código do aluno que deseja verificar: ");
            int cod = scan.nextInt();
            Aluno nomeLista = null;

            for(Aluno al : alunoList){
                if(al.getCodigo() == cod){
                    nomeLista = al;
                    break;
                } 
            }

            if(nomeLista == null){
                System.out.println("\nAluno não encontrado, tente novamente!");
            } else {
                double media = (((nomeLista.getA1() + nomeLista.getP1())/2) + ((nomeLista.getA2() + nomeLista.getP2())/2)) / 2;
                System.out.println("\nAluno " + nomeLista.getNome() + " selecionado!");
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
            System.out.println("\nLista vazia, adicione um aluno para continuar.");
        } else {
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
}
