package model;

public class Carro {
    private boolean carroLigado;
    private double velocidade;
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

        if(velocidade == 0 && marcha == 0) {
            carroLigado = false;
        } else{
            System.out.println("O carro não foi deligado! Tem que esta no ponto morto e a velocidade tem que ser igual a 0km");
        }
    }

    public void acelerar(){
        if(velocidade<=120){
            velocidade++;
        }
    }

    public void desacelerar(){
        if(velocidade>=0){
            velocidade--;
        }
    }

    public String verificarVelocidade(){
        return "Velocidade = "+ velocidade+ "KM";
    }
}
