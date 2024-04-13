package atividade02;

public class Desconto {
    static double precoOriginal = 25F;
    static double percentualDesconto = 5F;

    public static void main(String[] args) {
        System.out.println("Com desconto de " + (precoOriginal * percentualDesconto) / 100 + " reais " + "o valor final fica " + (precoOriginal - (precoOriginal * percentualDesconto) / 100 ));
    }
}
