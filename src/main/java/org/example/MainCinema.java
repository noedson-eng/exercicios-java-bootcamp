package org.example;

public class MainCinema{
    public static void main(String[] args) {


        Ingresso ingressoMeia = new MeiaEntrada(40.00, false, "O Senhor dos Anéis");

        Ingresso ingressoFamilia = new IngressoFamilia(30.00, true, 4, "Harry Potter");

        System.out.println("Filme " + ingressoMeia.getNomeDoFilme());
        System.out.println("Valor total da Meia Entrada: R$ " + ingressoMeia.getValor());
        System.out.println("Idioma: " + (ingressoMeia.isDublado() ? "Dublado" : "Legendado"));
        System.out.println("\n----------------------------------\n");

        System.out.println("Filme " + ingressoFamilia.getNomeDoFilme());
        System.out.println("Valor total do Ingresso Família: R$ " + ingressoFamilia.getValor());

        System.out.println("Idioma: " + (ingressoFamilia.isDublado() ? "Dublado" : "Legendado"));



    }
}
