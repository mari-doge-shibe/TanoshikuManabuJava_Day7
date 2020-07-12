package academy.learnprogramming;

public class Weight6 {
    static final int STD_BMI = 22;

    static double stdWeight(double height) {
        return stdWeight(height, STD_BMI);
    }

    static double stdWeight(double height, int bmi) {
        height = height / 100;
        return height * height * bmi;
    }

    public static void main(String[] args) {
        int height;
        height = 180;
        System.out.println("身長" + height + "cm:");
        System.out.println("男性の標準体重: " + stdWeight(height) + "kg");
        System.out.println("女性の標準体重: " + stdWeight(height, 21) + "kg");
    }
}
