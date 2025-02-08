package model;

import enums.TipoFilme;

public class Ingresso {
    private double valor;
    private String nomeFilme;
    private TipoFilme tipoFilme;

    public Ingresso(double valor, String nomeFilme, TipoFilme tipoFilme){
        this.valor = valor;
        this.nomeFilme = nomeFilme;
        this.tipoFilme = tipoFilme;
    }

    public double getValor(){
        return valor;
    }

    public String getNomeFilme(){
        return nomeFilme;
    }

    public TipoFilme getTipoFilme(){
        return tipoFilme;
    }

    public String toString(){
        return "Filme: "+getNomeFilme()+"\t"+tipoFilme.getAbreviatura()+
                "\n"+getValor();
    }
}