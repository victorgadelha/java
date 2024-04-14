package atividade04;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class AppBank {
    
    public static void main(String[] args) {
        Operations operations = new Operations();
        User user = operations.createUser("João Victor", 2453.24, "Corrente");

        System.out.println(user);
        operations.getExtract(user);
        System.out.println("""
                Operações

                1- Consultar saldos
                2- Receber valor
                3- Transferir valor

                Digite a opção desejada:
                """);
        
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        scanner.close();

        switch (option) {
            case 1 -> {
                Locale brCurrency = Locale.of("pt", "BR");
                NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(brCurrency);
                System.out.println(currencyFormat.format(operations.getBalance(user)));  
            }
            //case 2 -> operations.getBalance();
            //case 3 -> operations.getBalance();
        }
    }
}
