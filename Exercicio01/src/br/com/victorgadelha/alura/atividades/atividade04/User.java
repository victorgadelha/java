package atividade04;

public class User {
    String name;
    private double openingBalance;
    private String typeAccount;

    public User(String name, double openingBalance, String typeAccount) {
        this.name = name;
        this.openingBalance = openingBalance;
        this.typeAccount = typeAccount;
    }

    public String getName() {
        return name;
    }

    public double getOpeningBalance() {
        return openingBalance;
    }

    public String getTypeAccount() {
        return typeAccount;
    }

}
