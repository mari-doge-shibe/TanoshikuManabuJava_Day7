package academy.learnprogramming;

public class Practice6 extends MyCal2 {
    // MyCal2.javaのサブクラスを作成し、月を設定するsetMonth()メソッド、年を設定するsetYear()メソッドを定義せよ。
    public Practice6(int year, int month) {
        super(year, month);
    }

    public void setMonth(int month) {
        setYearMonth(getYear(), month);
    }

    public void setYear(int year) {
        setYearMonth(year, getMonth());
    }

    public static void main(String[] args) {
        Practice6 myCal = new Practice6(2015, 9);
        myCal.setYear(2017);
        myCal.setMonth(4);
        myCal.showCal();
    }




}
