import model.Alimento;
import model.Produto;

public class Main {
    public static void main(String[] args){
        Produto produto = new Alimento();

        System.out.println(produto.calculoValorImposto(100));
    }
}
