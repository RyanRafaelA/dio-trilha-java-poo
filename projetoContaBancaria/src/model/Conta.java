package model;

public class Conta {
    private double limite = 0;
    private double saldo = 0;
    private double chequeEspecial = 0;

    public Conta(){}
    public Conta(double saldo){
        this.saldo = saldo;

        setChequeEspecial();
        setlimite();
    }

    public double getLimite(){ return limite; }
    private void setlimite(){
        limite = getSaldo() + getChequeEspecial();
    }

    public double getSaldo(){ return saldo; }

    public double getChequeEspecial(){ return chequeEspecial; }
    private void setChequeEspecial(){
        if(getSaldo() <= 500){
            chequeEspecial = 50.00;
        } else{
            chequeEspecial = saldo * 0.5;
        }
    }

    public void deposito(double valorDeposito){
        saldo += valorDeposito;

        setlimite();
    }

    public void sacar(double valorSacar){
        if(valorSacar > saldo) {
            saldo -= valorSacar;

            setlimite();;
        } else {
            System.out.println("Valor a sacar excede o saldo.");
        }
    }

    public boolean verificarUsoChequeEspecial(){
        if (saldo<limite){
            return true;
        }
        return false;
    }
}
