package Carro;

public class Car {
    private int velocidade;
    private int marcha;
    private boolean ligado;

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public Car() {
        this.velocidade = 0;
        this.marcha = 0;
        this.ligado = false;
    }
    public void ligar() {
        this.ligado = true;
        System.out.println("O carro está ligado. Vrum!");
    }
    public void desligar() {
        if (this.marcha == 0 && this.velocidade == 0) {
            this.ligado = false;
        }else  {
            System.out.println("Não é seguro desligar o carro em movimento ou engatado!");
        }
    }
    public void trocarMarcha(int novaMarcha) {
        if(!this.ligado) {
            System.out.println("Erro! O carro está desligado");
        }else if (novaMarcha < 0 || novaMarcha > 6) {
            System.out.println("Marcha não existe");
        }else if (novaMarcha == this.marcha + 1 || novaMarcha == this.marcha - 1) {
            this.marcha = novaMarcha;
        }else {
            System.out.println("Você não pode pular marchas!");
        }
    }
    public void acelerar() {
        if(!this.ligado) {
            System.out.println("Erro! O carro está desligado");
            return;
        }else if (this.marcha == 0) {
            System.out.println("Carro está em ponto morto e não pode acelerar!");
            return;
        } int limiteMaximo = this.marcha * 20;
         if (this.velocidade < limiteMaximo) {
             this.velocidade++;
         }else {
             System.out.println("Você atingiu o limite de velocidade para a marcha atual!");
         }
    }
    public void diminuirVelocidade() {
        if (!this.ligado) {
            System.out.println("Erro! O carro está desligado");
            return;
        }if (this.velocidade > 0) {
            this.velocidade--;
        }else {
            System.out.println("O carro já está parado");
        }
    }
    public void virarEsquerda() {
        if (!this.ligado) {
            System.out.println("Erro! O carro está desligado");
            return;
        }if (this.velocidade >= 1 && this.velocidade <= 40) {
            System.out.println("O carro virou para a esquerda");
        }else {
            System.out.println("A velocidade atual não permite fazer curvas com segurança");
        }
    }
    public void virarDireita() {
       if (!this.ligado) {
           System.out.println("Erro! O carro está desligado");
           return;
       }if (this.velocidade >= 1 && this.velocidade <= 40) {
            System.out.println("O carro virou para a direita");
        }else {
            System.out.println("A velocidade atual não permite fazer curvas com segurança");
        }
    }
    public void verificarVelocidade() {
        System.out.println("\n=== PAINEL DO CARRO ===");
        System.out.println("Status: " + (this.ligado ? "Ligado" : "Desligado"));
        System.out.println("Marcha atual: " + this.marcha);
        System.out.println("Velocidade atual: " + this.velocidade + "km/h");
    }

}
