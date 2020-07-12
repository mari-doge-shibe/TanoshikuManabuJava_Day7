package academy.learnprogramming;

import java.util.Calendar;

public class Practice5 {
    // MyCal1.javaのmain()メソッドを変更し、コマンドラインで、年、月の順に設定すると、その月のカレンダーを表示するようにせよ。
    private Calendar cal;

    public Practice5(int year, int month) {
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

        System.out.println("日 月 火 水 木 金 土");
        for (int i = 1; i < dayOfWeek; i++) {
            col++;
            System.out.print("   ");
        }
        for (int day = 1; day <= maxDayOfMonth; day++) {
            String dayStr;
            if (day >= 10) {
                dayStr = day + " ";
            } else {
                dayStr = " " + day + " ";
            }

            if(col == 7) {
                System.out.println(dayStr);
                col = 1;
            } else {
                System.out.print(dayStr);
                col++;
            }
        }
        System.out.println();
        System.out.println();
    }

    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("年月を指定してください");
            System.exit(1);
        }

        try {
            int year = Integer.parseInt(args[0]);
            int month = Integer.parseInt(args[1]);
            Practice5 myCal = new Practice5(year, month);
            System.out.println(myCal.getYear() + "年");
            System.out.println(myCal.getMonth() + "月");
            myCal.showCal();
        } catch (NumberFormatException e) {
            System.err.println("年月を数値で指定してください");

        }

    }


}
