package model;

public class Vendedor extends Funcionario{
    private String informaçãoVendas="";
    private int quantidadeEmVendas;

    public Vendedor(String nome, String email, String senha) {
        super(nome, email, senha);
        super.administrador = false;
    }

    public int getQuantidadeEmVendas(){
        return quantidadeEmVendas;
    }

    public void realizarVenda(String informaçãoVenda){
        this.informaçãoVendas += informaçãoVenda+"\n";
        this.quantidadeEmVendas++;
    }

    public void consultarVendas(){
        System.out.println(this.informaçãoVendas);
    }
}
