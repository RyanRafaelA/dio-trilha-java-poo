package enums;

public enum TipoFilme {
    DUBLADO("DUB"),
    LENGENDADO("LENG");

    private String abreviatura;

    TipoFilme(String abreviatura){
        this.abreviatura = abreviatura;
    }

    public String getAbreviatura(){
        return this.abreviatura;
    }
}
