package model;

public class Alimento implements Produto{
    private final double PORCENTAGEM_IMPOSTO = 1;

    @Override
    public double calculoValorImposto(double valorProduto) {
        double valorImposto = 0;

        valorImposto = valorProduto * PORCENTAGEM_IMPOSTO / 100;

        return valorImposto;
    }
}
