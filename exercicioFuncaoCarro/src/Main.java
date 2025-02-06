import model.Carro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Carro carro = new Carro();

        int opc = 0;
        char sairCarro ='n';

        while(sairCarro == 'n'){
            menuInterativo();
            opc = sc.nextInt();

            System.out.println("===========================================");
            switch(opc){
                case 1:
                    carro.ligar();
                    break;
                case 2:
                    carro.desligar();
                    System.out.print("Deseja sair do carro: s/n ");
                    sairCarro = sc.next().charAt(0);
                    break;
                case 3:
                    carro.acelerar();
                    break;
                case 4:
                    carro.desacelerar();
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println(carro.verificarVelocidade());
                    break;
                case 7:
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
        System.out.print("Digite a opção: ");
    }
}
