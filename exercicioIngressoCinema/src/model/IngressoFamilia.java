package model;

import enums.TipoFilme;

public class IngressoFamilia extends Ingresso{
    private final double DESCONTO_FAMILIA = 0.05;
    private int quantidadeDeFamiliares;

    public IngressoFamilia(double valor, String nomeFilme, TipoFilme tipoFilme, int quantidadeDeFamiliares) {
        super(valor, nomeFilme, tipoFilme);
        this.quantidadeDeFamiliares = quantidadeDeFamiliares;
    }

    @Override
    public double getValor(){
        double valorFinal;
        double valorBase;

        valorBase = super.getValor() * quantidadeDeFamiliares;
        valorFinal = valorBase;

        if(quantidadeDeFamiliares>3){
            valorFinal = valorBase - (valorBase*DESCONTO_FAMILIA);
        }

        return valorFinal;
    }
}
