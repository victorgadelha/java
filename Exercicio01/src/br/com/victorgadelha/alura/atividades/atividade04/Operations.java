package atividade04;

public class Operations {    
    private String name;
    private double openingBalance;
    private String typeAccount;

    public String getName() {
        return name;
    }

    public String setName(String name) {
        return this.name = name;
    }

    public double getOpeningBalance() {
        return openingBalance;
    }

    private double setOpeningBalance(double openingBalance) {
        return this.openingBalance = openingBalance;
    }

    public String getTypeAccount() {
        return typeAccount;
    }

    private String setTypeAccount(String typeAccount) {
        return this.typeAccount = typeAccount;
    }
    
    public void createAccount(String name, double openingBalance, String typeAccount) {
        this.name = setName(name);
        this.openingBalance = setOpeningBalance(openingBalance);
        this.typeAccount = setTypeAccount(typeAccount);
    }

}
