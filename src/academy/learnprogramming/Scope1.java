package academy.learnprogramming;

public class Scope1 {
    static void showNum() {
        int i = 50;
        System.out.println("showNum() = " + i);
    }

    public static void main(String[] args) {
        int i = 1;
        showNum();
        System.out.println("main() = " + i);

    }

}
