package academy.learnprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice1 {
    // キーボードから入力した値を日本円とみなし、米ドルに換算するプログラム
    // 為替レートは１ドル＝１２０円固定
    static final double RATE = 120;
    static double convert(double yen) {
        return yen / RATE;
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
            System.out.print(yen + "円をドルに換算すると");
            System.out.println(convert(yen) + "ドルです");
        } catch (IOException e) {
            System.err.println("値を読み込めませんでした");
        } catch (NumberFormatException e) {
            System.err.println("円を数値で入力してください");
        }
    }


}
