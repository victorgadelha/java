package desafio;

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

    public void transferValue(double value, User user) {

        if (value > user.getBalance()) {
            System.out.println("Seu saldo é insuficiente.");
            return;
        }

        user.setBalance(user.getBalance() - value);
        System.out.println("Operação realizada com sucesso!");
        // .close();
    }

    public void recieveValue(double value, User user) {

        if (value < 0) {
            System.out.println("Não é possível depositar valores negativos.");
            return;
        }

        user.setBalance(user.getBalance() + value);
        System.out.println("Operação realizada com sucesso!");
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
