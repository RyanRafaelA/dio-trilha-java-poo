import exception.ExcecaoFuncionario;
import model.Atendente;
import model.Gerente;
import model.Vendedor;

public class Main {
    public static void main(String[] args){
        Gerente gerente = new Gerente("Joana", "Joana@gmail.com", "12345678");
        Vendedor vendedor = new Vendedor("Romario", "Romario@gmail.com", "98907222");
        Atendente atendente = new Atendente("Jusevaldo","Jusevaldo@gmail.com","1235797");


        try {
            System.out.println("==========="+atendente.getClass().getName()+"===========");
            System.out.println(gerente);
            gerente.alterarSenha("9889678");
            System.out.println(gerente);

            System.out.println("\n==========="+atendente.getClass().getName()+"===========");
            System.out.println(vendedor);
            vendedor.realizarVenda("1 - Avião de brinquedo");
            vendedor.realizarVenda("5 - relogio de bolso");
            vendedor.realizarVenda("1- carro");
            vendedor.consultarVendas();

            System.out.println("==========="+atendente.getClass().getName()+"===========");
            System.out.println(atendente);
            atendente.receberPagamento(12.50);
            atendente.receberPagamento(55.90);
            atendente.receberPagamento(15.20);
            System.out.println(atendente.getValorEmCaixa());
        } catch(ExcecaoFuncionario msg){
            System.err.println("ERRO: "+msg);
        }

    }
}
