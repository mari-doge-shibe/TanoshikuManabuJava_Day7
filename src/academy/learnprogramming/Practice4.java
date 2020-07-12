package academy.learnprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice4 {
    // Pracitce1のconvert()メソッドをオーバーロードし、第二引数で為替レートを指定できるようにせよ。
    static double rate;
    static double convert(double yen, double rate) {
        return yen / rate;
    }

    public static void main(String[] args) {
        double yen;
        InputStreamReader isr;
        BufferedReader br;
        isr = new InputStreamReader(System.in);
        br = new BufferedReader(isr);

        try {
            System.out.print("円を入力してください：");
            String ans = br.readLine();
            yen = Double.parseDouble(ans);
            System.out.println("レートを入力してください：");
            String yenRate = br.readLine();
            rate = Double.parseDouble(yenRate);
            System.out.print(yen + "円をドルに換算すると");
            System.out.println(convert(yen, rate) + "ドルです");
        } catch (IOException e) {
            System.err.println("値を読み込めませんでした");
        } catch (NumberFormatException e) {
            System.err.println("円を数値で入力してください");
        }
    }

}
