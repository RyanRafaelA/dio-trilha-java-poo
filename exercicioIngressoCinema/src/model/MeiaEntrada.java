package model;

import enums.TipoFilme;

public class MeiaEntrada extends Ingresso{
    private double INGRESSO_METADA = 0.5;

    public MeiaEntrada(double valor, String nomeFilme, TipoFilme tipoFilme) {
        super(valor, nomeFilme, tipoFilme);
    }

    @Override
    public double getValor(){
        double valorComMeiaEntrada;

        valorComMeiaEntrada = super.getValor();

        return valorComMeiaEntrada+= super.getValor()*INGRESSO_METADA;
    }
}
