package academy.learnprogramming;

import java.util.Calendar;

public class MyCal1 {
    private Calendar cal;

    public MyCal1(int year, int month) {
        cal = Calendar.getInstance();
        cal.set(year, month - 1, 1);
    }

    public void setYearMonth(int year, int month) {
        cal.set(year, month - 1, 1);
    }

    public int getYear() {
        return cal.get(Calendar.YEAR);
    }

    public int getMonth() {
        return cal.get(Calendar.MONTH) + 1;
    }

    public void showCal() {
        int col = 1;
        int maxDayOfMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);

        System.out.println(" 日 月 火 水 木 金 土");
        for(int i = 1; i < dayOfWeek; i++) {
            col++;
            System.out.print("   ");
        }

        for(int day = 1; day <= maxDayOfMonth; day++) {
            String dayStr;
            if (day >= 10) {
                dayStr = day + " ";
            } else {
                dayStr = " " + day + " ";
            }
            if (col == 7) {
                System.out.println(dayStr);
                col = 1;
            } else {
                System.out.print(dayStr);
                col++;
            }
        }
        System.out.println(" ");
        System.out.println(" ");

    }

    public static void main(String[] args) {
        MyCal1 myCal = new MyCal1(2015, 8);
        System.out.println(myCal.getYear() + "年");
        System.out.println(myCal. getMonth() + "月");
        myCal.showCal();
        myCal.setYearMonth(2016, 1);
        System.out.println(myCal.getYear() + "年");
        System.out.println(myCal.getMonth() + "月");
        myCal.showCal();
    }

}
