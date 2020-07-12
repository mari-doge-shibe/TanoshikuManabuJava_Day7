package academy.learnprogramming;

public class OmikujiTest2 {
    static String[] kujis = {"大吉", "中吉", "凶"};

    static void omikuji() {
        System.out.println(kujis[(int) (Math.random() * 3)]);
    }

    public static void main(String[] args) {
        System.out.print("今日の運勢：");
        omikuji();
        System.out.print("明日の運勢：");
        omikuji();
    }

}
