package atividade04;

public class User {
    public static void main(String[] args) {
        Operations operation = new Operations();
        operation.createAccount("João Victor Gadelha", 2000, "Poupança");
        System.out.println(operation.getName());

    }
}
