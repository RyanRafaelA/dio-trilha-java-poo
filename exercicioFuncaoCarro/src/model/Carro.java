package model;

public class Carro {
    private boolean carroLigado;
    private int velocidade;
    private int marcha;

    public Carro(){
        carroLigado = false;
        marcha = 0;
        velocidade = 0;
    }

    public void ligar(){
        if(carroLigado == true) {
            System.out.println("O carro já esta ligado");
        }
        carroLigado = true;
    }

    public void desligar(){
        if(carroLigado == false){
            System.out.println("O carro já esta desligado");
        }
        carroLigado = false;
    }
}
