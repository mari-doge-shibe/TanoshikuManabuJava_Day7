package academy.learnprogramming;

public class TelTest3 {
    public static void main(String[] args) {
        Tel3 t1, t2;
        t1 = new Tel3("0x-1234-xx1", "田中一郎");
        t2 = new Tel3("0x-3243-xx1", "芹川花子");
        System.out.println(t1.getName() + " " + t1.getTel());
        System.out.println(t2.getName() + " " + t2.getTel());

    }

}
