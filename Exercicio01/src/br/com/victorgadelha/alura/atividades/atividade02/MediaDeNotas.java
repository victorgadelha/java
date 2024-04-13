package atividade02;

public class MediaDeNotas {
    private double nota01;
    private double nota02;

   public double calculaMedia () {
        return (nota01 + nota02) / 2;
    }

    public static void main(String[] args) {
        MediaDeNotas mediaDeNotas = new MediaDeNotas();
        mediaDeNotas.nota01 = 2.5F;
        mediaDeNotas.nota02 = 7.8F;
       
        System.out.println(mediaDeNotas.calculaMedia());
    }
}
