package atividade02;

public class CastDoubleToInt {
    double var1;
    int var2;

    public int castDoubleToInt() {
        return (int) var1;
    }

    public static void main(String[] args) {
        var casted = new CastDoubleToInt();
        casted.var1 = 3.2;
        System.out.println("Antes do cast: " + casted.var1 + " e " + "depois do cast " + casted.castDoubleToInt());
    }

}
