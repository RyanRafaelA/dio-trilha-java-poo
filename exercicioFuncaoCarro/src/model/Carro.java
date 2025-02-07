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
        if(velocidade<=120 && carroLigado == true && marcha>0){
            if(trocarMarcha() ==true){
                velocidade++;
            }
        }
    }

    public void desacelerar(){
        if(velocidade>=0 && carroLigado == true && marcha>0){
            if(trocarMarcha() == true){
                velocidade--;
            }
        }
    }

    public void virarCarro(){
        if(velocidade>=1 && velocidade<=40){
            System.out.println("O carro esta virando");
        } else{
            System.out.println("O carro não pode virar nessa velocidade");
        }
    }

    public String verificarVelocidade(){
        return marcha+"ª --- "+velocidade+"KM";
    }

    public boolean trocarMarcha(){
        if(velocidade>=0 && velocidade<20){
            marcha=1;
            return true;
        } else if(velocidade>=20 && velocidade<40){
            marcha=2;
            return true;
        } else if(velocidade>=40 && velocidade<60){
            marcha=3;
            return true;
        } else if(velocidade>=40 && velocidade<80){
            marcha=4;
            return true;
        } else if(velocidade>=80 && velocidade<100){
            marcha=5;
            return true;
        } else if(velocidade>=100 && velocidade<=120){
            marcha = 6;
            return true;
        }

        if(marcha == 0){
            return false;
        }

        return false;
    }
}
