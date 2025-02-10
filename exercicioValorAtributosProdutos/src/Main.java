import model.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Produto produto = null;

        int opc = 1;
        double valor;

        while(opc>=1 && opc<=4){
            menu();
            opc = sc.nextInt();

            switch (opc){
                case 1:
                    produto = new Alimento();
                    System.out.print("Digite o valor R$ ");
                    valor = sc.nextDouble();
                    System.out.printf("R$ %.2f%n", produto.calculoValorImposto(valor));
                    break;
                case 2:
                    produto = new SaudeEBemEstar();
                    System.out.print("Digite o valor R$ ");
                    valor = sc.nextDouble();
                    System.out.printf("R$ %.2f%n", produto.calculoValorImposto(valor));
                    break;
                case 3:
                    produto = new Vestuario();
                    System.out.print("Digite o valor R$ ");
                    valor = sc.nextDouble();
                    System.out.printf("R$ %.2f%n", produto.calculoValorImposto(valor));
                    break;
                case 4:
                    produto = new Cultura();
                    System.out.print("Digite o valor R$ ");
                    valor = sc.nextDouble();
                    System.out.printf("R$ %.2f%n", produto.calculoValorImposto(valor));
                    break;
                default:
                    System.out.println("Tchau");

            }
        }
    }
    public static void menu(){
        System.out.println("Veja o imposto dos Produtos: ");
        System.out.println("[1] Alimentação\n[2]Saude e Bem Estar"
        +"\n[3] Vestuário\n[4] Cultura\n");
    }
}
