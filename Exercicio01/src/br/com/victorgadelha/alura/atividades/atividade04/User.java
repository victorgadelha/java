package atividade04;

public class User {
    String name;
    double balance;
    private String typeAccount;

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public String getTypeAccount() {
        return typeAccount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setTypeAccount(String typeAccount) {
        this.typeAccount = typeAccount;
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", Balance=" + balance + ", typeAccount=" + typeAccount + "]";
    }

}
