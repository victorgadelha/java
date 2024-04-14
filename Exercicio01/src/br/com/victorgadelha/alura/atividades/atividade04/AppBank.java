package atividade04;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class AppBank {
    public static String formatMoney(User user) {
        Operations operations = new Operations();
        Locale brCurrency = Locale.of("pt", "BR");
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(brCurrency);
        return currencyFormat.format(operations.getBalance(user));
    }
    public static void main(String[] args) {
        Operations operations = new Operations();
        User user = operations.createUser("João Victor", 20, "Corrente");

        System.out.println(user);
        operations.getExtract(user);
        System.out.println("""
                Operações

                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair

                Digite a opção desejada:
                """);
        
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        //scanner.close();

        switch (option) {
            case 1 -> {
                System.out.println(formatMoney(user));  
            }
            case 2 -> {
            System.out.println("Digite o valor para depósito:");
            operations.recieveValue(user);
            System.out.println("Saldo atual: " + formatMoney(user));
           }
           case 3 -> {
                System.out.println("Digite o valor para transferência:");
                operations.transferValue(user);
                System.out.println("Saldo atual: " + formatMoney(user));
           }
        }
    }
}
