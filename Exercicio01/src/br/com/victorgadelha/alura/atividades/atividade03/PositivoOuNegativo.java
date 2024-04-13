package atividade03;

import java.util.Scanner;

public class PositivoOuNegativo {
    private static double number;
    private static void verificaNumero() {
        Scanner scanner = new Scanner(System.in);
        PositivoOuNegativo.number = scanner.nextDouble();
        if (PositivoOuNegativo.number > 0) {
            System.out.println("O número é positivo.");
        } else if (PositivoOuNegativo.number < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é 0.");
        }
        scanner.close();
    }
    public static void main(String[] args) {
        verificaNumero();
    }
    
}