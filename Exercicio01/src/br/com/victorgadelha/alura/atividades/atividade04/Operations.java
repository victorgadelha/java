package atividade04;

public class Operations {    

    public User createUser(String name, double openingBalance, String typeAccount) {
        User user = new User();

        user.setName(name);
        user.setBalance(openingBalance);
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

    public void getExtract(User user) {
        System.out.println("""
                ******************************
                Nome: %s
                Tipo conta: %s
                Saldo inicial: %.2f
                ******************************
                """.formatted(user.getName(), user.getTypeAccount(), user.getBalance()));
    }
}
