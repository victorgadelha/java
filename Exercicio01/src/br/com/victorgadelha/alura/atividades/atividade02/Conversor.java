package atividade02;

public class Conversor {
    private double converteParaFahrenheit(double grauCelsius) {
        return ((grauCelsius * 1.8) + 32);
    }

    public static void main(String[] args) {
        Conversor conversor = new Conversor();
        System.out.println("A temperatura convertida é" + " " + conversor.converteParaFahrenheit(2) + " " + "graus Fahrenheit");
    }
}
