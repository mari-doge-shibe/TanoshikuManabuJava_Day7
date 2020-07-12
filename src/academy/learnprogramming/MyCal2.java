package academy.learnprogramming;

public class MyCal2 extends MyCal1 {
    public MyCal2(int year, int month) {
        super(year, month);
    }

    public void nextMonth() {
        int month = getMonth();
        int year = getYear();
        if(month == 12) {
            month = 1;
            year++;
        } else {
            month++;
        }
        setYearMonth(year, month);
    }

    public void prevMonth() {
        int month = getMonth();
        int year = getYear();
        if(month == 1) {
            month = 12;
            year--;
        } else {
            month--;
        }
        setYearMonth(year, month);
    }

    public void showCal() {
        System.out.println("   " + getYear() + "年" + getMonth() + "月");
        super.showCal();
    }

    public static void main(String[] args) {
        MyCal2 myCal = new MyCal2(2015, 8);
        myCal.showCal();
        myCal.nextMonth();
        myCal.showCal();
        myCal.nextMonth();
        myCal.nextMonth();
        myCal.showCal();
    }

}
