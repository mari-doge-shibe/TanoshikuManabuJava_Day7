package academy.learnprogramming;

public class FieldV2 {
    static int i = 10;

    static void test() {
        System.out.println("test()メソッド: i=" + i);
    }

    public static void main(String[] args) {
        int i = 3;
        System.out.println("main()メソッド: i=" + i);
        test();
    }

}
