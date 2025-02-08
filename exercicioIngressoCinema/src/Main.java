import enums.TipoFilme;
import model.Ingresso;
import model.IngressoFamilia;
import model.MeiaEntrada;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Ingresso ingresso = null;
        int opcao, quantidadePessoas;
        String nomeFilme;
        char tipoFilme;
        double valor;

        System.out.print("Nome do Filme: ");
        nomeFilme = sc.next();

        while(true){
            System.out.print("Tipo: [D]ublado/[L]egendado ");
            tipoFilme = sc.next().charAt(0);

            if(tipoFilme == 'D' || tipoFilme == 'L'){
                break;
            } else{
                System.out.println("Tipo Erro tente de novo.");
            }
        }

        System.out.print("Preço: R$");
        valor = sc.nextDouble();

        System.out.println("Tipo Ingresso");
        System.out.println("[1] Normal\n[2]Meia Entrada\n[3]Familia");
        System.out.print("Opção: ");
        opcao = sc.nextInt();


        switch (opcao){
            case 1:
                if(tipoFilme == 'D'){
                    ingresso = new Ingresso(valor, nomeFilme, TipoFilme.DUBLADO);
                } else{
                    ingresso = new Ingresso(valor, nomeFilme, TipoFilme.LENGENDADO);
                }
                System.out.println(ingresso);
                break;

            case 2:
                if(tipoFilme == 'D'){
                    ingresso = new MeiaEntrada(valor, nomeFilme, TipoFilme.DUBLADO);
                } else{
                    ingresso = new MeiaEntrada(valor, nomeFilme, TipoFilme.LENGENDADO);
                }
                System.out.println(ingresso);
                break;

            case 3:
                System.out.print("Quantidade de pessoas: ");
                quantidadePessoas = sc.nextInt();
                if(tipoFilme == 'D'){
                    ingresso = new IngressoFamilia(valor, nomeFilme, TipoFilme.DUBLADO, quantidadePessoas);
                } else{
                    ingresso = new IngressoFamilia(valor, nomeFilme, TipoFilme.LENGENDADO, quantidadePessoas);
                }
                System.out.println(ingresso);
                break;

            default:
                System.out.println("Não existe essa opção.");
        }
    }
}
