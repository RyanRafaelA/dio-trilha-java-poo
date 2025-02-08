package model;

public abstract class Funcionarios{
    private String nome;
    private String email;
    private String senha;
    protected boolean administrador;

    public Funcionarios(String nome, String email, String senha){
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public boolean getAdministrador() {
        return administrador;
    }
}