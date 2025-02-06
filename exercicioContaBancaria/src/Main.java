import model.Conta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Conta conta;

        int opcao = 0;
        double dinheiro;

        System.out.println("Inicializando conta");
        System.out.print("Primeiro Deposito R$");
        conta = new Conta(sc.nextDouble());

        while(opcao != 7) {
            menu();
            opcao = sc.nextInt();

            System.out.println("==========================================");
            switch (opcao){
                case 1:
                    System.out.print(conta.getSaldo());
                    break;
                case 2:
                    System.out.print(conta.getChequeEspecial());
                    break;
                case 3:
                    System.out.print("Depositar Dinheiro\nR$");
                    conta.deposito(sc.nextDouble());
                    break;
                case 4:
                    System.out.print("Sacar Dinheiro\nR$");
                    conta.sacar(sc.nextDouble());
                    break;
                case 5:
                    System.out.print("Pagar Boleto\nR$");
                    conta.deposito(sc.nextDouble());
                    break;
                case 6:
                    System.out.print("Esta sendo usado o cheque especial: "+conta.verificarUsoChequeEspecial());
                    break;
                case 7:
                    System.out.print("Até a proxima.");
                    break;
                default:
                    System.out.println("Não existe essa opção.");
            }
        }
    }

     static void menu(){
        System.out.println("\n==========================================");
        System.out.println("[1] - Consultar Saldo");
        System.out.println("[2] - Consultar Cheque Especial");
        System.out.println("[3] - Depositar Dinheiro");
        System.out.println("[4] - Sacar Dinheiro");
        System.out.println("[5] - Pagar um boleto");
        System.out.println("[6] - Verificar se a conta está usando cheque especial");
        System.out.println("[7] - Sair");
    }
}
