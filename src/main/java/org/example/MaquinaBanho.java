package org.example;

public class MaquinaBanho {

    private double agua;
    private double shampoo;
    private boolean maquinaSuja;
    private Pet petAtual;


    public MaquinaBanho() {
        this.agua = 0.0;
        this.shampoo = 0.0;
        this.maquinaSuja = false;
        this.petAtual = null;
    }

    public void abastecerAgua() {
        if (this.agua + 2.0 > 30.0) {
            System.out.println("Não é possivel abastecer mais água. Vai ultrapassar");
        } else {
            this.agua += 2.0;
            System.out.println("Abastecido com sucesso! Nível atual da água: " + this.agua);
        }
    }

    public void abastecerShampoo() {
        if (this.shampoo + 2.0 > 10.0) {
            System.out.println("Não é possivel abastecer mais shampoo. Vai ultrapassar");
        } else {
            this.shampoo += 2.0;
            System.out.println("Abastecido com sucesso! Nível atual do shampoo: " + this.shampoo);
        }
    }

    public void verificarNivelAgua() {
        System.out.printf("Nível atual da água é de: %s", this.agua);
    }

    public void verificarShampoo() {
        System.out.printf("Nível atual do shampoo é de: %s", this.shampoo);
    }

    public void colocarPet(Pet pet) {
        if (this.petAtual != null) {
            System.out.println("A máquina já está ocupada por outro pet!");
        } else if (this.maquinaSuja) {
            System.out.println("A máquina precisa ser limpa antes de receber um novo pet!");
        } else {
            this.petAtual = pet;
            System.out.println("O pet " + pet.getNome() + " entrou na máquina!");
        }
    }

    public void darBanho() {
        if (this.petAtual == null) {
            System.out.println("Não há nenhum pet na máquina para dar banho!");
            return;
        } else if (this.agua < 10.0) {
            System.out.println("Água insuficiente para o banho! abasteça a máquina");
            return;
        } else if (this.shampoo < 2.0) {
            System.out.println("Shampoo insuficente para o banho! Abasteça a máquina");
            return;
        } else {
            this.agua -= 10.0;
            this.shampoo -= 2.0;
            this.petAtual.setLimpo(true);
            System.out.println("O pet " + this.petAtual.getNome() + " tomou banho e está limpinho!");
        }
    }
    public void retirarPet(){
        if (this.petAtual == null) {
            System.out.println("A máquina já está vazia!");
            return;
        }
         if (!this.petAtual.isLimpo()) {
            this.maquinaSuja = true;
            System.out.println("Atenção: O pet saiu sujo! A máquina ficou suja e precisa de limpeza.");
        }else {
             System.out.println("O pet " + this.petAtual.getNome() + " saiu da máquina limpinho e cheiroso!");
         }
         this.petAtual = null;

}
public void limparMaquina(){
        if (!this.maquinaSuja) {
            System.out.println("A máquina já está limpa! Não precisa gastar insumos.");
            return;
        }else if (this.agua < 3.0){
            System.out.println("Água insuficiente para limpar a máquina!");
            return;
        }else if (this.shampoo < 1.0){
            System.out.println("Shampoo insuficente para limpar a máquina!");
            return;
        }
        this.agua -= 3.0;
        this.shampoo -= 1.0;
        this.maquinaSuja = false;
    System.out.println("A máquina foi limpa com sucesso e está pronta para o proximo pet!");

}




}




