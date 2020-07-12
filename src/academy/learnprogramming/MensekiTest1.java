package academy.learnprogramming;

public class MensekiTest1 {
    static double menseki(double hankei) {
        double menseki;
        menseki = Math.PI * hankei * hankei;
        return menseki;
    }

    public static void main(String[] args) {
        double hankei = 10;
        System.out.println("半径が" + hankei + "の円の面積は");
        System.out.println(menseki(hankei));
        hankei = 20;
        System.out.print("半径が" + hankei + "の円の面積は");
        System.out.println(menseki(hankei));
    }
}


