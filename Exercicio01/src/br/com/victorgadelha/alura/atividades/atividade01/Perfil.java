package atividade01;
public class Perfil {
    String name = "João Victor Gadelha";
    String compliment = "tudo bem?";

    public static void main(String[] args) {
        Perfil perfil = new Perfil();
        System.out.println("Olá, " + perfil.name + " " + perfil.compliment);
    }
}
