import model.Carro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Carro carro = new Carro();

        int opc = 0;

        while(opc != 8){
            menuInterativo();
            opc = sc.nextInt();

            System.out.println("===========================================");
            switch(opc){
                case 1:
                    carro.ligar();
                    break;
                case 2:
                    carro.desligar();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                default:
                    System.out.println("Não existe essa opção.");
            }
        }
    }

    static void menuInterativo(){
        System.out.println("===========================================");
        System.out.println("[1] Ligar Carro");
        System.out.println("[2] Desligar Carro");
        System.out.println("[3] Acelarar");
        System.out.println("[4] Diminuir velocidade");
        System.out.println("[5] Virar para esquerda/direita");
        System.out.println("[6] Verificar Velocidade");
        System.out.println("[7] Trocar Marcha");
        System.out.println("[8] sair");
        System.out.print("Digite a opção: ");
    }
}
