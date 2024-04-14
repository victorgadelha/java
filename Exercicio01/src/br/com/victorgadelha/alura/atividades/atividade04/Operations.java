package atividade04;

public class Operations {    

    public User createUser(String name, double openingBalance, String typeAccount) {
        User user = new User();

        user.setName(name);
        user.setOpeningBalance(openingBalance);
        user.setTypeAccount(typeAccount);

        return user;
    }

    public String getName(User user) {
        return user.getName();
    }

    public double getOpeningBalance(User user) {
        return user.getOpeningBalance();
    }

    public String getTypeAccount(User user) {
        return user.getTypeAccount();
    }
}
