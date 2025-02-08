package model;

public class Gerente extends Funcionarios{

    public Gerente(String nome, String email, String senha) {
        super(nome, email, senha);
        super.administrador=true;
    }
}
