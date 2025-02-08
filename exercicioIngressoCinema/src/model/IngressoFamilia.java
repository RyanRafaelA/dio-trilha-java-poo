package model;

import enums.TipoFilme;

public class IngressoFamilia extends Ingresso{
    private final double DESCONTO_FAMILIA = 1.05;
    private int quantidadeDeFamiliares;

    public IngressoFamilia(double valor, String nomeFilme, TipoFilme tipoFilme, int quantidadeDeFamiliares) {
        super(valor, nomeFilme, tipoFilme);
        this.quantidadeDeFamiliares = quantidadeDeFamiliares;
    }

    @Override
    public double getValor(){
        double novoValor;

        novoValor = super.getValor() * quantidadeDeFamiliares;

        if(quantidadeDeFamiliares>3){
            return novoValor-= novoValor*DESCONTO_FAMILIA;
        }

        return novoValor;
    }
}
