package atividade04;

public class AppBank {
    public static void main(String[] args) {
        User user = new User("João Victor Gadelha", 0, "Corrente");
        Operations operations = new Operations();

        System.out.println(operations.getName(user));
    }
}
