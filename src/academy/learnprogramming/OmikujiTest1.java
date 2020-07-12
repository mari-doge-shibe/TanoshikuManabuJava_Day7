package academy.learnprogramming;

public class OmikujiTest1 {
    static void omikuji() {
        String[] kuji = {"大吉", "中吉", "凶"};
        System.out.println(kuji[(int)(Math.random() * 3)]);
    }

    public static void main(String[] args) {
        System.out.print("今日の運勢：");
        omikuji();
        System.out.print("明日の運勢：");
        omikuji();
    }
}
