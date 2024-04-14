package desafio;

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

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("""
                Operações

                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair

                Digite a opção desejada:
                """);

                int option = scanner.nextInt();

                    switch (option) {

                        case 1 -> {
                            System.out.println("O seu saldo atual é: " + formatMoney(user));  
                        }

                        case 2 -> {
                            System.out.println("Digite o valor para depósito:");
                            double value = scanner.nextDouble();
                            operations.recieveValue(value, user);
                            System.out.println("Saldo atual: " + formatMoney(user));
                       }

                       case 3 -> { 
                            System.out.println("Digite o valor para transferência:");
                            double value = scanner.nextDouble();
                            operations.transferValue(value, user);
                            System.out.println("Saldo atual: " + formatMoney(user));
                        }
                        
                        case 4 -> {
                            System.out.println("Obrigado por usar nossos serviços.");
                            scanner.close();
                            return;
                        }
                        
                        default -> System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                    }
             
            }
        }  
}
