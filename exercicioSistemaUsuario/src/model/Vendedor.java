package model;

public class Vendedor extends Funcionario{
    private int quantidadeEmVendas;

    public Vendedor(String nome, String email, String senha) {
        super(nome, email, senha);
        super.administrador = false;
    }

    public int getQuantidadeEmVendas(){
        return quantidadeEmVendas;
    }

}
