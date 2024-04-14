package atividade04;

public class User {
    String name;
    double openingBalance;
    private String typeAccount;

    public String getName() {
        return name;
    }

    public double getOpeningBalance() {
        return openingBalance;
    }

    public String getTypeAccount() {
        return typeAccount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOpeningBalance(double openingBalance) {
        this.openingBalance = openingBalance;
    }

    public void setTypeAccount(String typeAccount) {
        this.typeAccount = typeAccount;
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", openingBalance=" + openingBalance + ", typeAccount=" + typeAccount + "]";
    }

}
