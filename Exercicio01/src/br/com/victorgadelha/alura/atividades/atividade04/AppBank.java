package atividade04;

public class AppBank {
    public static void main(String[] args) {
        Operations operations = new Operations();
        User user = operations.createUser("João Victor", 2453.24, "Corrente");

        System.out.println(user);

    }
}
