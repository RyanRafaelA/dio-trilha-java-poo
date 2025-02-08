package model;

import exception.ExcecaoFuncionario;

public abstract class Funcionario {
    private String nome;
    private String email;
    private String senha;
    protected boolean administrador;

    public Funcionario(String nome, String email, String senha){
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }


    public String getEmail() {
        return email;
    }


    public String getSenha() {
        return senha;
    }

    public boolean getAdministrador() {
        return administrador;
    }

    public boolean realizarLogin(String email, String senha){
        if(this.email == email && this.senha == senha){
            return true;
        }

        return false;
    }

    public boolean realizarLogof(){
        return false;
    }

    public void alterarSenha(String NovaSenha) throws ExcecaoFuncionario {
        if(NovaSenha.length() > 6 && NovaSenha != this.senha){
            this.senha = NovaSenha;
        } else{
            throw new ExcecaoFuncionario("Senha menor que 6 caractere ou é igual a antiga");
        }
    }

    public void alterarDados(String novoNome, String novoEmail) throws ExcecaoFuncionario{
        if(nome != novoNome){
            this.nome=nome;
        } else{
            throw new ExcecaoFuncionario("O novo nome é igual ao nome antigo");
        }

        if(novoEmail!=this.email && novoEmail.contains("@gmail.com")){
            this.email = email;
        }else{
            throw new ExcecaoFuncionario("Novo email não compre com as regras");
        }
    }
    public void alterarDados(String novoNome) throws ExcecaoFuncionario{
        if(nome != novoNome){
            this.nome=nome;
        } else{
            throw new ExcecaoFuncionario("O novo nome é igual ao nome antigo");
        }
    }

    public void alteraDados(String novoEmail) throws ExcecaoFuncionario{
        if(novoEmail!=this.email && novoEmail.contains("@gmail.com")){
            this.email = email;
        }else{
            throw new ExcecaoFuncionario("Novo email não compre com as regras");
        }
    }
}