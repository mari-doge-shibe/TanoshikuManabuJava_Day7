package academy.learnprogramming;

public class Scope2 {
    public static void main(String[] args) {
        for(int i = 4; i < 10; i++) {
            System.out.println(i);
        }
        for(int i = 1; i < 3; i++) {
            System.out.println(i);
        }
//        System.out.println(i); // it results in an error
    }

}
