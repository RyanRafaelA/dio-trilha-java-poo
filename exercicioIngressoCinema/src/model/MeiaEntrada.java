package model;

import enums.TipoFilme;

public class MeiaEntrada extends Ingresso{
    private final double DESCONTO_METADA = 0.5;

    public MeiaEntrada(double valor, String nomeFilme, TipoFilme tipoFilme) {
        super(valor, nomeFilme, tipoFilme);
    }

    @Override
    public double getValor(){
        return super.getValor()*DESCONTO_METADA;
    }
}
