package model;

public class Gerente extends Funcionario {

    public Gerente(String nome, String email, String senha) {
        super(nome, email, senha);
        super.administrador=true;
    }

    public void relatorioFinanceiro(double valor){
        System.out.println("R$ "+valor);
    }

    public void consultarVendas(int quantidadeVendas){
        System.out.println(quantidadeVendas);
    }

}
