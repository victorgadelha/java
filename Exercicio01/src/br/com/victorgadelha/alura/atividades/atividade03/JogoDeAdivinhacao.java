package atividade03;
import java.util.Random;
import java.util.Scanner;

public class JogoDeAdivinhacao {
    private int tentativas;
    private int numeroRandomico;
    private int chute;

    //void chutaNumero () {
        //Scanner scanner = new Scanner(System.in);
        //chute = scanner.nextInt();
        //tentativas ++;
        
        //if (chute != numeroRandomico && tentativas < 5) {
          //  System.out.println("Você errou. Tente mais uma vez");
           // chutaNumero();
       // } 
       // scanner.close();
   // }

    void chutaNumero() {
        Scanner scanner = new Scanner(System.in);
    
        while (true) {
            chute = scanner.nextInt();
            tentativas++;
    
            if (chute != numeroRandomico && tentativas < 5) {
                System.out.println("Você errou. Tente mais uma vez");
            } else {
                break; // Sai do loop caso o chute esteja correto ou o número máximo de tentativas seja alcançado
            }
        }
    
        scanner.close();
    }
    
    
    public static void main(String[] args) {
        JogoDeAdivinhacao newGame = new JogoDeAdivinhacao();
        newGame.numeroRandomico = new Random().nextInt(10);
        
        System.out.println("""
            Adivinhe o número secreto de 1 a 10!
            Você tem apenas 5 tentativas.
            Se não conseguir acertar, o programa encerra.
        """);
        
        newGame.chutaNumero();

        while (newGame.chute != newGame.numeroRandomico && newGame.tentativas < 5) {
            newGame.chutaNumero();
        } 

        if (newGame.chute == newGame.numeroRandomico) {
            System.out.println("Parabéns! Você acertou o número secreto.");
        } else if (newGame.chute != newGame.numeroRandomico && newGame.tentativas == 5) {
            System.out.println("Você perdeu! As tentativas acabaram.");
        }
    }
}
