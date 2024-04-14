package atividade04;

import java.util.Scanner;

public class Operations {    

    public User createUser(String name, double balance, String typeAccount) {
        User user = new User();

        user.setName(name);
        user.setBalance(balance);
        user.setTypeAccount(typeAccount);

        return user;
    }

    public String getName(User user) {
        return user.getName();
    }

    public double getBalance(User user) {
        return user.getBalance();
    }

    public String getTypeAccount(User user) {
        return user.getTypeAccount();
    }

    public void transferValue(User user) {
        Scanner scanner = new Scanner(System.in);
        double value = scanner.nextDouble();
        if (value > user.getBalance()) {
            System.out.println("Seu saldo não é insuficiente.");
            scanner.close();
            return;
        }
        user.setBalance(user.getBalance() - value);
        scanner.close();
    }

    public void getExtract(User user) {
        System.out.println("""
                ***********************************
                Nome: %s
                Tipo conta: %s
                Saldo inicial: %.2f
                ***********************************
                """.formatted(user.getName(), user.getTypeAccount(), user.getBalance()));
    }
}
