import java.util.Scanner;

import java.util.Scanner;

public class Conta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome = "Clarissa";
        String tipoConta = "Corrente";
        double saldo = 1998.28;

        System.out.println("************************************************");
        System.out.println("Dados iniciais do cliente: ");
        System.out.println("************************************************");
        System.out.println("Nome Cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo R$ " + saldo);


        System.out.println("Digite a operação que deseja");
        System.out.println("1- Consultar saldos");
        System.out.println("2- Receber valor");
        System.out.println("3- Transferir valor");
        System.out.println("4- Sair");


        int opcao = 0;
        while(opcao != 4) {
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.println("Saldo R$ " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual valor que deseja transferir?");
                double valor = sc.nextDouble();
                if(valor > saldo) {
                    System.out.println("Não há saldo para realizar a transferência.");
                } else {
                    saldo -= valor;
                    System.out.println("Novo saldo: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = sc.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo: " + saldo);
            } else if (opcao == 4){
                System.out.println("Agradecemos por utilizar nossos serviços! Tenha um ótimo dia e volte sempre!");
            }
        }
    }
}
