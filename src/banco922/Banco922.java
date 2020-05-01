
package banco922;

import java.util.ArrayList;
import java.util.Scanner;


public class Banco922 {

 
    public static void main(String[] args) {
        ArrayList lista1 = new ArrayList();
        Scanner teclado = new Scanner(System.in);
        Conta novaConta = new Conta();
        String CSI = "\u001B[";
        
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
        System.out.print (CSI + "33" + "m");
        System.out.println("                 Seja bem vind@ ao Banco                ");
        System.out.print (CSI + "32" + "m");
        System.out.println("                         DO IFAL                        ");
        System.out.println (CSI + "m");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
        System.out.println (CSI + "m");
        
        System.out.print (CSI + "34" + "m");
        System.out.println("Escolha uma das opções para continuar\n");
        System.out.println (CSI + "m");
        System.out.println("1 - Criar uma Conta/Guarda conta Na lista! \n2 - Gerenciar Lista De Contas \n3 - Gerenciar Uma Conta \n4 - SAIR!");
        System.out.println(":");
        int opcao1 = teclado.nextInt(); 
        System.out.println("");
        while(true){
            
            //Na primeira opção cria uma conta e salva todos os dados dentro de uma lista
            if (opcao1 == 1){

                novaConta = new Conta();
                System.out.print (CSI + "33" + "m");
                System.out.println("CRIANDO SUA CONTA");
                System.out.println (CSI + "m");

                System.out.println("\nNumero Da Conta:");
                int numero = teclado.nextInt();       
                novaConta.setNumero(numero);
                novaConta.setSaldo(0);

                System.out.println("\nNome Do Titular: ");
                String titular = teclado.next();
                novaConta.setTitular(titular);

                System.out.println("\nDigite A Senha Desejada:");
                int senha = teclado.nextInt();
                novaConta.setSenha(senha);
                
                
                lista1.add(novaConta);
                System.out.println("\nConta criada, e salva na lista!");
                System.out.println("\nDados da conta!");
                System.out.println("\nO Número Da Conta É: "+novaConta.getNumero());
                System.out.println("O Saldo Atual Da Conta É: R$"+novaConta.getSaldo());
                System.out.println("O Nome do Titular Da Conta É: "+novaConta.getTitular());
                System.out.println("A Senha Da Sua Conta é: "+novaConta.getSenha());
            }
            //Na opcão 2 ele mostra o painel de gerenciamento de lista, ou seja ele vai poder gerenciar todas as contas que estão dentro da lista
            else if (opcao1 == 2){
                System.out.println("");
                System.out.print (CSI + "33" + "m");
                System.out.println("GERENCIAMENTO DE LISTAS\n");
                System.out.println (CSI + "m");
                System.out.println("Escolha Uma Das Opções Abaixo!");
                System.out.println("\n1 - Mostrar Números Das Contas Na Lista! \n2 - Atualizar Lista De Contas \n3 - Excluir Conta Da Lista De Contas!");
                int opcao2 = teclado.nextInt();


                //Primeira essa opção vai vereficar se tem algo dentro da lista se tiver ele vai mostrar para o usuário todos os números de contas dentro da lista
                if (opcao2 == 1){
                    
                    if(lista1.size() == 0){
                        
                        System.err.println("\nNão tem nenhum item dentro da lista!");
                    }
                    
                    else{
                        for (int n = 0; n < lista1.size(); n++){
                            novaConta = new Conta();
                            novaConta = (Conta) lista1.get(n);
                            System.out.println("Dentro da lista de contas tem o número da seguinte conta: "+novaConta.getNumero());

                        }
                    }
                }
                //Nessa opção o usuário vai poder mexer com o nome do titular e com o número da conta, ou seja vai poder atualizar
                else if (opcao2 == 2){
                    System.out.println("");
                    System.out.print (CSI + "33" + "m");
                    System.out.println("ATUALIZAR CONTA NA LISTA");
                    System.out.println (CSI + "m");
                    System.out.println("Digite o número da conta que você deseja atualizar na lista!");
                    int numeroConta = teclado.nextInt();
                    //Esse for ele pega e verifica se tem algo dentro da lista ou não;
                    if(lista1.size() == 0){
                       
                        System.err.println("\nNão tem nenhum número de conta registrada na lista!");
                    }
                    
                    else{
                        for(int n = 0; n < lista1.size(); n++){
                        novaConta = new Conta();
                        novaConta = (Conta)lista1.get(n);
                        
                        if(numeroConta == novaConta.getNumero()){
                            System.out.println("Escolha uma das opções abaixo para atualizar!");
                            System.out.println("1 - Mudar Nome Do Titular \n2 - Mudar Número Da Conta!");
                            int opcao3 = teclado.nextInt();
                            
                            if (opcao3 == 1){
                                System.out.println("\nDigite o novo nome do titular da conta:");
                                String novoTitular = teclado.next();
                                novaConta.mudarNomeDoTitular(novoTitular);
                                System.out.println("\nO nome do titular agora é: "+novaConta.getTitular());
                                }
                            
                            else if(opcao3 == 2){
                                System.out.println("Digite o novo número para sua conta:");
                                int novoNumero = teclado.nextInt();
                                novaConta.mudarNumeroDaConta(novoNumero);
                                System.out.println("\nO novo numero da conta é: "+novaConta.getNumero());
                                }
                            }
                        //Esse else se caso o número digitado não estiver na lista
                        else{
                            System.err.println("\nNúmero da conta digitada não está na lista!");
                            }
                        }
                    
                    }
                }
                //Na opção 3 ele vai, pegar um número da conta do usuário e vai excluir ela da lista
                else if (opcao2 == 3){
                    System.out.println("\nDigite o número da conta que deseja excluir!");
                    int numeroDaConta = teclado.nextInt();
                    //Esse if vai novamente verificar se tem algo ou não dentro da lista
                    if (lista1.size() == 0){
                        System.err.println("\nNão tem nenhum item dentro da lista!");
                    }
                    
                    else{
                        for(int i = 0; i<lista1.size(); i++){
                            novaConta = new Conta();
                            novaConta = (Conta) lista1.get(i);
                            
                            if(numeroDaConta == novaConta.getNumero()){
                                Object n = novaConta; 
                                lista1.remove(n);
                                System.out.println("\nConta excluída da lista!");
                            }
                            else{
                              
                                System.err.println("\nNúmero da conta digitada não está na lista!");
                            }
                        }
                    }
                }
            }
            //Já na 3 opção ele vai mexer diretamente com uma conta, ou seja usar seu métodos básicos como sacar, depositar e trocar de senha
            else if (opcao1 == 3){
                System.out.println("");
                System.out.print (CSI + "33" + "m");
                System.out.println("GERENCIAMENTO DE CONTA\n");
                System.out.println (CSI + "m");
                System.out.println("Digite o número da conta que você deseja gerenciar:");
                int numeroGerenciar = teclado.nextInt();
                //Novamente antes de tudo verifica se a lista tem algo ou não
                if(lista1.size() == 0){
                    
                    System.err.println("\nNão tem nenhum item dentro da lista!");
                }
                    
                else{
                    
                for(int n = 0; n<lista1.size(); n++){
                    novaConta = new Conta();
                    novaConta = (Conta) lista1.get(n);
                        //Se caso o número informado pelo usuário for achado dentro da lista aí sim ele vai aparecer o painel de controle para comandar as funções básicas
                        if(numeroGerenciar == novaConta.getNumero()){
                            System.out.println("\nEscolha uma das opções abaixo!");
                            System.out.println("\n1 - Mostrar Informações Da Conta \n2 - Depositar \n3 - Sacar \n4 - MudarSenha");
                            int opcao4 = teclado.nextInt();

                            if(opcao4 == 1){
                                System.out.println("\nO Número Da Conta É: "+novaConta.getNumero());
                                System.out.println("\nO Saldo Atual Da Conta É: R$"+novaConta.getSaldo());
                                System.out.println("\nO Nome do Titular Da Conta É: "+novaConta.getTitular());
                            }
                            else if(opcao4 == 2){
                                System.out.println("\nDigite a quatidade que deseja Depositar!");
                                int valorDepositar = teclado.nextInt();
                                novaConta.depositar(valorDepositar);
                            }


                            else if(opcao4 == 3){
                                System.out.println("\nDigite sua senha!\n");
                                System.out.print("Senha: ");
                                int senhaPedida = teclado.nextInt();
                                if(novaConta.senhaCerta(senhaPedida)){

                                    System.out.println("\nSenha correta!");
                                    System.out.println("\nDigite quanto gostaria de sacar!");
                                    System.out.print("\nSacar: R$");
                                    double valorSacar = teclado.nextInt();
                                    novaConta.sacar(valorSacar);
                                }
                                else{
                                    
                                    System.err.println("\nSenha digitada incorreta!");
                                }

                            }
                            //Nessa opção, ele vai pegar a senha antiga e vai verificar se estar dentro da lista e se estiver, ele vai usar o método mudarSenha, substituindo.
                            else if (opcao4 == 4){
                                System.out.println("\nPara mudar a senha precisa digitar a senha anterior!");
                                int senhaAntiga = teclado.nextInt();
                                 if (novaConta.senhaCerta(senhaAntiga)){
                                     System.out.println("\nSenha correta!");
                                     System.out.println("Digite a nova senha!");
                                     int senhaNova = teclado.nextInt();
                                     novaConta.mudarSenha(senhaNova);
                                 }
             
                            }

                        }
                        
                    }
                    
                }
            }
            //Por último ele fecha tudo o while com o break hehe
            else if (opcao1 == 4){
                System.out.println("Obrigado pela preferência!");
                System.out.print (CSI + "33" + "m");
                System.out.println("Banco fechado!");
                System.out.println (CSI + "m");
                
                break;
            }
            System.out.println("");
            System.out.print (CSI + "34" + "m");
            System.out.println("Escolha uma das opções abaixo para continuar\n");
            System.out.println (CSI + "m");
            System.out.println("1 - Criar uma Conta/Guarda conta Na lista! \n2 - Gerenciar Lista De Contas \n3 - Gerenciar Uma Conta \n4 - SAIR!");
            opcao1 = teclado.nextInt();
        }
    }
}