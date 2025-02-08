package model;

public class Atendente extends Funcionario{
    private double valorEmCaixa;

    public Atendente(String nome, String email, String senha) {
        super(nome, email, senha);
        super.administrador = false;
    }

    public double getValorEmCaixa(){
        return valorEmCaixa;
    }
}
